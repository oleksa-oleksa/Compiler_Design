#!/bin/bash
#
#  Script b.cmd (executes an alg compiler)
#  ----------------------------------------------------------------------
#  1. Compiles the file %1 (if a parameter %1 was passed) and
#     the file t01 otherwise with the current alg compiler into
#     a file Target.j.
#  2. Assembles Target.j with Jasmin into Target.class
#  3. Executes Target.class.
# 
#  Requires the java interpreter java.exe by Sun to be accessible
#  via the PATH variable.
#  ----------------------------------------------------------------------

#  Quit immediatly if there is no current alg compiler
#  (this is a dirty command, which may soon not function any more)

if not exist Generated\Program.class goto :ALG_COMPILER_MISSING
if [ ! -f Generated/Program.class ]; then
   echo "----------------------------------------------------------------"
   echo "There seems to be no current alg compiler"
   exit 1
fi

if [ -z "${1}" ]; then
   FILE=t01        # If no parameter was passed
else
   FILE="${1}"     # If a parameter was passed
fi


echo "----------------------------------------------------------------"
#  Delete previous version of Target.j if it exists:
rm -f Target.j
echo "Compile ${FILE} with the current alg compiler into Target.j:"
../exe.sh "${FILE}"

if [ ! -f Target.j ]; then
   echo "There still seem to be some errors in alg source ${FILE}"
   exit 1
fi

echo "----------------------------------------------------------------"
#  Delete previous version of Target.class if it exists:
rm -f Target.class
echo "Assemble Target.j with jasmin.Main into Target.class:"
java -cp ../01_jasmin/jasmin.jar jasmin.Main Target.j
if [ ! -f Target.class ]; then
   echo "There still seem to be some errors in alg source ${FILE}"
   exit 1
fi

echo "----------------------------------------------------------------"
echo "Execute Target.class:"
java -cp .:../03_auxFiles Target


