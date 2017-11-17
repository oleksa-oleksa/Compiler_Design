// -----------------------------------------------------------------------
// File pred03\alternatives01.g
// Demonstrates the alternatives statement.
//------------------------------------------------------------------------
// The predicates evalA, evalB and evalC compute the same function
// (they all evalute expressions of type Exp)
//
// evalA consists of 5 rules, one for each case                (14 lines)
// evalB consists of 2 rules, the first of which contains
//       an alternatives statement                             (14 lines)
// evalC the same as evalB, only typed with a different layout (11 lines)
// -----------------------------------------------------------------------
type Op2 add() sub() mul() div()

type Exp
   exp(Op2, Exp, Exp)
   lit(int)
// ------------------------------------------------------------------------
proc evalA(Exp -> int)
   rule evalA(exp(add(), E1, E2) -> N1+N2):
      evalA(E1 -> N1)
      evalA(E2 -> N2)
   rule evalA(exp(sub(), E1, E2) -> N1-N2):
      evalA(E1 -> N1)
      evalA(E2 -> N2)
   rule evalA(exp(mul(), E1, E2) -> N1*N2):
      evalA(E1 -> N1)
      evalA(E2 -> N2)
   rule evalA(exp(div(), E1, E2) -> N1/N2):
      evalA(E1 -> N1)
      evalA(E2 -> N2)
   rule evalA(lit(N) -> N):
// ------------------------------------------------------------------------
proc evalB(Exp -> int)
   rule evalB(exp(OP, E1, E2) -> V):
      evalB(E1 -> V1)
      evalB(E2 -> V2)
      {
         OP -> add() V <- V1+V2
      |
         OP -> sub() V <- V1-V2
      |
         OP -> mul() V <- V1*V2
      |
         OP -> div() V <- V1/V2
      }
   rule evalB(lit(N) -> N):
// ------------------------------------------------------------------------
proc evalC(Exp -> int)
   rule evalC(exp(OP, E1, E2) -> V):
      evalC(E1 -> V1)
      evalC(E2 -> V2)
      {
         OP -> add() V <- V1+V2 |
         OP -> sub() V <- V1-V2 |
         OP -> mul() V <- V1*V2 |
         OP -> div() V <- V1/V2
      }
   rule evalC(lit(N) -> N):
// ------------------------------------------------------------------------
proc test1(Exp)
   rule test1(E):
   evalA(E -> VA)
   evalB(E -> VB)
   evalC(E -> VC)
   "------\n"
   "VA: " $VA "\n"
   "VB: " $VB "\n"
   "VC: " $VC "\n"
// ------------------------------------------------------------------------
root
   test1(exp(add(), lit(1), lit(1)))
   test1(exp(sub(),
             exp(mul(), lit(2), lit(3) ),
             exp(div(), lit(8),
                        exp(add(), lit(1), lit(3))
                )
            )
        )
// ------------------------------------------------------------------------
// Output of this program:
//
// ------
// VA: 2
// VB: 2
// VC: 2
// ------
// VA: 4
// VB: 4
// VC: 4