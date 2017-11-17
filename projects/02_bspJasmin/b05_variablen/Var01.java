// Datei Var01.java
/* ------------------------------------------------------------------------
Dieses Programm Var01 soll zeigen, dass lokale Variablen einer Methode
in einem Jasmin-Programm fast gar nicht vereinbart werden (nur indirekt
durch die Assembler-Direktive .limit locals).

In der main-Methode werden 7 lokale Variablen vereinbart: Der Parameter
sonja und die Variablen v01 bis v06. Zwei dieser Variablen belegen je
2 Worte auf dem Stapel (die long-Variable v02 und die double-Variable v04).
Die anderen belegen je 1 Wort auf dem Stapel. Insgesamt benoetigt diese
main-Methode also 9 Worte auf dem Stapel. Dieser "Platzbedarf" steht im
Jasim-Program in der Assembler-Direktive .limit locals.
------------------------------------------------------------------------ */
class Var01 {
   // ---------------------------------------------------------------------
   static public void main(String[] sonja) {

                                 // 1 Stapel-Wort fuer Param sonja
      int     v01 = 17;          // 1 Stapel-Wort
      long    v02 = 123;         // 2 Stapel-Worte
      float   v03 = 2.5F;        // 1 Stapel-Wort
      double  v04 = 3.5D;        // 2 Stapel-Worte
      boolean v05 = true;        // 1 Stapel-Wort
      String  v06 = "Hallo!";    // 1 Stapel-Wort
                                 // 9 Worte insgesamt (.limit locals 9)
   } // main
   // ---------------------------------------------------------------------
} // class Var01
