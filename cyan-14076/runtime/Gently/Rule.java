
// PACKAGE GENTLY  -  GENTLE RUNTIME LIBRARY
// COPYRIGHT (C) 2000-2014 COMPILERTOOLS.NET
// ALL RIGHTS RESERVED.   MAY BE DISTRIBUTED
// AS PART OF SOFTWARE GENERATED WITH GENTLE

package Gently;

import static Gently.Print.P;
import static Gently.Print.P_;

public class Rule
{
   int Id;
   Nonterm Lhs;
   Symbol[] Rhs;

   public Rule(int id, Nonterm lhs, Symbol[] rhs)
   {
      Id = id;
      Lhs = lhs;
      Rhs = rhs;
   }

   void Print()
   {
      P_(Lhs.Name + " :");
      for (Symbol s : Rhs) {
         P_(" " + s.Name);
      }
      P("");
   }
}
