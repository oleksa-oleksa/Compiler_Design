@echo off
rem Script TST1.CMD
rem ----------------------------------------------------------------------
rem Calls the current compiler several times with different inputs,
rem collects all the outputs in a file FOUND1.OUT, then compares
rem that file with the file EXPECTED1.OUT and reports any differences.
rem ----------------------------------------------------------------------

SetLocal

rem If a file named FOUND1.OUT exists it is deleted. Then
rem a new file named FOUND1.OUT is created with the text
rem "Testfile1" as its first line:
echo Testfile1> FOUND1.OUT

rem ----------------------------------------------------------------------
rem Tests with correct inputs:
call :TST1 0
call :TST1 1
call :TST1 2
call :TST1 3
call :TST1 4
call :TST1 5
call :TST1 6
call :TST1 7
call :TST1 8
call :TST1 9
call :TST1 10
call :TST1 11
call :TST1 15
call :TST1 19
call :TST1 20
call :TST1 22
call :TST1 26
call :TST1 28
call :TST1 30
call :TST1 33
call :TST1 34
call :TST1 37
call :TST1 40
call :TST1 50
call :TST1 60
call :TST1 70
call :TST1 80
call :TST1 90
call :TST1 99
call :TST1 100
call :TST1 101
call :TST1 110
call :TST1 130
call :TST1 135
call :TST1 150
call :TST1 190
call :TST1 199
call :TST1 240
call :TST1 245
call :TST1 247
call :TST1 249
call :TST1 250
call :TST1 252
call :TST1 254
call :TST1 255

rem Tests with incorrect inputs:
call :TST1 256
call :TST1 1234
call :TST1 -1
call :TST1 -100
call :TST1 abc

echo *********************************************************************
rem Compare files EXPECTED1.OUT and FOUND1.OUT and report any differences:
FC EXPECTED1.OUT FOUND1.OUT

goto :EOF


rem ***************************************** Begin of procedure :TST1 ***
rem This procedure carries out 1 test:
rem It expects any number of parameters (at least 1), writes them all
rem into a file SRC.TMP and applies the current alg compiler to that file.
rem The content of file SRC.TMP and the ouptut of the alg compiler is
rem appended to file FOUND1.OUT.

rem Note: In the commands   echo %* > SRC.TMP   and  echo SRC %* >> ...
rem the BLANK CHARACTER before ">" or ">>" is necessary. Without it,
rem single digit numbers (e.g. 0 or 9) will not be written into
rem the file specified after ">" or ">>".

: TST1
echo ----------------------------->> FOUND1.OUT
echo     %* >   SRC.TMP
echo SRC %* >>                       FOUND1.OUT
call ..\exe.cmd SRC.TMP >>           FOUND1.OUT

goto :EOF
rem ******************************************* End of procdedur :TST1 ***

:EOF
