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
makeString(

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
// DECLARE for alternative d
JavaNode d= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-string")
if (javadummy) break CONDITION2;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//JJ.M5
if (! JavaStringValue.MatchesString(current1,"ur"))
   if (javadummy) break  CONDITION2;
current1 = current0.Child1[1];
//assign current1 to d --- JJ.M4
d = current1 ;
} //)) children level 1
};
JavaLib.rtsEmitCode
("ur");
Procs.
makeString
(
d
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST1;
// $$$$$$$$ 
} // CONDITION2 // @@@ end of alternative
CONDITION3: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative d
JavaNode d= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-string")
if (javadummy) break CONDITION3;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//JJ.M5
if (! JavaStringValue.MatchesString(current1,"gross"))
   if (javadummy) break  CONDITION3;
current1 = current0.Child1[1];
//assign current1 to d --- JJ.M4
d = current1 ;
} //)) children level 1
};
JavaLib.rtsEmitCode
("gross");
Procs.
makeString
(
d
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST1;
// $$$$$$$$ 
} // CONDITION3 // @@@ end of alternative
CONDITION4: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-string")
if (javadummy) break CONDITION4;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//JJ.M5
if (! JavaStringValue.MatchesString(current1,"mutter"))
   if (javadummy) break  CONDITION4;
current1 = current0.Child1[1];
if (current1.Name
!= "NilOf-string")
if (javadummy) break CONDITION4;
} //)) children level 1
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
if (current0.Name
!= "SeqOf-string")
if (javadummy) break CONDITION5;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//JJ.M5
if (! JavaStringValue.MatchesString(current1,"vater"))
   if (javadummy) break  CONDITION5;
current1 = current0.Child1[1];
if (current1.Name
!= "NilOf-string")
if (javadummy) break CONDITION5;
} //)) children level 1
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
JavaLib.rtsAllAlternativesFailed("makeString");
}



public
static
void
Start(
)
{
// DECLARE for proc TR
JavaNode TR = null;
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
//assign current0 to TR --- JJ.M4
TR = current0 ;
}
Procs.
makeString
(
TR
);
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
