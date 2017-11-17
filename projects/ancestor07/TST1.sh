#!/bin/bash
# Script TST1.CMD
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
# into a file ALG.TMP and applies the current alg compiler to that file.
# The content of file ALG.TMP and the ouptut of the alg compiler is
# appended to file FOUND1.OUT.

TST1()
{ 
  echo "-----------------------------" >> FOUND1.OUT
  echo "    $@" > ALG.TMP
  echo "SRC $@ " >> FOUND1.OUT
  ../exe.sh ALG.TMP >> FOUND1.OUT
}

# ******************************************* End of procdedur TST1() ***

# ----------------------------------------------------------------------
# Tests with correct inputs:
TST1 Die Mutter von Maria
TST1 Der Vater  von Maria

TST1 Die Mutter von Johann
TST1 Der Vater  von Johann

TST1 Die Mutter der Mutter von Maria
TST1 Der Vater  der Mutter von Maria
TST1 Die Mutter des Vaters von Maria
TST1 Der Vater  des Vaters von Maria

TST1 Die Mutter der Mutter von Johann
TST1 Der Vater  der Mutter von Johann
TST1 Die Mutter des Vaters von Johann
TST1 Der Vater  des Vaters von Johann

TST1 Die Mutter der Mutter der Mutter von Maria
TST1 Der Vater  der Mutter der Mutter von Maria
TST1 Die Mutter des Vaters der Mutter von Maria
TST1 Der Vater  des Vaters der Mutter von Maria
TST1 Die Mutter der Mutter des Vaters von Maria
TST1 Der Vater  der Mutter des Vaters von Maria
TST1 Die Mutter des Vaters des Vaters von Maria
TST1 Der Vater  des Vaters des Vaters von Maria

TST1 Die Mutter der Mutter der Mutter von Johann
TST1 Der Vater  der Mutter der Mutter von Johann
TST1 Die Mutter des Vaters der Mutter von Johann
TST1 Der Vater  des Vaters der Mutter von Johann
TST1 Die Mutter der Mutter des Vaters von Johann
TST1 Der Vater  der Mutter des Vaters von Johann
TST1 Die Mutter des Vaters des Vaters von Johann
TST1 Der Vater  des Vaters des Vaters von Johann

TST1 Die Mutter der Mutter der Mutter der Mutter von Maria
TST1 Die Mutter des Vaters der Mutter des Vaters von Maria
TST1 Der Vater  des Vaters des Vaters des Vaters von Johann
TST1 Der Vater  der Mutter der Mutter des Vaters von Johann

# Tests with incorrect inputs:
TST1 Die Mutter von Marya
TST1 Der Fater von John
TST1 Der Vater der Mutter der Mutter des Vaters von Johannes

echo "*********************************************************************"
# Compare files EXPECTED1.OUT and FOUND1.OUT and report any differences:
diff --brief EXPECTED1.OUT FOUND1.OUT

