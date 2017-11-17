
// PACKAGE GENTLY  -  GENTLE RUNTIME LIBRARY
// COPYRIGHT (C) 2000-2014 COMPILERTOOLS.NET
// ALL RIGHTS RESERVED.   MAY BE DISTRIBUTED
// AS PART OF SOFTWARE GENERATED WITH GENTLE

package Gently;

import Gently.JavaNode;
import Gently.JavaStringValue;
import Gently.JavaLib;
//import Gently.Yylex; //7
import Generated.Grammar; //2

import static Gently.Print.P;
import static Gently.Print.P_;
import static Gently.Print.caught;

public class GrammarLib
{
   public static boolean SignalWhitespace;
   public static final int WhitespaceToken = 257;
   public static final int ErrorToken = 357;
   public static JavaNode JavaParseResult = null;

   public static String CyanSource = null;

   // public semantics , GrammarLib?
   public static boolean CyanSemantics(String source, JavaNode AbstractSyntax)
   {
      CyanSource = source;
      if (AbstractSyntax != null) {
         try {
            JavaLib.RESET();
            Generated.Procs.Semantics(AbstractSyntax);
            return true;
         } catch (ReportedError E) {
            caught(E);

         } catch (Error E) {
            caught(E);
         }
      }
      return false;
   }

   // --------------------------------------------------------------------------
   // main, DOPARSE is entry for all parsing algorithms (acute, accent, yacc)
   // --------------------------------------------------------------------------

   // Code generated from ``Parse(fn -> ast)''

   // public parse 1
   public static JavaNode ParseNamedFile(JavaNode fn)
   {
      JavaStringValue sv = (JavaStringValue) fn;
      String str = sv.Str;

         Tokenizer.filename = str;

      JavaNode n = ParseFile(str);
      return n;
   }

   // --------------------------------------------------------------------------

   // Code generated from ``Parse(-> ast)'', ``Nonterm(-> ast)''

   // public parse 2
   public static JavaNode ParseStandardFile()
   {

      String[] args = JavaLib.GetProgramArguments();
      String str = args[0];

         Tokenizer.filename = str;

      return ParseFile(str);
   }

   // --------------------------------------------------------------------------

   public static JavaNode ParseFile(String fn)
   {
      //java.io.Reader rdr = null;

      /*
      try {
         rdr = new java.io.FileReader(fn);
      } catch (java.io.FileNotFoundException exc) {
         caught(exc);
         
         System.out.println("File not found: " + fn);

         throw new ReportedError();
      }
      */

      TokenStream.SetCurrentFile(fn, null);
      JavaNode n = DOPARSE(true);
      return n;
   }

   // --------------------------------------------------------------------------

   private static JavaNode DOPARSE(boolean ExitOnError)
   {
      SignalWhitespace = false;

      try {

         JavaNode n = null;

         if (Generated.Grammar.Parser.equals("Accent")) {
            n = EarleyParseFile();
         }
         else {
            n = GammaParseFile();
         }

         return n;

      }

      catch (ErrorReportedByParser x) {
         caught(x);
         //P("case 1 ...");
         if (ExitOnError) {
            Control.Exit("!GrammarLib 1");
            // throw new RuntimeError();
         }
         //P("case 1");
         return null;
      } catch (RuntimeException x) {
         caught(x);
         P("case 2 ...");

         x.printStackTrace();
         PARSEERROR(ExitOnError);
         P("case 2");
         return null;

      } catch (Exception x) {
         caught(x);
         P("case 3 ...");

         x.printStackTrace();
         PARSEERROR(ExitOnError);
         P("case 3");
         return null;

      }
   }

   private static void PARSEERROR(boolean ExitOnError)
   {
      P("PARSE ERROR");
      if (ExitOnError)
         throw new RuntimeError();
   }

   // --------------------------------------------------------------------------
   // end main
   // --------------------------------------------------------------------------

   // --------------------------------------------------------------------------
   // Acute ; see class Derivator
   // (see also class PredictiveParser)
   // (see also class Llana)
   // --------------------------------------------------------------------------

   private static JavaNode GammaParseFile()
   {
      //Yylex scanner = new Yylex(rdr);

      //scanner.YyState = new LexerState();
      //Tokenizer.YyState = scanner.YyState;
      //return GoGo(scanner);
      //Tokenizer.YyState = LexerState.LEXERDATA;
      return GoGo();

   }

   
   //private static JavaNode GoGo(Yylex scanner)
   private static JavaNode GoGo()
   {
      Grammar.DefineGrammar();

      Derivator.PrepareGrammar();
      Llana.AnalizeGrammar();

      //JavaNode nd = Derivator.Parse(scanner);
      JavaNode nd = Derivator.Parse();

      return nd;
   }
   

   // --------------------------------------------------------------------------
   // end Acute
   // --------------------------------------------------------------------------

   // --------------------------------------------------------------------------
   // Accent
   // --------------------------------------------------------------------------

   private static JavaNode EarleyParseFile()
   {
      ExhaustiveParser earl = new ExhaustiveParser();
      //Yylex scanner = new Yylex(rdr);

      //scanner.YyState = new LexerState();
      //Tokenizer.YyState = scanner.YyState;
      //Tokenizer.YyState = LexerState.LEXERDATA;

      //JavaNode n = earl.EarleyParseProc(scanner);
      JavaNode n = earl.EarleyParseProc();
      return n;

   }

   // --------------------------------------------------------------------------
   // end Accent
   // --------------------------------------------------------------------------

   // --------------------------------------------------------------------------
   // Yacc
   // --------------------------------------------------------------------------

   /*
   private static JavaNode YaccParseFile(java.io.Reader rdr)
   {
      P("Error: BISON selected");
      JavaLib.RuntimeError("Error: BISON selected");
      return null;

   }
   */

   // --------------------------------------------------------------------------
   // end Yacc
   // --------------------------------------------------------------------------

   // CyanParser
   public static String CyanDocument = null;

   // public parse 3
   public static JavaNode CyanParser(String name,// java.io.Reader rdr,
         String text)
   {

      CyanDocument = text;
      //java.io.StringReader xxrdr = new java.io.StringReader(text);
      // 1
      TokenStream.SetCurrentFile(name, text);
      return DOPARSE(false); // Call from CyanParser(Reader rdr)

   }

   // --------------------------------------------------------------------------

   // CyanScanner

   /*
   // public scan 1 GrammarLib ?
   public static Yylex CyanScanner(java.io.Reader rdr, int offset)
   {
      SignalWhitespace = true;
      Yylex scanner = new Yylex(rdr);

      scanner.YyState = new LexerState();
      Tokenizer.YyState = scanner.YyState;
      return scanner;
   }
   */

   // --------------------------------------------------------------------------

}
