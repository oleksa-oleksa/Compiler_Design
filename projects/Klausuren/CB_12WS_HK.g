// Datei CB_12WS_HK.g
// ------------------------------------------------------------------------
proc listeDerBesonderen(L:int[] -> BL:int[])
   // Die Liste BL enthaelt alle besonderen Elemente der Liste B.
   // Welche Elemente "besonders" sind, entscheidet das Praedikat
   //
   // condition istBesonders(N:int)
   //    // Gelingt, wenn die Zahl N besonders ist
   //
   // Nehmen Sie an, dass das Praedikat istBesonders vorgegeben ist.

   rule listeDerBesonderen(int[] -> int[]):
   rule listeDerBesonderen(int[N::R] -> ERG):
      listeDerBesonderen(R -> BR)
      {
         istBesonders(N)
         ERG <- int[N::BR]
      |
         ERG <- BR
      }

condition istBesonders(int)
   rule istBesonders(N):
      GreaterOrEqual(N, 3)
         LessOrEqual(N, 6)
// ------------------------------------------------------------------------
condition keineZwillinge(L:int[])
   // Gelingt genau dann wenn L keine Zwillinge (gleiche, benachbarte
   // Elemente) enthaelt.
   // Beispiele:
   // Die Liste int[1, 2, 1, 2] enthaelt keinen Zwilling
   // Die Liste int[1, 2, 2, 1] enthaelt einen Zwilling

   rule keineZwillinge(int[]):
   rule keineZwillinge(int[N]):
   rule keineZwillinge(int[N1,N2::R]):
      Unequal(N1, N2)
      keineZwillinge(int[N2::R])
// ------------------------------------------------------------------------
proc aus2mach1(L1:int[], L2:int[] -> L3:int[])
   // L3 enthaelt abwechselnd ein Element aus L1 gefolgt von einem Element
   // aus L2, solange das moegliche ist, und dann
   // die "ueberzaehligen Elemente" der laengeren in-Liste.
   // Beispiel: Nach dem Aufruf
   // aus2mach1(int[1,2], int[3,4,5,6] -> L3)
   // ist L3 gleich int[1,3,2,4,5,6]

   rule aus2mach1(int[], L2 -> L2):
   rule aus2mach1(L1, int[] -> L1):
   rule aus2mach1(int[N1::R1], int[N2::R2] -> int[N1, N2::L12]):
      aus2mach1(R1, R2 -> L12)
// ------------------------------------------------------------------------
proc listeDerBesonderenTst()
   rule listeDerBesonderenTst()
      L0 <- int[]
      L1 <- int[2]
      L2 <- int[7]
      L3 <- int[3]
      L4 <- int[6]
      L5 <- int[0,1,2,7,8,9]
      L6 <- int[6,5,4,3]
      L7 <- int[9,8,7,6,5,4,3,2,1,0]

      listeDerBesonderenTst1(L0)
      listeDerBesonderenTst1(L1)
      listeDerBesonderenTst1(L2)
      listeDerBesonderenTst1(L3)
      listeDerBesonderenTst1(L4)
      listeDerBesonderenTst1(L5)
      listeDerBesonderenTst1(L6)
      listeDerBesonderenTst1(L7)

proc listeDerBesonderenTst1(L:int[])
   rule listeDerBesonderenTst1(L):
      listeDerBesonderen(L -> BL)
      "listeDerBesonderen(" p(L) " -> " p(BL) ")\n"
// ------------------------------------------------------------------------
proc keineZwillingeTst()
   rule keineZwillingeTst():
      L0 <- int[]
      L1 <- int[5]
      L2 <- int[5,3]
      L3 <- int[5,5]
      L4 <- int[1,2,1,2]
      L5 <- int[1,2,2,1]
      keineZwillingeTst1(L0)
      keineZwillingeTst1(L1)
      keineZwillingeTst1(L2)
      keineZwillingeTst1(L3)
      keineZwillingeTst1(L4)
      keineZwillingeTst1(L5)

proc keineZwillingeTst1(L:int[])
   rule keineZwillingeTst1(L):
      {
         keineZwillinge(L)
         "ist gelungen      : "
      |
         "ist nicht gelungen: "
      }
      "keineZwillinge(" p(L) ")\n"
// ------------------------------------------------------------------------
proc aus2mach1Tst()
   rule aus2mach1Tst()
      L0 <- int[]
      L1 <- int[5]
      L2 <- int[1,2,3]
      L3 <- int[4,5]

      aus2mach1Tst1(L0, L0)
      aus2mach1Tst1(L0, L1)
      aus2mach1Tst1(L1, L0)
      aus2mach1Tst1(L2, L2)
      aus2mach1Tst1(L2, L3)
      aus2mach1Tst1(L3, L2)

proc aus2mach1Tst1(L1:int[], L2:int[])
   rule aus2mach1Tst1(L1, L2):
      aus2mach1(L1,L2 -> L3)
      "aus2mach1("  p(L1) ", " p(L2) " -> " p(L3) ")\n"
// ------------------------------------------------------------------------
proc p(int[])
   rule p(L):
      "int["
      p1(L)
      "]"
proc p1(int[])
   rule p1(int[N1,N2::R]):
      $N1 ","
      p1(int[N2::R])
   rule p1(int[N]):
      $N
   rule p1(int[]):
// ------------------------------------------------------------------------
root
   "-----------------------------------------------\n"
   listeDerBesonderenTst()
   "-----------------------------------------------\n"
   keineZwillingeTst()
   "-----------------------------------------------\n"
   aus2mach1Tst()
   "-----------------------------------------------\n"
