// File RTS.java
/* ------------------------------------------------------------------------
Runtime system for the compilers alg30, alg31, ...
Requires only Java 1.4
------------------------------------------------------------------------ */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class RTS {
   // ---------------------------------------------------------------------
   // Public output methods: pInt, pBool, pString, plnInt, plnBool, plnString
   static public void pInt     (int i)    { p( intToString(i));}
   static public void pBool    (int b)    { p(boolToString(b));}
   static public void pString  (String s) { p(s); }

   static public void plnInt   (int    i) {pInt   (i); pln();}
   static public void plnBool  (int    b) {pBool  (b); pln();}
   static public void plnString(String s) {pString(s); pln();}

   // Private output methods:
   static private void p  (Object p) {System.out.print  (p);}
   static private void pln(Object p) {System.out.println(p);}
   static private void pln()         {System.out.println() ;}
   // ---------------------------------------------------------------------
   // Public input methods: readInt, readBool, readString
   // The read from standard input.

   static public int readInt() {
      // Reads an int value and returns it. If an exception of type
      // IOException or NumberFormatException occurs, 0 is returned.
      try {
         String eingabe = readTillSeparator().toLowerCase();
         return Integer.decode(eingabe).intValue();
      } catch (Throwable ausnahme01) {
         pln("Error while reading an int value from standard input!");
         pln("RTS.readInt() will return the int value 0!");
         return 0;
      } // try/catch
   } // readInt

   static public int readBool() {
      // Reads a bool value (either false or true) and returns 0 or 1,
      // respectively. If an exception of type IOException or
      // NumberFormatException occurs, 0 is returned.
      try {
         String input = readTillSeparator().toLowerCase();
         input = input.trim();
         if ("false".equals(input)) return 0;
         if ("true" .equals(input)) return 1;
         throw new NumberFormatException();
      } catch (Throwable ex) {
         pln("Error while reading a bool value from standard input!");
         pln("RTS.readBool() will return the bool value 0 (i.e. false)!");
         return 0;
      } // try/catch
   } // readBool

   static public String readString() {
      // Reads a non-empty string and returns it

      try {
         while (true) {
            String erg = bufr.readLine();
            // pln("readString, erg: ->" + erg + "<-");
            if (erg.length() > 0) return erg;
         }
      }  catch (IOException ausnahme01) {
         pln("Error while reading a string value from standard input!");
         pln("RTS.readString() will return an empty string!");
         return new String();
      } // try/catch

   } // readString
   // ---------------------------------------------------------------------
   // Methods to compare strings, returning 0 (for false) or 1 (for true)
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
   // Methods to convert int and bool values to string values
   // intToString, boolToString

   static public String  intToString(int n) {
      return String.valueOf (n) ;
   }

   static public String boolToString(int b) {
      // b should have one of the values 0 or 1.
      switch (b) {
         case 0:  return "false";
         case 1:  return "true" ;
         default: return "Illegal bool value: " + b;
      }
   }
   // ---------------------------------------------------------------------
   // Method to concatenate two strings:
   static public String concat (String s1, String s2) {return s1+s2;}
   // ---------------------------------------------------------------------
   // Private auxiliary fields and methods:
   static private InputStreamReader isr  = new InputStreamReader(System.in);
   static private BufferedReader    bufr = new BufferedReader(isr);
   // ---------------------------------------------------------------------
   static private String readTillSeparator() throws IOException {
      // Reads from the stream bufr all whitespace and discards it.
      // If the end of stream is reached while doing so, null is returned.
      // Otherwise: All non-whitespace characters (till to the next
      // whitespace character or till the end of stream) are read
      // and returned as a string.

      StringBuffer sb = new StringBuffer();
      int c;

      // Read and discard all whitespace characters:
      while (true) {
         c = bufr.read();

         if (c == -1)        return null; // End of stream
         if (isSeparator(c)) continue;
         break;
      } // while (true)

      // Now c contains a non-whitespace character.
      // This character and further non-whitespace characters
      // will be collected in sb. If a whitespace character or the
      // end of stream is reached, the content of sb is returned as string:
      while (true) {
         sb.append( (char) c);
         c = bufr.read();
         if (isSeparator(c) || c == -1) {
            return sb.toString();
         }
      } // while (true)
   } // readTillSeparator
   // ---------------------------------------------------------------------
   static private boolean isSeparator(int c) {
      // Returns true iff c is a whitespace character (space, tab, CR or LF)
      return (c == ' '  || c == '\t' ||c == '\r' || c == '\n');
   } // isSeparator

} // class RTS