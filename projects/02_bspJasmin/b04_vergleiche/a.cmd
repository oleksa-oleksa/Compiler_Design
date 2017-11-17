@echo off
rem cmd-Skript a.cmd: Assemble .j -> .class

SetLocal
set NAME=Vergleiche

echo Will try to assemble %NAME%.j to %NAME%.class:
echo ------------------------------------------------------

java.exe -cp ..\..\01_jasmin\jasmin.jar jasmin.Main %NAME%.j
