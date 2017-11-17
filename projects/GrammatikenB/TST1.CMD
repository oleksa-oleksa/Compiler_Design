@echo off
rem Script TST1.CMD
rem ----------------------------------------------------------------------
rem Calls the current compiler several times with different inputs,
rem collects all the outputs in a file FOUND1.OUT, then compares
rem that file with the file EXPECTED1.OUT and reports any differences.
rem ----------------------------------------------------------------------

SetLocal

echo Script TST1.CMD: Be patient, this may take a few moments!

rem If a file named FOUND1.OUT exists it is deleted. Then
rem a new file named FOUND1.OUT is created with the text
rem "Testfile1" as its first line:

echo Testfile1> FOUND1.OUT

rem ----------------------------------------------------------------------
rem Tests with correct inputs:
call :TST1 123#
call :TST1 0#
call :TST1 0123456789#
call :TST1 abc#
call :TST1 Abc#
call :TST1 abcdefghijklmnopqrstuvwxyz#
call :TST1 Abcdefghijklmnopqrstuvwxyz#
call :TST1 Zbcdefghijklmnopqrstuvwxyz#
call :TST1 123#abc#
call :TST1 abc#123#
call :TST1 123#abc#456#
call :TST1 abc#123#def#
call :TST1 123#abc#456#def#
call :TST1 abc#123#def#456#
call :TST1 a#1#b#2#c#3#d#4#e#5#f#6#
call :TST1 a#1#b#2#c#3#d#4#e#5#f#6#g#
call :TST1 1#a#2#b#3#c#4#d#5#e#6#f#
call :TST1 1#a#2#b#3#c#4#d#5#e#6#f#7#

rem Tests with incorrect inputs:
call :TST1 123
call :TST1 abc
call :TST1 123abc#
call :TST1 abc123#
call :TST1 123##
call :TST1 abc##
call :TST1 123#123#
call :TST1 abc#abc#
call :TST1 abc#123?#
call :TST1 123#abc!#
echo *********************************************************************
rem Compare files EXPECTED1.OUT and FOUND1.OUT and report any differences:
FC EXPECTED1.OUT FOUND1.OUT

goto :EOF


rem ***************************************** Begin of procedure :TST1 ***
rem This procedure carries out 1 test:
rem It expects any number of parameters (at least 1), writes them all
rem into a file SRC.TMP and applies the current alg compiler to that file.
rem The file SRC.TMP and the ouptut of the alg compiler is appended to
rem file FOUND1.OUT.

:TST1
echo ----------------------------->> FOUND1.OUT
rem Write all params of this procedure and a blank to file SRC.TMP.
rem The blank befor ">" is necessary. Without it, single digit
rem numbers (e.g. 0 oder 7 etc.) will not be written to the file.
echo %* >SRC.TMP

rem Read the content of file SRC.TMP into variable src (so that we will
rem notice if something has not been written to the file):
set /p src= <SRC.TMP

rem Append "SRC" and the content of file SRC.TMP to file FOUND1.OUT:
echo SRC %src%>>           FOUND1.OUT

rem Apply the current compiler to file SRC.TMP.
rem Append the output of the compiler to file FOUND1.OUT:
call ..\exe.cmd SRC.TMP >> FOUND1.OUT

goto :EOF
rem ******************************************* End of procdedur :TST1 ***

:EOF
