
// PACKAGE GENTLY  -  GENTLE RUNTIME LIBRARY
// COPYRIGHT (C) 2000-2014 COMPILERTOOLS.NET
// ALL RIGHTS RESERVED.   MAY BE DISTRIBUTED
// AS PART OF SOFTWARE GENERATED WITH GENTLE

package Gently;

public class Instructions
{
   // public static boolean SignalWhitespace;
   public static final int WhitespaceToken = 257;
   public static final int ErrorToken = 357;
   // public static JavaNode JavaParseResult = null;

   // public static String CyanSource = null;

   // - - -
   
   // Code generated from ``Parse(fn -> ast)''

   // public parse 1
   public static JavaNode ParseNamedFile(JavaNode fn)
   {
      JavaStringValue sv = (JavaStringValue) fn;
      String str = sv.Str;

      JavaNode n = GrammarLib.ParseFile(str);
      return n;
   }

   // --------------------------------------------------------------------------

   // Code generated from ``Parse(-> ast)'', ``Nonterm(-> ast)''

   // public parse 2
   public static JavaNode unused_ParseStandardFile()
   {

      String[] args = JavaLib.GetProgramArguments();
      String str = args[0];

      return GrammarLib.ParseFile(str);
   }


}
