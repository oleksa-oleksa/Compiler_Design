
// PACKAGE GENTLY  -  GENTLE RUNTIME LIBRARY
// COPYRIGHT (C) 2000-2014 COMPILERTOOLS.NET
// ALL RIGHTS RESERVED.   MAY BE DISTRIBUTED
// AS PART OF SOFTWARE GENERATED WITH GENTLE

package Gently;

public class Program
{

   public static void main(String argv[])
   {
      Gently.JavaLib.SaveProgramArguments(argv);
      try {
         Generated.Procs.Start();
      } catch (Error E) {
         Message.ProgramError(E);
      }
   }
}
