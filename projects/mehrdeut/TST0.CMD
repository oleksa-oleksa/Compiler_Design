@echo off

call :TstOne 01
call :TstOne 10
call :TstOne 0011
call :TstOne 0101
call :TstOne 0110
call :TstOne 1001
call :TstOne 1010
call :TstOne 1100
call :TstOne 000111
call :TstOne 001011
call :TstOne 001101
call :TstOne 001110
call :TstOne 010011
call :TstOne 010101
call :TstOne 010110
call :TstOne 011001
call :TstOne 011010


goto :EOF


:TstOne
echo %1 > tmp.txt
call b tmp.txt
goto :EOF