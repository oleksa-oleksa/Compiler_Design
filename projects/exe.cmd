@echo off
rem Script exe.cmd
rem Executes a (Java-) program generated with the Gentle compiler

SetLocal

rem Folder of the Gentle Distribution GD
rem set GD=..\..\cyan-13-10
rem set GD=..\..\cyan-14002
rem set GD=..\..\cyan-14005
rem set GD=..\..\cyan-14006
rem set GD=..\..\cyan-14008
rem set GD=..\..\cyan-14010
    set GD=..\..\cyan-14076

java -cp .\;%GD%\runtime Generated.Program %1
