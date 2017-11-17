
// PACKAGE GENTLY  -  GENTLE RUNTIME LIBRARY
// COPYRIGHT (C) 2000-2014 COMPILERTOOLS.NET
// ALL RIGHTS RESERVED.   MAY BE DISTRIBUTED
// AS PART OF SOFTWARE GENERATED WITH GENTLE

package Gently;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.util.Hashtable;

//import static Gently.Print.P;
//import static Gently.Print.P_;
import static Gently.Print.XP;
import static Gently.Print.XP_;
import static Gently.Print.EP;
import static Gently.Print.caught;


public class JavaLib
{
   private static String[] ProgramArguments = new String[] {};

   public static void CompilerError(String msg)
   {
      XP("Compiler Error: " + msg);
      throw new ReportedError();
   }

   public static void SaveProgramArguments(String argv[])
   {
      ProgramArguments = argv;
   }

   public static JavaNode rtsGetArgV()
   {
      String[] args = ProgramArguments;
      JavaNode list = new JavaNode("NilOf-string", new JavaNode[] {});
      for (int i = args.length; i > 0; i--) {
         String arg = args[i - 1];
         JavaNode head = new JavaStringValue(arg);
         list = new JavaNode("SeqOf-string", new JavaNode[] { head, list });
      }
      return list;
   }

   public static String[] GetProgramArguments()
   {
      return ProgramArguments;
   }

   public static java.io.Reader GetSourceFileReader()
   {
      String[] args = GetProgramArguments();

      String filename = "gurkensalat";
      if (args.length > 0) {
         filename = args[0];
      }
      try {
         java.io.Reader rdr = null;
         rdr = new FileReader(filename);
         return rdr;
      } catch (Exception x) {
         caught(x);
         XP("nicht geklappt: filename=" + filename);
         return null;
      }
   }

   public static void ErrorMessage(JavaNode msg, JavaNode pos)
   {
      JavaStringValue valmsg = (JavaStringValue) msg;
      String strmsg = valmsg.Str;

      JavaStringValue valpos = (JavaStringValue) pos;
      String strpos = valpos.Str;

      if (strpos == "nopos")
         XP("Error: " + strmsg);
      else
         XP("Error in line " + strpos + ": " + strmsg);

      String file = "/file/";
      int line = Integer.parseInt(strpos);
      int offset = 0; // xxxxxxxx
      int length = 0; // xxxxxxxx
      TokenStream.ReportedErrorPos = new Coordinate( // COORD 8
                                                     // JavaLib.ErrorMessage
                                                     // (obsolete)
            file, line, offset, length);
      TokenStream.ReportedErrorMsg = strmsg;
      throw new ReportedError();
   }

   // *** Result Parameters ***

   public static JavaNode yyoutvalue1;
   public static JavaNode yyoutvalue2;
   public static JavaNode yyoutvalue3;
   public static JavaNode yyoutvalue4;
   public static JavaNode yyoutvalue5;

   // *** Concat ***

   public static void Concat(JavaNode n1, JavaNode n2)
   {
      JavaStringValue sv1 = (JavaStringValue) n1;
      String s1 = sv1.Str;

      JavaStringValue sv2 = (JavaStringValue) n2;
      String s2 = sv2.Str;

      String concat = s1 + s2;

      JavaStringValue y = new JavaStringValue(concat);
      yyoutvalue1 = y;
   }

   // *** Substring ***

   public static void Substring(JavaNode n1, JavaNode n2, JavaNode n3)
   {
      JavaStringValue sv = (JavaStringValue) n1;
      String s = sv.Str;

      JavaIntValue iv2 = (JavaIntValue) n2;
      int i2 = iv2.Val;

      JavaIntValue iv3 = (JavaIntValue) n3;
      int i3 = iv3.Val;

      String substr = s.substring(i2, i3);

      JavaStringValue y = new JavaStringValue(substr);
      yyoutvalue1 = y;
   }

   // *** Stringlength ***

   public static void Stringlength(JavaNode n)
   {
      JavaStringValue sv = (JavaStringValue) n;
      String s = sv.Str;

      int i = s.length();

      JavaIntValue y = new JavaIntValue(i);
      yyoutvalue1 = y;
   }

   // *** Source Pos ***

   public static JavaNode rtsGetSourcePos(JavaNode node)
   {
      Coordinate coord = node.getCoordinate();
      String ResString = TokenStream.KonvertCoordinateToString(coord);

      JavaStringValue y = new JavaStringValue(ResString);
      return y;
   }

