// -----------------------------------------------------------------------
// File pred01\numbersEN_Comp.g
// -----------------------------------------------------------------------
// Translates a list of English words for numbers between 0 and 999
// (between  zero  and  nine hundred and ninety nine)
// into a corresponding list of int values. The input list should be
// in the Gentle syntax for a list of strings, e.g.
//
// string["zero", "seventeen", "three hundred and seventy five"]
// -----------------------------------------------------------------------

phrase listOfNumberWords(-> int[])
   rule listOfNumberWords(-> L):
      "string" "[" numbers(-> L) "]"

phrase numbers(-> int[])
   // A list of words for numbers, each number in double quotes:
   rule numbers(-> int[N::L]): "\"" number0_999(-> N) "\"" "," numbers(-> L)
   rule numbers(-> int[N]   ): "\"" number0_999(-> N) "\""

phrase number0_999(-> int)
   // The word for a number between 0 and 999
   rule number0_999(-> 0):     "zero"
   rule number0_999(-> N):     n100(-> N)
   rule number0_999(-> N1+N2): n100(-> N1) and n1_99(-> N2)
   rule number0_999(-> N):     n1_99(-> N)

phrase n100(-> int)
   // The hundreds part of a number word (optional part)
   // e.g. "one hundred" or "eight hundred"
   rule n100(-> N*100): n1_9(-> N) "hundred"

phrase n1_99(-> int)
   // The word for a number between 1 and 99
   rule n1_99(-> N):     n1_9(-> N)
   rule n1_99(-> N):     n10_19(-> N)
   rule n1_99(-> N):     n20_90(-> N)
   rule n1_99(-> N1+N2): n20_90(-> N1) n1_9(-> N2)

phrase  n1_9(-> int)
   // The word for a number between 1 and 9
   rule n1_9(-> 1): "one"
   rule n1_9(-> 2): "two"
   rule n1_9(-> 3): "three"
   rule n1_9(-> 4): "four"
   rule n1_9(-> 5): "five"
   rule n1_9(-> 6): "six"
   rule n1_9(-> 7): "seven"
   rule n1_9(-> 8): "eight"
   rule n1_9(-> 9): "nine"

phrase  n10_19(-> int)
   // The word for a number between 10 and 19
   rule n10_19(-> 10): "ten"
   rule n10_19(-> 11): "eleven"
   rule n10_19(-> 12): "twelve"
   rule n10_19(-> 13): "thirteen"
   rule n10_19(-> 14): "fourteen"
   rule n10_19(-> 15): "fifteen"
   rule n10_19(-> 16): "sixteen"
   rule n10_19(-> 17): "seventeen"
   rule n10_19(-> 18): "eighteen"
   rule n10_19(-> 19): "nineteen"

phrase n20_90(-> int)
   // The word for a multiple of ten: 20, 30, ..., 90
   rule n20_90(-> 20): "twenty"
   rule n20_90(-> 30): "thirty"
   rule n20_90(-> 40): "fourty"
   rule n20_90(-> 50): "fifty"
   rule n20_90(-> 60): "sixty"
   rule n20_90(-> 70): "seventy"
   rule n20_90(-> 80): "eighty"
   rule n20_90(-> 90): "ninety"

phrase and
   // After "hundred" the word "and" is optional
   rule and:
   rule and: "and"
// -----------------------------------------------------------------------
whitespace
   <<<//.*|\ |\t|\r|\n>>>
// -----------------------------------------------------------------------
proc out(L:int[])
   // Outputs L in Gentle syntax (e.g. int[10, 20, 30])
   rule out(int[]):
      "int[]\n"
   rule out(int[H::T])
      " int[" out2(H) out1(T) "]\n"

proc out1(int[])
   rule out1(int[]):
   rule out1(int[H::T]):
      ", " out2(H) out1(T)

proc out2(int)
   rule out2(N):
      {
         Less(N,  10) "  " $N |
         Less(N, 100) " "  $N |
         $N
      }
// -----------------------------------------------------------------------
root
   listOfNumberWords(-> L)
   out(L)