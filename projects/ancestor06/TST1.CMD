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
call :TST1 The mother of Mary
call :TST1 The father of Mary

call :TST1 The mother of John
call :TST1 The father of John

call :TST1 The mother of the mother of Mary
call :TST1 The father of the mother of Mary
call :TST1 The mother of the father of Mary
call :TST1 The father of the father of Mary

call :TST1 The mother of the mother of John
call :TST1 The father of the mother of John
call :TST1 The mother of the father of John
call :TST1 The father of the father of John

call :TST1 The mother of the mother of the mother of Mary
call :TST1 The father of the mother of the mother of Mary
call :TST1 The mother of the father of the mother of Mary
call :TST1 The father of the father of the mother of Mary
call :TST1 The mother of the mother of the father of Mary
call :TST1 The father of the mother of the father of Mary
call :TST1 The mother of the father of the father of Mary
call :TST1 The father of the father of the father of Mary

call :TST1 The mother of the mother of the mother of John
call :TST1 The father of the mother of the mother of John
call :TST1 The mother of the father of the mother of John
call :TST1 The father of the father of the mother of John
call :TST1 The mother of the mother of the father of John
call :TST1 The father of the mother of the father of John
call :TST1 The mother of the father of the father of John
call :TST1 The father of the father of the father of John

call :TST1 The mother of the mother of the mother of the mother of Mary
call :TST1 The mother of the father of the mother of the father of Mary
call :TST1 The father of the father of the father of the father of John
call :TST1 The father of the mother of the mother of the father of John

rem Tests with incorrect inputs:
call :TST1 The Mother of Mary
call :TST1 The fatheR of John
call :TST1 The father of the mother of the mother of the father of Johnny
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
