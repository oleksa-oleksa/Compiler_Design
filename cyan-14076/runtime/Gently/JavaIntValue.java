
// PACKAGE GENTLY  -  GENTLE RUNTIME LIBRARY
// COPYRIGHT (C) 2000-2014 COMPILERTOOLS.NET
// ALL RIGHTS RESERVED.   MAY BE DISTRIBUTED
// AS PART OF SOFTWARE GENERATED WITH GENTLE

package Gently;

import static Gently.Print.XP;

public class JavaIntValue extends JavaNode
{
   public int Val;
   public final static String IntTag = "%int%";

   public JavaIntValue(int i)
   {
      Name = IntTag; //"%int%";
      Val = i;
   }
   
   @Override()
   public int IntVal()
   {
      return Val;
   }
   
   @Override()
   public boolean IsInt()
   {
      return true;
   }

   public void DumpI(String indent)
   {
      XP(indent + "JavaIntValue{\"" + Name + "\", " + Val + "}");
   }

   public static boolean MatchesInt(JavaNode v, int i)
   {
      if (!v.Name.equals("%int%"))
         return false;

      JavaIntValue iv = (JavaIntValue) v;
      return iv.Val == i;
   }

   @Override
   public boolean Eq(JavaNode x)
   {
      boolean res = Val == ((JavaIntValue) x).Val;
      return res;
   }
}