   // *** Check Defined ***

   public static boolean rtsTestDefined(JavaNode Val, String Pos)
   {
      if (Val == null) {
         return false;
      }
      return true;
   }

   public static void rtsCheckDefined(JavaNode Val, String Pos)
   {
      if (Val == null) {
         XP("Undefind variable, line " + Pos);
         RuntimeError();
      }
   }

   // *** Print ***

   public static void PrintNode(JavaNode n)
   {
      if (n.Name.equals("%string%")) {
         JavaStringValue sv = (JavaStringValue) n;
         XP(sv.Str);
      } else if (n.Name.equals("%int%")) {
         JavaIntValue iv = (JavaIntValue) n;
         XP(""+iv.Val);
      } else if (n.Name.equals("%key%")) {
         JavaKeyValue kv = (JavaKeyValue) n;
         kv.Print();
      } else {
         // P_("'" + n.Name + "'");
         XP_(n.Name);
         XP(" {");
         for (int i = 0; i < n.Child1.length; i++) {
            PrintNode(n.Child1[i]);
         }
         XP("}");
      }
   }

   public static void Log(JavaNode n)
   {
      LogNode(n, 0, "");
   }

   static String TypeName(String str)
   {
      if (str.startsWith("Seq-")) {
         return TypeName(str.substring(4)) + "[]";
      } else if (str.startsWith("Opt-")) {
         return TypeName(str.substring(4)) + "?";
      } else {
         return str;
      }
   }

   static void Einr(int depth)
   {
      if (depth < 0)
         return;
      for (int i = 1; i <= depth; i++) {
         XP_("   ");
      }
   }

   static void Neu()
   {
      XP("");
   }

   static boolean SmallSeq(JavaNode n)
   {
      if (n.Child1.length == 0)
         return true;
      return false;
   }

   public static void LogNode(JavaNode n, int depth, String suc)
   {
      if (n instanceof JavaIntValue) {
         JavaIntValue iv = (JavaIntValue) n;
         int i = iv.Val;
         Einr(depth);
         XP_(""+i); // <===
      } else if (n instanceof JavaStringValue) {
         JavaStringValue sv = (JavaStringValue) n;
         String s = sv.Str;
         Einr(depth);
         XP_("\"" + s + "\""); // <===
      } else if (n instanceof JavaDomValue) {
         JavaDomValue dv = (JavaDomValue) n;
         int k = dv.GetKey();
         Einr(depth);
         XP_("JavaDomValue (");
         XP_(""+k);
         XP_(")"); // <===
      } else if (n instanceof JavaKeyValue) {
         JavaKeyValue kv = (JavaKeyValue) n;
         int k = kv.GetInternalKey();

         Einr(depth);
         XP_("JavaKeyValue (");
         XP_(""+k);
         XP_(")"); // <===
      } else {
         String name = n.Name;
         JavaNode[] child = n.Child1;
         if (name.startsWith("SeqOf-")) {
            int k = name.indexOf("-") + 1;
            String tp = name.substring(k);
            Einr(depth);
            tp = TypeName(tp);
            XP(tp + "["); // <===
            if (SmallSeq(n))
               depth = -5000;
            while (n.Name.startsWith("SeqOf-")) {
               JavaNode head = n.Child1[0];
               JavaNode tail = n.Child1[1];
               String s;
               if (tail.Name.startsWith("SeqOf-")) {
                  s = ",";
               } else {
                  s = "";
               }
               LogNode(head, depth + 1, s); // <<<<<<<<<<<<<<<<<<<<<<<<
               n = tail;
            }

            Einr(depth);
            XP_("]"); // <=== +++ 1 list
         } else if (name.startsWith("NilOf-")) {
            int k = name.indexOf("-") + 1;
            String tp = name.substring(k);
            tp = TypeName(tp);
            Einr(depth);
            XP_(tp + "[]"); // <===
         } else if (name.startsWith("OneOf-")) {
            int k = name.indexOf("-") + 1;
            String tp = name.substring(k);
            tp = TypeName(tp);
            Einr(depth);
            XP(tp + "?("); // <===
            if (SmallSeq(n))
               depth = -5000;
            JavaNode head = n.Child1[0];
            LogNode(head, depth + 1, ""); // <<<<<<<<<<<<<<<<<<<<<<<<

            Einr(depth);
            XP_(")"); // <=== +++ 2 oneof
         } else if (name.startsWith("NoneOf-")) {
            int k = name.indexOf("-") + 1;
            String tp = name.substring(k);
            tp = TypeName(tp);
            Einr(depth);
            XP_(tp + "?()"); // <===
         } else {
            Einr(depth);
            XP_(name + "("); // <===
            if (child.length > 0)
               XP("");
            if (SmallSeq(n))
               depth = -5000;
            for (int i = 0; i < child.length; i++) {
               String s;
               if (i < child.length - 1) {
                  s = ",";
               } else {
                  s = "";
               }
               LogNode(child[i], depth + 1, s); // <<<<<<<<<<<<<<<<<<<<<<<<
            }

            Einr(depth);
            XP_(")"); // <=== +++ 3 term
         }
      }
      XP(suc);
   }

