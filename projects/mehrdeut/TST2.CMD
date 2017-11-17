@echo off
rem Script TST2.CMD
rem ----------------------------------------------------------------------
rem Checks if the current parser parses various source programs
rem correctly and finds certain errors (double declarations and missing
rem declarations).
rem Applies the parser to several short programs, writes the outputs into
rem a file FOUND2.OUT, compares this file with file EXPECTED2 and reports
rem any differences.
rem ----------------------------------------------------------------------

SetLocal

rem If a file named FOUND2.OUT exists it is deleted. Then
rem a new file named FOUND2.OUT is created with the text
rem "Testfile2" as its first line:

echo Testfile2> FOUND2.OUT

rem ----------------------------------------------------------------------
rem alg programs containing one error each:

rem Correct sources:
call :TEST_ONE 01
call :TEST_ONE 10
call :TEST_ONE 0011
call :TEST_ONE 0101
call :TEST_ONE 0110
call :TEST_ONE 1001
call :TEST_ONE 1010
call :TEST_ONE 1100
call :TEST_ONE 000111
call :TEST_ONE 001011
call :TEST_ONE 001101
call :TEST_ONE 001110
call :TEST_ONE 010011
call :TEST_ONE 010101
call :TEST_ONE 010110
call :TEST_ONE 011001
call :TEST_ONE 011010

rem Incorrect sources
call :TEST_ONE 110
call :TEST_ONE 100
call :TEST_ONE 10101010101

echo *********************************************************************
rem Compare files EXPECTED2.OUT and FOUND2.OUT and report any differences:
FC EXPECTED2.OUT FOUND2.OUT

goto :EOF


rem ************************************* Begin of procedure :TEST_ONE ***
rem This procedure carries out 1 test:
rem It expects any number of parameters (at least 1), writes them all
rem into a file ALG.TMP and applies the current parser to that file.
rem The file ALG.TMP and the ouptut of the alg compiler is appended to
rem file FOUND2.OUT.

:TEST_ONE
echo     %*> ALG.TMP
echo -----------------  >> FOUND2.OUT
echo SRC %*>>              FOUND2.OUT
call ..\exe.cmd ALG.TMP >> FOUND2.OUT
del ALG.TMP >nul

goto :EOF
rem *************************************** End of procdedur :TEST_ONE ***

:EOF
