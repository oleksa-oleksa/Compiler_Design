@echo off
rem Script tst3.cmd
rem ----------------------------------------------------------------------
rem Checks if the current alg compiler detects certain errors in alg33
rem programs (double declarations or missing declarations of variables,
rem type errors)
rem Applies the compiler to several short alg33 programs, which contain
rem one such error each, writes the outputs into a file FOUND2.OUT,
rem compares this file with file EXPECTED2 and reports any differences.
rem ----------------------------------------------------------------------

SetLocal

rem If a file named FOUND2.OUT exists it is deleted. Then
rem a new file named FOUND2.OUT is created with the text
rem "Testfile2" as its first line:

echo Testfile2> FOUND2.OUT

rem ----------------------------------------------------------------------


rem Type errors in expressions with arithmetic operators and literals:
call :TST1 writeln(   3 + true );


echo *********************************************************************
rem Compare files EXPECTED2.OUT and %OF% and report any differences:
FC EXPECTED2.OUT FOUND2.OUT

goto :EOF


rem ***************************************** Begin of procedure :TST1 ***
rem This procedure carries out 1 test:
rem It expects any number of parameters (at least 1), writes them all
rem into a file ALG.TMP and applies the current alg compiler to that file.
rem The file ALG.TMP and the ouptut of the alg compiler is appended to
rem file FOUND2.OUT.

:TST1
echo     %*> ALG.TMP
echo -----------------  >> FOUND2.OUT
echo SRC %*>>              FOUND2.OUT
echo.                   >> FOUND2.OUT
call ..\exe.cmd ALG.TMP >> FOUND2.OUT

goto :EOF
rem ******************************************* End of procdedur :TST1 ***

:EOF
