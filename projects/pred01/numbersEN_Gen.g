// -----------------------------------------------------------------------
// File pred01\numbersEN_Gen.g
// -----------------------------------------------------------------------
// A generator which generates the English words for the numbers
// between 0 and 999 and outputs each number in digits and in
// a double quoted list of words, e.g.
//
// N: 147 L: "one hundred and fourty seven"
//
// For how to write numbers in English words see
// http://gwydir.demon.co.uk/jo/numbers/words/intro.htm
// -----------------------------------------------------------------------

proc number(N:int -> L:string[])
   // If 0<= N and N <= 999 then n is translated into a list L of
   // words which together are the English word for the number N.
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
         L <- string["zero"]
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
   // The English word for 321 is threehundredandtwentyone. It consists of
   // 5 subwords: three hundred and twenty two. These subwords are
   // computed from right to left and L will be the list
   // string["three", "hundred", "and", "twenty", "two"].

   rule processDigits(D2, D1, D0, D1D0 -> L3):
      {
         // Is D1D0 a number between 10 and 19?
         GreaterOrEqual(D1D0, 10)
         LessOrEqual   (D1D0, 19)
         transD1D0(D1D0 -> SD1D0)
         L2 <- string[SD1D0]
      |

         {
            // Do we have to translate the digit D1?
            Greater(D0, 0)
            transD0(D0 -> SD0)
            L1 <- string[SD0]
         |
            L1 <- string[]
         }

         {
            // Do we have to translate the digit D0?
            Greater(D1, 0)
            transD1(D1 -> SD1)
            L2 <- string[SD1::L1]
         |
            L2 <- L1
         }

      }

      {
         // Do we have to translate the digit D2?
         Greater(D2, 0)
         transD0(D2 -> SD2)
         {
            Greater(D1D0, 0)
            L3 <- string[SD2, "hundred", "and"::L2]
         |
            L3 <- string[SD2, "hundred"::L2]
         }
      |
         L3 <- L2
      }
// -----------------------------------------------------------------------
proc transD0(D0:int -> S:string)
   // Translates a digit D0 or a digit D2 into
   // the corresponding German word:
   rule transD0(D0 -> S):
      {
         D0 -> 1 S <- "one"   |
         D0 -> 2 S <- "two"   |
         D0 -> 3 S <- "three" |
         D0 -> 4 S <- "four"  |
         D0 -> 5 S <- "five"  |
         D0 -> 6 S <- "six"   |
         D0 -> 7 S <- "seven" |
         D0 -> 8 S <- "eight" |
         D0 -> 9 S <- "nine"  |
         S <- "Error in transD1"
      }

proc transD1D0(D1D0:int -> string)
   // Translates the digits D1D0 into the corresponding German word:
   rule transD1D0(D1D0 -> S):
      {
         D1D0 -> 10  S <- "ten"       |
         D1D0 -> 11  S <- "eleven"    |
         D1D0 -> 12  S <- "twelve"    |
         D1D0 -> 13  S <- "thirteen"  |
         D1D0 -> 14  S <- "fourteen"  |
         D1D0 -> 15  S <- "fifteen"   |
         D1D0 -> 16  S <- "sixteen"   |
         D1D0 -> 17  S <- "seventeen" |
         D1D0 -> 18  S <- "eighteen"  |
         D1D0 -> 19  S <- "nineteen"  |
         S <- "Error in transD1D0"
      }

proc transD1(D1:int -> string)
   // Translates the digit D1 into the corresponding German word:
   rule transD1(D1 -> S):
      {
         D1 -> 2  S <- "twenty"  |
         D1 -> 3  S <- "thirty"  |
         D1 -> 4  S <- "fourty"  |
         D1 -> 5  S <- "fifty"   |
         D1 -> 6  S <- "sixty"   |
         D1 -> 7  S <- "seventy" |
         D1 -> 8  S <- "eighty"  |
         D1 -> 9  S <- "ninety"  |
         S <- "Error in transD1"
      }
// -----------------------------------------------------------------------
proc out(L:string[])
   // Outputs the elements of L separated by a space (which is
   // a common way to write English numbers in words):
   rule out(string[]):
   rule out(string[H]): $H
   rule out(string[H::T]): $H " " out(T)

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
   open "nrsEN_out.txt"

   // Call predicate number with each int value between 0 and 999
   // and output the int value and the corresponding English words
   // as a double quoted list of words:
   first N <- 0
   {
      LessOrEqual(N, 999)
      number(N -> L)
      "N: " out2(N) " L: \"" out(L) "\"\n"
      next N <- N+1
   }*
   close