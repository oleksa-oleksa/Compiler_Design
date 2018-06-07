/// File alg31\spec.g
// ------------------------------------------------------------------------
// A compiler that translates alg30 programs into Jasmin (Java assembler).
// ------------------------------------------------------------------------
//
// Abbreviations:
// SI        source identifier (e.g. x, n17, sumOfEverything)
// TI        target identifier (e.g. 1, 2, 3)
// CS        concrete syntax
// AS        abstract syntax
// DEC, DECS declaration, declarations
// CMD, CMDS command, commands
// EXP       expression
// ------------------------------------------------------------------------
root
//   root1() // "with    bells and whistles" for development
 root2() // "without bells and whistles" for test and production
// ----------------------------------------------
proc root1()
   rule root1():
      initialise()
      "-------------------------------\n"
      "Error messages from the parser:\n"
      CS_Cmds(-> SynTree)
      "No errors found!\n"
      "-------------------------------\n"
      "Additional error messages:\n\n"
      check10(SynTree)
      "\nEnd of additonal error messages\n"
      "-------------------------------\n"
      //"SynTree:\n" pCmds(SynTree)
      "-------------------------------\n"
      // Translate the SynTree and output the result to a .j file:
      outAll(SynTree)
// ----------------------------------------------
proc root2()
   rule root2():
      initialise()
      CS_Cmds(-> SynTree)
      check10(SynTree)
      outAll(SynTree)
// ------------------------------------------------------------------------
// Qups (query and update pairs):
//
// Each source identifier has to be translated to a target identifier:
// Target identifiers are natural numbers starting with 1.
data NextTargetID(-> int)

data NextLabelId(-> int)

data NextCmpLabelID(-> int)
data NextConLabelID(-> int)
data NextLoopLabelID(-> int)
data IntCompareInstr(-> string)
data StringCompareMethod(-> string)


// The symbol table SymTab maps source identifiers of type string
// to their meaning of type Meaning
type Meaning m(Type:AS_Type, TargetID:int)
data SymTab(string -> Meaning)
// ------------------------------------------------------------------------
// Qups have to be initialized before they are used:
proc initialise()
   rule initialise():
      Set-NextTargetID(0)
      Set-NextCmpLabelID(0)
      Set-NextConLabelID(0)
      Set-NextLoopLabelID(0)
        
// ------------------------------------------------------------------------
// Abstract syntax types:

type AS_Cmd
   writeln(AS_Exp)                             // write with newline
   write(AS_Exp)                               // write without newline
   vardec (SI: string, AS_Type, Init: AS_Exp?) // Variable declaration
   assign (SI: string, AS_Exp)                 // Assignment
   read(SI: string)
   if(Condition:AS_Exp, IfCmds:AS_Cmd[])
   ifElse(Condition:AS_Exp, IfCmds:AS_Cmd[], ElseCmds:AS_Cmd[])
   doWhile(Condition:AS_Exp, doWhile:AS_Cmd[])
   while(Condition:AS_Exp, while:AS_Cmd[])

type AS_Exp
   varapp(SourceId: string)                    // Variable application
   lit(AS_Val)                                 // Literal
   exp1(AS_Op1, AS_Exp)                        // Expression with operator, type 1
   exp2(AS_Op2, AS_Exp, AS_Exp)                // Expression with operator, type 2

type AS_Val                                    // Values of literals
   intVal(int)
   boolVal(int)
   stringVal(string)

type AS_Type                                   // Types of expressions
   int()
   bool()
   string()


type AS_Op1
   minus()  // unary negation
   not()    // unary not

        
type AS_Op2
   conc()   // &
   lt()     // <
   le()     // <=
   eq()     // =
   ne()     // !=
   ge()     // >=
   gt()     // >
   or()     // logic or
   and()    // logic and
   add()    // +
   sub()    // -
   mul()    // *
   div()    // /

// ------------------------------------------------------------------------
// Concrete syntax to abstract syntax (syntax checks of type 3 and 2)
// An alg-program is a non-empty list of commands. Every command ends
// with a semicolan ";".

phrase  CS_Cmds(-> AS_Cmd[])
   rule CS_Cmds(-> AS_Cmd[CMD]):
      CS_Cmd(->  CMD) ";"
   rule CS_Cmds(-> AS_Cmd[CMD::CMDS]):
      CS_Cmd (-> CMD) ";"
      CS_Cmds(-> CMDS)

