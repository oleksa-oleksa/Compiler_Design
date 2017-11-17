// -----------------------------------------------------------------------
// File pred01\patternMatch01.g
// -----------------------------------------------------------------------
// Patterns of the types Address and Expr are matched against various
// values. The result (either "Failure!" or "Success:" and a state are
// output.
// -----------------------------------------------------------------------

root
   // ------------------------------------
   // Patterns and values of type Address:
   // ------------------------------------
   // Pattern adr_P1: sm(STR, NR)
   adr_P1(sm("Mainstreet", 17))
   adr_P1(em("Smith.John", "gmx.de"))

   // Pattern adr_P2: em(STR1, STR2)
   adr_P2(sm("Mainstreet", 17))
   adr_P2(em("Smith.John", "gmx.de"))

   // Pattern adr_P3: sm(STR, 17)
   adr_P3(sm("Mainstreet", 17))
   adr_P3(sm("Mainstreet", 18))

   // Pattern adr_P4: sm("Mainstreet", NR)
   adr_P4(sm("Mainstreet", 18))
   adr_P4(sm("Sunset Blvd", 18))

   // Pattern adr_P5: em("John.Doe", STR)
   adr_P5(em("John.Doe", "t-online.de"))
   adr_P5(em("John.Smith", "t-online.de"))

   // Pattern adr_P6: em(STR, "gmail.com")
   adr_P6(em("John.Smith", "gmail.com"))
   adr_P6(em("John.Doe", "gmx.com"))

   // ------------------------------------
   // Patterns and values of type Expr:
   // ------------------------------------
   // Pattern exp_P1: add(i(I1), i(4))
   exp_P1(add(i(17), i(4)))
   exp_P1(add(i(4), i(17)))

   // Pattern exp_P2: add(i(I1), i(I2))
   exp_P2(i(17))
   exp_P2(sub(i(1), i(2)))
   exp_P2(add(i(17), i(4)))

   // Pattern exp_P3: add(add(E1, E2), add(E1, E2))
   exp_P3(add(add(add(i(6),i(5)),i(4)),add(i(3),i(2))))
   exp_P3(add(add(i(6),i(5)),add(add(i(4),i(3)),i(2)))  )
   exp_P3(add(i(6),add(add(i(5),i(4)),i(3))))
   exp_P3(add(add(add(i(5),i(4)),i(3)),i(2)))

   "-------------------------------------------------------\n"
// root end

// ------------------------------------------------------------------------
// The types:
type Address
   sm(street:string, nr:int)
   em(beforeAt:string, afterAt:string)

type Expr
   add(Expr, Expr)
   sub(Expr, Expr)
   i(int)
// ------------------------------------------------------------------------
// Predicates which match a pattern of type Address against their in-param:

proc adr_P1(Address)
   rule adr_P1(V):
      "-------------------------------------------------------\n"
      PAT <- "sm(STR, NR)"
      {
         V -> sm(STR, NR)
         adrOutS(V, PAT)
         resSI("STR", STR, "NR", NR)  "\n"
      |
         adrOutF(V, PAT)
      }

proc adr_P2(Address)
   rule adr_P2(V):
      "-------------------------------------------------------\n"
      PAT <- "em(STR1, STR2)"
      {
         V -> em(STR1, STR2)
         adrOutS(V, PAT)
         resSS("STR1", STR1, "STR2", STR2)  "\n"
      |
         adrOutF(V, PAT)
      }

proc adr_P3(Address)
   rule adr_P3(V):
      "-------------------------------------------------------\n"
      PAT <- "sm(STR, 17)"
      {
         V -> sm(STR, 17)
         adrOutS(V, PAT)
         resS("STR", STR)  "\n"
      |
         adrOutF(V, PAT)
      }

proc adr_P4(Address)
   rule adr_P4(V):
      "-------------------------------------------------------\n"
      PAT <- "sm(\"Mainstreet\", NR)"
      {
         V -> sm("Mainstreet", NR)
         adrOutS(V, PAT)
         resI("NR", NR)  "\n"
      |
         adrOutF(V, PAT)
      }

proc adr_P5(Address)
   rule adr_P5(V):
      "-------------------------------------------------------\n"
      PAT <- "em(\"John.Doe\", STR)"
      {
         V -> em("John.Doe", STR)
         adrOutS(V, PAT)
         resS("STR", STR)  "\n"
      |
         adrOutF(V, PAT)
      }

