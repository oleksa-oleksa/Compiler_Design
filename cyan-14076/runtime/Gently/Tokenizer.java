
// PACKAGE GENTLY  -  GENTLE RUNTIME LIBRARY
// COPYRIGHT (C) 2000-2014 COMPILERTOOLS.NET
// ALL RIGHTS RESERVED.   MAY BE DISTRIBUTED
// AS PART OF SOFTWARE GENERATED WITH GENTLE

package Gently;

import java.io.*;

import java.util.*;
import java.util.regex.*;
import java.util.Hashtable;

public class Tokenizer
{
   //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//package Gently;

//public class LexerState
//{
   private static int LexerDataSourceLine = 1;
   private static int LexerDataSourceOffset = 0;
   private static JavaNode LexerDatayylval;

// for TokenStream: // "returned from tokenize()
public static int Get_LexerDataSourceLine() { return LexerDataSourceLine; }
public static int Get_LexerDataSourceOffset() {
   //return LexerDataSourceOffset;
   return BEGINMATCH;
   // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
   }
public static JavaNode Get_LexerDatayylval() { return LexerDatayylval; }
//}
   //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//package Gently;

//import static Gently.Print.EP;
//import static Gently.Print.caught;

//public class SemanticActions
//{

   // ====================================================================
   // Lexer Actions
   // ====================================================================
   private static int BEGINMATCH;

   // Yywhitespace
   // ------------
   // called in semantic action of generated lexer rules for whitespace
   // e.g.
   // " " {
   // Yywhitespace(yytext);
   // }
   private static void TknYywhitespace(String str)
   {
      final int len = str.length();

      CheckForEol(str);

      JavaStringValue node = new JavaStringValue(str);

      // =1=
      //System.out.println("white: '"+str+"'...");
      node.setCoordinate(
         new Coordinate(
            TokenStream.CurrentFile,
            LexerDataSourceLine,
            BEGINMATCH,//LexerDataSourceOffset-len,
            len
         ));

      LexerDatayylval = node; //XXXXXXXXXXXXX

   }

   // Yyunmatched
   // -----------
   // called in semantic action of generated lexer rule
   // for unmatched input
   // e.g.
   // . {
   // Yyunmatched(yytext);
   // }
   private static void TknYyunmatched(String str)
   {
      final int len = str.length();

      CheckForEol(str);

      JavaStringValue node = new JavaStringValue(str);

      // =2=
      //System.out.println("unmatched: '"+str+"'...");
      node.setCoordinate(
         new Coordinate(
            TokenStream.CurrentFile,
            LexerDataSourceLine,
            BEGINMATCH,//LexerDataSourceOffset-len,
            len
         ));

      LexerDatayylval = node;

   }

   // Yytext
   // ------
   // called in semactic actions of lex rules for matched tokens
   // e.g.
   // "abc" {
   // yylval = Yytext(yytext);
   // return tokencode;
   // }
   //=3=
   private static JavaNode TknYytext(String str)
   {

      final int len = str.length();

      CheckForEol(str);

      JavaStringValue node = new JavaStringValue(str);

      // =3=
      //System.out.println("yytext: '"+str+"'...");
      node.setCoordinate(
         new Coordinate(
            TokenStream.CurrentFile,
            LexerDataSourceLine,
            BEGINMATCH,//LexerDataSourceOffset-len,
            len
         ));

      LexerDatayylval = node;

      return node;
   }

   // see value converter
   private static void TknAssignYylval(JavaNode node)
   {
      LexerDatayylval = node;
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

               LexerDataSourceOffset++;

               LexerDataSourceLine++;
               i++;
            }
            else {

               //System.out.println("__r single");

               LexerDataSourceOffset++;

               //plus
               LexerDataSourceLine++;
            }
         }
         else if (ch == '\n') {
            if (i+1 < len && str.charAt(i+1) == '\r') {

               //System.out.println("__n and __r <-- so rum");

               LexerDataSourceOffset++;

               LexerDataSourceLine++;
               i++;
            }
            else  {

               //System.out.println("__n single");

               LexerDataSourceOffset++;

               LexerDataSourceLine++;
            }
         }
         else {

            //System.out.println("__c '"+ch+"'");

            LexerDataSourceOffset++;
         }
      }

   }