phrase  CS_Cmd(-> AS_Cmd)

   // write
   rule CS_Cmd(-> write(EXP)):
      "write" "(" CS_Exp(-> EXP)   ")"

   // writeln
   rule CS_Cmd(-> writeln(EXP)):
      "writeln" "(" CS_Exp(-> EXP)   ")"

   // Variable declarations without explicit initialization.
   rule CS_Cmd(-> vardec(I, int(), AS_Exp?())):
      "int" IDENT(->I) 
   rule CS_Cmd(-> vardec(I, string(), AS_Exp?())):
      "string" IDENT(->I) 
   rule CS_Cmd(-> vardec(I, bool(), AS_Exp?())):
      "bool" IDENT(->I)


   // Variable declarations with explicit initialization:
   rule CS_Cmd(-> vardec(I, int(), AS_Exp?(Exp))):
      "int" IDENT(->I) ":=" CS_Exp(->Exp)
   rule CS_Cmd(-> vardec(I, string(), AS_Exp?(Exp))):
      "string" IDENT(->I) ":=" CS_Exp(->Exp)
   rule CS_Cmd(-> vardec(I, bool(), AS_Exp?(Exp))):
      "bool" IDENT(->I) ":=" CS_Exp(->Exp)

   // assignment
   rule CS_Cmd(-> assign(I, Exp)):
      IDENT(-> I) ":=" CS_Exp(-> Exp)

   // read
   rule CS_Cmd(-> read(I)):
      "read" "(" IDENT(-> I) ")"

   // if
   rule CS_Cmd(-> if(E, CS)):
      "if" CS_Exp(-> E) "then"
      CS_Cmds(-> CS)
      "end" "if"

   // ifelse
   rule CS_Cmd(-> ifElse(E, C1, C2)):
      "if" CS_Exp(-> E) "then"
      CS_Cmds(-> C1)
      "else"
      CS_Cmds(-> C2)
      "end" "if"

   // Do
   rule CS_Cmd(-> doWhile(E, CS)):
      "do"
      CS_Cmds(-> CS)
      "until" CS_Exp(-> E) "end" "until"

   // While
   rule CS_Cmd(-> while(E, CS)):
      "while" CS_Exp(-> E) "do"
      CS_Cmds(-> CS)
      "end" "while"

phrase  CS_Exp(-> AS_Exp)
   rule CS_Exp (-> exp2(conc(), Exp1, Exp2)):
      CS_Exp(-> Exp1) "&" CS_Exp1(-> Exp2)
   rule CS_Exp (-> Exp):
      CS_Exp1(-> Exp)

phrase CS_Exp1(-> AS_Exp)
   rule CS_Exp1(-> exp2(lt(), Exp1, Exp2)):
      CS_Exp1(-> Exp1) "<" CS_Exp2(-> Exp2)
   rule CS_Exp1(-> exp2(le(), Exp1, Exp2)):
      CS_Exp1(-> Exp1) "<=" CS_Exp2(-> Exp2)
   rule CS_Exp1(-> exp2(eq(), Exp1, Exp2)):
      CS_Exp1(-> Exp1) "=" CS_Exp2(-> Exp2)
   rule CS_Exp1(-> exp2(ne(), Exp1, Exp2)):
      CS_Exp1(-> Exp1) "!=" CS_Exp2(-> Exp2)
   rule CS_Exp1(-> exp2(ge(), Exp1, Exp2)):
      CS_Exp1(-> Exp1) ">=" CS_Exp2(-> Exp2)
   rule CS_Exp1(-> exp2(gt(), Exp1, Exp2)):
      CS_Exp1(-> Exp1) ">" CS_Exp2(-> Exp2)
   rule CS_Exp1(-> Exp):
      CS_Exp2(-> Exp)

phrase CS_Exp2(-> AS_Exp)
   rule CS_Exp2(-> exp2(or(), Exp1, Exp2)):
      CS_Exp2(-> Exp1) "or" CS_Exp3(-> Exp2)
   rule CS_Exp2(-> Exp):
      CS_Exp3(-> Exp) 

phrase CS_Exp3(-> AS_Exp)
   rule CS_Exp3(-> exp2(and(), Exp1, Exp2)):
      CS_Exp3(-> Exp1) "and" CS_Exp4(-> Exp2)
   rule CS_Exp3(-> Exp):
      CS_Exp4(-> Exp)

phrase CS_Exp4(-> AS_Exp)
   rule CS_Exp4(-> exp1(not(), InExp)):
      "not" CS_Exp5(-> InExp)
   rule CS_Exp4(-> Exp):
      CS_Exp5(-> Exp)

phrase CS_Exp5(-> AS_Exp) 
   rule CS_Exp5(-> exp2(add(), Exp1, Exp2)):
      CS_Exp5(-> Exp1) "+" CS_Exp6(-> Exp2)
   rule CS_Exp5(-> exp2(sub(), Exp1, Exp2)):
      CS_Exp5(-> Exp1) "-" CS_Exp6(-> Exp2)
   rule CS_Exp5(-> Exp):  
      CS_Exp6(-> Exp) 

