// -----------------------------------------------------------------------
// File pred01\base3.g
// A parser for base 3 numbers (e.g. 0, 1, 2, 10, 11, 12, 200, 201, ...)
// -----------------------------------------------------------------------

phrase base3number
   rule base3number:
     base3digit
   rule base3number:
     base3digit
     base3number

phrase base3digit
   rule base3digit: "0"
   rule base3digit: "1"
   rule base3digit: "2"

root
   base3number
   "No parse error found!\n"