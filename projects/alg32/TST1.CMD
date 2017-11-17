@echo off
rem Script TST1.CMD
rem ----------------------------------------------------------------------
rem Checks if the current alg compiler translates the
rem alg31 source file TST1.ALG such that it produces the expected output.
rem Translates TST1.ALG into a class, executes that class, redirects the
rem output of that execution into a file FOUND1.OUT, compares that file
rem with a file EXPECTED1.OUT and reports any differences.
rem ----------------------------------------------------------------------
rem The redirections  1>&2  converts "normal output" into "error messages".
rem Scripts calling this script may redirect such error messages to nul.
rem ----------------------------------------------------------------------

SetLocal

rem If a file named FOUND1.OUT exists it is deleted. Then
rem a new file named FOUND1.OUT is created with the text
rem "Testfile1" as its first line:

echo Testfile1> FOUND1.OUT

echo --------------------------------------------------------------------- 1>&2
echo run alg compiler and compile TST1.ALG into Target.j                   1>&2
call ..\exe.cmd TST1.ALG

echo --------------------------------------------------------------------- 1>&2
echo run jasmin and assemble Target.j into Target.class                    1>&2
java.exe -cp ..\01_jasmin\jasmin.jar jasmin.Main Target.j                  1>&2

echo --------------------------------------------------------------------- 1>&2
echo Execute Target.class and redirect output to file FOUND1.OUT:          1>&2
java.exe -cp .;..\03_auxFiles Target >> FOUND1.OUT


echo *********************************************************************
rem Compare files EXPECTED1.OUT and FOUND1.OUT and report any differences:
FC EXPECTED1.OUT FOUND1.OUT
