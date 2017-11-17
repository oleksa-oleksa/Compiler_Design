// -----------------------------------------------------------------------
// File alg10\spec.g
// -----------------------------------------------------------------------
// Complete syntax checking (type 3, typ 2, type 1/0) for a very simple
// source language alg10. A typical program of this language:
//
// prog anna, bert, carl begin bert, bert, anna end
//
// Between prog  and begin  identifiers are declared
// Between begin and end    identifiers are applied
//
// The following context conditions are checked:
// CC1: An identifier may be declared at most once
// CC2: Only declared identifiers may be applied (0 or more times)
//
// Two examples of erroneous source programs:
// prog anna, anna begin end  -- anna is declared more than once
// prog anna begin carl  end  -- carl is applied without being declared
// -----------------------------------------------------------------------
root
// root1() // "with    bells and whistles" for development
   root2() // "without bells and whistles" for test and production
// ----------------------------------------------
proc root1()
   // Parse the source program into a syntax tree of type PROG:
   Program(-> SYNTREE)
   // Output the syntax tree as a source program with comments:
   pPROG(SYNTREE)
   "----------------------------------\n"
   // Check the syntax tree for double declarations and undeclared
   // statements. Output the number of errors found:
   check10(SYNTREE -> NR_OF_ERRORS)
   "\nNr of errors found by check10: " $NR_OF_ERRORS "\n"

proc root2()
   // Parse the source program into a syntax tree of type PROG:
   Program(-> SYNTREE)
   // Check the syntax tree for double declarations and undeclared
   // statements. Output the number of errors found:
   check10(SYNTREE -> NR_OF_ERRORS)
   "Nr of errors found by check10: " $NR_OF_ERRORS "\n"
// -----------------------------------------------------------------------
// Abstract syntax types:

type AS_Dec
   dec(Ident: string)

type AS_Stm
   stm(Ident: string)

type AS_Prog
   prog(Declarations: AS_Dec[], Statements: AS_Stm[])
// -----------------------------------------------------------------------
// Concrete syntax to abstract syntax (syntax checks of type 3 and 2):

phrase  Program(-> SyntaxTree: AS_Prog)
   rule Program(-> prog(DECS, STMS))
      "prog"
      Declarations(-> DECS)
      "begin"
      Statements(-> STMS)
      "end"

phrase Declarations(-> AS_Dec[])
   // A sequence of declarations consists of 1 or more declaration(s):
   rule Declarations(-> AS_Dec[DEC]):        // Sequence of length 1
      Declaration(-> DEC)
   rule Declarations(-> AS_Dec[DEC::DECS]):  // Sequence of length > 1
      Declaration (-> DEC) ","
      Declarations(-> DECS)

phrase Declaration(-> AS_Dec)
   rule Declaration(->dec(ID)):
      Ident(-> ID)

phrase Statements(-> AS_Stm[])
   // A sequence of statements consists of 0 or more statements:
   rule Statements(-> AS_Stm[]):             // Sequence of length 0
   rule Statements(-> AS_Stm[STM]):          // Sequence of length 1
      Statement(-> STM)
   rule Statements(-> AS_Stm[STM::STMS]):    // Sequence of length > 1
      Statement (-> STM) ","
      Statements(-> STMS)

phrase Statement(-> AS_Stm)
   rule Statement(-> stm(ID)):
      Ident(-> ID)

token Ident(-> string)
   <<<[A-Za-z][A-Za-z0-9_]*>>>
// ------------------------------------------------------------------------
// Additional syntax checks (type 1/0):

// Here a symbol table is a list of strings (type string[]) which
// contains all declared identifiers (names of variables)

proc check10(SyntaxTree: AS_Prog -> NrOfErrors: int)
   // Checks the SyntaxTree for double declarations and for undeclared
   // variables. Outputs an error message for each error found and
   // returns the number of errors.

   // THE FOLLOWING USELESS RULE MUST BE REPLACED BY "REAL RULES"
   rule check10(ST -> 0):

proc doubleDecs(Declarations: AS_Dec[], SymTabI:string[] ->
                                        SymTabO:string[], NrOfErrors: int)
   // Checks the Declarations for double declarations and
   // constructs a symbol table (list of declared identifiers)

   // THE FOLLOWING USELESS RULE MUST BE REPLACED BY "REAL RULES"
   rule doubleDecs(DECS, SYMTAB -> SYMTAB, 0):


condition isInSymTab(ID1:string, SymTab:string[] -> ID2:string)
   // Suceeds iff ID1 is already in SymTab. Returns as ID2 the element
   // of SymTab which is equal to ID1.
   // Note: Although ID1 and ID2 are equal, they will have different
   // sourcepositions attached to them, which can be used to output
   // a "good error message" in case of a double declaration.

   // THE FOLLOWING USELESS RULE MUST BE REPLACED BY "REAL RULES"
   rule isInSymTab(ID1, SYMTAB -> ""):


proc undeclared(Statements: AS_Stm[], SymTab:string[] -> NrOfErrors: int)
   // Checks the Statements for undeclared variables:

   // THE FOLLOWING USELESS RULE MUST BE REPLACED BY "REAL RULES"
   rule undeclared(STMS, _ -> 0):

// ------------------------------------------------------------------------
// Abstract syntax back to concrete syntax

proc pPROG(SyntaxTree: AS_Prog)
   // Prints the SyntaxTree as a source program with
   // line numbers of lexems as comments.
   // The SyntaxTree may contain errors (double declarations or undeclared
   // statements), but the list of declarations must not be empty!
   rule pPROG(prog(DECS, STMS)):
      "prog\n"
      pDECS(DECS)
      "begin\n"
      pSTMS(STMS)
      "end\n"

proc pDECS(Declarations: AS_Dec[])
   rule pDECS(AS_Dec[dec(ID)]):            // List of length 1
      sourcepos(ID -> POS)
      "   " $ID "    // line " pLine(POS) "\n"
   rule pDECS(AS_Dec[dec(ID)::DECS]):       // List of length > 1
      sourcepos(ID -> POS)
      "   " $ID ",   // line " pLine(POS) "\n"
      pDECS(DECS)

proc pSTMS(Statements: AS_Stm[])
   rule pSTMS(AS_Stm[]):                   // List of length 0
   rule pSTMS(AS_Stm[stm(ID)]):            // List of length 1
      sourcepos(ID -> POS)
      "   " $ID "    // line " pLine(POS) "\n"
   rule pSTMS(AS_Stm[stm(ID)::STMS]):       // List of length > 1
      sourcepos(ID -> POS)
      "   " $ID ",   // line " pLine(POS) "\n"
      pSTMS(STMS)
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
