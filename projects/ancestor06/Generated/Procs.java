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
t_tr(

JavaNode yy_inparam_0
)
{
// DECLARE for proc X
JavaNode X = null;
CONDITION0:
while(javadummy) {
// ***** begin condlist 1 (in cond 0) *****
CONDLIST1: // @@@ begin of alternative group
while(javadummy) {
CONDITION2: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (! current0 .Name
.equals( "pers") )
   if (javadummy) break  CONDITION2;
{ //(( children level 1
JavaNode current1 =
   current0 . Child1[0];
JavaNode kurrent0 = current0;
//assign current1 to X --- JJ.M4
X = current1 ;
} //)) children level 1
};
Procs.
t_name
(
NodeFactory.NewNode(
"pers"
, new JavaNode [] {
X
}
)
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST1;
// $$$$$$$$ 
} // CONDITION2 // @@@ end of alternative
CONDITION3: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to X --- JJ.M4
X = current0 ;
};
Procs.
t_article
(
X
);
JavaLib.rtsEmitCode
(" ");
Procs.
t_ancs1
(
X
,
new JavaIntValue(1)
);
JavaLib.rtsEmitCode
(" von ");
Procs.
t_name
(
X
);
JavaLib.rtsEmitCode
("\n");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST1;
// $$$$$$$$ 
} // CONDITION3 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=1 N=0
if (javadummy) break CONDITION0;
} // CONDLIST1 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION0
// failed:
JavaLib.rtsAllAlternativesFailed("t_tr");
}



public
static
void
t_article(

JavaNode yy_inparam_0
)
{
CONDITION4:
while(javadummy) {
// ***** begin condlist 5 (in cond 4) *****
CONDLIST5: // @@@ begin of alternative group
while(javadummy) {
CONDITION6: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (! current0 .Name
.equals( "fa") )
   if (javadummy) break  CONDITION6;
{ //(( children level 1
JavaNode current1 =
   current0 . Child1[0];
JavaNode kurrent0 = current0;
if (! current1 .Name
.equals( "pers") )
   if (javadummy) break  CONDITION6;
{ //(( children level 2
JavaNode current2 =
   current1 . Child1[0];
JavaNode kurrent1 = current1;
} //)) children level 2
} //)) children level 1
};
JavaLib.rtsEmitCode
("Der");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST5;
// $$$$$$$$ 
} // CONDITION6 // @@@ end of alternative
CONDITION7: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (! current0 .Name
.equals( "mo") )
   if (javadummy) break  CONDITION7;
{ //(( children level 1
JavaNode current1 =
   current0 . Child1[0];
JavaNode kurrent0 = current0;
if (! current1 .Name
.equals( "pers") )
   if (javadummy) break  CONDITION7;
{ //(( children level 2
JavaNode current2 =
   current1 . Child1[0];
JavaNode kurrent1 = current1;
} //)) children level 2
} //)) children level 1
};
JavaLib.rtsEmitCode
("Die");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST5;
// $$$$$$$$ 
} // CONDITION7 // @@@ end of alternative
CONDITION8: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (! current0 .Name
.equals( "fa") )
   if (javadummy) break  CONDITION8;
{ //(( children level 1
JavaNode current1 =
   current0 . Child1[0];
JavaNode kurrent0 = current0;
} //)) children level 1
};
JavaLib.rtsEmitCode
("Ein");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST5;
// $$$$$$$$ 
} // CONDITION8 // @@@ end of alternative
CONDITION9: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (! current0 .Name
.equals( "mo") )
   if (javadummy) break  CONDITION9;
{ //(( children level 1
JavaNode current1 =
   current0 . Child1[0];
JavaNode kurrent0 = current0;
} //)) children level 1
};
JavaLib.rtsEmitCode
("Eine");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST5;
// $$$$$$$$ 
} // CONDITION9 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=5 N=4
if (javadummy) break CONDITION4;
} // CONDLIST5 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION4
// failed:
JavaLib.rtsAllAlternativesFailed("t_article");
}



public
static
void
t_name(

JavaNode yy_inparam_0
)
{
// DECLARE for proc X
JavaNode X = null;
CONDITION10:
while(javadummy) {
// ***** begin condlist 11 (in cond 10) *****
CONDLIST11: // @@@ begin of alternative group
while(javadummy) {
CONDITION12: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (! current0 .Name
.equals( "pers") )
   if (javadummy) break  CONDITION12;
{ //(( children level 1
JavaNode current1 =
   current0 . Child1[0];
JavaNode kurrent0 = current0;
//assign current1 to X --- JJ.M4
X = current1 ;
} //)) children level 1
};
JavaLib.rtsEmitString
(
X
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST11;
// $$$$$$$$ 
} // CONDITION12 // @@@ end of alternative
CONDITION13: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (! current0 .Name
.equals( "mo") )
   if (javadummy) break  CONDITION13;
{ //(( children level 1
JavaNode current1 =
   current0 . Child1[0];
JavaNode kurrent0 = current0;
//assign current1 to X --- JJ.M4
X = current1 ;
} //)) children level 1
};
Procs.
t_name
(
X
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST11;
// $$$$$$$$ 
} // CONDITION13 // @@@ end of alternative
CONDITION14: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (! current0 .Name
.equals( "fa") )
   if (javadummy) break  CONDITION14;
{ //(( children level 1
JavaNode current1 =
   current0 . Child1[0];
JavaNode kurrent0 = current0;
//assign current1 to X --- JJ.M4
X = current1 ;
} //)) children level 1
};
Procs.
t_name
(
X
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST11;
// $$$$$$$$ 
} // CONDITION14 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=11 N=10
if (javadummy) break CONDITION10;
} // CONDLIST11 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION10
// failed:
JavaLib.rtsAllAlternativesFailed("t_name");
}



