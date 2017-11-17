// -----------------------------------------------------------------------
// File pred03\symtabFlat.g
// Demonstrates the management of a flat symbol table.
// Each entry of the symbol table consists of
// a key   of type string  (e.g. "Andy", "Bert", ...) and
// a value of type Meaning (e.g. m("Smith", 17), m("Miller", 21) ).
//------------------------------------------------------------------------

type Meaning
   m(lastName:string, age:int)

// The SymTab maps string-keys to Meaning-values:
data SymTab(string -> Meaning)

proc insert(firstName:string, lastName:string, age:int)
   // Inserts an entry into the SymTab
   rule insert(FN, LN, AGE):
      Set-SymTab(FN, m(LN, AGE))

proc print1(firstName:string)
   // Prints one entry of the SymTab or an error message:
   rule print1(FN):
      {
         Get-SymTab(FN -> m(LN, AGE))
         $LN ", " $FN ", age " $AGE "\n"
      |
         "No \"" $FN "\" in the SymTab!\n"
      }
// -----------------------------------------------------------------------
root
   "-------------------------\n"
   // Insert some entries into the SymTab:
   insert("Alice", "Smith", 17)
   insert("Boris", "Jones", 21)
   insert("Carol", "Brown", 16)

   // Try to access the Meaning of some keys and print a line for each key:
   print1("Alike")
   print1("Alice")
   print1("Boris")
   print1("Karol")
   print1("Carol")
   print1("Doris")
   "-------------------------\n"
// -----------------------------------------------------------------------
// Output of this program:
//
// -------------------------
// No "Alike" in the SymTab!
// Smith, Alice, age 17
// Jones, Boris, age 21
// No "Karol" in the SymTab!
// Brown, Carol, age 16
// No "Doris" in the SymTab!
// -------------------------
