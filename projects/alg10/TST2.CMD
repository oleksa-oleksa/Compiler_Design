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

rem Correct programs:
call :TEST_ONE prog anna begin end
call :TEST_ONE prog anna begin anna end
call :TEST_ONE prog anna, bert, carl begin end
call :TEST_ONE prog anna, bert, carl begin carl, carl, anna end

rem Empty list of declarations is an error;
call :TEST_ONE prog begin end

rem Double declarations are errors:
call :TEST_ONE prog anna, anna begin end
call :TEST_ONE prog anna, anna begin anna end
call :TEST_ONE prog anna, bert, anna begin anna, anna end
call :TEST_ONE prog anna, bert, anna, bert begin end
call :TEST_ONE prog anna, anna, anna, anna begin end

rem Undeclared variables are errors:
call :TEST_ONE prog anna begin bert end
call :TEST_ONE prog anna, bert begin bert, carl, end
call :TEST_ONE prog anna, bert begin carl, bert, carl, end


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
