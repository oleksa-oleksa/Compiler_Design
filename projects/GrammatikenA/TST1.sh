#!/bin/sh
# Script TST1.sh
# ----------------------------------------------------------------------
# Calls the current compiler several times with different inputs,
# collects all the outputs in a file FOUND1.OUT, then compares
# that file with the file EXPECTED1.OUT and reports any differences.
# ----------------------------------------------------------------------

# If a file named FOUND1.OUT exists it is deleted. Then
# a new file named FOUND1.OUT is created with the text
# "Testfile1" as its first line:
echo Testfile1 > FOUND1.OUT

# ***************************************** Begin of procedure TST1() ***
# This procedure carries out 1 test:
# It expects any number of parameters (at least 1), writes them all
# into a file SRC.TMP and applies the current alg compiler to that file.
# The content of file SRC.TMP and the ouptut of the alg compiler is
# appended to file FOUND1.OUT.
#
# Note: In the commands   echo %* > SRC.TMP   and  echo SRC %* >> ...
# the BLANK CHARACTER before ">" or ">>" is necessary. Without it,
# single digit numbers (e.g. 0 or 9) will not be written into
# the file specified after ">" or ">>".

TST1()
{
  echo "-----------------------------" >> FOUND1.OUT
  echo "    $@" > SRC.TMP
  echo "SRC $@ " >> FOUND1.OUT
  ../exe.sh SRC.TMP >> FOUND1.OUT
}

# ******************************************* End of procdedur TST1() ***

# ----------------------------------------------------------------------
# Tests with correct inputs:
TST1 0
TST1 1
TST1 2
TST1 3
TST1 4
TST1 5
TST1 6
TST1 7
TST1 8
TST1 9
TST1 10
TST1 11
TST1 15
TST1 19
TST1 20
TST1 22
TST1 26
TST1 28
TST1 30
TST1 33
TST1 34
TST1 37
TST1 40
TST1 50
TST1 60
TST1 70
TST1 80
TST1 90
TST1 99
TST1 100
TST1 101
TST1 110
TST1 130
TST1 135
TST1 150
TST1 190
TST1 199
TST1 240
TST1 245
TST1 247
TST1 249
TST1 250
TST1 252
TST1 254
TST1 255

# Tests with incorrect inputs:
TST1 256
TST1 1234
TST1 -1
TST1 -100
TST1 abc

echo "*********************************************************************"
# Compare files EXPECTED1.OUT and FOUND1.OUT and report any differences:
diff --brief EXPECTED1.OUT FOUND1.OUT

