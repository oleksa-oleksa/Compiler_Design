@echo off
rem Script b.cmd (executes a compiler applying to a source file)
rem ----------------------------------------------------------------------
rem Executes the current language processor
rem applying it to the file %1 (if a parameter %1 was passed) and
rem to the file t01 otherwise.
rem
rem Requires the java interpreter java.exe by Sun to be accessible
rem via the PATH variable.
rem ----------------------------------------------------------------------

SetLocal

if "%1" equ "" (   rem If no parameter was passed
   set FILE=t01
) else (           rem If a parameter was passed
   set FILE=%1
)

rem Output the file content to be processed (to inform the user):
echo ----------------------------------
echo INPUT:
type %FILE%
echo.
echo OUTPUT:

rem Execute the current language processer applying it to %FILE%:
call ..\exe.cmd %FILE%

echo ----------------------------------