proc adr_P6(Address)
   rule adr_P6(V):
      "-------------------------------------------------------\n"
      PAT <- "em(STR, \"gmail.com\")"
      {
         V -> em(STR, "gmail.com")
         adrOutS(V, PAT)
         resS("STR", STR)  "\n"
      |
         adrOutF(V, PAT)
      }

// ------------------------------------------------------------------------
// Predicates which match a pattern of type Expr against their in-param:

proc exp_P1(Expr)
   rule exp_P1(V)
      "-------------------------------------------------------\n"
      PAT <- "add(i(I1), i(4))"
      {
         V -> add(i(I1), i(4))
         expOutS(V, PAT)
         resI("I1", I1) "\n"
      |
         expOutF(V, PAT)
      }

proc exp_P2(Expr)
   rule exp_P2(V)
      "-------------------------------------------------------\n"
      PAT <- "add(i(I1), i(I2))"
      {
         V -> add(i(I1), i(I2))
         expOutS(V, PAT)
         resII("I1", I1, "I2", I2) "\n"
      |
         expOutF(V, PAT)
      }

proc exp_P3(Expr)
   rule exp_P3(V)
      "-------------------------------------------------------\n"
      PAT <- "add(add(E1, E2), add(E3, E4))"
      {
         V -> add(add(E1, E2), add(E3, E4))
         expOutS(V, PAT)
         resEEEE("E1", E1, "E2", E2, "E3", E3, "E4", E4) "\n"
      |
         expOutF(V, PAT)
      }
// ------------------------------------------------------------------------
// Output for type Address:

proc outAddress(A:Address)
   // Outputs A in Gentle syntax.
   rule outAddress(sm(STR, NR)):
      "sm(\"" $STR "\", " $NR ")"
   rule outAddress(em(BEF, AFT)):
      "em(\"" $BEF "\", \"" $AFT "\")"

// Note: Here PAT is a string which looks like a pattern of type Address,
// but it is just a value of type string, not a pattern:

proc adrOutS(VAL:Address, PAT:string)
   // Output if the pattern matching was a SUCCESS:
   rule adrOutS(VAL, PAT)
      "Pattern: " $PAT            "\n"
      "Value  : " outAddress(VAL) "\n"

proc adrOutF(VAL:Address, PAT:string)
   // Output if the pattern matching was a FAILURE:
   rule adrOutF(VAL, PAT)
      "Pattern: " $PAT            "\n"
      "Value  : " outAddress(VAL) "\n"
      "Failure!\n"
// ------------------------------------------------------------------------
// Output for type Expr:

proc outExpr(E:Expr)
   // Outputs E in Gentle syntax.
   rule outExpr(i(I)):
      "i(" $I ")"
   rule outExpr(add(E1, E2)):
      "add(" outExpr(E1) ", " outExpr(E2) ")"
   rule outExpr(sub(E1, E2)):
      "sub(" outExpr(E1) ", " outExpr(E2) ")"

// Note: Here PAT is a string which looks like a pattern of type Expr,
// but it is just a value of type string, not a pattern:

proc expOutS(VAL:Expr, PAT:string)
   // Output if the pattern matching was a SUCCESS:
   rule expOutS(VAL, PAT)
      "Pattern: " $PAT         "\n"
      "Value  : " outExpr(VAL) "\n"

proc expOutF(VAL:Expr, PAT:string)
   // Output if the pattern matching was a FAILURE:
   rule expOutF(VAL, PAT)
      "Pattern: " $PAT         "\n"
      "Value  : " outExpr(VAL) "\n"
      "Failure!\n"
// ------------------------------------------------------------------------
// Predicates which output a state. The capital letters in the names
// indicate the number and the types of the variables in the state:
// SI   string, int
// SS   string, string
// S    string
// I    int
// II   int, int
// EEEE Expre, Expr, Expr, Expr

proc resSI(name1:string, val1:string, name2:string, val2:int)
   rule resSI(N1, V1, N2, V2):
      "Success: {" $N1 "=\"" $V1 "\", " $N2 "=" $V2 "}"

proc resSS(name1:string, val1:string, name2:string, val2:string)
   rule resSS(N1, V1, N2, V2):
      "Success: {" $N1 "=\"" $V1 "\", " $N2 "=\"" $V2 "\"}"