   static Hashtable<String, JavaNode> HT = new Hashtable<String, JavaNode>();

   public static void RESET()
   {
      HT = new Hashtable<String, JavaNode>();
   }

   public static void XStore(String id, JavaNode n1, JavaNode n2)
   {

      JavaStringValue sv = (JavaStringValue) n1;
      String str = sv.Str;

      HT.put(id + "#" + str, n2); // prelim xxx

   }

   public static void YStore(int Index, JavaNode n1, JavaNode n2)
   {
      AttributedJavaNode an1 = (AttributedJavaNode) n1;
      an1.Child2[Index] = n2;
   }

   public static JavaNode XFetch(String id, JavaNode n1)
   {
      JavaStringValue sv = (JavaStringValue) n1;
      String str = sv.Str;
      JavaNode res = HT.get(id + "#" + str); // prelim xxx

      return res;
   }

   public static JavaNode YFetch(int Index, JavaNode n1)
   {
      AttributedJavaNode an1 = (AttributedJavaNode) n1;
      JavaNode res = an1.Child2[Index];
      return res;
   }

   // *** Emit (OutputStream) ***

   static PrintWriter OutputStream = null;

   public static void rtsOpenAlphaFile(String str)
   {
      if (OutputStream != null) {
         OutputStream.close();
      }
      try {

         OutputStream = new PrintWriter(new FileWriter(str));
      } catch (java.io.IOException x) {
         XP("exception in Open");
         RuntimeError();
      }
   }

   public static void rtsCloseAlphaFile()
   {
      OutputStream.close();
      OutputStream = null;
   }

   public static void rtsEmitString(JavaNode x)
   {
      String str;
      if (x.Name.equals("%string%")) {
         JavaStringValue sv = (JavaStringValue) x;
         str = sv.Str;
      } else if (x.Name.equals("%int%")) {
         JavaIntValue iv = (JavaIntValue) x;
         str = Integer.toString(iv.Val);
      } else {
         XP("+++ rtsAsString, invalid argument:");
         RuntimeError();
         str = "%not a string%";
      }

      if (OutputStream == null)
         XP_(str);
      else
         OutputStream.print(str);
   }

   public static void rtsEmitCode(String str)
   {
      if (OutputStream == null)
         XP_(str);
      else
         OutputStream.print(str);
   }

   public static void rtsEmitEol()
   {
      if (OutputStream == null)
         XP("");
      else
         OutputStream.println();
   }

   // *** Errors ***

   public static void rtsAllAlternativesFailed(String proc)
   {
      XP("all alternatives failed: " + proc);
      RuntimeError();
   }

   public static void RuntimeError(String str)
   {
      XP("runtime error: " + str);
      throw new Failure();
   }

   public static void RuntimeError()
   {
      XP("runtime error");
      throw new Failure();
   }

   // *** Entity ***

   public static JavaNode rtsNewObject(String domain)
   {
      return new JavaDomValue(domain);
   }

   // *** Key ***

   public static JavaNode rtsNewKey()
   {
      return new JavaKeyValue();
   }

   public static void rtsBindToKey(JavaNode Key, JavaNode Value)
   {
      JavaKeyValue kv = (JavaKeyValue) Key;

      // int index = kv.Val;
      // JavaKeyValue.Bindings[index] = Value;

      kv.SetValue(Value);

   }

   public static JavaNode rtsBoundToKey(JavaNode Key)
   {
      JavaKeyValue kv = (JavaKeyValue) Key;

      JavaNode n = kv.GetValue();

      if (n == null) {
         XP("invalid access [BoundToKey]");
         RuntimeError();
      }
      return n;
   }

