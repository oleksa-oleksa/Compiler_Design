@echo off
rem cmd-Skript clean.cmd
rem ----------------------------------------------------------------------
rem Loescht im aktuellen Ordner alle von einem der Skripte c.cmd, b.cmd und
rem a.cmd erzeugten Dateien und gibt die Anzahl der geloeschten Dateien aus.
rem ----------------------------------------------------------------------

SetLocal

rem Die Anzahl der Dateien im aktuellen Ordner . in die Datei ..\tmp.tmp
rem schreiben und von dort in die lokale Variable ANZ1 einlesen:
rem Dabei muss unbedingt das find-Programm von Windows (und nicht das im
rem Ordner MinGW\msys\1.0\bin) aufgerufen werden.
dir /b /a-d | %WINDIR%\System32\find /c /v "" > ..\tmp.tmp
set /P ANZ1= < ..\tmp.tmp

rem Erlaeuterung 1: Die im dir-Kommando verwendeten Optionen:
rem /b   (basic) Einfaches Format der Ausgabe, ohne Kopf- und Fusszeilen
rem /a-d (attribute no directories) Keine Ordner anzeigen, nur normale Dateien

rem Erlaeuterung 2: Hier wird die temporaere Datei ..\tmp.tmp statt einfach
rem tmp.tmp benutzt, damit diese Datei das Zaehlen der geloeschten Dateien
rem nicht erschwert.

rem Von einem Skript erzeugte Dateien loeschen:
del *.j          2> nul
del *.class      2> nul

rem Die Anzahl der Dateien im aktuellen Ordner . in die Datei ..\tmp.tmp
rem schreiben und von dort in die lokale Variable ANZ2 einlesen:
rem Dabei muss unbedingt das find-Programm von Windows (und nicht das im
rem Ordner MinGW\msys\1.0\bin) aufgerufen werden.
dir /b /a-d | %WINDIR%\System32\find /c /v "" > ..\tmp.tmp
set /P ANZ2= < ..\tmp.tmp

del ..\tmp.tmp   2> nul

rem Die Anzahl ANZ3 der geloschten Dateien berechnen und ausgeben:
set /a ANZ3 = %ANZ1% - %ANZ2%
echo ---------------------------------------------------------------------
echo %ANZ3% files have been deleted in folder %~dp0

EndLocal