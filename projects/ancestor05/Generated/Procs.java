package Generated;
import Gently.*;
public class Procs
{
   public static int Gen()
   {
      return 10;
   }
   public static void YyVersion ()
   {
      System.out.println(Gently.Version.V());
      System.out.println("V: 14076");
      System.out.println("W: 14076");
   }
   static boolean javadummy = true;

public
static
void
translate(

JavaNode yy_inparam_0
)
{
CONDITION0:
while(javadummy) {
// ***** begin condlist 1 (in cond 0) *****
CONDLIST1: // @@@ begin of alternative group
while(javadummy) {
CONDITION2: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative AS
JavaNode AS= null;
{
JavaNode current0 = yy_inparam_0;
if (! current0 .Name
.equals( "g") )
   if (javadummy) break  CONDITION2;
{ //(( children level 1
JavaNode current1 =
   current0 . Child1[0];
JavaNode kurrent0 = current0;
if (! current1 .Name
.equals( "g") )
   if (javadummy) break  CONDITION2;
{ //(( children level 2
JavaNode current2 =
   current1 . Child1[0];
JavaNode kurrent1 = current1;
//assign current2 to AS --- JJ.M4
AS = current2 ;
} //)) children level 2
} //)) children level 1
};
JavaLib.rtsEmitCode
("ur");
Procs.
translate
(
NodeFactory.NewNode(
"g"
, new JavaNode [] {
AS
}
)
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST1;
// $$$$$$$$ 
} // CONDITION2 // @@@ end of alternative
CONDITION3: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative AS
JavaNode AS= null;
{
JavaNode current0 = yy_inparam_0;
if (! current0 .Name
.equals( "g") )
   if (javadummy) break  CONDITION3;
{ //(( children level 1
JavaNode current1 =
   current0 . Child1[0];
JavaNode kurrent0 = current0;
//assign current1 to AS --- JJ.M4
AS = current1 ;
} //)) children level 1
};
JavaLib.rtsEmitCode
("gross");
Procs.
translate
(
AS
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST1;
// $$$$$$$$ 
} // CONDITION3 // @@@ end of alternative
CONDITION4: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (! current0 .Name
.equals( "mo") )
   if (javadummy) break  CONDITION4;
};
JavaLib.rtsEmitCode
("mutter\n");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST1;
// $$$$$$$$ 
} // CONDITION4 // @@@ end of alternative
CONDITION5: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (! current0 .Name
.equals( "fa") )
   if (javadummy) break  CONDITION5;
};
JavaLib.rtsEmitCode
("vater\n");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST1;
// $$$$$$$$ 
} // CONDITION5 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=1 N=0
if (javadummy) break CONDITION0;
} // CONDLIST1 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION0
// failed:
JavaLib.rtsAllAlternativesFailed("translate");
}



public
static
void
Start(
)
{
// DECLARE for proc AS
JavaNode AS = null;
CONDITION6:
while(javadummy) {
// ***** begin condlist 7 (in cond 6) *****
CONDLIST7: // @@@ begin of alternative group
while(javadummy) {
CONDITION8: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = 
Gently.GrammarLib.ParseStandardFile();
//assign current0 to AS --- JJ.M4
AS = current0 ;
}
Procs.
translate
(
AS
);
JavaLib.rtsEmitCode
("No parse error!\n");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST7;
// $$$$$$$$ 
} // CONDITION8 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=7 N=6
if (javadummy) break CONDITION6;
} // CONDLIST7 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION6
// failed:
JavaLib.rtsAllAlternativesFailed("Start");
}


public static void Semantics(JavaNode n)
{
}
}