proc resS(name1:string, val1:string)
   rule resS(N1, V1):
      "Success: {" $N1 "=\"" $V1 "\"}"

proc resI(name1:string, val1:int)
   rule resI(N1, V1):
      "Success: {" $N1 "=" $V1 "}"

proc resII(name1:string, val1:int, name2:string, val2:int)
   rule resII(N1, V1, N2, V2):
      "Success: {" $N1 "=" $V1 ", " $N2 "=" $V2 "}"

proc resEEEE(name1:string, val1:Expr, name2:string, val2:Expr,
             name3:string, val3:Expr, name4:string, val4:Expr)
   rule resEEEE(N1, V1, N2, V2, N3, V3, N4, V4):
      "Success: {" $N1 "=" outExpr(V1) ", "
                   $N2 "=" outExpr(V2) ", "
                   $N3 "=" outExpr(V3) ", "
                   $N4 "=" outExpr(V4) "}"
(@ ------------------------------------------------------------------------
Output of program:

-------------------------------------------------------
Pattern: sm(STR, NR)
Value  : sm("Mainstreet", 17)
Success: {STR="Mainstreet", NR=17}
-------------------------------------------------------
Pattern: sm(STR, NR)
Value  : em("Smith.John", "gmx.de")
Failure!
-------------------------------------------------------
Pattern: em(STR1, STR2)
Value  : sm("Mainstreet", 17)
Failure!
-------------------------------------------------------
Pattern: em(STR1, STR2)
Value  : em("Smith.John", "gmx.de")
Success: {STR1="Smith.John", STR2="gmx.de"}
-------------------------------------------------------
Pattern: sm(STR, 17)
Value  : sm("Mainstreet", 17)
Success: {STR="Mainstreet"}
-------------------------------------------------------
Pattern: sm(STR, 17)
Value  : sm("Mainstreet", 18)
Failure!
-------------------------------------------------------
Pattern: sm("Mainstreet", NR)
Value  : sm("Mainstreet", 18)
Success: {NR=18}
-------------------------------------------------------
Pattern: sm("Mainstreet", NR)
Value  : sm("Sunset Blvd", 18)
Failure!
-------------------------------------------------------
Pattern: em("John.Doe", STR)
Value  : em("John.Doe", "t-online.de")
Success: {STR="t-online.de"}
-------------------------------------------------------
Pattern: em("John.Doe", STR)
Value  : em("John.Smith", "t-online.de")
Failure!
-------------------------------------------------------
Pattern: em(STR, "gmail.com")
Value  : em("John.Smith", "gmail.com")
Success: {STR="John.Smith"}
-------------------------------------------------------
Pattern: em(STR, "gmail.com")
Value  : em("John.Doe", "gmx.com")
Failure!
-------------------------------------------------------
Pattern: add(i(I1), i(4))
Value  : add(i(17), i(4))
Success: {I1=17}
-------------------------------------------------------
Pattern: add(i(I1), i(4))
Value  : add(i(4), i(17))
Failure!
-------------------------------------------------------
Pattern: add(i(I1), i(I2))
Value  : i(17)
Failure!
-------------------------------------------------------
Pattern: add(i(I1), i(I2))
Value  : sub(i(1), i(2))
Failure!
-------------------------------------------------------
Pattern: add(i(I1), i(I2))
Value  : add(i(17), i(4))
Success: {I1=17, I2=4}
-------------------------------------------------------
Pattern: add(add(E1, E2), add(E3, E4))
Value  : add(add(add(i(6), i(5)), i(4)), add(i(3), i(2)))
Success: {E1=add(i(6), i(5)), E2=i(4), E3=i(3), E4=i(2)}
-------------------------------------------------------
Pattern: add(add(E1, E2), add(E3, E4))
Value  : add(add(i(6), i(5)), add(add(i(4), i(3)), i(2)))
Success: {E1=i(6), E2=i(5), E3=add(i(4), i(3)), E4=i(2)}
-------------------------------------------------------
Pattern: add(add(E1, E2), add(E3, E4))
Value  : add(i(6), add(add(i(5), i(4)), i(3)))
Failure!
-------------------------------------------------------
Pattern: add(add(E1, E2), add(E3, E4))
Value  : add(add(add(i(5), i(4)), i(3)), i(2))
Failure!
-------------------------------------------------------
------------------------------------------------------------------------ @)