   public static void rtsSetField(JavaNode Key, String Field, JavaNode Value)
   {
      JavaDomValue dv = (JavaDomValue) Key;
      dv.PutField(Field, Value);
      // dv.Fields.put(Field, Value);
   }

   public static JavaNode rtsGetField(JavaNode Key, String Field)
   {
      JavaDomValue dv = (JavaDomValue) Key;
      JavaNode n = dv.GetField(Field);
      return n;
   }

   // *** Int ***

   public static JavaNode UnaryMinus(JavaNode x1)
   {
      JavaIntValue iv1 = (JavaIntValue) x1;
      return new JavaIntValue(-iv1.Val);

   }

   public static JavaNode Plus(JavaNode x1, JavaNode x2)
   {
      JavaIntValue iv1 = (JavaIntValue) x1;
      JavaIntValue iv2 = (JavaIntValue) x2;
      return new JavaIntValue(iv1.Val + iv2.Val);
   }

   public static JavaNode Minus(JavaNode x1, JavaNode x2)
   {
      JavaIntValue iv1 = (JavaIntValue) x1;
      JavaIntValue iv2 = (JavaIntValue) x2;
      return new JavaIntValue(iv1.Val - iv2.Val);
   }

   public static JavaNode Times(JavaNode x1, JavaNode x2)
   {
      JavaIntValue iv1 = (JavaIntValue) x1;
      JavaIntValue iv2 = (JavaIntValue) x2;
      return new JavaIntValue(iv1.Val * iv2.Val);
   }

   public static JavaNode Div(JavaNode x1, JavaNode x2)
   {
      JavaIntValue iv1 = (JavaIntValue) x1;
      JavaIntValue iv2 = (JavaIntValue) x2;
      return new JavaIntValue(iv1.Val / iv2.Val);
   }

   // *** Relations ***
   public static boolean rtsEqualNode(JavaNode x1, JavaNode x2)
   {
      return x1.Eq(x2);
   }

   public static boolean rtsUnequalNode(JavaNode x1, JavaNode x2)
   {
      return !x1.Eq(x2);
   }

   public static boolean rtsEqualInt(JavaNode x1, JavaNode x2)
   {
      JavaIntValue v1 = (JavaIntValue) x1;
      JavaIntValue v2 = (JavaIntValue) x2;
      return v1.Val == v2.Val;
   }

   public static boolean rtsUnequalInt(JavaNode x1, JavaNode x2)
   {
      JavaIntValue v1 = (JavaIntValue) x1;
      JavaIntValue v2 = (JavaIntValue) x2;
      return v1.Val != v2.Val;
   }

   public static boolean rtsGreaterInt(JavaNode x1, JavaNode x2)
   {
      JavaIntValue v1 = (JavaIntValue) x1;
      JavaIntValue v2 = (JavaIntValue) x2;
      boolean res = v1.Val > v2.Val;
      return res;
   }

   public static boolean rtsGreaterOrEqualInt(JavaNode x1, JavaNode x2)
   {
      JavaIntValue v1 = (JavaIntValue) x1;
      JavaIntValue v2 = (JavaIntValue) x2;
      boolean res = v1.Val >= v2.Val;
      return res;
   }

   public static boolean rtsEqualKey(JavaNode x1, JavaNode x2)
   {
      JavaDomValue v1 = (JavaDomValue) x1;
      JavaDomValue v2 = (JavaDomValue) x2;
      return v1.GetKey() == v2.GetKey();
   }

   public static boolean rtsUnequalKey(JavaNode x1, JavaNode x2)
   {
      JavaDomValue v1 = (JavaDomValue) x1;
      JavaDomValue v2 = (JavaDomValue) x2;
      return v1.GetKey() != v2.GetKey();
   }

   public static boolean rtsLessInt(JavaNode x1, JavaNode x2)
   {
      JavaIntValue v1 = (JavaIntValue) x1;
      JavaIntValue v2 = (JavaIntValue) x2;
      return v1.Val < v2.Val;
   }

   public static boolean rtsLessOrEqualInt(JavaNode x1, JavaNode x2)
   {
      JavaIntValue v1 = (JavaIntValue) x1;
      JavaIntValue v2 = (JavaIntValue) x2;
      return v1.Val <= v2.Val;
   }