phrase CS_Exp6(-> AS_Exp) 
   rule CS_Exp6(-> exp2(mul(), Exp1, Exp2)):
      CS_Exp6(-> Exp1) "*" CS_Exp7(-> Exp2)
   rule CS_Exp6(-> exp2(div(), Exp1, Exp2)):
      CS_Exp6(-> Exp1) "/" CS_Exp7(-> Exp2)
   rule CS_Exp6(-> Exp):  
      CS_Exp7(-> Exp) 

phrase CS_Exp7(-> AS_Exp)
   rule CS_Exp7(-> exp1(minus(), InExp)):
      "-" CS_Exp8(-> InExp)
   rule CS_Exp7(-> Exp):
      CS_Exp8(-> Exp)

phrase CS_Exp8(-> AS_Exp)
   // int literals
   rule CS_Exp8(-> lit(intVal(I))):
      INTEGER(-> I)

   // bool literals
   rule CS_Exp8(-> lit(boolVal(1))):
      "true"
   rule CS_Exp8(-> lit(boolVal(0))):
      "false"

   // string literals
   rule CS_Exp8(-> lit(stringVal(STR))):
      STRING(-> STR)

   // Variable applications
   rule CS_Exp8(-> varapp(I)):
      IDENT(-> I)
      
   rule CS_Exp8(-> Exp):
      "(" CS_Exp(-> Exp) ")"


// ----------------------------------------------
// Gentle has predefined token predicates IDENT, INTEGER and STRING.
// They have to be declared here (without rules or the like as a body):

                          //                       Regular expression:
token IDENT  (-> string)  // For identifiers:      [A-Za-z][A-Za-z0-9_]*
token INTEGER(-> int)     // For int-Literals:     [0-9]+
token STRING (-> string)  // For string-Literals:  \"([^\"]|\\\")*\"

// ------------------------------------------------------------------------
// Check for formal errors which the lexer and parser could not detect
// ("semantic errors" or "errors of type 1 and type 0")
// After finding and reporting the first such error this compiler
// will stop.

proc check10(SynTree:AS_Cmd[])
   rule check10(CMDS):
      checkVarDecs(CMDS)        // Is no variable declared more than once?
      checkVarApplsInCmds(CMDS) // Is every applied variable declared?
      checkTypingErrors(CMDS)
        
// ------------------------------------------------------------------------
// Check a list of commands (a syntax tree) for double declarations
// and construct a symbol table
proc checkVarDecs(SynTree:AS_Cmd[])
   rule checkVarDecs(AS_Cmd[CMD::CMDS]):
      checkVarDec (CMD)
      checkVarDecs(CMDS)
   rule checkVarDecs(AS_Cmd[]):

// Check a single command for double declarations
proc checkVarDec(AS_Cmd)
   // Check a variable declaration here

   rule checkVarDec(vardec(SI, T, _)):
        {
            Get-SymTab(SI -> _)
            sourcepos(SI -> P)
            error "Double declaration", P
        |
            Get-NextTargetID(-> TI)
            Set-NextTargetID(TI+1)
            Set-SymTab(SI, m(T, TI))
        }
        
   rule checkVarDec(if(E, CS)):
        checkVarDecs(CS)

   rule checkVarDec(ifElse(E, CS1, CS2)):
        checkVarDecs(CS1)
        checkVarDecs(CS2)

   rule checkVarDec(while(E, CS)):
        checkVarDecs(CS)

   rule checkVarDec(doWhile(E, CS)):
        checkVarDecs(CS)

        // Other simple commands (e.g. write, read) are skipped:
   rule checkVarDec(CMD):


// ----------------------------------------------
// Check a list of commands (a syntax tree) for undeclared variables
proc checkVarApplsInCmds(SynTree:AS_Cmd[])
   rule checkVarApplsInCmds(AS_Cmd[CMD::CMDS]):
      checkVarApplsInCmds(CMDS)
      checkVarApplsInCmd (CMD)
   rule checkVarApplsInCmds(AS_Cmd[]):


// Check a single command for undeclared variables:
proc checkVarApplsInCmd(AS_Cmd)
   rule checkVarApplsInCmd(assign(I, Exp)):
      {
         Get-SymTab(I -> _)
         |
         sourcepos(I -> P)
         error "Undeclared variable", P
      }
      checkVarApplsInExp(Exp)

   rule checkVarApplsInCmd(read(I)):
      {
         Get-SymTab(I -> _)
         |
         sourcepos(I -> P)
         error "Undeclared variable", P
      }
        
   rule checkVarApplsInCmd(Cmd):
      {
         Cmd -> write(Exp) |
         Cmd -> writeln(Exp) |
         Cmd -> vardec(_, _, AS_Exp?(Exp)) |
         Cmd -> assign(_, Exp) |
         Cmd -> if(Exp, _) |
         Cmd -> ifElse(Exp, _, _) |
         Cmd -> while(Exp, _) |
         Cmd -> doWhile(Exp, _)
      }
      checkVarApplsInExp(Exp)


   rule checkVarApplsInCmd(vardec(_, _, AS_Exp?())):
   // The following rule is for testing only. It will be called
   // if the definition of the predicate is still incomplete
   rule checkVarApplsInCmd(CMD):
      log "checkVarApplsInCmd has been called with CMD:"
      log CMD


