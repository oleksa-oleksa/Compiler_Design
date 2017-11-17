#!/bin/sh
#
# Script b.cmd (executes a compiler applying to a source file)
# ----------------------------------------------------------------------
# Executes the current language processor
# applying it to the file %1 (if a parameter %1 was passed) and
# to the file t01 otherwise.
#
# Requires the java interpreter java.exe by Sun to be accessible
# via the PATH variable.
# ----------------------------------------------------------------------

if [ -z "${1}" ]; then
   FILE=t01        # If no parameter was passed
else
   FILE="${1}"     # If a parameter was passed
fi

# Output the file content to be processed (to inform the user):
echo "----------------------------------"
echo "INPUT:"
cat "${FILE}"
echo "."
echo "OUTPUT:"

# Execute the current language processer applying it to %FILE%:
../exe.sh ${FILE}

echo "----------------------------------"
