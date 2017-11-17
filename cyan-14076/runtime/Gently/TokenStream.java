
// PACKAGE GENTLY  -  GENTLE RUNTIME LIBRARY
// COPYRIGHT (C) 2000-2014 COMPILERTOOLS.NET
// ALL RIGHTS RESERVED.   MAY BE DISTRIBUTED
// AS PART OF SOFTWARE GENERATED WITH GENTLE

package Gently;

import java.io.*;
import java.util.*;

import static Gently.Print.EP;
import static Gently.Print.EP_;
import static Gently.Print.caught;

public class TokenStream
{

   //public static int STARTOFFSET;

   private static int AktuellerIndex;
   private static int StartAktuellerIndex;
   private static int AktuellerPoint;

   private static int[] TOKENINFO_TokenCode;
   private static JavaNode[] TOKENINFO_TokenNode;
   private static int[] TOKENINFO_TokenOffset;
   private static int[] TOKENINFO_TokenLine;

   // --------------------------------------------------------------------

   static int TokenCount;

   public static void InitTokenStream(String newstate)
   {
         long start = System.currentTimeMillis( );
      final int MaxLengthTokenStream = 90000; // xxx

      // ALLOCATE TOKENINFO
      TOKENINFO_TokenCode = new int[MaxLengthTokenStream];
      TOKENINFO_TokenNode = new JavaNode[MaxLengthTokenStream];
      TOKENINFO_TokenOffset = new int[MaxLengthTokenStream];
      TOKENINFO_TokenLine = new int[MaxLengthTokenStream];

      AktuellerIndex = -1;

      TokenCount = 0;

      int LEXERRETURNVALUE;

      Tokenizer.prepare();

      do {
         // LOOP
         int vorher = -1;
         try {

               LEXERRETURNVALUE = Tokenizer.tokenize();

         } catch (Exception exc) {
            
            caught(exc);

            int line = 0; // xxx Tokenizer.LexerDataSourceLine;//KKK
            int offset = 0; // xxx = Tokenizer.LexerDataSourceOffset;//KKK


            int len = 1; // xxxx
            Coordinate coord = new Coordinate( // COORD 5 SyntaxError
                  CurrentFile, line, offset, len);

            internalError(coord, "Lexer: Internal Error");

            LEXERRETURNVALUE = -9; // dummy
         }


         // SET TOKENINFO
         TOKENINFO_TokenCode[TokenCount] = LEXERRETURNVALUE;
         
         // from Tokenizer: // "returned" from tokenize()
         TOKENINFO_TokenOffset[TokenCount] = //xxx STARTOFFSET;
            Tokenizer.Get_LexerDataSourceOffset();//KKK
         TOKENINFO_TokenNode[TokenCount] =
            Tokenizer.Get_LexerDatayylval();//KKK
         TOKENINFO_TokenLine[TokenCount] =
            Tokenizer.Get_LexerDataSourceLine();//KKK

         TokenCount++;

         // END LOOP

      } while (LEXERRETURNVALUE > 0);

         long end = System.currentTimeMillis( );
         long diff = end - start;
         //System.out.println("TIME : " + (diff*1.0)/1000.0 + " sec");
   }

   // --------------------------------------------------------------------
   // Position
   // --------------------------------------------------------------------

   public static void ResetPtr()
   {
      AktuellerIndex = -1;
   }

   // --------------------------------------------------------------------

   public static void MarkStart()
   {
      StartAktuellerIndex = AktuellerIndex;
   }

   // --------------------------------------------------------------------

   public static void BackToStart()
   {
      AktuellerIndex = StartAktuellerIndex;
   }

   // --------------------------------------------------------------------

   public static void MarkSuccess()
   {
      AktuellerPoint = AktuellerIndex;
   }

   // --------------------------------------------------------------------

   public static void BackToSuccess()
   {
      AktuellerIndex = AktuellerPoint - 1;
   }

   // --------------------------------------------------------------------

   static void ADVANCE()
   {
      AktuellerIndex++;
   }

   // --------------------------------------------------------------------
   // Aktuell
   // --------------------------------------------------------------------

   public static int Aktuelles()
   {
      return TOKENINFO_TokenCode[AktuellerIndex];
   }

   // --------------------------------------------------------------------

   public static JavaNode EarleyCurRep()
   {
      return TOKENINFO_TokenNode[AktuellerIndex];
   }

   // --------------------------------------------------------------------
   // Naechster
   // --------------------------------------------------------------------

   public static int EinsWeiter()
   {
      return TOKENINFO_TokenCode[AktuellerIndex + 1];
   }

   /*
   public static int NWeiter(int N)
   {
      if (TokenCount < AktuellerIndex + N) {
         return -999;
      }
      return TOKENINFO_TokenCode[AktuellerIndex + N];
   }
   */