// ----------------------------------------------
// Check an expression for undeclared variables:
proc checkVarApplsInExp(AS_Exp)
  rule checkVarApplsInExp(lit(_)):
  rule checkVarApplsInExp(exp1(_, InExp)):
     checkVarApplsInExp(InExp)
  rule checkVarApplsInExp(exp2(_, InExp1, InExp2)):
     checkVarApplsInExp(InExp1)
     checkVarApplsInExp(InExp2)

   // Check other expressions for undeclared variables
  rule checkVarApplsInExp(varapp(SI)):
      {
          Get-SymTab(SI -> _)
      |
          sourcepos(SI -> P)
          error "Undeclared variable", P
      }


   // The following rule is for testing only. It will be called
   // if the definition of the predicate is still incomplete
   rule checkVarApplsInExp(EXP):
      log "checkVarApplsInExp has been called with EXP:"
      log EXP


proc checkTypingErrors(AS_Cmd[])
        rule checkTypingErrors(AS_Cmd[]):
        rule checkTypingErrors(AS_Cmd[C::CMDS]):
            checkCommandTyping(C)
            checkTypingErrors(CMDS)

proc checkCommandTyping(AS_Cmd)
    rule checkCommandTyping(vardec(I, T, AS_Exp?(E))):
        checkExpressionTyping(E)
        {
            IsSameType(T, E)
        |
            sourcepos(I -> P)
            error "Type error in variable declaration", P
        }

            
    rule checkCommandTyping(assign(I, E)):
        checkExpressionTyping(E)
        Get-SymTab(I -> m(T, _))
        {
            IsSameType(T, E)
        |
            sourcepos(I -> P)
            error "Type error in assignment", P
        }


    rule checkCommandTyping(if(E, CS)):
        checkExpressionTyping(E)
        {
            isBool(E)
         |
            sourcepos(E -> P)
            error "Condition in if-then-statement is not bool", P
         }
        checkTypingErrors(CS)

    rule checkCommandTyping(ifElse(E, C1, C2)):
        checkExpressionTyping(E)
        {
            isBool(E)
        |
            sourcepos(E -> P)
            error "Condition in if-then-else-statement is not bool", P
        }
        checkTypingErrors(C1)
        checkTypingErrors(C2)


    rule checkCommandTyping(while(E, CS)):
         checkExpressionTyping(E)
         {
            isBool(E)
         |
            sourcepos(E -> P)
            error "Condition in while-do-statement is not bool", P
         }
        checkTypingErrors(CS)



    rule checkCommandTyping(doWhile(E, CS)):
         checkExpressionTyping(E)
         {
            isBool(E)
         |
            sourcepos(E -> P)
            error "Condition in do-until-statement is not bool", P
         }
        checkTypingErrors(CS)

     
    rule checkCommandTyping(writeln(E)):
        checkExpressionTyping(E)
        

    rule checkCommandTyping(write(E)):
        checkExpressionTyping(E)

    // Other commands need no type checking
    rule checkCommandTyping(_):


        
proc checkExpressionTyping(AS_Exp)
    rule checkExpressionTyping(varapp(_)):
    rule checkExpressionTyping(lit(_)):

    rule checkExpressionTyping(exp1(Op, E)):
        {
            Op -> not()
            isBool(E)
        |
            Op -> minus()
            isInt(E)
        |
            sourcepos(Op -> Pos)
            error "Operand of unary operator has wrong type", Pos
        }

   rule checkExpressionTyping(exp2(Op, E1, E2)):
        {
         Op -> conc()
         |
         { Op -> lt() | Op -> le()
         | Op -> eq() | Op -> ne()
         | Op -> ge() | Op -> gt()
         }         
         {
            isString(E1) isString(E2)
         |
            isBool(E1) isBool(E2)
         |
            isInt(E1) isInt(E2)
         |
            sourcepos(Op -> P)
            error "Operands of a comparison are of different types", P
         }
         
         |

         { Op -> or() | Op -> and() }
         {
            isBool(E1)
            isBool(E2)
         |
            sourcepos(Op -> P)
            error "Operand of binary bool operator is not bool", P
         }
         |
         { Op -> add() | Op -> sub() | Op -> mul() | Op -> div() }
         {
            isInt(E1)
            isInt(E2)
            |
            sourcepos(Op -> P)
            error "Operand of binary arithmetic operator is not int", P
         }
      }
      checkExpressionTyping(E1)
      checkExpressionTyping(E2)


        
