#!/bin/sh
# Script TST1.sh
# ----------------------------------------------------------------------
# Calls the current compiler several times with different inputs,
# collects all the outputs in a file FOUND1.OUT, then compares
# that file with the file EXPECTED1.OUT and reports any differences.
# ----------------------------------------------------------------------

echo "Script TST1.CMD: Be patient, this may take a few moments!"

# If a file named FOUND1.OUT exists it is deleted. Then
# a new file named FOUND1.OUT is created with the text
# "Testfile1" as its first line:

echo Testfile1 > FOUND1.OUT

# ***************************************** Begin of procedure TST1() ***
# This procedure carries out 1 test:
# It expects any number of parameters (at least 1), writes them all
# into a file SRC.TMP and applies the current alg compiler to that file.
# The file SRC.TMP and the ouptut of the alg compiler is appended to
# file FOUND1.OUT.
#

TST1()
{
  echo "-----------------------------" >> FOUND1.OUT
  # Write all params of this procedure and a blank to file SRC.TMP.
  # The blank befor ">" is necessary. Without it, single digit
  # numbers (e.g. 0 oder 7 etc.) will not be written to the file.
  echo $@ > SRC.TMP

  # Read the content of file SRC.TMP into variable src (so that we will
  # notice if something has not been written to the file):
  src=`cat SRC.TMP`

  # Append "SRC" and the content of file SRC.TMP to file FOUND1.OUT:
  echo "SRC ${src}" >> FOUND1.OUT

  # Apply the current compiler to file SRC.TMP.
  # Append the output of the compiler to file FOUND1.OUT:
  ../exe.sh SRC.TMP >> FOUND1.OUT
}

# ******************************************* End of procdedur TST1() ***

# ----------------------------------------------------------------------
# Tests with correct inputs:
TST1 "123#"
TST1 "0#"
TST1 "0123456789#"
TST1 "abc#"
TST1 "Abc#"
TST1 "abcdefghijklmnopqrstuvwxyz#"
TST1 "Abcdefghijklmnopqrstuvwxyz#"
TST1 "Zbcdefghijklmnopqrstuvwxyz#"
TST1 "123#abc#"
TST1 "abc#123#"
TST1 "123#abc#456#"
TST1 "abc#123#def#"
TST1 "123#abc#456#def#"
TST1 "abc#123#def#456#"
TST1 "a#1#b#2#c#3#d#4#e#5#f#6#"
TST1 "a#1#b#2#c#3#d#4#e#5#f#6#g#"
TST1 "1#a#2#b#3#c#4#d#5#e#6#f#"
TST1 "1#a#2#b#3#c#4#d#5#e#6#f#7#"

# Tests with incorrect inputs:
TST1 "123"
TST1 "abc"
TST1 "123abc#"
TST1 "abc123#"
TST1 "123##"
TST1 "abc##"
TST1 "123#123#"
TST1 "abc#abc#"
TST1 "abc#123?#"
TST1 "123#abc!#"
echo "*********************************************************************"
# Compare files EXPECTED1.OUT and FOUND1.OUT and report any differences:
diff --brief EXPECTED1.OUT FOUND1.OUT
