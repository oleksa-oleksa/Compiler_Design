#!/bin/bash
#
# Script b.sh (executes one of the ancestor compilers)
# ----------------------------------------------------------------------
# Executes the current language processor
# applying it to a file, which depends on how this script is called:
#
# 1. If it is called with 0 parameters, the word
#
#    mother
#
#    is written into a file and that file is processed
# 2. If it is called with the name of an existing file as %1, that file
#    is processed
# 3. If %1 is not the name of an existing file, all parameters are
#    written into a file and that file is processed.
#
# Examples:
#
# Call of b.cmd            What is processed?
# > b                      THe mother of Mary
# > b The father of John   The father of John
# > b t01                  The content of t01
#
# Requires the java interpreter java.exe by Sun to be accessible
# via the PATH variable.
# ----------------------------------------------------------------------
#

# The variable FILE shall contain the name of the file to be processed
# by the current language processor. In 2 out of 3 cases this will be
# the name "word.tmp"
# FILE=word.tmp

if [ -z "${1}" ]; then
   echo The mother of Mary > word.tmp   # If no parameter was passed
else
   if [ -f "${1}" ]; then
      FILE="${1}"           # If a filename was passed
   else
      # If none of the above
      # Write all parameters into word.tmp
      echo $@ > word.tmp
   fi
fi

#m Output the file content to be processed (to inform the user):
echo "----------------------------------"
echo "INPUT:"
cat "${FILE}"
echo "."
echo "OUTPUT:"

# Execute the current language processer applying it to ${FILE}:
../exe.sh ${FILE}

echo "----------------------------------"