condition IsSameType(AS_Type, AS_Exp)
    rule IsSameType(int(), E): isInt(E)
    rule IsSameType(string(), E): isString(E)
    rule IsSameType(bool(), E): isBool(E)

            
// ------------------------------------------------------------------------
// The predicates prelude and postlude together output a simple but
// complete Jasmin program. Anything output between the prelude and
// the postlude will be located in the main method of that program.

proc outPrelude(NrOfVars: int)
   rule outPrelude(NrOfVars):
      open "Target.j"
      ";Target produced by compiler alg30                 \n"
      ";at the Beuht Hochschule, TB5-CPB, SS14            \n"
      ";---------------------------------                 \n"
      ".class public Target                               \n"
      ".super java/lang/Object                            \n"
      ".method public <init>()V                           \n"
      "   aload_0                                         \n"
      "   invokenonvirtual java/lang/Object/<init>()V     \n"
      "   return                                          \n"
      ".end method                                        \n"
      ".method public static main([Ljava/lang/String;)V   \n"
      ".limit stack  15                                   \n"
      ".limit locals " $NrOfVars                         "\n"
      "   ldc \"-------------------------------\"         \n"
      "   invokestatic RTS/plnString(Ljava/lang/String;)V \n"
      "   ldc \"Here we go!\"                             \n"
      "   invokestatic RTS/plnString(Ljava/lang/String;)V \n"

proc outPostlude()
   rule outPostlude():
      "   ldc \"That's all!\"                             \n"
      "   invokestatic RTS/plnString(Ljava/lang/String;)V \n"
      "   ldc \"-------------------------------\"         \n"
      "   invokestatic RTS/plnString(Ljava/lang/String;)V \n"
      "   return                                          \n"
      ".end method                                        \n"

      close // The file Target.j
// ------------------------------------------------------------------------
// Predicates to translate abstract syntax into Java assembler (Jasmin)
// and output the Jasmin code to a target file:

proc outAll(AS_Cmd[])
   rule outAll(SynTree):
      // The next target ID is at the same time the
      // number of variables declared in the alg source program:
      Get-NextTargetID(-> NrOfVars)
      outPrelude(NrOfVars)
      // Write a comment into the file Target.j:
      "   ; Initialize each variable with a default value, begin:\n"
      // Write Jasmin instructions to initialize each declared variable
      // with the default value of its type (i.e. 0, false or "")
      outDecs   (SynTree)
      // Write a comment into the file Target.j:
      "   ; Initialize each variable with a default value, end.\n"
      outCmds   (SynTree) // Translate alle commands
      outPostlude()
// ----------------------------------------------
// Initialize each declared variable with the default value of its type.

// Process only the variable declarations in a list of commands:
proc outDecs(DECLS:AS_Cmd[])
   rule outDecs(AS_Cmd[]):
   rule outDecs(AS_Cmd[DECL::DECLS]):
      outDec (DECL)
      outDecs(DECLS)

// Process a single command, but only if it is a variable declaration.
proc outDec(AS_Cmd)

   // Process a variable declaration without explicit init:
   rule outDec(vardec(SI, TYPE, AS_Exp?())):
        "   ; variable declaration w/ implicit init\n"
        {
            TYPE -> int()
            outCmd(assign(SI, lit(intVal(0))))
        |
            TYPE -> bool()
            outCmd(assign(SI, lit(boolVal(0))))
        |
            TYPE -> string()
            outCmd(assign(SI, lit(stringVal(""))))
        }


   // Process a variable declaration with explicit initialization
   rule outDec(vardec(SI, TYPE, AS_Exp?(E))):
        "   ; variable declaration w/ explicit init\n"
        {
            TYPE -> int()
            isInt(E)
            outCmd(assign(SI, E))
        |
            TYPE -> bool()
            isBool(E)
            outCmd(assign(SI, E))
        |
            TYPE -> string()
            isString(E)
            outCmd(assign(SI, E))
        |
            sourcepos(SI -> P)
            error "Uncompatible types", P
        }

   // Process a variable declaration with explicit initialization
   rule outDec(if(_, CS)):
        outDecs(CS)
        
   rule outDec(ifElse(_, C1, C2)):
        outDecs(C1)
        outDecs(C2)
        
   rule outDec(doWhile(_, CS)):
        outDecs(CS)
        
   rule outDec(while(_, CS)):
        outDecs(CS)


        
   // Other simple commands (e.g. write, read) are skipped:
   rule outDec(CMD):
