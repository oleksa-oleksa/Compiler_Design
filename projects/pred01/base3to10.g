// -----------------------------------------------------------------------
// File pred01\base3to10.g
// A compiler which translates base 3 numbers into base 10 numbers
// -----------------------------------------------------------------------

phrase base3number(-> Value:int)
   rule base3number(-> V):
     base3digit(-> V)
   rule base3number(-> VN*3 + VD):
     base3number(-> VN)
     base3digit(-> VD)

phrase base3digit(-> Value:int)
   rule base3digit(-> 0): "0"
   rule base3digit(-> 1): "1"
   rule base3digit(-> 2): "2"

root
   base3number(-> V)
   "Output (in base 10):\n"
   $V "\n"
