@echo off
rem Script ALL_TST.CMD
rem ----------------------------------------------------------------------
rem Calls several times the procedure :TEST_ONE (defined at the end of
rem this script).
rem Each such call of :TST_ONE carrys out one test involving
rem - a subfolder of the folder projects (e.g. ancester01 or alg30 or ...)
rem - a Gentle source in that subfolder  (spec01.g or spec02.g)
rem - a test script   in that subfolder  (TST1.CMD or TST2.CMD)
rem The outputs of the test scripts (together with some comments)
rem are collected in a file ALL_FOUND.OUT. This file is compared with
rem the file ALL_EXPECTED.OUT and any differences are reported.
rem ----------------------------------------------------------------------

SetLocal

echo Testfile All> ALL_FOUND.OUT

call :TEST_ONE ancestor01   spec01 TST1
call :TEST_ONE ancestor02   spec01 TST1
call :TEST_ONE ancestor03   spec01 TST1
call :TEST_ONE ancestor04   spec01 TST1
call :TEST_ONE ancestor05   spec01 TST1
call :TEST_ONE ancestor06   spec01 TST1
call :TEST_ONE ancestor07   spec01 TST1

call :TEST_ONE alg10        spec01 TST2
call :TEST_ONE alg20        spec01 TST2

call :TEST_ONE alg30        spec01 TST1
call :TEST_ONE alg30        spec01 TST2
call :TEST_ONE alg30        spec02 TST1
call :TEST_ONE alg30        spec02 TST2

call :TEST_ONE alg31        spec01 TST1
call :TEST_ONE alg31        spec01 TST2
call :TEST_ONE alg31        spec02 TST1
call :TEST_ONE alg31        spec02 TST2

call :TEST_ONE alg32        spec01 TST1
call :TEST_ONE alg32        spec01 TST2
call :TEST_ONE alg32        spec02 TST1
call :TEST_ONE alg32        spec02 TST2

call :TEST_ONE alg33        spec01 TST1
call :TEST_ONE alg33        spec01 TST2
call :TEST_ONE alg33        spec02 TST1
call :TEST_ONE alg33        spec02 TST2

call :TEST_ONE GrammatikenA spec01 TST1
call :TEST_ONE GrammatikenB spec01 TST1

call :TEST_ONE mehrdeut     mehrd01 TST2
call :TEST_ONE mehrdeut     mehrd02 TST2


echo *********************************************************************
rem Compare files ALL_EXPECTED.OUT and ALL_FOUND.OUT and
rem report any differences:
FC ALL_EXPECTED.OUT ALL_FOUND.OUT

goto :EOF

rem ************************************* Begin of procedure :TEST_ONE ***
rem Expects 3 parameter
rem %1: The name of a subfolder of the folder projects,
rem     ancester01 oder alg30 or ...
rem %2: The name of a Gentle source without the extension .g,
rem     e.g. spec or spec01 or ...
rem %3: The name of a .cmd script without the extension .cmd,
rem     e.g. TST1 or TST2
rem The folder %1 should contain the Gentle source %2 and the script %3
rem
rem The Gentle source %2 will be compiled into an alg-compiler, this
rem compiler will be tested by running the script %3. The output of
rem the script will be appended to the file ALL_FOUND.OUT

:TEST_ONE

if not exist %1 (
   echo ALL_TST.CMD: There seems to be no folder named %1
   goto :EOF
)

if not exist %1\ (
   echo ALL_TST.CMD: %1 seems not to be a folder
   goto :EOF
)

cd %1

if not exist %2.g (
   echo ALL_TST.CMD: Gentle source %2.g seems not to exist in folder %1.
   cd ..
   goto :EOF
)

if not exist %3.cmd (
   echo ALL_TST.CMD: Script file %3.cmd seems not to exist.
   cd ..
   goto :EOF
)

echo ******************************************************>> ..\ALL_FOUND.OUT
echo ### Folder %1, Gentle source %2.g, Script file %3.cmd >> ..\ALL_FOUND.OUT
echo ### Folder %1, Gentle source %2.g, Script file %3.cmd
rem Compile the Gentle source with the Gentle compiler into a compiler,
rem discard any error messages:
call a.cmd %2   >nul
rem Test the resulting compiler by running the script %3.cmd.
rem Redirect error messages of that script to nul and
rem append normal output to file ALL_FOUND.OUT:
call %3.cmd    2>nul                                       >> ..\ALL_FOUND.OUT
rem Delete files created during this test:
call clean.cmd

cd ..

goto :EOF
rem *************************************** End of procdedur :TEST_ONE ***
