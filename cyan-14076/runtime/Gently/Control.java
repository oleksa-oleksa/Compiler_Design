
// PACKAGE GENTLY  -  GENTLE RUNTIME LIBRARY
// COPYRIGHT (C) 2000-2014 COMPILERTOOLS.NET
// ALL RIGHTS RESERVED.   MAY BE DISTRIBUTED
// AS PART OF SOFTWARE GENERATED WITH GENTLE

package Gently;

public class Control
{
   public static void Exit(String str)
   {
      if (str.charAt(0) == '!') {
         // System.out.println("! Exit: " + str);
      }
      else {
         System.out.println("Exit: " + str);
      }
      System.exit(-1);
   }
}
