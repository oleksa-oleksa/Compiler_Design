// -----------------------------------------------------------------------
// File pred01\numbersDE_Comp.g
// -----------------------------------------------------------------------
// Translates a list of German words for numbers between 0 and 999
// (zwischen null und neunhundertundneunundneunzig)
// into a corresponding list of int values. The input list should be
// in the Gentle syntax for a list of strings, e.g.
//
// string["null", "siebzehn", "dreihundertundfuenfundsiebzig"]
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
   rule number0_999(-> 0):     "null"
   rule number0_999(-> N):     n100(-> N)
   rule number0_999(-> N1+N2): n100(-> N1) und n1_99(-> N2)
   rule number0_999(-> N):     n1_99(-> N)

phrase n100(-> int)
   // The hundreds part of a number word
   // e.g. "" or "hundert" or "dreihundert"
   rule n100(-> 100):   "hundert"
   rule n100(-> N*100): n1_9(-> N) "hundert"

phrase n1_99(-> int)
   // The word for a number between 1 and 99
   rule n1_99(-> N):     n1_9G(-> N)
   rule n1_99(-> N):     n10_19(-> N)
   rule n1_99(-> N):     n20_90(-> N)
   rule n1_99(-> N1+N2): n1_9G(-> N1) "und" n20_90(-> N2)

phrase  n1_9(-> int)
   // The word for a number between 1 and 9
   // (only masculine "ein")
   rule n1_9(-> 1):  "ein"
   rule n1_9(-> N):  n2_9(-> N)

phrase  n1_9G(-> int)
   // The word for a number between 1 and 9
   // (G like "gendered")
   rule n1_9G(-> 1): "ein"
   rule n1_9G(-> 1): "eine"
   rule n1_9G(-> 1): "eins"
   rule n1_9G(-> N): n2_9(-> N)

phrase  n2_9(-> int)
   // The word for a number between 2 and 9
   rule n2_9(-> 2): "zwei"
   rule n2_9(-> 3): "drei"
   rule n2_9(-> 4): "vier"
   rule n2_9(-> 5): "fuenf"
   rule n2_9(-> 6): "sechs"
   rule n2_9(-> 7): "sieben"
   rule n2_9(-> 8): "acht"
   rule n2_9(-> 9): "neun"

phrase  n10_19(-> int)
   // The word for a number between 10 and 19
   rule n10_19(-> 10): "zehn"
   rule n10_19(-> 11): "elf"
   rule n10_19(-> 12): "zwoelf"
   rule n10_19(-> 13): "dreizehn"
   rule n10_19(-> 14): "vierzehn"
   rule n10_19(-> 15): "fuenfzehn"
   rule n10_19(-> 16): "sechzehn"
   rule n10_19(-> 17): "siebzehn"
   rule n10_19(-> 18): "achtzehn"
   rule n10_19(-> 19): "neunzehn"

phrase n20_90(-> int)
   // The word for a multiple of ten: 20, 30, ..., 90
   rule n20_90(-> 20): "zwanzig"
   rule n20_90(-> 30): "dreissig"
   rule n20_90(-> 40): "vierzig"
   rule n20_90(-> 50): "fuenfzig"
   rule n20_90(-> 60): "sechzig"
   rule n20_90(-> 70): "siebzig"
   rule n20_90(-> 80): "achtzig"
   rule n20_90(-> 90): "neunzig"

phrase und
   // After "hundert" the word "und" is optional
   rule und:
   rule und: "und"
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