// ----------------------------------------------
// Translate and output a list of commands (a syntax tree):
proc outCmds(CMDS:AS_Cmd[])
   rule outCmds(AS_Cmd[]):
   rule outCmds(AS_Cmd[CMD::CMDS]):
      outCmd (CMD)
      outCmds(CMDS)

// Translate and output a single command:
proc outCmd(E:AS_Cmd)

   // write
   rule outCmd(write(EXP)):
      "   ;--- write\n"
      outExp(EXP)
      {
            isBool(EXP)
            "   invokestatic RTS/boolToString(I)Ljava/lang/String;" "\n"
            "   invokestatic RTS/pString(Ljava/lang/String;)V"
            |
            isString(EXP)
            "   invokestatic RTS/pString(Ljava/lang/String;)V\n"
            |
            isInt(EXP)
            "   invokestatic RTS/pInt(I)V\n"
      }

   // writeln
   rule outCmd(writeln(EXP)):
      "   ;--- writeln\n"
      outExp(EXP)
      {
            isBool(EXP)
            "   invokestatic RTS/boolToString(I)Ljava/lang/String;" "\n"
            "   invokestatic RTS/plnString(Ljava/lang/String;)V\n"
            |
            isString(EXP)
            "   invokestatic RTS/plnString(Ljava/lang/String;)V\n"
            |
            isInt(EXP)
            "   invokestatic RTS/plnInt(I)V\n"
      }

   // var declaration without explicit initialisation:
   rule outCmd(vardec(SI, T, AS_Exp?())):

   // var declaration with explicit initialisation:
   rule outCmd(vardec(SI, T, AS_Exp?(E))):
   //  Should be handled in outDec

   // assign
   rule outCmd(assign(SI, E)):
      "   ; variable assignment " $SI " \n"
      Get-SymTab(SI -> m(_, TI))
      {
         { isBool(E) | isInt(E) }
         outExp(E)
         "   istore " $TI "\n"
         |
         isString(E)
         outExp(E)
         "   astore " $TI "\n"
      }
        
   // read
   rule outCmd(read(SI)):
      "   ;--- read\n"
      Get-SymTab(SI -> m(Type, TI))
      {
         Type -> bool()
         "   invokestatic RTS/readBool()I\n"
         "   istore " $TI "\n"
         |
         Type -> int()
         "   invokestatic RTS/readInt()I\n"
         "istore " $TI "\n"
         |
         Type -> string()
         "   invokestatic RTS/readString()Ljava/lang/String;" "\n"
         "   astore " $TI "\n"
      }
      
   rule outCmd(if(Exp, Cmds)):
      "   ;--- if statement\n"
      Get-NextConLabelID(-> LabelID)
      "IfBegin" $LabelID ":\n"
      outExp(Exp)
      "   ifeq IfEnd" $LabelID "\n"
      outCmds(Cmds)
      "IfEnd" $LabelID ":\n"
      Set-NextConLabelID(LabelID + 1)
      
   rule outCmd(ifElse(Exp, IfCmds, ElseCmds)):
      "   ;--- if-else statement\n"
      Get-NextConLabelID(-> LabelID)
      "IfBegin" $LabelID ":" "\n"
      outExp(Exp)
      "   ifeq Else" $LabelID "\n"
      outCmds(IfCmds)
      "   goto IfEnd" $LabelID "\n"
      "Else" $LabelID ":\n"
      outCmds(ElseCmds)
      "IfEnd" $LabelID ":\n"
      Set-NextConLabelID(LabelID + 1)
      
   rule outCmd(while(Exp, Cmds)):
      "   ;--- while loop\n"
      Get-NextLoopLabelID(-> LabelID)
      "WhileDo" $LabelID ":\n"
      outExp(Exp)
      "   ifeq WhileEnd" $LabelID "\n"
      outCmds(Cmds)
      "   goto WhileDo" $LabelID "\n"
      "WhileEnd" $LabelID ":\n"
      Set-NextLoopLabelID(LabelID + 1)
      
   rule outCmd(doWhile(Exp, Cmds)):
      "   ;--- do-while loop\n"
      Get-NextLoopLabelID(-> LabelID)
      "DoUntil" $LabelID ":\n"
      outCmds(Cmds)
      outExp(Exp)
      "   ifeq DoUntil" $LabelID "\n"
      "DoUntilEnd" $LabelID ":\n"
      Set-NextLoopLabelID(LabelID + 1)

   // The following rule is for testing only. It will be called
   // if the definition of the predicate is still incomplete
   rule outCmd(CMD):
      log "outCmd has been called with CMD:"
      log CMD
// ----------------------------------------------
// Translate and output an expression
// Every expression EXP is translated into Jasmin instructions, which will
// cause the value of EXP to be placed onto the stack of the JVM.



