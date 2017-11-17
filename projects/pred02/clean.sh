#!/bin/bash
#
# Script clean.sh
# -----------------------------------------------------------------
# Deletes all files and directories which have been created
# by the Gentle compiler and its allies.
# -----------------------------------------------------------------

# The command   rmdir /S /Q xxx  will delete the folder xxx
# and all files contained in it, without asking for permission.

rm -rfQ Generated
rm -f *.tmp
rm -f FOUND?.OUT
