// Datei Vergleiche.java
/* ------------------------------------------------------------------------
Dieses Programm Vergleiche leistet Folgendes:
------------------------------------------------------------------------ */

class Vergleiche {
   // ---------------------------------------------------------------------
   static public void main(String[] sonja) {
      pln("Vergleiche: Jetzt geht es los!");

      int n1 = 17;
      int n2 = 25;

      boolean b1 = n1 < n2;

      pln("Vergleiche: Das war's erstmal!");
   } // main
   // ---------------------------------------------------------------------
   // Eine Methode mit einem kurzen Namen:
   static void pln(Object ob) {System.out.println(ob);}
   // ---------------------------------------------------------------------
} // class Vergleiche