//}
   //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

   public static String filename;

   private static Hashtable<String, FixPattern> FixPatterns =
      new Hashtable<String, FixPattern>();

   private static List<FlexPattern> FlexPatterns =
      new ArrayList<FlexPattern>();

   private static List<FlexPattern> WhitePatterns =
      new ArrayList<FlexPattern>();

   private static String quelltext;
   private static Matcher global_m;
   private static int global_pos;
   private static int global_end;
   private static RRule global_fix = null;

   // ---------------------------------------------------------------------
   // prepare
   // ---------------------------------------------------------------------

   public static void prepare()
   {
      prepare1();
      prepare2();
      prepare3();
   }

   public static void prepare1()
   {
      // System.out.println("*** using Tokenizer");

      String fixpattern = null;
      
      for (int curlen = 50; curlen > 0; curlen--) { //xxxxxx
      for (Token t : Token.TokenList) {

         String regex = t.Regex;

         if (regex != null) {
         if(t.Regex.length() == curlen) { //xxx

            if (t.Code == -1) {

               // whitespace
               // ==========

               String pat = regex.substring(3, regex.length() - 3);

               WhitePatterns.add(new FlexPattern(pat, t.Code, t));

            } else if (regex.length() >= 3
                  && regex.substring(0, 3).equals("<<<")) {

               // flex
               // ====

               String pat = regex.substring(3, regex.length() - 3);

               FlexPatterns.add(new FlexPattern(pat, t.Code, t));

            } else {

               // fix
               // ===

               String escapedpat = FixEscaped(regex);
               if (fixpattern == null)
                  fixpattern = escapedpat;
               else
                  fixpattern = fixpattern + "|" + escapedpat;

               FixPatterns.put(regex, new FixPattern(regex, t.Code));
            }

         } //xxx
         } // regex != null

      } // for tokens in TokenList
      } //xxxxxx

      // ***********************************
      if (fixpattern != null) {
         global_fix = new RRule("fix", fixpattern);
      }


   }
   public static void prepare2(String str)
   {
      quelltext = str;
   }
   public static void prepare2()
   {
      if (GrammarLib.CyanDocument == null) {
         quelltext = Gently.Reader.ReadFile(filename);
      }
      else {
         quelltext = GrammarLib.CyanDocument;
      }

   }
   public static void prepare3()
   {
      global_pos = 0;
      global_end = quelltext.length();

      Pattern p  = Pattern.compile("dummy");
      global_m = p.matcher(quelltext);
      global_m.useTransparentBounds(true);
      global_m.useAnchoringBounds(false);

      /*
      if (fixpattern != null) {
         global_fix = new RRule("fix", fixpattern);
      }
      */

   }
   // ---------------------------------------------------------------------

   static String FixEscaped(String xs)
   {
      int len = xs.length();
      StringBuilder result = new StringBuilder();

      char[] meta = { 
         '<', '(', '[', '{', '\\', '^', '-', '=', '$',
         '!', '|', ']', '}', ')', '?', '*', '+', '.', '>' };

      for (int i = 0; i < len; i++) {
         char ch = xs.charAt(i);
         boolean replaced = false;

         for (char m: meta) {
            if (ch == m) {
               result.append('\\');
               result.append(m);
               replaced = true;
               break;
            }
         }   

         if (! replaced) {
            result.append( ch );
         }
      }
      
      String ys = result.toString();

      return ys;
   } 

   // ---------------------------------------------------------------------
   // tokenize
   // ---------------------------------------------------------------------

   public static int tokenize() throws java.io.IOException
   {
      try {

         boolean TRACE = false;

         if (TRACE) System.out.println("*** tokenize ***");
         int plusten = global_pos+10;
         String suffix = "...";
         if (plusten > global_end) {
            plusten = global_end;
            suffix = "";
         }
         if (TRACE) System.out.println
            ("*** <<<"+
            quelltext.substring(global_pos, plusten)+suffix+
            ">>> at "+global_pos);

         global_m.region(global_pos, global_end);

         // *** skip whitespace ***

         boolean whitespacematched;
         do {
            whitespacematched = false;

            for (FlexPattern p : WhitePatterns) {

               if (global_pos < global_end
                     && global_m.usePattern(p.pattern).lookingAt()) {
                  int from = global_m.start();
                  int upto = global_m.end();
                  String matched = quelltext.substring(from, upto);

            //=1=
            BEGINMATCH = global_pos;
                  TknYywhitespace(matched);
                  int old_global_pos = global_pos;
                  global_pos = upto;
                  global_m.region(global_pos, global_end);
                  if (TRACE) System.out.println("*** whitespace : <<<" +
                     matched + ">>> at "+old_global_pos);
                  whitespacematched = true;
               } // if

            } // for

         } while (whitespacematched);

         // *** check eof ***

         if (global_pos >= global_end) {
            if (TRACE) System.out.println("*** return eof at "+global_pos);
            return -1; // Eof
            //=======================================
         }

         // *** next token ... ***

         global_m.region(global_pos, global_end);

         int maxupto = -1;
         int maxcode = -1;
         Token maxtoken = null;

         // *** check fix patterns ***

         if (global_fix != null) {

         if (global_m.usePattern(global_fix.pattern).lookingAt()) {
            int from = global_m.start();
            int upto = global_m.end();
            maxupto = upto;
            String matched = quelltext.substring(from, upto);

            if (FixPatterns.containsKey(matched)) {
               int c = FixPatterns.get(matched).code;
               maxcode = c;
            } else {
               System.out.println("+++++ not in table: '" + matched + "'");
               System.exit(-1);
            }

         }

         }

         // *** check flex patterns ***

         for (FlexPattern p : FlexPatterns) {
            if (global_m.usePattern(p.pattern).lookingAt()) {
               int upto = global_m.end();

               if (upto > maxupto) {
                  maxupto = upto;
                  maxcode = p.code;
                  maxtoken = p.token;
               }
            }
         }

         // *** matched ? ***

         if (maxupto == -1) {
            int from = global_pos;
            //int upto = global_pos+1;
            int upto = global_pos;
            // nach unten geschoben: global_pos = global_pos+1;
            String matched = quelltext.substring(from, upto);

            //=2=
            BEGINMATCH = global_pos;
            TknYyunmatched(matched);

            if (TRACE) System.out.println
               ("*** no match : <<<" + matched + ">>> at "+global_pos);

            global_pos = global_pos+1;

            return Gently.GrammarLib.ErrorToken;
            //==========================================

         } else {
            String matched = quelltext.substring(global_pos, maxupto);
            

            //=3=
            BEGINMATCH = global_pos;
            JavaNode node =
               TknYytext(matched);

            int old_global_pos = global_pos;
            global_pos = maxupto;

            if (maxtoken != null && maxtoken.converter != null) {
               
               //System.out.println("calling converter......");

               JavaNode converted = maxtoken.converter.convert(node);

               Coordinate coord = node.getCoordinate();
               converted.setCoordinate(coord);
               converted.SetChildPositions();


               TknAssignYylval (converted);
            }

            if (TRACE) System.out.println
               ("*** return : <<<" + matched + ">>> at "+old_global_pos);

            return maxcode;
            //==========================================
         }

      }

      catch (Exception e) {
         Message.Bad(e);
         return -1;
      }

   }
   // ---------------------------------------------------------------------

}
// =======================================================================

