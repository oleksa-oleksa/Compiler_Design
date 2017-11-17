// -----------------------------------------------------------------------
// File pred03\iteration02.g
// Demonstrates repetition statements with more than one variable.
//
// Does not contain token or phrase predicates.
// -----------------------------------------------------------------------

root
   "-----------------------------------------------\n"
   rep01(5)
// rep02(3, 2)
// rep03(int[1,2], int[3,4])
   "-----------------------------------------------\n"
// -----------------------------------------------------------------------
proc rep01(int)
   rule rep01(P):
      first N1 <- P
      first N2 <- 1
      {
         Greater(N1, 0)
         "-----\n"
         "N1: " $N1 "\n"
         "N2: " $N2 "\n"

         next N1 <- N1-1
         next N2 <- N2+1
      }*
      "-----\n"
// -----------------------------------------------------------------------
// proc rep02(P1:int, P2:int)
//    rule rep02(P1, P2):
//       first N1 <- P1
//       {
//          Greater(N1, 0)
//          first N2 <- P2
//          {
//             Greater(N2, 0)
//             $N1 "|" $N2 " "
//             next N2 <- N2-1
//          }*
//          " X\n"
//          next N1 <- N1-1
//       }*

// Error message while compiling:
//
// refefinition problem
// N1
// 41
// -----------------------------------------------------------------------
// proc rep03(P1:int[], P2:int[])
//    rule rep03(P1, P2):
//       first L1 <- P1
//       {
//          L1 -> int[H1::T1]
//          {
//             first L2 <- P2
//             {
//                L2 -> int[H2::T2]
//                $H1 "|" $H2 " "
//                next L2 <- T2
//             }*
//          }?
//          "\n"
//          next L1 <- T1
//       }*

// Error message while compiling:

// refefinition problem
// L1
// 64

// -----------------------------------------------------------------------
// Output of this program:
//
// -----
// N1: 5
// N2: 1
// -----
// N1: 4
// N2: 2
// -----
// N1: 3
// N2: 3
// -----
// N1: 2
// N2: 4
// -----
// N1: 1
// N2: 5
// -----