// -----------------------------------------------------------------------
// File pred03\alternatives03.g
// Nested alternatives statements
//------------------------------------------------------------------------
proc pBase3(N1:int, N2:int)
   // Prints a single entry of the multiplication table
   // for base 3 numbers, from 1x1 up to 10x10 (i.e. 3x3)
   rule pBase3(N1, N2):
   {
      N1 -> 1
      {
         N2 -> 1 " 1x 1 =   1\n" |
         N2 -> 2 " 1x 2 =   2\n" |
         N2 -> 3 " 1x10 =  10\n" |
         "Parameter N2: " $N2 " is out of range\n"
      }
   |
      N1 -> 2
      {
         N2 -> 1 " 2x 1 =   2\n" |
         N2 -> 2 " 2x 2 =  11\n" |
         N2 -> 3 " 2x10 =  20\n" |
         "Parameter N2: " $N2 " is out of range\n"
      }
   |
      N1 -> 3
      {
         N2 -> 1 "10x 1 =  10\n" |
         N2 -> 2 "10x 2 =  20\n" |
         N2 -> 3 "10x10 = 100\n" |
         "Parameter N2: " $N2 " is out of range\n"
      }
   |
      "Parameter N1: " $N1 " is out of range\n"
   }
//------------------------------------------------------------------------
root
   "-----------------------\n"
   "1x1 for base 3 numbers:\n"
   "-----------------------\n"
   pBase3(1, 1)
   pBase3(1, 2)
   pBase3(1, 3)
   "------------\n"
   pBase3(2, 1)
   pBase3(2, 2)
   pBase3(2, 3)
   "------------\n"
   pBase3(3, 1)
   pBase3(3, 2)
   pBase3(3, 3)
   "------------\n"
   pBase3(0, 1)
   pBase3(1, 4)
   "------------\n"
(@ ------------------------------------------------------------------------
Output of this program:

-----------------------
1x1 for base 3 numbers:
-----------------------
 1x 1 =   1
 1x 2 =   2
 1x10 =  10
------------
 2x 1 =   2
 2x 2 =  11
 2x10 =  20
------------
10x 1 =  10
10x 2 =  20
10x10 = 100
------------
Parameter N1: 0 is out of range
Parameter N2: 4 is out of range
------------------------------------------------------------------------------------ @)
