
// PACKAGE GENTLY  -  GENTLE RUNTIME LIBRARY
// COPYRIGHT (C) 2000-2014 COMPILERTOOLS.NET
// ALL RIGHTS RESERVED.   MAY BE DISTRIBUTED
// AS PART OF SOFTWARE GENERATED WITH GENTLE

package Gently;

import static Gently.Print.XP;

public class JavaKeyValue extends JavaNode
{
   private int Val;

   static final int max = 22000;

   // constructor

   public int GetInternalKey()
   {
      return Val;
   }

   public JavaKeyValue()
   {
      Name = "%key%";
      KeyIndex++;
      if (KeyIndex == max) {
         XP("+++ KeyValue overflow " + KeyIndex); // xxx
         JavaLib.RuntimeError("KeyValue overflow");
      }
      Val = KeyIndex;
   }

   public void SetValue(JavaNode n)
   {
      Bindings[Val] = n;
   }

   public JavaNode GetValue()
   {
      return Bindings[Val];
   }

   @Override
   public void Print()
   {
      XP("key::" + Val);
   }

   @Override
   public boolean Eq(JavaNode x)
   {
      return Val == ((JavaKeyValue) x).Val;
   }

   public static JavaNode[] Bindings = new JavaNode[max]; // xxxxxxx

   static int KeyIndex = 0;
}