class RRule
{
   final String name;
   Pattern pattern;

   final String regex;

   RRule(String name, String regex)
   {
      if (regex == null)
         System.out.println(">>>>>>>>>>>>>>> regex null " + name);
      this.name = name;
      this.regex = regex;
      try {
         pattern = Pattern.compile(regex);
      }
      catch (Exception x)
      {
         JavaLib.RuntimeError("error in pattern <<<" + regex + ">>>");
         pattern = null;
      }
   }

   @Override
   public String toString()
   {
      return "RRule" + "[" + name + ":" + regex + "]";
   }
}
// =======================================================================

class FixPattern
{
   final String pattern;
   final int code;

   public FixPattern(String p, int c)
   {
      pattern = p;
      code = c;
   }
}
// =======================================================================

class FlexPattern
{
   String regex;
   Pattern pattern;
   final int code;
   final Token token;

   public FlexPattern(String r, int c, Token t)
   {
      regex = r;
      code = c;
      //System.out.println(">>>>>>> compile flexpattern: '" + regex + "'");
      try {
         pattern = Pattern.compile(regex);
      }
      catch (Exception x)
      {
         JavaLib.RuntimeError("error in pattern <<<" + regex + ">>>");
         pattern = null;
      }
      //System.out.println("regex="+regex);
      token = t; // xxx c part of t
   }
}
// =======================================================================
