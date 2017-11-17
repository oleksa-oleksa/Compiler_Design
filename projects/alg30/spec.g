// File alg30\spec.g
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
   root1() // "with    bells and whistles" for development
// root2() // "without bells and whistles" for test and production
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
      "SynTree:\n" pCmds(SynTree)
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

// The symbol table SymTab maps source identifiers of type string
// to their meaning of type Meaning
type Meaning m(Type:AS_Type, TargetID:int)
data SymTab(string -> Meaning)
// ------------------------------------------------------------------------
// Qups have to be initialized before they are used:
proc initialise()
   rule initialise():
      Set-NextTargetID(1)
// ------------------------------------------------------------------------
// Abstract syntax types:

type AS_Cmd
   writeln(AS_Exp)                             // write with    newline
   vardec (SI: string, AS_Type, Init: AS_Exp?) // Variable declaration
   assign (SI: string, AS_Exp)                 // Assignment

type AS_Exp
   varapp(SourceId: string)                    // Variable application
   lit(AS_Val)                                 // Literal

type AS_Val                                    // Values of literals
   intVal(int)
   boolVal(int)
   stringVal(string)

type AS_Type                                   // Types of expressions
   int()
   bool()
   string()
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
   // ???

   // writeln
   rule CS_Cmd(-> writeln(EXP)):
      "writeln" "(" CS_Exp(-> EXP)   ")"

   // Variable declarations without explicit initialization.
   // ???

   // Variable declarations with explicit initialization:
   // ???

   // assignment
   // ???

   // read
   // ???

phrase  CS_Exp(-> AS_Exp)

   // int literals
   // ???

   // bool literals
   // ???

   // string literals
   rule CS_Exp(-> lit(stringVal(STR))):
      STRING(-> STR)

   // Variable applications
   // ???
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
   // ???

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
   rule checkVarApplsInCmd(writeln(lit(X)))
   // ???

   // The following rule is for testing only. It will be called
   // if the definition of the predicate is still incomplete
   rule checkVarApplsInCmd(CMD):
      log "checkVarApplsInCmd has been called with CMD:"
      log CMD
// ----------------------------------------------
// Check an expression for undeclared variables:
proc checkVarApplsInExp(AS_Exp)
   rule checkVarApplsInExp(lit(_)):

   // Check other expressions for undeclared variables
   // ???

   // The following rule is for testing only. It will be called
   // if the definition of the predicate is still incomplete
   rule checkVarApplsInExp(EXP):
      log "checkVarApplsInExp has been called with EXP:"
      log EXP
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

   // Process a variable declaration:
   rule outDec(vardec(SI, TYPE, _)):
   // ???

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
proc outCmd(AS_Cmd)

   // write
   // ???

   // writeln
   rule outCmd(writeln(EXP)):
      "   ;--- writeln\n"
      outExp(EXP)
      {
         isString(EXP) "   invokestatic RTS/plnString(Ljava/lang/String;)V\n"
      }

   // var declaration without explicit initialisation:
   // ???

   // var declaration with explicit initialisation:
   // ???

   // assign
   // ???

   // read
   // ???

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
      {
         AVAL -> stringVal(V3) "   ldc " "\"" $V3 "\"" "\n"
      }

   // Translate and output variable applications:
   // ???

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
   // ???


condition isBool(Exp:AS_Exp)
   // Suceeds iff Exp is of type bool
   // ???


condition isString(Exp:AS_Exp)
   // Suceeds iff Exp is of type string
   rule isString(lit(stringVal(_))):

// ------------------------------------------------------------------------
// Auxiliary predicates, possibly useful for testing.
// They translate abstact syntax back into concrete syntax.

proc pCmds(CMDS: AS_Cmd[])
   // Prints the syntax tree CMDS in a format similar to a source program:
   rule pCmds(AS_Cmd[]):
   rule pCmds(AS_Cmd[CMD::CMDS]):
      pCmd (CMD)
      pCmds(CMDS)

proc pCmd(AS_Cmd)
   rule pCmd(CMD):
      {
         CMD -> writeln(EXP)
         "writeln(" pExp(EXP) ");\n"
      |
         CMD -> vardec(SI, T, AS_Exp?())
         pType(T) $SI ";\n"
      |
         CMD -> vardec(SI, T, AS_Exp?(EXP))
         pType(T) $SI " := " pExp(EXP) ";\n"
      }

   // The following rule is for testing only. It will be called
   // if the definition of the predicate is still incomplete
   rule pCmd(CMD):
      log "pCMD was called with CMD:"
      log CMD


proc pType(AS_Type)
   rule pType(TYPE): {
      TYPE -> int()    "int    " |
      TYPE -> bool()   "bool   " |
      TYPE -> string() "string "
   }

proc pExp(AS_Exp)
   rule pExp(EXP):
      {
         EXP -> lit(VAL)
         pVal(VAL)
      |
         EXP -> varapp(SI)
         $SI
      }

   // The following rule is for testing only. It will be called
   // if the definition of the predicate is still incomplete
   rule pExp(EXP):
      log "pExp was called with EXP:"
      log EXP


proc pVal(AS_Val)
   rule pVal(VAL): {
      VAL -> intVal   (P1) $P1     |
      VAL -> boolVal  (0)  "false" |
      VAL -> boolVal  (1)  "true"  |
      VAL -> stringVal(P2) "\"" $P2 "\""
   }
// ------------------------------------------------------------------------
