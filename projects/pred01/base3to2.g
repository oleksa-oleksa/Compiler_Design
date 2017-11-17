// -----------------------------------------------------------------------
// File pred01\base3to2.g
// A compiler which translates base 3 numbers into base 2 numbers
// -----------------------------------------------------------------------

phrase base3number(-> Value:int)
   rule base3number(-> V):
     base3digit(-> V)
   rule base3number(-> VN*3 + VD):
     base3number(-> VN)   // All but the last digit
     base3digit(-> VD)    // Last digit

phrase base3digit(-> Value:int)
   rule base3digit(-> 0): "0"
   rule base3digit(-> 1): "1"
   rule base3digit(-> 2): "2"

proc printInBase2(Nr:int)
   // Prints Nr in base  2 if Nr is non-negative
   // Prints Nr in base 10 if Nr is negative
   rule printInBase2(N):
      Less(N, 2)
      $N
   rule printInBase2(N):
      printInBase2(N/2)
      DIGIT <- N - N/2*2
      $DIGIT

root
   base3number(-> V)
   "Output (in base 2): \n"
   printInBase2(V)     "\n"
