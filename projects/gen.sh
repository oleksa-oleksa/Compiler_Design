#!/bin/bash
#
# Script gen.sh
# Compiles a Gentle source file with the Gentle compiler
#

# Folder of the Gentle Distribution GD:
GD=../../cyan-14076
FOUNDGD=`ls -d ../../cyan-*`
if [ "${FOUNDGD}" ]; then
  GD=${FOUNDGD}
fi
export GD

java -cp ${GD}/compiler Gentle ${1}

