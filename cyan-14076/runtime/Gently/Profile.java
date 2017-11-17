
// PACKAGE GENTLY  -  GENTLE RUNTIME LIBRARY
// COPYRIGHT (C) 2000-2014 COMPILERTOOLS.NET
// ALL RIGHTS RESERVED.   MAY BE DISTRIBUTED
// AS PART OF SOFTWARE GENERATED WITH GENTLE

package Gently;

import static Gently.Print.P;
public class Profile
{
   String ident;
   long started;
   long total = 0;
   int count = 0;
   int count2 = 0;

   static int next = 0;
   static Profile[] Prof = new Profile[50];

   public Profile(String id)
   {
      ident = id;
      Prof[next] = this;
      next++;
   }

   public void Start()
   {
      started = System.nanoTime();
      count++;
   }

   public void Stop()
   {
      long stopped = System.nanoTime();
      total += (stopped - started);
      count2++;
   }

   public void Report()
   {
      if (count == 0)
         return;

      long Factor = 100000000;
      P("Profile " + ident + " count : " + count);
      P("Profile " + ident + " time : " + (total / Factor)
            + " sec/10");
      if (count != count2)
         P("Profile " + ident + " count2 : " + count2);
   }

   static void Summary()
   {
      for (int i = 0; i < next; i++) {
         Prof[i].Report();
      }
   }
}
