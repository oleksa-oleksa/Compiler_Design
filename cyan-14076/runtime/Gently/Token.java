
// PACKAGE GENTLY  -  GENTLE RUNTIME LIBRARY
// COPYRIGHT (C) 2000-2014 COMPILERTOOLS.NET
// ALL RIGHTS RESERVED.   MAY BE DISTRIBUTED
// AS PART OF SOFTWARE GENERATED WITH GENTLE

package Gently;

import java.util.*;

public class Token extends Symbol
{
   public static List<Token> TokenList = new ArrayList<Token>();

   int Code;
   String Regex = null;
   Converter converter = null;

   public Token(String n, int c)
   {
      Name = n;
      Code = c;
      TokenList.add(this);
   }


   public Token(String n, int c, String r)
   {
      Name = n;
      Code = c;
      Regex = r;
      TokenList.add(this);
   }
   public Token(String n, int c, String r, Converter conv)
   {
      Name = n;
      Code = c;
      Regex = r;
      TokenList.add(this);
      converter = conv;
   }
}