proc outExp(AS_Exp)
   // Translate and output literals:
   rule outExp(lit(AVAL)):
     "   ; -- Load literal \n"
     {
       AVAL -> stringVal(V1) "   ldc " "\"" $V1 "\"\n"
       |
       AVAL -> boolVal(V2) "   iconst_" $V2 "\n"
       |
       AVAL -> intVal(V3)
       {
          Greater(V3, -129) Less(V3, 128) "   bipush "
          |
          Greater(V3, -32769) Less(V3, 32768) "   sipush "
          |
          "    ldc "
       }
       $V3 "\n"
     }

   // Translate and output variable applications:
   rule outExp(varapp(I)):
      "   ; -- Load varapp " $I "\n"
      Get-SymTab(I -> m(Type, TI))
      {
         { Type -> bool() | Type -> int() }
         "   iload " $TI "\n"
         |
         Type -> string()
         "   aload " $TI "\n"
      }

   rule outExp(exp1(Op, E)):
      {
         Op -> not()
         outExp(E)
         "   iconst_1\n"
         "   ixor\n"
         |
         Op -> minus()
         outExp(E)
         "   ineg\n"
      }


   rule outExp(exp2(Op, E1, E2)):
      {
         Op -> conc()
         outExp(E1)
         {
            {
               isInt(E1)
               "   invokestatic RTS/intToString(I)Ljava/lang/String;" "\n"
               |
               isBool(E1)
               "   invokestatic RTS/boolToString(I)Ljava/lang/String;" "\n"
            }
            |
            isString(E1)
         }
         outExp(E2)
         {
            {
               isInt(E2)
               "   invokestatic RTS/intToString(I)Ljava/lang/String;\n"
            |
               isBool(E2)
               "   invokestatic RTS/boolToString(I)Ljava/lang/String;\n"
            }
            
            |
            isString(E2)
         }
         "   invokestatic RTS/concat(Ljava/lang/String;Ljava/lang/String;)"
         "Ljava/lang/String;" "\n"
         |
         {
            {
               Op -> lt()
               Set-StringCompareMethod("lessThan")
               Set-IntCompareInstr("lt")
               |
               Op -> le()
               Set-StringCompareMethod("lessEquals")
               Set-IntCompareInstr("le")
               |
               Op -> eq()
               Set-StringCompareMethod("equals")
               Set-IntCompareInstr("eq")
               |
               Op -> ne()
               Set-StringCompareMethod("unEquals")
               Set-IntCompareInstr("ne")
               |
               Op -> ge()
               Set-StringCompareMethod("greaterEquals")
               Set-IntCompareInstr("ge")
               |
               Op -> gt()
               Set-StringCompareMethod("greaterThan")
               Set-IntCompareInstr("gt")
            }
            {
               { isInt(E1) | isBool(E1) }
               { isInt(E2) | isBool(E2) }
               outExp(E1)
               outExp(E2)
               Get-NextCmpLabelID(-> LabelID)
               Get-IntCompareInstr(-> ST)
               "   if_icmp" $ST " Label" $LabelID "\n"  // Compare both exp
               "   iconst_0" "\n"                        // Set false
               "   goto Label" $LabelID + 1  "\n"
               "Label" $LabelID ":" "\n"
               "   iconst_1" "\n"                        // Set true
               "Label" $LabelID + 1 ":" "\n"
               Set-NextCmpLabelID(LabelID + 2)
               |
               isString(E1)
               isString(E2)
               outExp(E1)
               outExp(E2)
               Get-StringCompareMethod(-> Str)
               "   invokestatic RTS/" $Str "(Ljava/lang/String;"
               "Ljava/lang/String;)I" "\n"
            }
         }
         |
         {
            Op -> or()
            outExp(E1)
            outExp(E2)
            "   ior\n"
         }
         |
         {
            Op -> and()
            isBool(E1) isBool(E2)
            outExp(E1)
            outExp(E2)
            "   iand\n"
         }
         |
         {
            Op -> add()
            isInt(E1) isInt(E2)
            outExp(E1)
            outExp(E2)
            "   iadd\n"
         }
         |
         {
            Op -> sub()
            isInt(E1) isInt(E2)
            outExp(E1)
            outExp(E2)
            "   isub\n"
         }
         |
         {
            Op -> mul()
            isInt(E1) isInt(E2)
            outExp(E1)
            outExp(E2)
            "   imul\n"
         }
         |
         {
            Op -> div()
            isInt(E1) isInt(E2)
            outExp(E1)
            outExp(E2)
            "   idiv\n"
         }
      }


   // The following rule is for testing only. It will be called
   // if the definition of the predicate is still incomplete
   rule outExp(EXP):
      log "outExp was called with EXP:"
      log EXP



// ----------------------------------------------
// The following condition predicates assume, that all expressions
// have been checked and do not contain type errors. Only if this
// assumption is true do the predicates function correctly.

