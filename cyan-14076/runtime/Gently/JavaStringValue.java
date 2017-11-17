
// PACKAGE GENTLY  -  GENTLE RUNTIME LIBRARY
// COPYRIGHT (C) 2000-2014 COMPILERTOOLS.NET
// ALL RIGHTS RESERVED.   MAY BE DISTRIBUTED
// AS PART OF SOFTWARE GENERATED WITH GENTLE

//
// cyan.compilertools.net
//
// This is a beta release for personal use
//
// Distributed by Metarga GmbH, Berlin
// Copyright (C) 2001-2012
//

package Gently;

import static Gently.Print.XP;

public class JavaStringValue extends JavaNode
{
   public String Str;
   
   public JavaStringValue(String s)
   {
      Name = "%string%";
      Str = s;
   }
   
   @Override()
   public boolean IsString()
   {
      return true;
   }
   
   @Override()
   public String StringVal()
   {
      return Str;
   }
   public void DumpI(String indent)
   {
      XP(indent + "JavaStringValue {\"" + Name + "\", \"" + Str + "\"}");
   }

   public static boolean MatchesString(JavaNode v, String s)
   {
      if (! v.Name.equals("%string%") ) return false;
      
      JavaStringValue sv = (JavaStringValue) v;
      return sv.Str.equals(s);
   }
   
   @Override
   public boolean Eq(JavaNode x)
   {
	   return Str == ((JavaStringValue) x).Str;
   }
}   