   // --------------------------------------------------------------------

   public static JavaNode NaechstesRep()
   {
      return TOKENINFO_TokenNode[AktuellerIndex + 1];
   }

   // --------------------------------------------------------------------
   // etc
   // --------------------------------------------------------------------

   private static Token EOFTOKEN = new Token("/EOF/", -1);

   static Token EofToken()
   {
      return EOFTOKEN;
   }

   // --------------------------------------------------------------------
   // Messages
   // --------------------------------------------------------------------

   public static String CurrentFile;

   private static java.util.Hashtable<String, String> HT =
      new java.util.Hashtable<String, String>();

   public static void SetCurrentFile(String file, String text)
   {
      CurrentFile = file;
      if (text != null)
         HT.put(file, text);
   }

   public static void SyntaxError()
   {
      int line = TOKENINFO_TokenLine[AktuellerIndex];
      int offset = TOKENINFO_TokenOffset[AktuellerIndex];
      int len = 0; // xxxx

      Coordinate coord = new Coordinate( // COORD 5 SyntaxError
            CurrentFile, line, offset, len);
      internalSyntaxError(coord, "syntax error");
   }

   // MSG 2
   public static void SyntaxErrorNextPos()
   {
      int line = TOKENINFO_TokenLine[AktuellerIndex + 1];
      int offset = TOKENINFO_TokenOffset[AktuellerIndex + 1];
      int len = 0; // xxxx
      Coordinate coord = new Coordinate( // COORD 6 SyntaxErrorNextPos
            CurrentFile, line, offset, len);
      internalSyntaxError(coord, "syntax error");
   }

   public static Coordinate ReportedErrorPos = null;
   public static String ReportedErrorMsg = null;

   // generated by Gentle compiler
   // as translation of: error Msg, Pos
   // or: error Msg (error Msg, /nopos/)
   // MSG 3
   public static void ReportError(JavaNode msg, JavaNode pos)
   // pos is in string format
   // coordinate converted by obsolete JavaLib.rtsGetSourcePos
   {
      // message text
      JavaStringValue valmsg = (JavaStringValue) msg;
      String strmsg = valmsg.Str;

      // coordinate
      JavaStringValue valpos = (JavaStringValue) pos;
      String strpos = valpos.Str;

      String file = GetFileFromString(strpos);
      if (strpos.equals("/unknown pos/")) {
         System.out.println(strmsg);
         System.out.println("[error message with undefined position]");
         System.exit(-1);
         //xxx
      }
      int line = GetLineFromString(strpos);
      int offset = GetOffsetFromString(strpos);
      int length = 0; // xxxxxxxxxxxxxxxx

      Coordinate coord = new Coordinate( // COORD 7 ReportError
            file, line, offset, length);
      internalError(coord, strmsg);
   }

   public static String KonvertCoordinateToString(Coordinate coord)
   {
      if (coord == null)
         return "/unknown pos/";
      else
         return "/line,offset,length,file=/ " + coord.getLine() + " "
               + coord.getOffset() + " " + coord.getLength() + " "
               + coord.getFile();
   }

   public static int GetLineFromString(String str)
   {
      //System.out.println("GetLineFromString: str = '" + str + "'");
      int k;
      String rest;
      String head;

      k = str.indexOf(" ");
      head = str.substring(0, k);
      rest = str.substring(k + 1);

      k = rest.indexOf(" ");
      head = rest.substring(0, k);
      rest = rest.substring(k + 1);
      int line = Integer.parseInt(head);
      return line;
   }

   public static int GetOffsetFromString(String str)
   {
      int k;
      String rest;
      String head;

      k = str.indexOf(" ");
      head = str.substring(0, k);
      rest = str.substring(k + 1);

      k = rest.indexOf(" ");
      head = rest.substring(0, k);
      rest = rest.substring(k + 1);

      k = rest.indexOf(" ");
      head = rest.substring(0, k);
      rest = rest.substring(k + 1);
      int offset = Integer.parseInt(head);

      return offset;
   }

   public static String GetFileFromString(String str)
   {
      int k;
      String rest;

      k = str.indexOf(" ");
      rest = str.substring(k + 1);

      k = rest.indexOf(" ");
      rest = rest.substring(k + 1);

      k = rest.indexOf(" ");
      rest = rest.substring(k + 1);

      k = rest.indexOf(" ");
      rest = rest.substring(k + 1);

      return rest;
   }

   // --------------------------------------------------------------------
   // ExhaustiveParser/Derivator ->
   // TokenStream.SyntaxError / TokenStream.SyntaxErrorNextPos ->
   // GrammarLib.SyntaxError
   //
   // MSG 5
   private static void internalError(Coordinate coord, String txt)
   {
      String SourceFile = coord.getFile();
      int SourceLine = coord.getLine();
      FindErrorLine(coord);
      EP(SourceFile + ", line " + SourceLine + ": " + txt);
      ReportedErrorPos = coord;
      ReportedErrorMsg = txt;

      throw new ReportedError();
   }

