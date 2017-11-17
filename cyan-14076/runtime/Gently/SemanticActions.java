
// PACKAGE GENTLY  -  GENTLE RUNTIME LIBRARY
// COPYRIGHT (C) 2000-2014 COMPILERTOOLS.NET
// ALL RIGHTS RESERVED.   MAY BE DISTRIBUTED
// AS PART OF SOFTWARE GENERATED WITH GENTLE

package Gently;

import static Gently.Print.EP;
import static Gently.Print.caught;

public class SemanticActions
{

   // ====================================================================
   // Parser Actions
   // ====================================================================

   // ....................................................................
   // called in semantic actions of parser :
   // SourceRange //1
   // SourceRangeEmpty //2
   // ....................................................................

   // Source Range
   // ------------
   // called in semantic action of generated parser
   // m : m1 ... mn {
   // x = Node (...);
   // SourceRange($1, $n, x);
   // $$ = x;
   // }
   //static LexerState Voriger = null;

   static int HERE_LINE = 0;
   static int HERE_OFFSET = 0;
   // code
   public static void SourceRange(JavaNode x1, JavaNode x2, JavaNode x,
         int Folding)
   // 1
   {

      try {
      //if (x1 == null) P("x1 == null");
      //if (x2 == null) P("x2 == null");

      if (x1.getCoordinate() == null) return; // xxx
      if (x2.getCoordinate() == null) return; // xxx

      int line1 = x1.getCoordinate().getLine();
      int offset1 = x1.getCoordinate().getOffset();
      int length1 = x1.getCoordinate().getLength();
      int offset2 = x2.getCoordinate().getOffset();
      int length2 = x2.getCoordinate().getLength();

      int line = line1;
      int offset = offset1;
      int length = offset2 + length2 - offset1;
      HERE_LINE = line; 
      HERE_OFFSET = offset; 

      x.setCoordinate
         (new Coordinate(TokenStream.CurrentFile, line, offset, length));

      x.SetChildPositions();

      if (x.folding != 1) 
         x.folding = Folding;

      }
      catch (Exception E) {
         caught(E);
         Control.Exit("SemanticActions 1");
      }
   }

   // SourceRangeEmpty
   // ----------------
   // called in semantic action of generated parser
   // see SourceRange
   // used for empty rhs

   // code
   public static void SourceRangeEmpty(JavaNode x)
   {
      x.setCoordinate(
         new Coordinate(
            TokenStream.CurrentFile,
            HERE_LINE,//0, //Tokenizer.LexerDataSourceLine, //xxx
            HERE_OFFSET,//0, //Tokenizer.LexerDataSourceOffset,//xxx
            0 // length //xxx
      ));

   }

   /*
   // ====================================================================
   // Lexer Actions
   // ====================================================================

   // Yywhitespace
   // ------------
   // called in semantic action of generated lexer rules for whitespace
   // e.g.
   // " " {
   // Yywhitespace(yytext);
   // }
   public static void TknYywhitespace(String str)
   {
      final int len = str.length();

      CheckForEol(str);

      JavaStringValue node = new JavaStringValue(str);

      int offset = LexerState.LexerDataSourceOffset - len;
      TokenStream.STARTOFFSET = offset;

      node.setCoordinate(
         new Coordinate(
            TokenStream.CurrentFile,
            LexerState.LexerDataSourceLine,
            offset,
            len
         ));

      LexerState.LexerDatayylval = node; //XXXXXXXXXXXXX

   }

   // Yyunmatched
   // -----------
   // called in semantic action of generated lexer rule
   // for unmatched input
   // e.g.
   // . {
   // Yyunmatched(yytext);
   // }
   public static void TknYyunmatched(String str)
   {
      final int startoffset = LexerState.LexerDataSourceOffset;
      final int len = str.length();

      TokenStream.STARTOFFSET = startoffset;

      CheckForEol(str);

      JavaStringValue node = new JavaStringValue(str);

      int offset = LexerState.LexerDataSourceOffset - len;
      node.setCoordinate(
         new Coordinate(
            TokenStream.CurrentFile,
            LexerState.LexerDataSourceLine,
            startoffset,
            len
         ));

      LexerState.LexerDatayylval = node;

   }

   // Yytext
   // ------
   // called in semactic actions of lex rules for matched tokens
   // e.g.
   // "abc" {
   // yylval = Yytext(yytext);
   // return tokencode;
   // }
   public static JavaNode TknYytext(String str)
   {

      final int startoffset = LexerState.LexerDataSourceOffset;
      final int len = str.length();

      TokenStream.STARTOFFSET = startoffset;

      CheckForEol(str);

      JavaStringValue node = new JavaStringValue(str);

      node.setCoordinate(
         new Coordinate(
            TokenStream.CurrentFile,
            LexerState.LexerDataSourceLine,
            startoffset,
            len
         ));

      LexerState.LexerDatayylval = node;

      return node;
   }

   // see value converter
   public static void TknAssignYylval(JavaNode node)
   {
      LexerState.LexerDatayylval = node;
   }

   private static void CheckForEol(String str)
   {
      final int len = str.length();

      //System.out.println("'"+str+"'");
      for (int i = 0; i < len; i++) {
         //System.out.println("_________________i= "+i);
         char ch = str.charAt(i);

         if (ch == '\r') {
            if (i+1 < len && str.charAt(i+1) == '\n') {

               //System.out.println("__r and __n");

               LexerState.LexerDataSourceOffset++;

               LexerState.LexerDataSourceLine++;
               i++;
            }
            else {

               //System.out.println("__r single");

               LexerState.LexerDataSourceOffset++;

               //plus
               LexerState.LexerDataSourceLine++;
            }
         }
         else if (ch == '\n') {
            if (i+1 < len && str.charAt(i+1) == '\r') {

               //System.out.println("__n and __r <-- so rum");

               LexerState.LexerDataSourceOffset++;

               LexerState.LexerDataSourceLine++;
               i++;
            }
            else  {

               //System.out.println("__n single");

               LexerState.LexerDataSourceOffset++;

               LexerState.LexerDataSourceLine++;
            }
         }
         else {

            //System.out.println("__c '"+ch+"'");

            LexerState.LexerDataSourceOffset++;
         }
      }

   }
   */

}
