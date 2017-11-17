@echo off
rem Script gen.cmd
rem Compiles a Gentle source file with the Gentle compiler

SetLocal

rem Folder of the Gentle Distribution GD
rem set GD=..\..\cyan-13-10
rem set GD=..\..\cyan-14002
rem set GD=..\..\cyan-14005
rem set GD=..\..\cyan-14006
rem set GD=..\..\cyan-14008
rem set GD=..\..\cyan-14010
    set GD=..\..\cyan-14076

java -cp %GD%\compiler Gentle %1

