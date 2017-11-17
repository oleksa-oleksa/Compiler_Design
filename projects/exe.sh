#!/bin/bash
#
# Script exe.sh
# Executes a (Java-) program generated with the Gentle compiler
#

# Folder of the Gentle Distribution GD:
GD=../../cyan-14076
FOUNDGD=`ls -d ../../cyan-*`
if [ "${FOUNDGD}" ]; then
  GD=${FOUNDGD}
fi
export GD

java -cp ./:${GD}/runtime Generated.Program ${1}

