#!/bin/sh
#
# Script a.sh
# ----------------------------------------------------------------------
# Applies the Gentle compiler to the file spec.g,
# compiling the file into a language processor.
#
# Requires the java compiler javac.exe by Sun to be
# accessible via the PATH variable.
# ----------------------------------------------------------------------

echo "Will try to compile file spec.g"
echo "--------------------------------------"

# Apply the Gentle compiler to file spec.g
../gen.sh spec.g

echo "--------------------------------------"

