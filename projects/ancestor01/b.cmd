@echo off
rem Script b.cmd (executes one of the ancestor compilers)
rem ----------------------------------------------------------------------
rem Executes the current language processor
rem applying it to a file, which depends on how this script is called:
rem
rem 1. If it is called with 0 parameters, the word
rem
rem    mother
rem
rem    is written into a file and that file is processed
rem 2. If it is called with the name of an existing file as %1, that file
rem    is processed
rem 3. If %1 is not the name of an existing file, all parameters are
rem    written into a file and that file is processed.
rem
rem Examples:
rem
rem Call of b.cmd       What is processed?
rem > b                 mother
rem > b father          father
rem > b t01             The content of t01
rem
rem Requires the java interpreter java.exe by Sun to be accessible
rem via the PATH variable.
rem ----------------------------------------------------------------------

SetLocal

rem The variable FILE shall contain the name of the file to be processed
rem by the current language processor. In 2 out of 3 cases this will be
rem the name "word.tmp"
set FILE=word.tmp

if "%1" equ "" (            rem If no parameter was passed
   echo mother > word.tmp
) else if EXIST "%1" (      rem If a filename was passed
   set FILE="%1"
) else (                    rem If none of the above
   rem Write all parameters into word.tmp
   echo %*> word.tmp
)

rem Output the file content to be processed (to inform the user):
echo ----------------------------------
echo INPUT:
type %FILE%%
echo.
echo OUTPUT:

rem Execute the current language processer applying it to %FILE%:
call ..\exe.cmd %FILE%

echo ----------------------------------
