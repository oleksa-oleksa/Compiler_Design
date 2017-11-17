// -----------------------------------------------------------------------
// File pred03\iteration01.g
// Demonstrates repetition statements with 1 variable.
//
// Does not contain token or phrase predicates.
// ------------------------------------------------------------------------
proc rep01(P:int[])
   // Outputs P
   rule rep01(P):
      "rep01: ["
      first L <- P
      {
         L -> int[Head::Tail]
         $Head " "
         next L <- Tail
      }*
      "]\n"
// ------------------------------------------------------------------------
proc rep02(P:int)
   rule rep02(P):
      // P should not be negative.
      // Outputs all int values from 0 up to P

      "rep02: "
      first N <- 0
      {
         LessOrEqual(N, P)
         $N " "
         next N <- N + 1
      }*
      "\n"

// ------------------------------------------------------------------------
proc rep03(P:int)
   rule rep03(P):
      // Outputs all int values
      // from P down to 0 (if P is positive) or
      // from P up   to 0 (if P is negative)

      "rep03: "
      first N <- P
      {
         Greater(N, 0)
         "+" $N " "
         next N <- N - 1
      |
         Less(N, 0)
         $N " "
         next N <- N + 1
      }*
      "0\n"
// ------------------------------------------------------------------------
proc rep04(P:string)
   // Outputs all characters of P separated by "+"
   rule rep04(P):
      Stringlength(P -> LEN)

      "rep04: "
      first IND <- 0
      {
         Less   (IND, LEN-1)
         Substring(P, IND, IND+1 -> SUB)
         $SUB "+"
         next IND <- IND+1
      }*
      // If P is not empty, output its last character
      {Greater(LEN, 0) Substring(P, LEN-1, LEN -> SUB) $SUB}?
      "\n"
// -----------------------------------------------------------------------
root
   "-----------------------------------------------\n"
   rep01(int[10, 20, 30, 40, 50])
   rep01(int[])
   "-----------------------------------------------\n"
   rep02(5)
   rep02(0)
   "-----------------------------------------------\n"
   rep03(+5)
   rep03(-5)
   "-----------------------------------------------\n"
   rep04("ABC")
   rep04("X")
   rep04("")
   "-----------------------------------------------\n"

// ------------------------------------------------------------------------
// Output of this program:
// -----------------------------------------------
// rep01: [10 20 30 40 50 ]
// rep01: []
// -----------------------------------------------
// rep02: 0 1 2 3 4 5
// rep02: 0
// -----------------------------------------------
// rep03: +5 +4 +3 +2 +1 0
// rep03: -5 -4 -3 -2 -1 0
// -----------------------------------------------
// rep04: A+B+C
// rep04: X
// rep04:
// -----------------------------------------------