public
static
void
ancs(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
CONDITION15:
while(javadummy) {
// ***** begin condlist 16 (in cond 15) *****
CONDLIST16: // @@@ begin of alternative group
while(javadummy) {
CONDITION17: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative X
JavaNode X= null;
{
JavaNode current0 = yy_inparam_0;
if (! current0 .Name
.equals( "fa") )
   if (javadummy) break  CONDITION17;
{ //(( children level 1
JavaNode current1 =
   current0 . Child1[0];
JavaNode kurrent0 = current0;
//assign current1 to X --- JJ.M4
X = current1 ;
} //)) children level 1
};
{
JavaNode current0 = yy_inparam_1;
//JJ.M6
if (! JavaIntValue.MatchesInt(current0,1))
   if (javadummy) break  CONDITION17;
};
JavaLib.rtsEmitCode
("vater");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST16;
// $$$$$$$$ 
} // CONDITION17 // @@@ end of alternative
CONDITION18: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative X
JavaNode X= null;
{
JavaNode current0 = yy_inparam_0;
if (! current0 .Name
.equals( "mo") )
   if (javadummy) break  CONDITION18;
{ //(( children level 1
JavaNode current1 =
   current0 . Child1[0];
JavaNode kurrent0 = current0;
//assign current1 to X --- JJ.M4
X = current1 ;
} //)) children level 1
};
{
JavaNode current0 = yy_inparam_1;
//JJ.M6
if (! JavaIntValue.MatchesInt(current0,1))
   if (javadummy) break  CONDITION18;
};
JavaLib.rtsEmitCode
("mutter");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST16;
// $$$$$$$$ 
} // CONDITION18 // @@@ end of alternative
CONDITION19: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative K
JavaNode K= null;
{
JavaNode current0 = yy_inparam_0;
//assign current0 to K --- JJ.M4
K = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//JJ.M6
if (! JavaIntValue.MatchesInt(current0,2))
   if (javadummy) break  CONDITION19;
};
JavaLib.rtsEmitCode
("gross");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST16;
// $$$$$$$$ 
} // CONDITION19 // @@@ end of alternative
CONDITION20: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative K
JavaNode K= null;
{
JavaNode current0 = yy_inparam_0;
//assign current0 to K --- JJ.M4
K = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
};
JavaLib.rtsEmitCode
("ur");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST16;
// $$$$$$$$ 
} // CONDITION20 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=16 N=15
if (javadummy) break CONDITION15;
} // CONDLIST16 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION15
// failed:
JavaLib.rtsAllAlternativesFailed("ancs");
}



public
static
void
t_ancs1(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc X
JavaNode X = null;
CONDITION21:
while(javadummy) {
// ***** begin condlist 22 (in cond 21) *****
CONDLIST22: // @@@ begin of alternative group
while(javadummy) {
CONDITION23: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (! current0 .Name
.equals( "pers") )
   if (javadummy) break  CONDITION23;
{ //(( children level 1
JavaNode current1 =
   current0 . Child1[0];
JavaNode kurrent0 = current0;
} //)) children level 1
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to X --- JJ.M4
X = current0 ;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST22;
// $$$$$$$$ 
} // CONDITION23 // @@@ end of alternative
CONDITION24: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative P
JavaNode P= null;
{
JavaNode current0 = yy_inparam_0;
if (! current0 .Name
.equals( "fa") )
   if (javadummy) break  CONDITION24;
{ //(( children level 1
JavaNode current1 =
   current0 . Child1[0];
JavaNode kurrent0 = current0;
//assign current1 to P --- JJ.M4
P = current1 ;
} //)) children level 1
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to X --- JJ.M4
X = current0 ;
};
Procs.
t_ancs1
(
P
,
JavaLib.Plus(
X
,
new JavaIntValue(1)
)
);
Procs.
ancs
(
NodeFactory.NewNode(
"fa"
, new JavaNode [] {
P
}
)
,
X
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST22;
// $$$$$$$$ 
} // CONDITION24 // @@@ end of alternative
CONDITION25: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative P
JavaNode P= null;
{
JavaNode current0 = yy_inparam_0;
if (! current0 .Name
.equals( "mo") )
   if (javadummy) break  CONDITION25;
{ //(( children level 1
JavaNode current1 =
   current0 . Child1[0];
JavaNode kurrent0 = current0;
//assign current1 to P --- JJ.M4
P = current1 ;
} //)) children level 1
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to X --- JJ.M4
X = current0 ;
};
Procs.
t_ancs1
(
P
,
JavaLib.Plus(
X
,
new JavaIntValue(1)
)
);
Procs.
ancs
(
NodeFactory.NewNode(
"mo"
, new JavaNode [] {
P
}
)
,
X
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST22;
// $$$$$$$$ 
} // CONDITION25 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=22 N=21
if (javadummy) break CONDITION21;
} // CONDLIST22 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION21
// failed:
JavaLib.rtsAllAlternativesFailed("t_ancs1");
}



public
static
void
Start(
)
{
// DECLARE for proc AS
JavaNode AS = null;
CONDITION26:
while(javadummy) {
// ***** begin condlist 27 (in cond 26) *****
CONDLIST27: // @@@ begin of alternative group
while(javadummy) {
CONDITION28: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = 
Gently.GrammarLib.ParseStandardFile();
//assign current0 to AS --- JJ.M4
AS = current0 ;
}
Procs.
t_tr
(
AS
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST27;
// $$$$$$$$ 
} // CONDITION28 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=27 N=26
if (javadummy) break CONDITION26;
} // CONDLIST27 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION26
// failed:
JavaLib.rtsAllAlternativesFailed("Start");
}


public static void Semantics(JavaNode n)
{
}
}
