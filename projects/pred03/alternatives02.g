// -----------------------------------------------------------------------
// File pred03\alternatives02.g
// An example in which an alternatives statement is possibly
// of great advantage.
//
// Does not contain token or phrase predicates.
//------------------------------------------------------------------------
// The predicates processA and processB solve the same problem,
// processA with several rules and
// processB with an alternatives statement in only one rule.
// processA calls the procedure expensive more often then processB.
//------------------------------------------------------------------------
proc processA(N:int)
   rule processA(N):
      expensive(N -> RES)
      RES -> 1  "*** The result was 1!\n\n"
   rule processA(N):
      expensive(N -> RES)
      RES -> 2  "*** The result was 2!\n\n"
   rule processA(N):
      expensive(N -> RES)
      RES -> 3  "*** The result was 3!\n\n"
   rule processA(N):
      "*** The result was something else!\n"
//------------------------------------------------------------------------
proc processB(N:int)
   rule processB(N):
      expensive(N -> RES)
      {
         RES -> 1  "*** The result was 1!\n\n" |
         RES -> 2  "*** The result was 2!\n\n" |
         RES -> 3  "*** The result was 3!\n\n" |
         "*** The result was something else!\n"
      }
//------------------------------------------------------------------------
proc expensive(N:int -> RES:int)
   // Computes RES as N mod 17
   // Assume that this predicate is expensive to execute
   rule expensive(N -> N - (N/17*17)):
     "expensive was called!\n"
//------------------------------------------------------------------------
root
   "-------------------------------\n"
   "processA:\n\n"
   processA(1)
   processA(2)
   processA(3)
   processA(-123)
   "-------------------------------\n"
   "processB:\n\n"
   processB(1)
   processB(2)
   processB(3)
   processB(-123)
   "-------------------------------\n"
//------------------------------------------------------------------------
// Output of this program:
// -------------------------------
// processA:
//
// expensive was called!
// *** The result was 1!
//
// expensive was called!
// expensive was called!
// *** The result was 2!
//
// expensive was called!
// expensive was called!
// expensive was called!
// *** The result was 3!
//
// expensive was called!
// expensive was called!
// expensive was called!
// *** The result was something else!
// -------------------------------
// processB:
//
// expensive was called!
// *** The result was 1!
//
// expensive was called!
// *** The result was 2!
//
// expensive was called!
// *** The result was 3!
//
// expensive was called!
// *** The result was something else!
// -------------------------------