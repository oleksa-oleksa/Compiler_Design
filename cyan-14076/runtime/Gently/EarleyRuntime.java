
// PACKAGE GENTLY  -  GENTLE RUNTIME LIBRARY
// COPYRIGHT (C) 2000-2014 COMPILERTOOLS.NET
// ALL RIGHTS RESERVED.   MAY BE DISTRIBUTED
// AS PART OF SOFTWARE GENERATED WITH GENTLE

package Gently;

import static Gently.Print.P;
import static Gently.Print.P_;

public class EarleyRuntime
{
   //JavaNode[] Stack = new JavaNode[5000]; // xxx
   JavaNode[] Stack = new JavaNode[50000]; // xxx
   private int SP = -1;
   JavaNode SemanticValue;
   public int LengthOfCurrentRule;

   public void ClearStack()
   {
      SP = -1;
   }

   void PrintStack()
   {
      P("<<<<<<");
      for (int i = 0; i <= SP; i++) {
         P_("   " + i + ": ");
         JavaLib.PrintNode(Stack[i]);
      }
      P(">>>>>>");
   }

   public void Push(JavaNode n)
   {
      SP++;
      Stack[SP] = n;
   }

   public JavaNode Dollar1()
   {
      return EarleyStack(1);
   }

   public JavaNode Dollar2()
   {
      return EarleyStack(2);
   }

   public JavaNode DollarI(int i)
   {
      return EarleyStack(i);
   }

   public void DefDollarDollar(JavaNode n)
   {
      SemanticValue = n;
   }

   public JavaNode EarleyStack(int i)
   {
      int adapted = SP - LengthOfCurrentRule + i;
      JavaNode n = Stack[adapted];
      return n;
   }

   public void Pop(int n)
   {
      SP = SP - n;
   }
}