condition isInt(Exp:AS_Exp)
   // Suceeds iff Exp is of type int
   rule isInt(lit(intVal(_)))
   rule isInt(exp1(minus(), _))
   rule isInt(exp2(add(), _, _))
   rule isInt(exp2(sub(), _, _))
   rule isInt(exp2(mul(), _, _))
   rule isInt(exp2(div(), _, _))
   rule isInt(varapp(V)):
      Get-SymTab(V -> m(Type, _))
      Type -> int()

condition isBool(Exp:AS_Exp)
   // Suceeds iff Exp is of type boo
   rule isBool(lit(boolVal(_)))
   rule isBool(exp1(not(), _))
   rule isBool(exp2(lt(), _, _))
   rule isBool(exp2(le(), _, _))
   rule isBool(exp2(eq(), _, _))
   rule isBool(exp2(ne(), _, _))
   rule isBool(exp2(ge(), _, _))
   rule isBool(exp2(gt(), _, _))
   rule isBool(exp2(or(), _, _))
   rule isBool(exp2(and(), _, _))
   rule isBool(varapp(V)):
      Get-SymTab(V -> m(Type, _))
      Type -> bool()

condition isString(Exp:AS_Exp)
   // Suceeds iff Exp is of type string
   rule isString(exp2(conc(), _, _))
   rule isString(lit(stringVal(_)))
   rule isString(varapp(V)):
      Get-SymTab(V -> m(Type, _))
      Type -> string()

// ------------------------------------------------------------------------
// Auxiliary predicates, possibly useful for testing.
// They translate abstact syntax back into concrete syntax.

// proc pCmds(CMDS: AS_Cmd[])
//    // Prints the syntax tree CMDS in a format similar to a source program:
//    rule pCmds(AS_Cmd[]):
//    rule pCmds(AS_Cmd[CMD::CMDS]):
//       pCmd (CMD)
//       pCmds(CMDS)

// proc pCmd(AS_Cmd)
//    rule pCmd(CMD):
//       {
//          CMD -> writeln(EXP)
//          "writeln(" pExp(EXP) ");\n"
//       |
//          CMD -> write(EXP)
//          "write(" pExp(EXP) ");\n"
//       |
//          CMD -> vardec(SI, T, AS_Exp?())
//          pType(T) $SI ";\n"
//       |
//          CMD -> vardec(SI, T, AS_Exp?(EXP))
//          pType(T) $SI " := " pExp(EXP) ";\n"
//       |
//          CMD -> assign(SI, Exp)
//          $SI " := " pExp(Exp) ";\n"
//       }

//    // The following rule is for testing only. It will be called
//    // if the definition of the predicate is still incomplete
//    rule pCmd(CMD):
//       log "pCMD was called with CMD:"
//       log CMD


// proc pType(AS_Type)
//    rule pType(TYPE): {
//       TYPE -> int()    "int    " |
//       TYPE -> bool()   "bool   " |
//       TYPE -> string() "string "
//    }

// proc pExp(AS_Exp)
//    rule pExp(Exp):
//       {
//          Exp -> lit(VAL)
//          pVal(VAL)
//       |
//          Exp -> varapp(SI)
//          $SI
//       |
//          Exp -> exp1(Op1, InExp)
//          pOp1(Op1)
//          pExp(InExp)
//       |
//          Exp -> exp2(Op2, InExp1, InExp2)
//          pExp(InExp1)
//          pOp2(Op2)
//          pExp(InExp2)
//       }

//    // The following rule is for testing only. It will be called
//    // if the definition of the predicate is still incomplete
//    rule pExp(EXP):
//       log "pExp was called with EXP:"
//       log EXP

// proc pOp1(AS_Op1)
//    rule pOp1(Op):
//       " "
//       {
//          Op -> not() "not " |
//          Op -> minus() "-"
//       }


// proc pOp2(AS_Op2)
//    rule pOp2(Op):
//       " "
//       {
//          Op -> conc() "&" |
//          Op -> lt() "<" |
//          Op -> le() "<=" |
//          Op -> eq() "=" |
//          Op -> ne() "!=" |
//          Op -> ge() ">=" |
//          Op -> gt() ">" |
//          Op -> or() "or" |
//          Op -> and() "and" |
//          Op -> add() "+" |
//          Op -> sub() "-" |
//          Op -> mul() "*" |
//          Op -> div() "/"
//       }
//       " "

// proc pVal(AS_Val)
//    rule pVal(VAL): {
//       VAL -> intVal   (P1) $P1     |
//       VAL -> boolVal  (0)  "false" |
//       VAL -> boolVal  (1)  "true"  |
//       VAL -> stringVal(P2) "\"" $P2 "\""
//    }
// // ------------------------------------------------------------------------
