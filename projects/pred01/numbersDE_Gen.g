// -----------------------------------------------------------------------
// File pred01\numbersDE_Gen.g
// -----------------------------------------------------------------------
// A generator which generates the German words for the numbers
// between 0 and 999 and outputs each number in words and in digits, e.g.
//
// N: 147 L: einhundertsiebenundvierzig
// -----------------------------------------------------------------------

proc number(N:int -> L:string[])
   // If 0<= N and N <= 999 then n is translated into a list L of
   // words which together are the German word for the number N.
   // Otherwise an error message is returned in L and
   // another error message is output.

   rule number(N -> L):
      {
         Less(N, 0)
         L <- string["In-parameter of number is less than 0!\n"]
         "In-parameter " $N " of predicate number is less than 0!\n"
      |
         Greater(N, 999)
         L <- string["In-parameter of number is greater than 999!\n"]
         "In-parameter " $N " of predicate number is greater than 999!\n"
      |
         // Get the simple case "N equals 0" out of the way:
         Equal(N, 0)
         L <- string["null"]
      |
         // To construct the word for N it is convenient to have
         // the three decimal digits D2 D1 D0 of which N consists:
         // Example: If N = 345 then D2=3, D1=4, D0=5
         // Example: If N =   6 then D2=0, D1=0, D0=6
         D2 <- N/100 - N/100/10*10 // The expression after "-" has value 0
         D1 <- N/ 10 - N/ 10/10*10
         D0 <- N/  1 - N/  1/10*10

         // Compute the rightmost two digits D1D0 of N
         D1D0 <- D1*10 + D0

         processDigits(D2, D1, D0, D1D0 -> L)
      }


proc processDigits(D2:int, D1:int, D0:int, D1D0:int -> L:string[])
   // The German word for 321 is dreihunderteinundzwanzig. It consists of
   // 6 subwords: drei hundert und zwei und zwanzig. These subwords are
   // computed from right to left and L will be the list
   // string["drei", "hundert", "und", "zwei", "und", "zwanzig"].

   rule processDigits(D2, D1, D0, D1D0 -> L4):
      {
         // Is D1D0 a number between 10 and 19?
         GreaterOrEqual(D1D0, 10)
         LessOrEqual   (D1D0, 19)
         transD1D0(D1D0 -> SD1D0)
         L3 <- string[SD1D0]
      |
         {
            // Do we have to translate the digit D0?
            Greater(D1, 0)
            transD1(D1 -> SD1)
            L1 <- string[SD1]
         |
            L1 <- string[]
         }

         {
            // If both D0 and D1 have to be translated, the word
            // "und" goes in between the two translations:
            Greater(D0, 0)
            Greater(D1, 0)
            L2 <- string["und"::L1]
         |
            L2 <- L1
         }

         {
            // Do we have to translate the digit D1?
            Greater(D0, 0)
            transD0(D0 -> SD0)
            L3 <- string[SD0::L2]
         |
            L3 <- L2
         }
      }

      {
         // Do we have to translate the digit D2?
         Greater(D2, 0)
         transD0(D2 -> SD2)
         L4 <- string[SD2, "hundert"::L3]
      |
         L4 <- L3
      }
// -----------------------------------------------------------------------
proc transD0(D0:int -> S:string)
   // Translates a digit D0 or a digit D2 into
   // the corresponding German word:
   rule transD0(D0 -> S):
      {
         D0 -> 1 S <- "ein"    |
         D0 -> 2 S <- "zwei"   |
         D0 -> 3 S <- "drei"   |
         D0 -> 4 S <- "vier"   |
         D0 -> 5 S <- "fuenf"  |
         D0 -> 6 S <- "sechs"  |
         D0 -> 7 S <- "sieben" |
         D0 -> 8 S <- "acht"   |
         D0 -> 9 S <- "neun"   |
         S <- "Error in transD1"
      }

proc transD1D0(D1D0:int -> string)
   // Translates the digits D1D0 into the corresponding German word:
   rule transD1D0(D1D0 -> S):
      {
         D1D0 -> 10  S <- "zehn"      |
         D1D0 -> 11  S <- "elf"       |
         D1D0 -> 12  S <- "zwoelf"    |
         D1D0 -> 13  S <- "dreizehn"  |
         D1D0 -> 14  S <- "vierzehn"  |
         D1D0 -> 15  S <- "fuenfzehn" |
         D1D0 -> 16  S <- "sechzehn"  |
         D1D0 -> 17  S <- "siebzehn"  |
         D1D0 -> 18  S <- "achtzehn"  |
         D1D0 -> 19  S <- "neunzehn"  |
         S <- "Error in transD1D0"
      }

proc transD1(D1:int -> string)
   // Translates the digit D1 into the corresponding German word:
   rule transD1(D1 -> S):
      {
         D1 -> 2  S <- "zwanzig"    |
         D1 -> 3  S <- "dreissig"   |
         D1 -> 4  S <- "vierzig"    |
         D1 -> 5  S <- "fuenfzig"   |
         D1 -> 6  S <- "sechzig"    |
         D1 -> 7  S <- "siebzig"    |
         D1 -> 8  S <- "achtzig"    |
         D1 -> 9  S <- "neunzig"    |
         S <- "Error in transD1"
      }
// -----------------------------------------------------------------------
proc out(L:string[])
   // Outputs the elements of L without any separating characters
   // between them:
   rule out(string[]):
   rule out(string[H::T]): $H out(T)

proc out2(N:int)
   // Outputs N as 3 characters, padding with spaces on the left side:
   rule out2(N):
      {
         Less(N,  10) "  " $N |
         Less(N, 100) " "  $N |
         $N
      }
// -----------------------------------------------------------------------
root
   // Call predicate number with illegal in-parameters,
   // any output (including error messages) goes to the screen:
   number(  -1 -> L1) out(L1)
   number(1000 -> L2) out(L2)

   // From now on output goes to a file:
   open "nrsDE_out.txt"

   // Call predicate number with each int value between 0 and 999
   // and output the int value and the corresponding German word
   // as a string literal in double quotes (e.g. "siebzehn")
   first N <- 0
   {
      LessOrEqual(N, 999)
      number(N -> L)
      "N: " out2(N) " L: \"" out(L) "\"\n"
      next N <- N+1
   }*
   close