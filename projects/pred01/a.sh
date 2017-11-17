#!/bin/sh
#
# Script a.sh
# ----------------------------------------------------------------------
# Applies the Gentle compiler to the file %1.g (if
# a parameter %1 was passed) and to the file spec.g otherwise,
# compiling the file into a language processor.
#
# Requires the java compiler javac.exe by Sun to be
# accessible via the PATH variable.
# ----------------------------------------------------------------------

# Delete previously generated language processor if it exists:
# (this is a dirty command, which may soon not function any more)
rm -f Generated\Program.class

if [ -z "${1}" ]; then
   FILE=spec       # If no parameter was passed
else
   FILE="${1}"     # If a parameter was passed
fi

echo "Will try to compile file ${FILE}.g"
echo "--------------------------------------"

# Apply the Gentle compiler to file %FILE%.g
../gen.sh  ${FILE}.g

echo "--------------------------------------"

