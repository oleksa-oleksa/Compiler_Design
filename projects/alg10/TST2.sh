#!/bin/sh
#
# Script TST2.sh
# ----------------------------------------------------------------------
# Checks if the current parser parses various source programs
# correctly and finds certain errors (double declarations and missing
# declarations).
# Applies the parser to several short programs, writes the outputs into
# a file FOUND2.OUT, compares this file with file EXPECTED2 and reports
# any differences.
# ----------------------------------------------------------------------

# If a file named FOUND2.OUT exists it is deleted. Then
# a new file named FOUND2.OUT is created with the text
# "Testfile2" as its first line:

echo Testfile2 > FOUND2.OUT

# ************************************* Begin of procedure TEST_ONE() ***
# This procedure carries out 1 test:
# It expects any number of parameters (at least 1), writes them all
# into a file ALG.TMP and applies the current parser to that file.
# The file ALG.TMP and the ouptut of the alg compiler is appended to
# file FOUND2.OUT.

TEST_ONE()
{
  echo "    $@" >> ALG.TMP
  echo "-----------------" >> FOUND2.OUT
  echo "SRC $@" >> FOUND2.OUT
  ../exe.sh ALG.TMP >> FOUND2.OUT
  rm -f ALG.TMP
}

# *************************************** End of procdedur TEST_ONE() ***

# ----------------------------------------------------------------------
# alg programs containing one error each:

# Correct programs:
TEST_ONE prog anna begin end
TEST_ONE prog anna begin anna end
TEST_ONE prog anna, bert, carl begin end
TEST_ONE prog anna, bert, carl begin carl, carl, anna end

# Empty list of declarations is an error;
TEST_ONE prog begin end

# Double declarations are errors:
TEST_ONE prog anna, anna begin end
TEST_ONE prog anna, anna begin anna end
TEST_ONE prog anna, bert, anna begin anna, anna end
TEST_ONE prog anna, bert, anna, bert begin end
TEST_ONE prog anna, anna, anna, anna begin end

# Undeclared variables are errors:
TEST_ONE prog anna begin bert end
TEST_ONE prog anna, bert begin bert, carl, end
TEST_ONE prog anna, bert begin carl, bert, carl, end

echo *********************************************************************
# Compare files EXPECTED2.OUT and FOUND2.OUT and report any differences:
diff --brief EXPECTED2.OUT FOUND2.OUT

