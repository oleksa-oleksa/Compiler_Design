/* ------------------------------------------------------------------------
// Datei Vers01.java
/* ------------------------------------------------------------------------
Dieses Programm Vers01 soll in eine Jasmin-Datei umgewandelt werden.
Die Jasimin-Datei soll dann um bestimmte Jasmin-Befehle ergaenzt werden.
------------------------------------------------------------------------ */
class Hilf {
          int   i01 = 17;
          float f01 = 2.5F;
   static int   i02 = 25;
   static float f02 = 4.5F;
}

public class Vers01 {
   // ---------------------------------------------------------------------
   static public void main(String[] sonja) {
      pln("Vers01: Jetzt geht es los!");
      int n1 = 17;
      int n2 =  4;
      int n3;

      float f1 = 17.0F;
      float f2 =  4.0F;
      float f3;

      pln(123);
      pln(1.3F);

      pln("Vers01: Das war's erstmal!");
   } // main
   // ---------------------------------------------------------------------
   // Methoden mit kurzen Namen:
   static void pln(Object ob) {System.out.println(ob);}
   static void pln(int    i ) {System.out.println( i);}
   static void pln(float  f ) {System.out.println( f);}
   // ---------------------------------------------------------------------
} // class Vers01
