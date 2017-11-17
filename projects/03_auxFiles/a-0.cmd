@echo off
rem Script a.cmd
rem ----------------------------------------------------------------------
rem Applies the Gentle compiler to the file spec.g,
rem compiling the file into a language processor.
rem
rem Requires the java compiler javac.exe by Sun to be
rem accessible via the PATH variable.
rem ----------------------------------------------------------------------

echo Will try to compile file spec.g
echo --------------------------------------

rem Apply the Gentle compiler to file spec.g
call ..\gen.cmd spec.g

echo --------------------------------------
