@echo off
rem Script distributeCmdFiles.cmd
rem -----------------------------------------------------------------
rem Copies into each predefined project folder three .cmd-files:
rem One of a-0.cmd, a-1.cmd, a-2.cmd          (as a.cmd),
rem one of b-0.cmd, b-1.cmd, b-2.cmd, b-3.cmd (as b.cmd) and
rem one of clean-0.cmd, clean-1.cmd           (as clean.cmd)
rem -----------------------------------------------------------------

echo Copy a-1, b-1, clean-0 to ..\alg10:
copy a-1.cmd     ..\alg10\a.cmd
copy b-1.cmd     ..\alg10\b.cmd
copy clean-0.cmd ..\alg10\clean.cmd

echo Copy a-1, b-1, clean-0 to ..\alg20:
copy a-1.cmd     ..\alg20\a.cmd
copy b-1.cmd     ..\alg20\b.cmd
copy clean-0.cmd ..\alg20\clean.cmd

echo Copy a-2, b-3, clean-1 to ..\alg30:
copy a-2.cmd     ..\alg30\a.cmd
copy b-3.cmd     ..\alg30\b.cmd
copy clean-1.cmd ..\alg30\clean.cmd

echo Copy a-2, b-3, clean-1 to ..\alg31:
copy a-2.cmd     ..\alg31\a.cmd
copy b-3.cmd     ..\alg31\b.cmd
copy clean-1.cmd ..\alg31\clean.cmd

echo Copy a-2, b-3, clean-1 to ..\alg32:
copy a-2.cmd     ..\alg32\a.cmd
copy b-3.cmd     ..\alg32\b.cmd
copy clean-1.cmd ..\alg32\clean.cmd

echo Copy a-2, b-3, clean-1 to ..\alg33:
copy a-2.cmd     ..\alg33\a.cmd
copy b-3.cmd     ..\alg33\b.cmd
copy clean-1.cmd ..\alg33\clean.cmd

echo Copy a-1, b-2, clean-0 to ..\ancestor01:
copy a-1.cmd     ..\ancestor01\a.cmd
copy b-2.cmd     ..\ancestor01\b.cmd
copy clean-0.cmd ..\ancestor01\clean.cmd

echo Copy a-1, b-2, clean-0 to ..\ancestor02:
copy a-1.cmd     ..\ancestor02\a.cmd
copy b-2.cmd     ..\ancestor02\b.cmd
copy clean-0.cmd ..\ancestor02\clean.cmd

echo Copy a-1, b-2, clean-0 to ..\ancestor03:
copy a-1.cmd     ..\ancestor03\a.cmd
copy b-2.cmd     ..\ancestor03\b.cmd
copy clean-0.cmd ..\ancestor03\clean.cmd

echo Copy a-1, b-2, clean-0 to ..\ancestor04:
copy a-1.cmd     ..\ancestor04\a.cmd
copy b-2.cmd     ..\ancestor04\b.cmd
copy clean-0.cmd ..\ancestor04\clean.cmd

echo Copy a-1, b-2, clean-0 to ..\ancestor05:
copy a-1.cmd     ..\ancestor05\a.cmd
copy b-2.cmd     ..\ancestor05\b.cmd
copy clean-0.cmd ..\ancestor05\clean.cmd

echo Copy a-1, b-2, clean-0 to ..\ancestor06:
copy a-1.cmd     ..\ancestor06\a.cmd
copy b-6.cmd     ..\ancestor06\b.cmd
copy clean-0.cmd ..\ancestor06\clean.cmd

echo Copy a-1, b-2, clean-0 to ..\ancestor07:
copy a-1.cmd     ..\ancestor07\a.cmd
copy b-7.cmd     ..\ancestor07\b.cmd
copy clean-0.cmd ..\ancestor07\clean.cmd

echo Copy a-1, b-1, clean-0 to ..\pred01:
copy a-1.cmd     ..\pred01\a.cmd
copy b-0.cmd     ..\pred01\b.cmd
copy clean-0.cmd ..\pred01\clean.cmd

echo Copy a-1, b-1, clean-0 to ..\pred02:
copy a-1.cmd     ..\pred02\a.cmd
copy b-0.cmd     ..\pred02\b.cmd
copy clean-0.cmd ..\pred02\clean.cmd

echo Copy a-1, b-1, clean-0 to ..\pred03:
copy a-1.cmd     ..\pred03\a.cmd
copy b-0.cmd     ..\pred03\b.cmd
copy clean-0.cmd ..\pred03\clean.cmd

echo Copy a-1, b-1, clean-0 to ..\GrammatikenA
copy a-1.cmd     ..\GrammatikenA\a.cmd
copy b-1.cmd     ..\GrammatikenA\b.cmd
copy clean-0.cmd ..\GrammatikenA\clean.cmd

echo Copy a-1, b-1, clean-0 to ..\GrammatikenB
copy a-1.cmd     ..\GrammatikenB\a.cmd
copy b-1.cmd     ..\GrammatikenB\b.cmd
copy clean-0.cmd ..\GrammatikenB\clean.cmd

echo Compy a-1, b-1, clean-0 to ..\IfThenElse
copy a-1.cmd     ..\IfThenElse\a.cmd
copy b-1.cmd     ..\IfThenElse\b.cmd
copy clean-0.cmd ..\IfThenElse\clean.cmd

echo Compy a-1, b-1, clean-0 to ..\Klausuren
copy a-1.cmd     ..\Klausuren\a.cmd
copy b-1.cmd     ..\Klausuren\b.cmd
copy clean-0.cmd ..\Klausuren\clean.cmd

echo Compy a-1, b-1, clean-0 to ..\mehrdeut
copy a-1.cmd     ..\mehrdeut\a.cmd
copy b-1.cmd     ..\mehrdeut\b.cmd
copy clean-0.cmd ..\mehrdeut\clean.cmd

echo Compy a-1, b-1, clean-0 to ..\tests
copy a-1.cmd     ..\tests\a.cmd
copy b-1.cmd     ..\tests\b.cmd
copy clean-0.cmd ..\tests\clean.cmd

echo Compy a-1, b-1, clean-0 to ..\zahlen0Bis255
copy a-1.cmd     ..\zahlen0Bis255\a.cmd
copy b-1.cmd     ..\zahlen0Bis255\b.cmd
copy clean-0.cmd ..\zahlen0Bis255\clean.cmd