   private static void internalSyntaxError(Coordinate coord, String txt)
   {
      String SourceFile = coord.getFile();
      int SourceLine = coord.getLine();
      FindErrorLine(coord);
      EP(SourceFile + ", line " + SourceLine + ": " + txt);
      ReportedErrorPos = coord;

      throw new ErrorReportedByParser();
   }
   public static void ErrorExit(String txt)
   {
      EP("Error: " + txt);
      //throw new ErrorReportedByParser();
      throw new ReportedError();
   }

   private static void FindErrorLine(Coordinate coord)
   {
      String SourceFile = coord.getFile();
      int SourceLine = coord.getLine();
      int SourceOffset = coord.getOffset();
      //System.out.println("FindErrorLine: SourceOffset="+SourceOffset);
      
      String quelltext = Gently.Reader.ReadFile(SourceFile);
      int pos = SourceOffset;
      while (true) {
         if (pos < 0) break;
         if (pos >= quelltext.length()) break;
         if (quelltext.charAt(pos) == '\n') break;
         if (quelltext.charAt(pos) == '\r') break;
         //System.out.println("pos="+pos+ " '" +quelltext.charAt(pos)+"'");
         pos--;
      }
      int first = pos+1;

      pos = SourceOffset;
      while (true) {
         if (pos >= quelltext.length()) break;
         if (quelltext.charAt(pos) == '\n') break;
         if (quelltext.charAt(pos) == '\r') break;
         //System.out.println("pos="+pos+ " '" +quelltext.charAt(pos)+"'");
         pos++;
      }
      int last = pos;

      if (first <= last) {
      String Line = quelltext.substring(first, last); 
      //System.out.println("'"+Line+"'");
      EmitMessage(SourceOffset, first, last-first, Line);
      }
      else {
         //System.out.println("first="+first);
         //System.out.println("last="+last);
      }
   }

   private static void qqFindErrorLine(Coordinate coord)
   {
      String SourceFile = coord.getFile();
      int SourceLine = coord.getLine();
      int SourceOffset = coord.getOffset();
      System.out.println("FindErrorLine: SourceOffset="+SourceOffset);

      // String sep = System.lineSeparator(); // Java 7
      String OS = System.getProperty("os.name").toLowerCase();
      int SEPLEN;
      if (OS.indexOf("win") >= 0) {
         SEPLEN = 2;
      }
      else {
         SEPLEN = 1;
      }
      BufferedReader br = null;
      try {

         String sCurrentLine;

         br = new BufferedReader(new FileReader(SourceFile));

         int linecount = 0;
         int lineoffset = 0;
         while (true) {
            
            sCurrentLine = br.readLine();
            if (sCurrentLine  == null) break;
            int linelength = sCurrentLine.length();

            //System.out.println
               //("FindErrorLine, read : >>>" +sCurrentLine + "<<<");
            linecount++;

            if (linecount == SourceLine) {
               EmitMessage(SourceOffset, lineoffset, linelength, sCurrentLine);
               return;
            }

            lineoffset = lineoffset + linelength + SEPLEN;

         }
         //System.out.println("FindErrorLine: not found");

      } catch (Exception e) {
         System.out.println("FindErrorLine: Exception");
         caught(e);
      } finally {
         try {
            if (br != null)
               br.close();
         } catch (IOException ex) {
            System.out.println("FindErrorLine: IOException in finally");
            caught(ex);
         }
      }
   }
               private static void EmitMessage(int SourceOffset, int lineoffset, int linelength, String sCurrentLine)
               {
               //System.out.println("FindErrorLine: found");
               int errorcol = SourceOffset - lineoffset + 1;
               if (errorcol > (linelength-1)) {
                  //System.out.println("FindErrorLine, AT END OF LINE");
                  errorcol = linelength;
               }
               EP(sCurrentLine);
               for (int i = 1; i < errorcol; i++) {
                  if (i > 0 && sCurrentLine.charAt(i - 1) == '\t') {
                     EP_("\t");
                  } else {
                     EP_(" ");
                  }
               }
               EP("^");
               }

}
  
class DiffDemo {

   public static void main(String args[]) {
      try {
         long start = System.currentTimeMillis( );
         System.out.println(new Date( ) + "\n");

         Thread.sleep(5*60*10);

         System.out.println(new Date( ) + "\n");
         long end = System.currentTimeMillis( );
         long diff = end - start;
         System.out.println("Difference is : " + diff);
      } catch (Exception e) {
      caught(e);
         System.out.println("Got an exception!");
      }
   }
}
