@echo off
rem Script a.cmd
rem ----------------------------------------------------------------------
rem Applies the Gentle compiler to the file %1.g (if
rem a parameter %1 was passed) and to the file spec.g otherwise,
rem compiling the file into a language processor.
rem
rem Requires the java compiler javac.exe by Sun to be
rem accessible via the PATH variable.
rem ----------------------------------------------------------------------

SetLocal

rem Delete previously generated language processor if it exists:
rem (this is a dirty command, which may soon not function any more)
del Generated\Program.class 2> nul

if "%1" equ "" (   rem If no parameter was passed
   set FILE=spec
) else (           rem If a parameter was passed
   set FILE=%1
)

echo Will try to compile file %FILE%.g
echo --------------------------------------

rem Apply the Gentle compiler to file %FILE%.g
call ..\gen.cmd  %FILE%.g

echo --------------------------------------
