
// PACKAGE GENTLY  -  GENTLE RUNTIME LIBRARY
// COPYRIGHT (C) 2000-2014 COMPILERTOOLS.NET
// ALL RIGHTS RESERVED.   MAY BE DISTRIBUTED
// AS PART OF SOFTWARE GENERATED WITH GENTLE

package Gently;

import java.io.*;

import java.util.*;
import java.util.regex.*;
import java.util.Hashtable;

public class Reader
{
   public static String ReadFile(String SourceFile)
   {
      return Reader1(SourceFile);
      /*
      //long start = System.currentTimeMillis();
      String content = null;

      File F = null;
      try {
         F = new File(SourceFile);
      }
      catch (Exception E)
      {
         System.out.println("Cannot open file '" + SourceFile +"'");
         Message.Bad(E);
      }

      try {
         content = new Scanner(F).useDelimiter("\\Z").next();
      }
      catch (java.util.NoSuchElementException e) {
         System.out.println("No '\\Z' in file '" + SourceFile +"'");
         content = "";
         Message.Bad(e);
      }
      catch (Exception e) {
         content = "";
         Message.Bad(e);
      }
      finally {
         try {
            // if (br != null)
            // br.close();
         } catch (Exception ex) {
            Message.Bad(ex);
         }
      } 
      
      //long end = System.currentTimeMillis();
      
      //long diff = end - start;
      //System.out.println("Reader: Difference is : " + diff);
      return content;
      */

   }
   //---------

   private static String Reader1(String filePath)
   {
      FileInputStream input = null;

      // OPEN
      try {
         input = new FileInputStream(filePath);
      }
      catch (Exception E)
      {
         TokenStream.ErrorExit("Cannot open file " + filePath);
         return "pustekuchen";
      }

      // READ
      try {
         byte[] fileData = new byte[input.available()];

         input.read(fileData);
         input.close();

         //return new String(fileData, "UTF-8");
         return new String(fileData);
      }
      catch (Exception E)
      {
         TokenStream.ErrorExit("Cannot process file " + filePath);
         return "pustekuchen";
      }
      finally {
         try {
            input.close();
         }
         catch (Exception E)
         {
            TokenStream.ErrorExit("Cannot close file " + filePath);
            return "pustekuchen";
         }
      }
   }
   //---------
}
// =======================================================================
