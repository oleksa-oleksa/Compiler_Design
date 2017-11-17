@echo off
rem cmd-Skript b.cmd: Backk-asseble .class -> .j

SetLocal
set NAME=Hallo

echo Will try to back-assemble %NAME%.class to %NAME%.j:
echo ------------------------------------------------------
java.exe -cp ..\..\01_jasmin\bcel.jar JasminVisitor %NAME%.class
if %ERRORLEVEL% EQU 0 (
   echo Back-assembler JasminVisitor generated %NAME%.j
)