   public static boolean rtsEqualString(JavaNode x1, JavaNode x2)
   {
      JavaStringValue v1 = (JavaStringValue) x1;
      JavaStringValue v2 = (JavaStringValue) x2;
      return v1.Str.equals(v2.Str);
   }

   public static boolean rtsUnequalString(JavaNode x1, JavaNode x2)
   {
      JavaStringValue v1 = (JavaStringValue) x1;
      JavaStringValue v2 = (JavaStringValue) x2;
      return !v1.Str.equals(v2.Str);
   }

   public static boolean rtsLessString(JavaNode x1, JavaNode x2)
   {
      JavaStringValue v1 = (JavaStringValue) x1;
      JavaStringValue v2 = (JavaStringValue) x2;
      return v1.Str.compareTo(v2.Str) < 0;
   }

   public static boolean rtsLessOrEqualString(JavaNode x1, JavaNode x2)
   {
      JavaStringValue v1 = (JavaStringValue) x1;
      JavaStringValue v2 = (JavaStringValue) x2;
      return v1.Str.compareTo(v2.Str) <= 0;
   }

   public static boolean rtsGreaterString(JavaNode x1, JavaNode x2)
   {
      JavaStringValue v1 = (JavaStringValue) x1;
      JavaStringValue v2 = (JavaStringValue) x2;
      return v1.Str.compareTo(v2.Str) > 0;
   }

   public static boolean rtsGreaterOrEqualString(JavaNode x1, JavaNode x2)
   {
      JavaStringValue v1 = (JavaStringValue) x1;
      JavaStringValue v2 = (JavaStringValue) x2;
      return v1.Str.compareTo(v2.Str) >= 0;
   }

   // *** End ***

   // ValueConverter xxx
   // default int to string converter
   public static JavaNode ValueConverter(JavaNode node)
   {
      JavaStringValue stringnode = (JavaStringValue) node;
      String str = stringnode.Str;
      // P("GrammarLib.ValueConverter...");
      // P("str='" + str + "'");
      int i = 0;
      try {
         i = Integer.parseInt(str);
      } catch (Exception e) {
         caught(e);
         EP("(Error in default value converter: not a valid int: '"
                     + str + "')");
         RuntimeError();
      }
      JavaNode intnode = new JavaIntValue(i);
      return intnode;
   }

   public static JavaNode BuiltinConverterINTEGER(JavaNode node)
   {
      JavaStringValue stringnode = (JavaStringValue) node;
      String str = stringnode.Str;

      int i = 0;
      try {
         i = Integer.parseInt(str);
      } catch (Exception e) {
         caught(e);
         EP("(Error in default value converter: not a valid int: '"
                     + str + "')");
         RuntimeError();
      }
      JavaNode intnode = new JavaIntValue(i);
      intnode.setCoordinate(stringnode.getCoordinate());

      return intnode;
   }

   public static JavaNode BuiltinConverterSTRING(JavaNode node)
   {
      JavaStringValue stringnode = (JavaStringValue) node;
      String str = stringnode.Str;
      StringBuilder b = new StringBuilder();

      //System.out.println("original string `" + str +"`");

      // without initial and final quote
      for (int i = 1; i < str.length() - 1; i++) {

         //hier
         char ch = str.charAt(i);

         if (ch == '\\') {
            i++;
            ch = str.charAt(i);
            if (ch == '\\') {
               //System.out.println("replaced `\\\\`");
               b.append('\\');
            }
            else if (ch == '"') {
               //System.out.println("replaced `\\\"`");
               b.append('"');
            }
            else if (ch == 'n') {
               //System.out.println("replaced `\\n`");
               b.append('\n');
            }
            else if (ch == 'r') {
               //System.out.println("replaced `\\r`");
               b.append('\r');
            }
            else if (ch == 't') {
               //System.out.println("replaced `\\t`");
               b.append('\t');
            }
            else {
               //System.out.println("backslash ignored in `\\" + ch +"`");
               b.append(ch);
            }
         } else {
            b.append(ch);
         }
      }

      String res = b.toString();

      //System.out.println("converted string `" + res +"`");

      JavaStringValue resnode = new JavaStringValue(res);


      resnode.setCoordinate(stringnode.getCoordinate()); // !!!

      return resnode;
   }

   public static JavaNode BuiltinConverterIDENT(JavaNode node)
   {
      JavaStringValue stringnode = (JavaStringValue) node;
      return stringnode;
   }

}
