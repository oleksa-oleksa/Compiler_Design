
// PACKAGE GENTLY  -  GENTLE RUNTIME LIBRARY
// COPYRIGHT (C) 2000-2014 COMPILERTOOLS.NET
// ALL RIGHTS RESERVED.   MAY BE DISTRIBUTED
// AS PART OF SOFTWARE GENERATED WITH GENTLE

package Gently;

public class Message
{
   public static void ProgramError(Error E)
   {
      if (E instanceof Gently.ReportedError) {
         //E.printStackTrace();
         System.exit(-1);
      }
      else if (E instanceof Gently.Failure) {
         E.printStackTrace();
         System.exit(-1);
      }
      else {
         E.printStackTrace();
         System.out.println("Program Error");
         System.exit(-1);
      }
   }
   public static void Bad(Exception E)
   {
      E.printStackTrace();
      System.out.println("Sorry");
      System.exit(-1);
   }
}
