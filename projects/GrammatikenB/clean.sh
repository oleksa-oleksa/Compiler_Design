#!/bin/bash
#
# Script clean.cmd
# -----------------------------------------------------------------
# Deletes all files and directories which have been created
# by the Gentle compiler and its allies.
# -----------------------------------------------------------------

# The command   rmdir /S /Q xxx  will delete the folder xxx
# and all files contained in it, without asking for permission.

rm -rf Generated
rm -f *.tmp
rm -f FOUND?.OUT

