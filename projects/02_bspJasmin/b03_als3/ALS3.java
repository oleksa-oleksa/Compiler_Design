// Datei ALS3.java
/* ------------------------------------------------------------------------
Alg Laufzeit-System, Variante 2

Diese Variante benutzt nur Java 1.4 Befehle (nicht die Klasse Scanner),
damit auch der Java-Compiler gcj Version 3.4.5 sie uebersetzen kann.
------------------------------------------------------------------------ */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ALS3 {

   // ---------------------------------------------------------------------
   // Ausgabe-Methoden
   // pInt, pBool, pString, plnInt, plnBool, plnString

   static private void p  (Object p) {System.out.print  (p);}
   static private void pln(Object p) {System.out.println(p);}
   static private void pln()         {System.out.println() ;}

   static public void pInt     (int i)    { p( intToString(i));}
   static public void pBool    (int b)    { p(boolToString(b));}
   static public void pString  (String s) { p(s); }

   static public void plnInt   (int    i) {pInt   (i); pln();}
   static public void plnBool  (int    b) {pBool  (b); pln();}
   static public void plnString(String s) {pString(s); pln();}
   // ---------------------------------------------------------------------
   // Eingabe-Methoden
   // liesInt, liesBool, liesString

   static public int liesInt() {
      // Liest einen int-Wert von der Standardeingabe und liefert ihn als
      // Ergebnis. Falls eine Ausnahme des Typs IOException oder des Typs
      // NumberFormatException auftritt, wird 0 als Ergebnis geliefert.
      try {
         String eingabe = liesBisTrenner().toLowerCase();
         return Integer.decode(eingabe).intValue();
      } catch (Throwable ausnahme01) {
         pln("Fehler beim Einlesen eines int-Wertes!");
         pln("ALS3.liesInt() liefert den int-Wert 0!");
         return 0;
      } // try/catch
   } // liesInt

   static public int liesBool() {
      // Liest einen bool-Wert (false oder true) von der Standardeingabe
      // und liefert einen int-Wert 0 bzw. 1 als Ergebnis.
      // Ergebnis. Falls eine Ausnahme des Typs IOException oder des Typs
      // NumberFormatException auftritt, wird 0 als Ergebnis geliefert.
      try {
         String eingabe = liesBisTrenner().toLowerCase();
         eingabe = eingabe.trim();
         if ("false".equals(eingabe)) return 0;
         if ("true" .equals(eingabe)) return 1;
         throw new NumberFormatException();
      } catch (Throwable ausnahme01) {
         pln("Fehler beim Einlesen eines int-Wertes!");
         pln("ALS3.liesBool() liefert den bool-Wert 0!");
         return 0;
      } // try/catch
   } // liesBool

   static public String liesString() {
      // Liest einen nicht-leeren String von der Standardeingabe

      try {
         while (true) {
            String erg = bufr.readLine();
            // pln("liesString, erg: ->" + erg + "<-");
            if (erg.length() > 0) return erg;
         }
      }  catch (IOException ausnahme01) {
         pln("Fehler beim Einlesen eines Strings!");
         pln("ALS3.liesString() liefert leeren String!");
         return new String();
      } // try/catch

   } // liesString
   // ---------------------------------------------------------------------
   // Vergleichsmethoden fuer Strings:
   // lessThan, lessEquals, equals, unEquals, greaterEquals, greaterThan

   static public int lessThan(String s1, String s2) {
      int erg = s1.compareTo(s2);
      return (erg < 0) ? 1 : 0;
   }

   static public int lessEquals(String s1, String s2) {
      int erg = s1.compareTo(s2);
      return (erg <= 0) ? 1 : 0;
   }

   static public int equals(String s1, String s2) {
      return s1.equals(s2) ? 1 : 0;
   }

   static public int unEquals(String s1, String s2) {
      return s1.equals(s2) ? 0 : 1;
   }

   static public int greaterEquals(String s1, String s2) {
      int erg = s1.compareTo(s2);
      return (erg >= 0) ? 1 : 0;
   }

   static public int greaterThan(String s1, String s2) {
      int erg = s1.compareTo(s2);
      return (erg > 0) ? 1 : 0;
   }
   // ---------------------------------------------------------------------
   // int und bool-Werte in Strings umwandlen (z.B. vor dem Konkatenieren)
   // intToString, boolToString

   static public String  intToString(int n) {
      return String.valueOf (n) ;
   }

   static public String boolToString(int b) {
      // b sollte einen der Werte 0 oder 1 haben.
      switch (b) {
         case 0:  return "false";
         case 1:  return "true" ;
         default: return "Unerlaubter bool-Wert: " + b;
      }
   }
   // ---------------------------------------------------------------------
   // Zwei Strings konkatenieren:
   static public String concat (String s1, String s2) {return s1+s2;}

   // ---------------------------------------------------------------------
   // Private Hilfs-Attribute und Methoden
   static private InputStreamReader isr  = new InputStreamReader(System.in);
   static private BufferedReader    bufr = new BufferedReader(isr);
   // ---------------------------------------------------------------------
   static private String liesBisTrenner() throws IOException {
      // Liest aus dem Eingebstrom bufr alle transparenten Zeichen und
      // wirft sie weg. Liefert null, wenn dabei das Ende des Stroms
      // erreicht wird.
      // Sonst, nach dem Einlesen eines nicht-transparenten Zeichens Z,
      // wird Z zusammen mit allen danach stehenden nicht-transparenten
      // Zeichen (bis vor das naechste transparente Zeichen oder bis das
      // Ende des Stromes bufr erreicht wird) zu einem String zusammen-
      // gefasst und als Ergebnis geliefert.

      StringBuffer sb = new StringBuffer();
      int zeichen;

      // Alle transparenten Zeichen ueberlesen. Wenn dabei das Ende des
      // Eingabestroms bufr erreicht mit Ergebnis null beenden:
      while (true) {
         zeichen = bufr.read();

         if (zeichen == -1)       return null; // Ende von bufr erreicht
         if (istTrenner(zeichen)) continue;
         break;
      } // while (true)

      // Jetzt steht in zeichen ein nicht-tranparentes Zeichen. Dieses
      // Zeichen und weitere nicht-transparente Zeichen einlesen und in
      // sb sammeln. Wenn ein transparentes Zeichen gelesen oder das
      // Ende des Eingabestroms bufr erreicht wird, den Inhalt von sb
      // als String-Ergebnis liefern:
      while (true) {
         // Ein Zeichen sammeln:
         sb.append( (char) zeichen);
         zeichen = bufr.read();
         // Wenn ein tranparentes Zeichen gelesen ode das Ende des
         // Eingabestroms bufr erreicht wurde:
         if (istTrenner(zeichen) || zeichen == -1) {
            return sb.toString();
         }
      } // while (true)
   } // liesBisTrenner
   // ---------------------------------------------------------------------
   static private boolean istTrenner(int z) {
      // Liefert true wenn z ein transparentes Zeichen
      // (Blank, Tab, CR oder LF) ist.
      // Im Englischen werden transparente Zeichen auch als
      // white space characters bezeichnet. Hier dienen sie zum Trennen
      // einzelner Eingaben und werden deshalb auch Trenner genannt.
      return (z == ' '  || z == '\t' ||z == '\r' || z == '\n');
   } // istTrenner


} // class ALS3