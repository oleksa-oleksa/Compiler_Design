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
call :TST1 mother
call :TST1 father
call :TST1 grandmother
call :TST1 grandfather
call :TST1 greatgrandmother
call :TST1 greatgrandfather
call :TST1 greatgreatgrandmother
call :TST1 greatgreatgrandfather
call :TST1 greatgreatgreatgrandfather
call :TST1 greatgreatgreatgrandfather

rem Tests with incorrect inputs:
call :TST1 Mother
call :TST1 fatheR
call :TST1 greatgreatgreatfather
echo *********************************************************************
rem Compare files EXPECTED1.OUT and FOUND1.OUT and report any differences:
FC EXPECTED1.OUT FOUND1.OUT

goto :EOF


rem ***************************************** Begin of procedure :TST1 ***
rem This procedure carries out 1 test:
rem It expects any number of parameters (at least 1), writes them all
rem into a file ALG.TMP and applies the current alg compiler to that file.
rem The content of file ALG.TMP and the ouptut of the alg compiler is
rem appended to file FOUND1.OUT.

: TST1
echo ----------------------------->> FOUND1.OUT
echo     %*>    ALG.TMP
echo SRC %*>>                        FOUND1.OUT
call ..\exe.cmd ALG.TMP >>           FOUND1.OUT

goto :EOF
rem ******************************************* End of procdedur :TST1 ***

:EOF
