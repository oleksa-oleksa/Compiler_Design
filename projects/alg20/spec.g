// -----------------------------------------------------------------------
// File alg20\spec.g
// -----------------------------------------------------------------------
// Complete syntax checking (type 3, typ 2, type 1/0) for a very simple
// source language alg20. A typical program of this language:
//
// prog dec anna, dec bert, stm anna, dec carl, stm anna, stm carl end
//
// Between prog and end there is a list of commands separated by commas.
// This list of commands may be empty (prog end).
// There are two kinds of commands: declarations and statements.
// Examples:
// The delaration   dec anna   declares the identifier anna.
// The statement    stm anna   applies  the identifier anna.
//
// The following context conditions are checked:
// CC1: An identifier may be declared at most once.
// CC2: An identifier must be declared before it ist applied.
//
// Three examples of erroneous source programs:
// prog dec anna, dec anna end  -- anna is declared more than once
// prog stm anna end            -- anna is applied without being declared
// prog stm anna, dec anna end  -- anna is applied before it is declared
// -----------------------------------------------------------------------
// A syntax tree  is a value of type COMMAND[]
//    (which is rather a list than a full blown tree).
// A symbol table is a value of type string[],
//    containing all declared identifiers.
// -----------------------------------------------------------------------

root
   Program(-> SynTree)
   "----------------------------------\n"
   // Output the syntax tree as a source program with comments:
   pPROG(SynTree)
   "----------------------------------\n"
   // Check the syntax tree for double declarations and undeclared
   // statements. Output the number of errors found:
   SymTabEmpty <- string[]
   check10(SynTree, SymTabEmpty -> SymTabFull, NrOfErrors)
   "\nNr of errors found by check10: " $NrOfErrors "\n"

// -----------------------------------------------------------------------
// Abstract syntax types:

type COMMAND
   dec(Ident: string)
   stm(Ident: string)

// -----------------------------------------------------------------------
// Concrete syntax to abstract syntax (syntax checks of type 3 and 2):

phrase  Program(-> SyntaxTree: COMMAND[])
   rule Program(-> CMDS)
      "prog"
      Commands(-> CMDS)
      "end"

phrase Commands(-> COMMAND[])
   rule Commands(-> COMMAND[]):
   rule Commands(-> COMMAND[CMD]):
      Command(-> CMD)
   rule Commands(-> COMMAND[CMD::CMDS]):
      Command (-> CMD) ","
      Commands(-> CMDS)

phrase Command(-> COMMAND)
   rule Command(-> dec(ID)):
      "dec" Ident(-> ID)
   rule Command(-> stm(ID)):
      "stm" Ident(-> ID)

token Ident(-> string)
   <<<[A-Za-z][A-Za-z0-9_]*>>>

// ------------------------------------------------------------------------
// Additional syntax checks (type 1/0):
// An identifier has to be declared BEFORE it is applied in a statement.
// Therefore the predicate check10 traverses the SyntaxTree, building up
// a symbol table and checking for undeclared statements "in an integrated
// way".

proc check10(SyntaxTree:COMMAND[], SymTabIn :string[] ->
                                   SymTabOut:string[], NrOfErrors:int)
   // Checks the SyntaxTree for double declarations and for undeclared
   // statements. Outputs an error message for each error found.
   // Returns:
   // SymTabOut, which contains all identifiers declared so far, and
   // NrOfErrors, the number of errors found so far in the SyntaxTree.

   // THE FOLLOWING USELESS RULE MUST BE REPLACED BY "REAL RULES"
   rule check10(ST, SymTab -> string[], 0):

proc doubleDecs(Ident: string, SymTabIn :string[] ->
                               SymTabOut:string[], NrOfErrors: int)
   // Checks if the Ident is already in SymTabIn (which means that
   // Ident is declared more than once)

   // THE FOLLOWING USELESS RULE MUST BE REPLACED BY "REAL RULES"
   rule doubleDecs(ID, SymTab -> string[], 0):



proc undeclared(Ident: string, SymTab:string[] -> NrOfErrors: int)
   // Checks if the Ident is in the SymTab (if not, Ident is undeclared)

   // THE FOLLOWING USELESS RULE MUST BE REPLACED BY "REAL RULES"
   rule undeclared(ID, SymTab -> 0):


condition isDeclared(IdentIn: string, SymTab:string[] -> IdentOut:string)
   // Succeeds and returns IdentOut, iff IdentOut is an element of the
   // SymTab and equals to IdentIn.
   // Note: Even if IdentIn and IdentOut are equal, they may have
   // different source positions.

   // THE FOLLOWING USELESS RULE MUST BE REPLACED BY "REAL RULES"
   rule isDeclared(ID, SymTab -> "CharlyParker"):

// ------------------------------------------------------------------------
// Abstract syntax back to concrete syntax

proc pPROG(SyntaxTree:COMMAND[])
   // Prints the SyntaxTree as a source program with
   // positions of lexems as comments.
   // The SyntaxTree may contain errors (double declarations or undeclared
   // statements) and it may be empty!
   rule pPROG(CMDS):
      "prog\n"
      pCMDS(CMDS)
      "end\n"

proc pCMDS(COMMAND[])
   rule pCMDS(COMMAND[]):
   rule pCMDS(COMMAND[CMD::CMDS]):
      pCMD (CMD)
      pCMDS(CMDS)

proc pCMD(COMMAND)
   rule pCMD(dec(ID)):
      sourcepos(ID -> PosID)
      "   dec " $ID "   // line " pLine(PosID) "\n"
   rule pCMD(stm(ID)):
      sourcepos(ID -> PosID)
      "   stm " $ID "   // line " pLine(PosID) "\n"
// ------------------------------------------------------------------------
// The following predicates are "dirty tricks", which may not work
// with new versions of Gentle (they work with cyan-14010).
proc pLine(Sourceposition: string)
   // Prints the line number of a source position
   // Expects the Sourceposition to be a string like for example
   // "/line,offset,length,file=/ 5 219 4 t01"
   // where 5 is the line number
   rule pLine(POS)
      Stringlength(POS -> LEN)
      Substring(POS, 27, LEN-1 -> SUB1)
      NextWord(SUB1, 0 -> SUB2)
      $SUB2

proc NextWord(IN:string, FROM:int -> OUT:string)
   // Assumes (without checking) that IN contains some non-blank characters
   // followed by a blank character " " (e.g. "123 4567...")
   // FROM should be 0 in non-recursive calls.
   // Returns as OUT that substring of IN, which starts at index FROM
   // and contains all characters up to (and excluding) the first
   // blank character (space character).
   rule NextWord(S, I -> ERG)
      Substring(S, I, I+1 -> C)
      Equal(C, " ")
      Substring(S, 0, I -> ERG)
   rule NextWord(S, I -> ERG)
      NextWord(S, I+1 -> ERG)
// ------------------------------------------------------------------------
