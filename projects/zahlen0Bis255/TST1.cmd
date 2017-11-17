@echo off
rem Datei tst01.cmd
rem -----------------------------------------------------------------
rem Zum Testen eines Parsers fuer die Zahlen 0 bis 255.
rem Testet den aktuellen Parser mit korrekten Eingaben (Zahlen
rem aus dem Intervall [0, 255]) und mit unkorrekten Eingaben.
rem -----------------------------------------------------------------

SetLocal

echo Zahlen0Bis255 Testprotokoll > FOUND1.OUT

rem Tests mit korrekten Eingaben:
call :TST1 0
call :TST1 1
call :TST1 9
call :TST1 10
call :TST1 11
call :TST1 19
call :TST1 22
call :TST1 33
call :TST1 44
call :TST1 55
call :TST1 66
call :TST1 77
call :TST1 88
call :TST1 99
call :TST1 100
call :TST1 101
call :TST1 199
call :TST1 240
call :TST1 249
call :TST1 250
call :TST1 255

rem Tests mit unkorrekten Eingaben:
call :TST1 256
call :TST1 259
call :TST1 300
call :TST1 -1
call :TST1 abc

rem Vergleiche die Dateien EXPECTED1.OUT und FOUND1.OUT und
rem melde Unterschiede:
echo ----------------------------------------------------------------
FC EXPECTED1.OUT FOUND1.OUT

del ALG.TMP 2> nul
goto :EOF


rem ***************************************** Begin of procedure :TST1 ***
rem This procedure carries out 1 test:
rem It expects any number of parameters (at least 1), writes them all
rem into a file ALG.TMP and applies the current alg compiler to that file.
rem The file ALG.TMP and the ouptut of the alg compiler is appended to
rem file FOUND1.OUT.

:TST1
echo ----------------------------->> FOUND1.OUT
echo     %* > ALG.TMP
echo SRC %* >>                       FOUND1.OUT
..\..\cyan\bin\Gecco /run ALG.TMP >> FOUND1.OUT

goto :EOF
rem ******************************************* End of procdedur :TST1 ***

:EOF
