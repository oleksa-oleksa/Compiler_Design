@echo off
rem cmd-Skript c.cmd: Compile .java -> .class

SetLocal
set NAME=Hallo

echo Will try to compile %NAME%.java to %NAME%.class:
echo ------------------------------------------------------
javac %NAME%.java
if %ERRORLEVEL% EQU 0 (
   echo Compiler javac generated %NAME%.class
)
