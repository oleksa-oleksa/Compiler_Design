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
Start(
)
{
// DECLARE for proc F
JavaNode F = null;
// DECLARE for proc T
JavaNode T = null;
// DECLARE for proc LIST2
JavaNode LIST2 = null;
// DECLARE for proc LIST1
JavaNode LIST1 = null;
CONDITION0:
while(javadummy) {
// ***** begin condlist 1 (in cond 0) *****
CONDLIST1: // @@@ begin of alternative group
while(javadummy) {
CONDITION2: // @@@ begin of alternative
while(javadummy) {
Procs.
init
(
);
LIST1 = 
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(5)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
JavaLib.UnaryMinus(
new JavaIntValue(3)
)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(5)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(5)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
JavaLib.UnaryMinus(
new JavaIntValue(3)
)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
JavaLib.UnaryMinus(
new JavaIntValue(3)
)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(0)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
}
)
}
)
}
)
}
)
}
)
}
)
;
LIST2 = 
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
JavaLib.UnaryMinus(
new JavaIntValue(1)
)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(2)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
JavaLib.UnaryMinus(
new JavaIntValue(3)
)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(4)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
JavaLib.UnaryMinus(
new JavaIntValue(5)
)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(6)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
JavaLib.UnaryMinus(
new JavaIntValue(7)
)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
}
)
}
)
}
)
}
)
}
)
}
)
;
Procs.
tst_length
(
LIST1
,
new JavaIntValue(7)
);
Procs.
tst_length
(
LIST2
,
new JavaIntValue(7)
);
Procs.
tst_length
(
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
,
new JavaIntValue(0)
);
Procs.
tst_sum
(
LIST1
,
new JavaIntValue(6)
);
Procs.
tst_sum
(
LIST2
,
JavaLib.UnaryMinus(
new JavaIntValue(4)
)
);
Procs.
tst_sum
(
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
,
new JavaIntValue(0)
);
Procs.
tst_nrOfPosElems
(
LIST1
,
new JavaIntValue(3)
);
Procs.
tst_nrOfPosElems
(
LIST2
,
new JavaIntValue(3)
);
Procs.
tst_nrOfPosElems
(
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
,
new JavaIntValue(0)
);
if (! JavaLib.rtsTestDefined(NrOfTests,"/line,offset,length,file=/ 176 7368 9 prob01.g"))
if (javadummy) break CONDITION2;
{
JavaNode current0 = NrOfTests;
//assign current0 to T --- JJ.M4
T = current0 ;
};
if (! JavaLib.rtsTestDefined(NrOfFailures,"/line,offset,length,file=/ 177 7395 12 prob01.g"))
if (javadummy) break CONDITION2;
{
JavaNode current0 = NrOfFailures;
//assign current0 to F --- JJ.M4
F = current0 ;
};
JavaLib.rtsEmitCode
("---------------------------------------------------------------\n");
JavaLib.rtsEmitCode
("Number of tests: ");
JavaLib.rtsEmitString
(
T
);
JavaLib.rtsEmitCode
(", number of failures: ");
JavaLib.rtsEmitString
(
F
);
JavaLib.rtsEmitCode
("\n");
JavaLib.rtsEmitCode
("---------------------------------------------------------------\n");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST1;
// $$$$$$$$ 
} // CONDITION2 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=1 N=0
if (javadummy) break CONDITION0;
} // CONDLIST1 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION0
// failed:
JavaLib.rtsAllAlternativesFailed("Start");
}



public
static
void
length(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
CONDITION3:
while(javadummy) {
// ***** begin condlist 4 (in cond 3) *****
CONDLIST4: // @@@ begin of alternative group
while(javadummy) {
CONDITION5: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION5;
};
yy_outparam_0 = 
new JavaIntValue(0)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST4;
// $$$$$$$$ 
} // CONDITION5 // @@@ end of alternative
CONDITION6: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative L
JavaNode L= null;
// DECLARE for alternative R
JavaNode R= null;
// DECLARE for alternative E
JavaNode E= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION6;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to E --- JJ.M4
E = current1 ;
current1 = current0.Child1[1];
//assign current1 to R --- JJ.M4
R = current1 ;
} //)) children level 1
};
Procs.
length
(
R
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to L --- JJ.M4
L = current0 ;
}
yy_outparam_0 = 
JavaLib.Plus(
L
,
new JavaIntValue(1)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST4;
// $$$$$$$$ 
} // CONDITION6 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=4 N=3
if (javadummy) break CONDITION3;
} // CONDLIST4 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION3
// failed:
JavaLib.rtsAllAlternativesFailed("length");
}



public
static
void
sum(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
CONDITION7:
while(javadummy) {
// ***** begin condlist 8 (in cond 7) *****
CONDLIST8: // @@@ begin of alternative group
while(javadummy) {
CONDITION9: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION9;
};
yy_outparam_0 = 
new JavaIntValue(0)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST8;
// $$$$$$$$ 
} // CONDITION9 // @@@ end of alternative
CONDITION10: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative L
JavaNode L= null;
// DECLARE for alternative R
JavaNode R= null;
// DECLARE for alternative E
JavaNode E= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION10;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to E --- JJ.M4
E = current1 ;
current1 = current0.Child1[1];
//assign current1 to R --- JJ.M4
R = current1 ;
} //)) children level 1
};
Procs.
sum
(
R
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to L --- JJ.M4
L = current0 ;
}
yy_outparam_0 = 
JavaLib.Plus(
L
,
E
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST8;
// $$$$$$$$ 
} // CONDITION10 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=8 N=7
if (javadummy) break CONDITION7;
} // CONDLIST8 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION7
// failed:
JavaLib.rtsAllAlternativesFailed("sum");
}



public
static
void
nrOfPosElems(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
CONDITION11:
while(javadummy) {
// ***** begin condlist 12 (in cond 11) *****
CONDLIST12: // @@@ begin of alternative group
while(javadummy) {
CONDITION13: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION13;
};
yy_outparam_0 = 
new JavaIntValue(0)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST12;
// $$$$$$$$ 
} // CONDITION13 // @@@ end of alternative
CONDITION14: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative L
JavaNode L= null;
// DECLARE for alternative n
JavaNode n= null;
// DECLARE for alternative R
JavaNode R= null;
// DECLARE for alternative E
JavaNode E= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION14;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to E --- JJ.M4
E = current1 ;
current1 = current0.Child1[1];
//assign current1 to R --- JJ.M4
R = current1 ;
} //)) children level 1
};
Procs.
isPositive
(
E
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to n --- JJ.M4
n = current0 ;
}
Procs.
nrOfPosElems
(
R
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to L --- JJ.M4
L = current0 ;
}
yy_outparam_0 = 
JavaLib.Plus(
L
,
n
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST12;
// $$$$$$$$ 
} // CONDITION14 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=12 N=11
if (javadummy) break CONDITION11;
} // CONDLIST12 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION11
// failed:
JavaLib.rtsAllAlternativesFailed("nrOfPosElems");
}



public
static
void
isPositive(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
// DECLARE for proc n
JavaNode n = null;
CONDITION15:
while(javadummy) {
// ***** begin condlist 16 (in cond 15) *****
CONDLIST16: // @@@ begin of alternative group
while(javadummy) {
CONDITION17: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to n --- JJ.M4
n = current0 ;
};
{
if (! JavaLib.rtsGreaterInt(
n
,
new JavaIntValue(0)
)
)
   if (javadummy) break  CONDITION17;
};
yy_outparam_0 = 
new JavaIntValue(1)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST16;
// $$$$$$$$ 
} // CONDITION17 // @@@ end of alternative
CONDITION18: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to n --- JJ.M4
n = current0 ;
};
{
if (! JavaLib.rtsGreaterInt(
new JavaIntValue(0)
,
n
)
)
   if (javadummy) break  CONDITION18;
};
yy_outparam_0 = 
new JavaIntValue(0)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST16;
// $$$$$$$$ 
} // CONDITION18 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=16 N=15
if (javadummy) break CONDITION15;
} // CONDLIST16 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION15
// failed:
JavaLib.rtsAllAlternativesFailed("isPositive");
}



public
static
void
nrOfNegElems(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION19:
while(javadummy) {
// ***** begin condlist 20 (in cond 19) *****
CONDLIST20: // @@@ begin of alternative group
while(javadummy) {
CONDITION21: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
yy_outparam_0 = 
JavaLib.UnaryMinus(
new JavaIntValue(999)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST20;
// $$$$$$$$ 
} // CONDITION21 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=20 N=19
if (javadummy) break CONDITION19;
} // CONDLIST20 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION19
// failed:
JavaLib.rtsAllAlternativesFailed("nrOfNegElems");
}



public
static
void
sumOfPosElems(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION22:
while(javadummy) {
// ***** begin condlist 23 (in cond 22) *****
CONDLIST23: // @@@ begin of alternative group
while(javadummy) {
CONDITION24: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
yy_outparam_0 = 
JavaLib.UnaryMinus(
new JavaIntValue(999)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST23;
// $$$$$$$$ 
} // CONDITION24 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=23 N=22
if (javadummy) break CONDITION22;
} // CONDLIST23 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION22
// failed:
JavaLib.rtsAllAlternativesFailed("sumOfPosElems");
}



public
static
void
sumOfNegElems(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION25:
while(javadummy) {
// ***** begin condlist 26 (in cond 25) *****
CONDLIST26: // @@@ begin of alternative group
while(javadummy) {
CONDITION27: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
yy_outparam_0 = 
JavaLib.UnaryMinus(
new JavaIntValue(999)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST26;
// $$$$$$$$ 
} // CONDITION27 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=26 N=25
if (javadummy) break CONDITION25;
} // CONDLIST26 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION25
// failed:
JavaLib.rtsAllAlternativesFailed("sumOfNegElems");
}



public
static
void
maxPosElem(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION28:
while(javadummy) {
// ***** begin condlist 29 (in cond 28) *****
CONDLIST29: // @@@ begin of alternative group
while(javadummy) {
CONDITION30: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
yy_outparam_0 = 
JavaLib.UnaryMinus(
new JavaIntValue(999)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST29;
// $$$$$$$$ 
} // CONDITION30 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=29 N=28
if (javadummy) break CONDITION28;
} // CONDLIST29 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION28
// failed:
JavaLib.rtsAllAlternativesFailed("maxPosElem");
}



public
static
void
minNegElem(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION31:
while(javadummy) {
// ***** begin condlist 32 (in cond 31) *****
CONDLIST32: // @@@ begin of alternative group
while(javadummy) {
CONDITION33: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
yy_outparam_0 = 
JavaLib.UnaryMinus(
new JavaIntValue(999)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST32;
// $$$$$$$$ 
} // CONDITION33 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=32 N=31
if (javadummy) break CONDITION31;
} // CONDLIST32 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION31
// failed:
JavaLib.rtsAllAlternativesFailed("minNegElem");
}



public
static
boolean
isEven(

JavaNode yy_inparam_0
)
{
// DECLARE for proc N
JavaNode N = null;
CONDITION34:
while(javadummy) {
// ***** begin condlist 35 (in cond 34) *****
CONDLIST35: // @@@ begin of alternative group
while(javadummy) {
CONDITION36: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to N --- JJ.M4
N = current0 ;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST35;
// $$$$$$$$ 
} // CONDITION36 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=35 N=34
if (javadummy) break CONDITION34;
} // CONDLIST35 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION34
// failed:
return false;
}



public
static
boolean
isOdd(

JavaNode yy_inparam_0
)
{
// DECLARE for proc N
JavaNode N = null;
CONDITION37:
while(javadummy) {
// ***** begin condlist 38 (in cond 37) *****
CONDLIST38: // @@@ begin of alternative group
while(javadummy) {
CONDITION39: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to N --- JJ.M4
N = current0 ;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST38;
// $$$$$$$$ 
} // CONDITION39 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=38 N=37
if (javadummy) break CONDITION37;
} // CONDLIST38 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION37
// failed:
return false;
}



public
static
void
nrOfEvenElems(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION40:
while(javadummy) {
// ***** begin condlist 41 (in cond 40) *****
CONDLIST41: // @@@ begin of alternative group
while(javadummy) {
CONDITION42: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
yy_outparam_0 = 
JavaLib.UnaryMinus(
new JavaIntValue(999)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST41;
// $$$$$$$$ 
} // CONDITION42 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=41 N=40
if (javadummy) break CONDITION40;
} // CONDLIST41 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION40
// failed:
JavaLib.rtsAllAlternativesFailed("nrOfEvenElems");
}



public
static
void
nrOfOddElems(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION43:
while(javadummy) {
// ***** begin condlist 44 (in cond 43) *****
CONDLIST44: // @@@ begin of alternative group
while(javadummy) {
CONDITION45: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
yy_outparam_0 = 
JavaLib.UnaryMinus(
new JavaIntValue(999)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST44;
// $$$$$$$$ 
} // CONDITION45 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=44 N=43
if (javadummy) break CONDITION43;
} // CONDLIST44 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION43
// failed:
JavaLib.rtsAllAlternativesFailed("nrOfOddElems");
}



public
static
void
nrsOfPosNegElems(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
JavaNode yy_outparam_1 = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION46:
while(javadummy) {
// ***** begin condlist 47 (in cond 46) *****
CONDLIST47: // @@@ begin of alternative group
while(javadummy) {
CONDITION48: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
yy_outparam_0 = 
JavaLib.UnaryMinus(
new JavaIntValue(999)
)
;
yy_outparam_1 = 
JavaLib.UnaryMinus(
new JavaIntValue(999)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST47;
// $$$$$$$$ 
} // CONDITION48 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=47 N=46
if (javadummy) break CONDITION46;
} // CONDLIST47 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
JavaLib.yyoutvalue2 = yy_outparam_1;
if (javadummy) return;
} // CONDITION46
// failed:
JavaLib.rtsAllAlternativesFailed("nrsOfPosNegElems");
}



public
static
void
nrsOfNegEvenElems(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
JavaNode yy_outparam_1 = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION49:
while(javadummy) {
// ***** begin condlist 50 (in cond 49) *****
CONDLIST50: // @@@ begin of alternative group
while(javadummy) {
CONDITION51: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
yy_outparam_0 = 
JavaLib.UnaryMinus(
new JavaIntValue(999)
)
;
yy_outparam_1 = 
JavaLib.UnaryMinus(
new JavaIntValue(999)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST50;
// $$$$$$$$ 
} // CONDITION51 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=50 N=49
if (javadummy) break CONDITION49;
} // CONDLIST50 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
JavaLib.yyoutvalue2 = yy_outparam_1;
if (javadummy) return;
} // CONDITION49
// failed:
JavaLib.rtsAllAlternativesFailed("nrsOfNegEvenElems");
}



public
static
void
listOfPosElems(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION52:
while(javadummy) {
// ***** begin condlist 53 (in cond 52) *****
CONDLIST53: // @@@ begin of alternative group
while(javadummy) {
CONDITION54: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
yy_outparam_0 = 
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
JavaLib.UnaryMinus(
new JavaIntValue(999)
)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST53;
// $$$$$$$$ 
} // CONDITION54 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=53 N=52
if (javadummy) break CONDITION52;
} // CONDLIST53 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION52
// failed:
JavaLib.rtsAllAlternativesFailed("listOfPosElems");
}



public
static
void
listOfNegElems(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION55:
while(javadummy) {
// ***** begin condlist 56 (in cond 55) *****
CONDLIST56: // @@@ begin of alternative group
while(javadummy) {
CONDITION57: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
yy_outparam_0 = 
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
JavaLib.UnaryMinus(
new JavaIntValue(999)
)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST56;
// $$$$$$$$ 
} // CONDITION57 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=56 N=55
if (javadummy) break CONDITION55;
} // CONDLIST56 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION55
// failed:
JavaLib.rtsAllAlternativesFailed("listOfNegElems");
}



public
static
void
listsOfPosNegElems(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
JavaNode yy_outparam_1 = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION58:
while(javadummy) {
// ***** begin condlist 59 (in cond 58) *****
CONDLIST59: // @@@ begin of alternative group
while(javadummy) {
CONDITION60: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
yy_outparam_0 = 
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
JavaLib.UnaryMinus(
new JavaIntValue(999)
)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
;
yy_outparam_1 = 
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
JavaLib.UnaryMinus(
new JavaIntValue(999)
)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST59;
// $$$$$$$$ 
} // CONDITION60 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=59 N=58
if (javadummy) break CONDITION58;
} // CONDLIST59 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
JavaLib.yyoutvalue2 = yy_outparam_1;
if (javadummy) return;
} // CONDITION58
// failed:
JavaLib.rtsAllAlternativesFailed("listsOfPosNegElems");
}



public
static
void
listOfEvenElems(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION61:
while(javadummy) {
// ***** begin condlist 62 (in cond 61) *****
CONDLIST62: // @@@ begin of alternative group
while(javadummy) {
CONDITION63: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
yy_outparam_0 = 
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
JavaLib.UnaryMinus(
new JavaIntValue(999)
)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST62;
// $$$$$$$$ 
} // CONDITION63 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=62 N=61
if (javadummy) break CONDITION61;
} // CONDLIST62 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION61
// failed:
JavaLib.rtsAllAlternativesFailed("listOfEvenElems");
}



public
static
void
nrOfEqualNeighbors(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION64:
while(javadummy) {
// ***** begin condlist 65 (in cond 64) *****
CONDLIST65: // @@@ begin of alternative group
while(javadummy) {
CONDITION66: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
yy_outparam_0 = 
JavaLib.UnaryMinus(
new JavaIntValue(999)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST65;
// $$$$$$$$ 
} // CONDITION66 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=65 N=64
if (javadummy) break CONDITION64;
} // CONDLIST65 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION64
// failed:
JavaLib.rtsAllAlternativesFailed("nrOfEqualNeighbors");
}



public
static
boolean
containsElem(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc N
JavaNode N = null;
// DECLARE for proc E
JavaNode E = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION67:
while(javadummy) {
// ***** begin condlist 68 (in cond 67) *****
CONDLIST68: // @@@ begin of alternative group
while(javadummy) {
CONDITION69: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to E --- JJ.M4
E = current0 ;
};
{
JavaNode current0 = L;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION69;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to N --- JJ.M4
N = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "NilOf-int")
if (javadummy) break CONDITION69;
} //)) children level 1
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST68;
// $$$$$$$$ 
} // CONDITION69 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=68 N=67
if (javadummy) break CONDITION67;
} // CONDLIST68 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION67
// failed:
return false;
}



public
static
boolean
containsList(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc N
JavaNode N = null;
// DECLARE for proc L2
JavaNode L2 = null;
// DECLARE for proc L1
JavaNode L1 = null;
CONDITION70:
while(javadummy) {
// ***** begin condlist 71 (in cond 70) *****
CONDLIST71: // @@@ begin of alternative group
while(javadummy) {
CONDITION72: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L1 --- JJ.M4
L1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to L2 --- JJ.M4
L2 = current0 ;
};
{
JavaNode current0 = L1;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION72;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to N --- JJ.M4
N = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "NilOf-int")
if (javadummy) break CONDITION72;
} //)) children level 1
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST71;
// $$$$$$$$ 
} // CONDITION72 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=71 N=70
if (javadummy) break CONDITION70;
} // CONDLIST71 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION70
// failed:
return false;
}



public
static
boolean
containsEqualElems(

JavaNode yy_inparam_0
)
{
// DECLARE for proc N
JavaNode N = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION73:
while(javadummy) {
// ***** begin condlist 74 (in cond 73) *****
CONDLIST74: // @@@ begin of alternative group
while(javadummy) {
CONDITION75: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
{
JavaNode current0 = L;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION75;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to N --- JJ.M4
N = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "NilOf-int")
if (javadummy) break CONDITION75;
} //)) children level 1
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST74;
// $$$$$$$$ 
} // CONDITION75 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=74 N=73
if (javadummy) break CONDITION73;
} // CONDLIST74 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION73
// failed:
return false;
}



public
static
boolean
containEqualElems(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc N
JavaNode N = null;
// DECLARE for proc L2
JavaNode L2 = null;
// DECLARE for proc L1
JavaNode L1 = null;
CONDITION76:
while(javadummy) {
// ***** begin condlist 77 (in cond 76) *****
CONDLIST77: // @@@ begin of alternative group
while(javadummy) {
CONDITION78: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L1 --- JJ.M4
L1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to L2 --- JJ.M4
L2 = current0 ;
};
{
JavaNode current0 = L1;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION78;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to N --- JJ.M4
N = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "NilOf-int")
if (javadummy) break CONDITION78;
} //)) children level 1
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST77;
// $$$$$$$$ 
} // CONDITION78 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=77 N=76
if (javadummy) break CONDITION76;
} // CONDLIST77 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION76
// failed:
return false;
}



public
static
boolean
isSortedAscending(

JavaNode yy_inparam_0
)
{
// DECLARE for proc N
JavaNode N = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION79:
while(javadummy) {
// ***** begin condlist 80 (in cond 79) *****
CONDLIST80: // @@@ begin of alternative group
while(javadummy) {
CONDITION81: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
{
JavaNode current0 = L;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION81;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to N --- JJ.M4
N = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "NilOf-int")
if (javadummy) break CONDITION81;
} //)) children level 1
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST80;
// $$$$$$$$ 
} // CONDITION81 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=80 N=79
if (javadummy) break CONDITION79;
} // CONDLIST80 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION79
// failed:
return false;
}



public
static
boolean
isSortedDescending(

JavaNode yy_inparam_0
)
{
// DECLARE for proc L
JavaNode L = null;
CONDITION82:
while(javadummy) {
// ***** begin condlist 83 (in cond 82) *****
CONDLIST83: // @@@ begin of alternative group
while(javadummy) {
CONDITION84: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
{
JavaNode current0 = L;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION84;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST83;
// $$$$$$$$ 
} // CONDITION84 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=83 N=82
if (javadummy) break CONDITION82;
} // CONDLIST83 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION82
// failed:
return false;
}



public
static
void
firstElem(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION85:
while(javadummy) {
// ***** begin condlist 86 (in cond 85) *****
CONDLIST86: // @@@ begin of alternative group
while(javadummy) {
CONDITION87: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
yy_outparam_0 = 
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(999)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST86;
// $$$$$$$$ 
} // CONDITION87 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=86 N=85
if (javadummy) break CONDITION85;
} // CONDLIST86 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION85
// failed:
JavaLib.rtsAllAlternativesFailed("firstElem");
}



public
static
void
butFirstElem(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION88:
while(javadummy) {
// ***** begin condlist 89 (in cond 88) *****
CONDLIST89: // @@@ begin of alternative group
while(javadummy) {
CONDITION90: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
yy_outparam_0 = 
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(999)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST89;
// $$$$$$$$ 
} // CONDITION90 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=89 N=88
if (javadummy) break CONDITION88;
} // CONDLIST89 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION88
// failed:
JavaLib.rtsAllAlternativesFailed("butFirstElem");
}



public
static
void
lastElem(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION91:
while(javadummy) {
// ***** begin condlist 92 (in cond 91) *****
CONDLIST92: // @@@ begin of alternative group
while(javadummy) {
CONDITION93: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
yy_outparam_0 = 
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(999)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST92;
// $$$$$$$$ 
} // CONDITION93 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=92 N=91
if (javadummy) break CONDITION91;
} // CONDLIST92 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION91
// failed:
JavaLib.rtsAllAlternativesFailed("lastElem");
}



public
static
void
butLastElem(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION94:
while(javadummy) {
// ***** begin condlist 95 (in cond 94) *****
CONDLIST95: // @@@ begin of alternative group
while(javadummy) {
CONDITION96: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
yy_outparam_0 = 
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(999)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST95;
// $$$$$$$$ 
} // CONDITION96 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=95 N=94
if (javadummy) break CONDITION94;
} // CONDLIST95 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION94
// failed:
JavaLib.rtsAllAlternativesFailed("butLastElem");
}



public
static
void
reverse(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
// DECLARE for proc L
JavaNode L = null;
CONDITION97:
while(javadummy) {
// ***** begin condlist 98 (in cond 97) *****
CONDLIST98: // @@@ begin of alternative group
while(javadummy) {
CONDITION99: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L --- JJ.M4
L = current0 ;
};
yy_outparam_0 = 
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(999)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST98;
// $$$$$$$$ 
} // CONDITION99 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=98 N=97
if (javadummy) break CONDITION97;
} // CONDLIST98 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION97
// failed:
JavaLib.rtsAllAlternativesFailed("reverse");
}


// global variable NrOfTests
static JavaNode NrOfTests = null;
// global variable NrOfFailures
static JavaNode NrOfFailures = null;

public
static
void
init(
)
{
CONDITION100:
while(javadummy) {
// ***** begin condlist 101 (in cond 100) *****
CONDLIST101: // @@@ begin of alternative group
while(javadummy) {
CONDITION102: // @@@ begin of alternative
while(javadummy) {
NrOfTests=
new JavaIntValue(0)
;
NrOfFailures=
new JavaIntValue(0)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST101;
// $$$$$$$$ 
} // CONDITION102 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=101 N=100
if (javadummy) break CONDITION100;
} // CONDLIST101 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION100
// failed:
JavaLib.rtsAllAlternativesFailed("init");
}



public
static
void
incTests(
)
{
// DECLARE for proc NR
JavaNode NR = null;
CONDITION103:
while(javadummy) {
// ***** begin condlist 104 (in cond 103) *****
CONDLIST104: // @@@ begin of alternative group
while(javadummy) {
CONDITION105: // @@@ begin of alternative
while(javadummy) {
if (! JavaLib.rtsTestDefined(NrOfTests,"/line,offset,length,file=/ 385 16480 9 prob01.g"))
if (javadummy) break CONDITION105;
{
JavaNode current0 = NrOfTests;
//assign current0 to NR --- JJ.M4
NR = current0 ;
};
NrOfTests=
JavaLib.Plus(
NR
,
new JavaIntValue(1)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST104;
// $$$$$$$$ 
} // CONDITION105 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=104 N=103
if (javadummy) break CONDITION103;
} // CONDLIST104 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION103
// failed:
JavaLib.rtsAllAlternativesFailed("incTests");
}



public
static
void
incFailures(
)
{
// DECLARE for proc NR
JavaNode NR = null;
CONDITION106:
while(javadummy) {
// ***** begin condlist 107 (in cond 106) *****
CONDLIST107: // @@@ begin of alternative group
while(javadummy) {
CONDITION108: // @@@ begin of alternative
while(javadummy) {
if (! JavaLib.rtsTestDefined(NrOfFailures,"/line,offset,length,file=/ 390 16580 12 prob01.g"))
if (javadummy) break CONDITION108;
{
JavaNode current0 = NrOfFailures;
//assign current0 to NR --- JJ.M4
NR = current0 ;
};
NrOfFailures=
JavaLib.Plus(
NR
,
new JavaIntValue(1)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST107;
// $$$$$$$$ 
} // CONDITION108 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=107 N=106
if (javadummy) break CONDITION106;
} // CONDLIST107 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION106
// failed:
JavaLib.rtsAllAlternativesFailed("incFailures");
}



public
static
void
tst_length(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION109:
while(javadummy) {
// ***** begin condlist 110 (in cond 109) *****
CONDLIST110: // @@@ begin of alternative group
while(javadummy) {
CONDITION111: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
Procs.
length
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
Procs.
tstL_I
(
new JavaStringValue( "length" )
,
IN1
,
EXP1
,
FND1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST110;
// $$$$$$$$ 
} // CONDITION111 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=110 N=109
if (javadummy) break CONDITION109;
} // CONDLIST110 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION109
// failed:
JavaLib.rtsAllAlternativesFailed("tst_length");
}



public
static
void
tst_sum(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION112:
while(javadummy) {
// ***** begin condlist 113 (in cond 112) *****
CONDLIST113: // @@@ begin of alternative group
while(javadummy) {
CONDITION114: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
Procs.
sum
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
Procs.
tstL_I
(
new JavaStringValue( "sum" )
,
IN1
,
EXP1
,
FND1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST113;
// $$$$$$$$ 
} // CONDITION114 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=113 N=112
if (javadummy) break CONDITION112;
} // CONDLIST113 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION112
// failed:
JavaLib.rtsAllAlternativesFailed("tst_sum");
}



public
static
void
tst_nrOfPosElems(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION115:
while(javadummy) {
// ***** begin condlist 116 (in cond 115) *****
CONDLIST116: // @@@ begin of alternative group
while(javadummy) {
CONDITION117: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
Procs.
nrOfPosElems
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
Procs.
tstL_I
(
new JavaStringValue( "nrOfPosElems" )
,
IN1
,
EXP1
,
FND1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST116;
// $$$$$$$$ 
} // CONDITION117 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=116 N=115
if (javadummy) break CONDITION115;
} // CONDLIST116 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION115
// failed:
JavaLib.rtsAllAlternativesFailed("tst_nrOfPosElems");
}



public
static
void
tst_nrOfNegElems(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION118:
while(javadummy) {
// ***** begin condlist 119 (in cond 118) *****
CONDLIST119: // @@@ begin of alternative group
while(javadummy) {
CONDITION120: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
Procs.
nrOfNegElems
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
Procs.
tstL_I
(
new JavaStringValue( "nrOfNegElems" )
,
IN1
,
EXP1
,
FND1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST119;
// $$$$$$$$ 
} // CONDITION120 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=119 N=118
if (javadummy) break CONDITION118;
} // CONDLIST119 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION118
// failed:
JavaLib.rtsAllAlternativesFailed("tst_nrOfNegElems");
}



public
static
void
tst_sumOfPosElems(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION121:
while(javadummy) {
// ***** begin condlist 122 (in cond 121) *****
CONDLIST122: // @@@ begin of alternative group
while(javadummy) {
CONDITION123: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
Procs.
sumOfPosElems
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
Procs.
tstL_I
(
new JavaStringValue( "sumOfPosElems" )
,
IN1
,
EXP1
,
FND1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST122;
// $$$$$$$$ 
} // CONDITION123 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=122 N=121
if (javadummy) break CONDITION121;
} // CONDLIST122 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION121
// failed:
JavaLib.rtsAllAlternativesFailed("tst_sumOfPosElems");
}



public
static
void
tst_sumOfNegElems(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION124:
while(javadummy) {
// ***** begin condlist 125 (in cond 124) *****
CONDLIST125: // @@@ begin of alternative group
while(javadummy) {
CONDITION126: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
Procs.
sumOfNegElems
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
Procs.
tstL_I
(
new JavaStringValue( "SumOfNegElems" )
,
IN1
,
EXP1
,
FND1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST125;
// $$$$$$$$ 
} // CONDITION126 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=125 N=124
if (javadummy) break CONDITION124;
} // CONDLIST125 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION124
// failed:
JavaLib.rtsAllAlternativesFailed("tst_sumOfNegElems");
}



public
static
void
tst_maxPosElem(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION127:
while(javadummy) {
// ***** begin condlist 128 (in cond 127) *****
CONDLIST128: // @@@ begin of alternative group
while(javadummy) {
CONDITION129: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
Procs.
maxPosElem
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
Procs.
tstL_I
(
new JavaStringValue( "maxPosElem" )
,
IN1
,
EXP1
,
FND1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST128;
// $$$$$$$$ 
} // CONDITION129 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=128 N=127
if (javadummy) break CONDITION127;
} // CONDLIST128 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION127
// failed:
JavaLib.rtsAllAlternativesFailed("tst_maxPosElem");
}



public
static
void
tst_minNegElem(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION130:
while(javadummy) {
// ***** begin condlist 131 (in cond 130) *****
CONDLIST131: // @@@ begin of alternative group
while(javadummy) {
CONDITION132: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
Procs.
minNegElem
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
Procs.
tstL_I
(
new JavaStringValue( "minNegElem" )
,
IN1
,
EXP1
,
FND1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST131;
// $$$$$$$$ 
} // CONDITION132 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=131 N=130
if (javadummy) break CONDITION130;
} // CONDLIST131 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION130
// failed:
JavaLib.rtsAllAlternativesFailed("tst_minNegElem");
}



public
static
void
tst_isEven(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION133:
while(javadummy) {
// ***** begin condlist 134 (in cond 133) *****
CONDLIST134: // @@@ begin of alternative group
while(javadummy) {
CONDITION135: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"succ"))
   if (javadummy) break  CONDITION135;
};
Procs.
incTests
(
);
// ***** begin condlist 136 (in cond 135) *****
CONDLIST136: // @@@ begin of alternative group
while(javadummy) {
CONDITION137: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isEven
(
IN1
)
)
if (javadummy) break CONDITION137;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST136;
// $$$$$$$$ 
} // CONDITION137 // @@@ end of alternative
CONDITION138: // @@@ begin of alternative
while(javadummy) {
Procs.
ermI
(
new JavaStringValue( "isEven failed" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST136;
// $$$$$$$$ 
} // CONDITION138 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=136 N=135
if (javadummy) break CONDITION135;
} // CONDLIST136 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST134;
// $$$$$$$$ 
} // CONDITION135 // @@@ end of alternative
CONDITION139: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"fail"))
   if (javadummy) break  CONDITION139;
};
Procs.
incTests
(
);
// ***** begin condlist 140 (in cond 139) *****
CONDLIST140: // @@@ begin of alternative group
while(javadummy) {
CONDITION141: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isEven
(
IN1
)
)
if (javadummy) break CONDITION141;
Procs.
ermI
(
new JavaStringValue( "isEven succeeded" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST140;
// $$$$$$$$ 
} // CONDITION141 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=140 N=139
if (javadummy) break CONDLIST140;
} // CONDLIST140 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST134;
// $$$$$$$$ 
} // CONDITION139 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=134 N=133
if (javadummy) break CONDITION133;
} // CONDLIST134 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION133
// failed:
JavaLib.rtsAllAlternativesFailed("tst_isEven");
}



public
static
void
tst_isOdd(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION142:
while(javadummy) {
// ***** begin condlist 143 (in cond 142) *****
CONDLIST143: // @@@ begin of alternative group
while(javadummy) {
CONDITION144: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"succ"))
   if (javadummy) break  CONDITION144;
};
Procs.
incTests
(
);
// ***** begin condlist 145 (in cond 144) *****
CONDLIST145: // @@@ begin of alternative group
while(javadummy) {
CONDITION146: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isOdd
(
IN1
)
)
if (javadummy) break CONDITION146;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST145;
// $$$$$$$$ 
} // CONDITION146 // @@@ end of alternative
CONDITION147: // @@@ begin of alternative
while(javadummy) {
Procs.
ermI
(
new JavaStringValue( "isOdd failed" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST145;
// $$$$$$$$ 
} // CONDITION147 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=145 N=144
if (javadummy) break CONDITION144;
} // CONDLIST145 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST143;
// $$$$$$$$ 
} // CONDITION144 // @@@ end of alternative
CONDITION148: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"fail"))
   if (javadummy) break  CONDITION148;
};
Procs.
incTests
(
);
// ***** begin condlist 149 (in cond 148) *****
CONDLIST149: // @@@ begin of alternative group
while(javadummy) {
CONDITION150: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isOdd
(
IN1
)
)
if (javadummy) break CONDITION150;
Procs.
ermI
(
new JavaStringValue( "isOdd succeeded" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST149;
// $$$$$$$$ 
} // CONDITION150 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=149 N=148
if (javadummy) break CONDLIST149;
} // CONDLIST149 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST143;
// $$$$$$$$ 
} // CONDITION148 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=143 N=142
if (javadummy) break CONDITION142;
} // CONDLIST143 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION142
// failed:
JavaLib.rtsAllAlternativesFailed("tst_isOdd");
}



public
static
void
tst_nrOfEvenElems(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION151:
while(javadummy) {
// ***** begin condlist 152 (in cond 151) *****
CONDLIST152: // @@@ begin of alternative group
while(javadummy) {
CONDITION153: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
Procs.
nrOfEvenElems
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
Procs.
tstL_I
(
new JavaStringValue( "nrOfEvenElems" )
,
IN1
,
EXP1
,
FND1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST152;
// $$$$$$$$ 
} // CONDITION153 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=152 N=151
if (javadummy) break CONDITION151;
} // CONDLIST152 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION151
// failed:
JavaLib.rtsAllAlternativesFailed("tst_nrOfEvenElems");
}



public
static
void
tst_nrOfOddElems(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION154:
while(javadummy) {
// ***** begin condlist 155 (in cond 154) *****
CONDLIST155: // @@@ begin of alternative group
while(javadummy) {
CONDITION156: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
Procs.
nrOfOddElems
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
Procs.
tstL_I
(
new JavaStringValue( "nrOfOddElems" )
,
IN1
,
EXP1
,
FND1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST155;
// $$$$$$$$ 
} // CONDITION156 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=155 N=154
if (javadummy) break CONDITION154;
} // CONDLIST155 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION154
// failed:
JavaLib.rtsAllAlternativesFailed("tst_nrOfOddElems");
}



public
static
void
tst_nrsOfPosNegElems(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
,

JavaNode yy_inparam_2
)
{
// DECLARE for proc FND2
JavaNode FND2 = null;
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP2
JavaNode EXP2 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION157:
while(javadummy) {
// ***** begin condlist 158 (in cond 157) *****
CONDLIST158: // @@@ begin of alternative group
while(javadummy) {
CONDITION159: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
{
JavaNode current0 = yy_inparam_2;
//assign current0 to EXP2 --- JJ.M4
EXP2 = current0 ;
};
Procs.
nrsOfPosNegElems
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
{
JavaNode current0 = 
 JavaLib.yyoutvalue2;
//assign current0 to FND2 --- JJ.M4
FND2 = current0 ;
}
Procs.
tstL_II
(
new JavaStringValue( "nrsOfPosNegElems" )
,
IN1
,
EXP1
,
EXP2
,
FND1
,
FND2
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST158;
// $$$$$$$$ 
} // CONDITION159 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=158 N=157
if (javadummy) break CONDITION157;
} // CONDLIST158 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION157
// failed:
JavaLib.rtsAllAlternativesFailed("tst_nrsOfPosNegElems");
}



public
static
void
tst_nrsOfNegEvenElems(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
,

JavaNode yy_inparam_2
)
{
// DECLARE for proc FND2
JavaNode FND2 = null;
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP2
JavaNode EXP2 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION160:
while(javadummy) {
// ***** begin condlist 161 (in cond 160) *****
CONDLIST161: // @@@ begin of alternative group
while(javadummy) {
CONDITION162: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
{
JavaNode current0 = yy_inparam_2;
//assign current0 to EXP2 --- JJ.M4
EXP2 = current0 ;
};
Procs.
nrsOfNegEvenElems
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
{
JavaNode current0 = 
 JavaLib.yyoutvalue2;
//assign current0 to FND2 --- JJ.M4
FND2 = current0 ;
}
Procs.
tstL_II
(
new JavaStringValue( "nrsOfNegEvenElems" )
,
IN1
,
EXP1
,
EXP2
,
FND1
,
FND2
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST161;
// $$$$$$$$ 
} // CONDITION162 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=161 N=160
if (javadummy) break CONDITION160;
} // CONDLIST161 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION160
// failed:
JavaLib.rtsAllAlternativesFailed("tst_nrsOfNegEvenElems");
}



public
static
void
tst_listOfPosElems(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION163:
while(javadummy) {
// ***** begin condlist 164 (in cond 163) *****
CONDLIST164: // @@@ begin of alternative group
while(javadummy) {
CONDITION165: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
Procs.
listOfPosElems
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
Procs.
tstL_L
(
new JavaStringValue( "listOfPosElems" )
,
IN1
,
EXP1
,
FND1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST164;
// $$$$$$$$ 
} // CONDITION165 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=164 N=163
if (javadummy) break CONDITION163;
} // CONDLIST164 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION163
// failed:
JavaLib.rtsAllAlternativesFailed("tst_listOfPosElems");
}



public
static
void
tst_listOfNegElems(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION166:
while(javadummy) {
// ***** begin condlist 167 (in cond 166) *****
CONDLIST167: // @@@ begin of alternative group
while(javadummy) {
CONDITION168: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
Procs.
listOfNegElems
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
Procs.
tstL_L
(
new JavaStringValue( "listOfNegElems" )
,
IN1
,
EXP1
,
FND1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST167;
// $$$$$$$$ 
} // CONDITION168 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=167 N=166
if (javadummy) break CONDITION166;
} // CONDLIST167 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION166
// failed:
JavaLib.rtsAllAlternativesFailed("tst_listOfNegElems");
}



public
static
void
tst_listsOfPosNegElems(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
,

JavaNode yy_inparam_2
)
{
// DECLARE for proc FND2
JavaNode FND2 = null;
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP2
JavaNode EXP2 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION169:
while(javadummy) {
// ***** begin condlist 170 (in cond 169) *****
CONDLIST170: // @@@ begin of alternative group
while(javadummy) {
CONDITION171: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
{
JavaNode current0 = yy_inparam_2;
//assign current0 to EXP2 --- JJ.M4
EXP2 = current0 ;
};
Procs.
listsOfPosNegElems
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
{
JavaNode current0 = 
 JavaLib.yyoutvalue2;
//assign current0 to FND2 --- JJ.M4
FND2 = current0 ;
}
Procs.
tstL_LL
(
new JavaStringValue( "listsOfPosNegElems" )
,
IN1
,
EXP1
,
EXP2
,
FND1
,
FND2
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST170;
// $$$$$$$$ 
} // CONDITION171 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=170 N=169
if (javadummy) break CONDITION169;
} // CONDLIST170 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION169
// failed:
JavaLib.rtsAllAlternativesFailed("tst_listsOfPosNegElems");
}



public
static
void
tst_listOfEvenElems(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION172:
while(javadummy) {
// ***** begin condlist 173 (in cond 172) *****
CONDLIST173: // @@@ begin of alternative group
while(javadummy) {
CONDITION174: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
Procs.
listOfEvenElems
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
Procs.
tstL_L
(
new JavaStringValue( "listOfEvenElems" )
,
IN1
,
EXP1
,
FND1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST173;
// $$$$$$$$ 
} // CONDITION174 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=173 N=172
if (javadummy) break CONDITION172;
} // CONDLIST173 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION172
// failed:
JavaLib.rtsAllAlternativesFailed("tst_listOfEvenElems");
}



public
static
void
tst_nrOfEqualNeighbors(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION175:
while(javadummy) {
// ***** begin condlist 176 (in cond 175) *****
CONDLIST176: // @@@ begin of alternative group
while(javadummy) {
CONDITION177: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
Procs.
nrOfEqualNeighbors
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
Procs.
tstL_I
(
new JavaStringValue( "nrOfEqualNeighbors" )
,
IN1
,
EXP1
,
FND1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST176;
// $$$$$$$$ 
} // CONDITION177 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=176 N=175
if (javadummy) break CONDITION175;
} // CONDLIST176 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION175
// failed:
JavaLib.rtsAllAlternativesFailed("tst_nrOfEqualNeighbors");
}



public
static
void
tst_containsElem(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
,

JavaNode yy_inparam_2
)
{
// DECLARE for proc IN2
JavaNode IN2 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION178:
while(javadummy) {
// ***** begin condlist 179 (in cond 178) *****
CONDLIST179: // @@@ begin of alternative group
while(javadummy) {
CONDITION180: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to IN2 --- JJ.M4
IN2 = current0 ;
};
{
JavaNode current0 = yy_inparam_2;
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"succ"))
   if (javadummy) break  CONDITION180;
};
Procs.
incTests
(
);
// ***** begin condlist 181 (in cond 180) *****
CONDLIST181: // @@@ begin of alternative group
while(javadummy) {
CONDITION182: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
containsElem
(
IN1
,
IN2
)
)
if (javadummy) break CONDITION182;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST181;
// $$$$$$$$ 
} // CONDITION182 // @@@ end of alternative
CONDITION183: // @@@ begin of alternative
while(javadummy) {
Procs.
ermLI
(
new JavaStringValue( "containsElem failed" )
,
IN1
,
IN2
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST181;
// $$$$$$$$ 
} // CONDITION183 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=181 N=180
if (javadummy) break CONDITION180;
} // CONDLIST181 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST179;
// $$$$$$$$ 
} // CONDITION180 // @@@ end of alternative
CONDITION184: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to IN2 --- JJ.M4
IN2 = current0 ;
};
{
JavaNode current0 = yy_inparam_2;
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"fail"))
   if (javadummy) break  CONDITION184;
};
Procs.
incTests
(
);
// ***** begin condlist 185 (in cond 184) *****
CONDLIST185: // @@@ begin of alternative group
while(javadummy) {
CONDITION186: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
containsElem
(
IN1
,
IN2
)
)
if (javadummy) break CONDITION186;
Procs.
ermLI
(
new JavaStringValue( "containsElem succeeded" )
,
IN1
,
IN2
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST185;
// $$$$$$$$ 
} // CONDITION186 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=185 N=184
if (javadummy) break CONDLIST185;
} // CONDLIST185 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST179;
// $$$$$$$$ 
} // CONDITION184 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=179 N=178
if (javadummy) break CONDITION178;
} // CONDLIST179 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION178
// failed:
JavaLib.rtsAllAlternativesFailed("tst_containsElem");
}



public
static
void
tst_containsList(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
,

JavaNode yy_inparam_2
)
{
// DECLARE for proc IN2
JavaNode IN2 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION187:
while(javadummy) {
// ***** begin condlist 188 (in cond 187) *****
CONDLIST188: // @@@ begin of alternative group
while(javadummy) {
CONDITION189: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to IN2 --- JJ.M4
IN2 = current0 ;
};
{
JavaNode current0 = yy_inparam_2;
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"succ"))
   if (javadummy) break  CONDITION189;
};
Procs.
incTests
(
);
// ***** begin condlist 190 (in cond 189) *****
CONDLIST190: // @@@ begin of alternative group
while(javadummy) {
CONDITION191: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
containsList
(
IN1
,
IN2
)
)
if (javadummy) break CONDITION191;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST190;
// $$$$$$$$ 
} // CONDITION191 // @@@ end of alternative
CONDITION192: // @@@ begin of alternative
while(javadummy) {
Procs.
ermLL
(
new JavaStringValue( "containsList failed" )
,
IN1
,
IN2
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST190;
// $$$$$$$$ 
} // CONDITION192 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=190 N=189
if (javadummy) break CONDITION189;
} // CONDLIST190 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST188;
// $$$$$$$$ 
} // CONDITION189 // @@@ end of alternative
CONDITION193: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to IN2 --- JJ.M4
IN2 = current0 ;
};
{
JavaNode current0 = yy_inparam_2;
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"fail"))
   if (javadummy) break  CONDITION193;
};
Procs.
incTests
(
);
// ***** begin condlist 194 (in cond 193) *****
CONDLIST194: // @@@ begin of alternative group
while(javadummy) {
CONDITION195: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
containsList
(
IN1
,
IN2
)
)
if (javadummy) break CONDITION195;
Procs.
ermLL
(
new JavaStringValue( "containsList succeeded" )
,
IN1
,
IN2
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST194;
// $$$$$$$$ 
} // CONDITION195 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=194 N=193
if (javadummy) break CONDLIST194;
} // CONDLIST194 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST188;
// $$$$$$$$ 
} // CONDITION193 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=188 N=187
if (javadummy) break CONDITION187;
} // CONDLIST188 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION187
// failed:
JavaLib.rtsAllAlternativesFailed("tst_containsList");
}



public
static
void
tst_containsEqualElems(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION196:
while(javadummy) {
// ***** begin condlist 197 (in cond 196) *****
CONDLIST197: // @@@ begin of alternative group
while(javadummy) {
CONDITION198: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"succ"))
   if (javadummy) break  CONDITION198;
};
Procs.
incTests
(
);
// ***** begin condlist 199 (in cond 198) *****
CONDLIST199: // @@@ begin of alternative group
while(javadummy) {
CONDITION200: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
containsEqualElems
(
IN1
)
)
if (javadummy) break CONDITION200;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST199;
// $$$$$$$$ 
} // CONDITION200 // @@@ end of alternative
CONDITION201: // @@@ begin of alternative
while(javadummy) {
Procs.
ermL
(
new JavaStringValue( "containsEqualElems failed" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST199;
// $$$$$$$$ 
} // CONDITION201 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=199 N=198
if (javadummy) break CONDITION198;
} // CONDLIST199 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST197;
// $$$$$$$$ 
} // CONDITION198 // @@@ end of alternative
CONDITION202: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"fail"))
   if (javadummy) break  CONDITION202;
};
Procs.
incTests
(
);
// ***** begin condlist 203 (in cond 202) *****
CONDLIST203: // @@@ begin of alternative group
while(javadummy) {
CONDITION204: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
containsEqualElems
(
IN1
)
)
if (javadummy) break CONDITION204;
Procs.
ermL
(
new JavaStringValue( "containsEqualElems succeeded" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST203;
// $$$$$$$$ 
} // CONDITION204 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=203 N=202
if (javadummy) break CONDLIST203;
} // CONDLIST203 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST197;
// $$$$$$$$ 
} // CONDITION202 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=197 N=196
if (javadummy) break CONDITION196;
} // CONDLIST197 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION196
// failed:
JavaLib.rtsAllAlternativesFailed("tst_containsEqualElems");
}



public
static
void
tst_containEqualElems(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
,

JavaNode yy_inparam_2
)
{
// DECLARE for proc IN2
JavaNode IN2 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION205:
while(javadummy) {
// ***** begin condlist 206 (in cond 205) *****
CONDLIST206: // @@@ begin of alternative group
while(javadummy) {
CONDITION207: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to IN2 --- JJ.M4
IN2 = current0 ;
};
{
JavaNode current0 = yy_inparam_2;
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"succ"))
   if (javadummy) break  CONDITION207;
};
Procs.
incTests
(
);
// ***** begin condlist 208 (in cond 207) *****
CONDLIST208: // @@@ begin of alternative group
while(javadummy) {
CONDITION209: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
containEqualElems
(
IN1
,
IN2
)
)
if (javadummy) break CONDITION209;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST208;
// $$$$$$$$ 
} // CONDITION209 // @@@ end of alternative
CONDITION210: // @@@ begin of alternative
while(javadummy) {
Procs.
ermLL
(
new JavaStringValue( "containEqualElems failed" )
,
IN1
,
IN2
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST208;
// $$$$$$$$ 
} // CONDITION210 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=208 N=207
if (javadummy) break CONDITION207;
} // CONDLIST208 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST206;
// $$$$$$$$ 
} // CONDITION207 // @@@ end of alternative
CONDITION211: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to IN2 --- JJ.M4
IN2 = current0 ;
};
{
JavaNode current0 = yy_inparam_2;
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"fail"))
   if (javadummy) break  CONDITION211;
};
Procs.
incTests
(
);
// ***** begin condlist 212 (in cond 211) *****
CONDLIST212: // @@@ begin of alternative group
while(javadummy) {
CONDITION213: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
containEqualElems
(
IN1
,
IN2
)
)
if (javadummy) break CONDITION213;
Procs.
ermLL
(
new JavaStringValue( "containEqualElems succeeded" )
,
IN1
,
IN2
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST212;
// $$$$$$$$ 
} // CONDITION213 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=212 N=211
if (javadummy) break CONDLIST212;
} // CONDLIST212 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST206;
// $$$$$$$$ 
} // CONDITION211 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=206 N=205
if (javadummy) break CONDITION205;
} // CONDLIST206 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION205
// failed:
JavaLib.rtsAllAlternativesFailed("tst_containEqualElems");
}



public
static
void
tst_isSortedAscending(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION214:
while(javadummy) {
// ***** begin condlist 215 (in cond 214) *****
CONDLIST215: // @@@ begin of alternative group
while(javadummy) {
CONDITION216: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"succ"))
   if (javadummy) break  CONDITION216;
};
Procs.
incTests
(
);
// ***** begin condlist 217 (in cond 216) *****
CONDLIST217: // @@@ begin of alternative group
while(javadummy) {
CONDITION218: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isSortedAscending
(
IN1
)
)
if (javadummy) break CONDITION218;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST217;
// $$$$$$$$ 
} // CONDITION218 // @@@ end of alternative
CONDITION219: // @@@ begin of alternative
while(javadummy) {
Procs.
ermL
(
new JavaStringValue( "isSortedAscending failed" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST217;
// $$$$$$$$ 
} // CONDITION219 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=217 N=216
if (javadummy) break CONDITION216;
} // CONDLIST217 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST215;
// $$$$$$$$ 
} // CONDITION216 // @@@ end of alternative
CONDITION220: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"fail"))
   if (javadummy) break  CONDITION220;
};
Procs.
incTests
(
);
// ***** begin condlist 221 (in cond 220) *****
CONDLIST221: // @@@ begin of alternative group
while(javadummy) {
CONDITION222: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isSortedAscending
(
IN1
)
)
if (javadummy) break CONDITION222;
Procs.
ermL
(
new JavaStringValue( "isSortedAscending succeeded" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST221;
// $$$$$$$$ 
} // CONDITION222 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=221 N=220
if (javadummy) break CONDLIST221;
} // CONDLIST221 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST215;
// $$$$$$$$ 
} // CONDITION220 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=215 N=214
if (javadummy) break CONDITION214;
} // CONDLIST215 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION214
// failed:
JavaLib.rtsAllAlternativesFailed("tst_isSortedAscending");
}



public
static
void
tst_isSortedDescending(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION223:
while(javadummy) {
// ***** begin condlist 224 (in cond 223) *****
CONDLIST224: // @@@ begin of alternative group
while(javadummy) {
CONDITION225: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"succ"))
   if (javadummy) break  CONDITION225;
};
Procs.
incTests
(
);
// ***** begin condlist 226 (in cond 225) *****
CONDLIST226: // @@@ begin of alternative group
while(javadummy) {
CONDITION227: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isSortedDescending
(
IN1
)
)
if (javadummy) break CONDITION227;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST226;
// $$$$$$$$ 
} // CONDITION227 // @@@ end of alternative
CONDITION228: // @@@ begin of alternative
while(javadummy) {
Procs.
ermL
(
new JavaStringValue( "isSortedDescending failed" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST226;
// $$$$$$$$ 
} // CONDITION228 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=226 N=225
if (javadummy) break CONDITION225;
} // CONDLIST226 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST224;
// $$$$$$$$ 
} // CONDITION225 // @@@ end of alternative
CONDITION229: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"fail"))
   if (javadummy) break  CONDITION229;
};
Procs.
incTests
(
);
// ***** begin condlist 230 (in cond 229) *****
CONDLIST230: // @@@ begin of alternative group
while(javadummy) {
CONDITION231: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isSortedDescending
(
IN1
)
)
if (javadummy) break CONDITION231;
Procs.
ermL
(
new JavaStringValue( "isSortedDescending succeeded" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST230;
// $$$$$$$$ 
} // CONDITION231 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=230 N=229
if (javadummy) break CONDLIST230;
} // CONDLIST230 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST224;
// $$$$$$$$ 
} // CONDITION229 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=224 N=223
if (javadummy) break CONDITION223;
} // CONDLIST224 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION223
// failed:
JavaLib.rtsAllAlternativesFailed("tst_isSortedDescending");
}



public
static
void
tst_firstElem(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION232:
while(javadummy) {
// ***** begin condlist 233 (in cond 232) *****
CONDLIST233: // @@@ begin of alternative group
while(javadummy) {
CONDITION234: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
Procs.
firstElem
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
Procs.
tstL_L
(
new JavaStringValue( "firstElem" )
,
IN1
,
EXP1
,
FND1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST233;
// $$$$$$$$ 
} // CONDITION234 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=233 N=232
if (javadummy) break CONDITION232;
} // CONDLIST233 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION232
// failed:
JavaLib.rtsAllAlternativesFailed("tst_firstElem");
}



public
static
void
tst_butFirstElem(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION235:
while(javadummy) {
// ***** begin condlist 236 (in cond 235) *****
CONDLIST236: // @@@ begin of alternative group
while(javadummy) {
CONDITION237: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
Procs.
butFirstElem
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
Procs.
tstL_L
(
new JavaStringValue( "butFirstElem" )
,
IN1
,
EXP1
,
FND1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST236;
// $$$$$$$$ 
} // CONDITION237 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=236 N=235
if (javadummy) break CONDITION235;
} // CONDLIST236 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION235
// failed:
JavaLib.rtsAllAlternativesFailed("tst_butFirstElem");
}



public
static
void
tst_lastElem(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION238:
while(javadummy) {
// ***** begin condlist 239 (in cond 238) *****
CONDLIST239: // @@@ begin of alternative group
while(javadummy) {
CONDITION240: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
Procs.
lastElem
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
Procs.
tstL_L
(
new JavaStringValue( "lastElem" )
,
IN1
,
EXP1
,
FND1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST239;
// $$$$$$$$ 
} // CONDITION240 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=239 N=238
if (javadummy) break CONDITION238;
} // CONDLIST239 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION238
// failed:
JavaLib.rtsAllAlternativesFailed("tst_lastElem");
}



public
static
void
tst_butLastElem(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION241:
while(javadummy) {
// ***** begin condlist 242 (in cond 241) *****
CONDLIST242: // @@@ begin of alternative group
while(javadummy) {
CONDITION243: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
Procs.
butLastElem
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
Procs.
tstL_L
(
new JavaStringValue( "butLastElem" )
,
IN1
,
EXP1
,
FND1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST242;
// $$$$$$$$ 
} // CONDITION243 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=242 N=241
if (javadummy) break CONDITION241;
} // CONDLIST242 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION241
// failed:
JavaLib.rtsAllAlternativesFailed("tst_butLastElem");
}



public
static
void
tst_reverse(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
CONDITION244:
while(javadummy) {
// ***** begin condlist 245 (in cond 244) *****
CONDLIST245: // @@@ begin of alternative group
while(javadummy) {
CONDITION246: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
Procs.
reverse
(
IN1
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
}
Procs.
tstL_L
(
new JavaStringValue( "reverse" )
,
IN1
,
EXP1
,
FND1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST245;
// $$$$$$$$ 
} // CONDITION246 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=245 N=244
if (javadummy) break CONDITION244;
} // CONDLIST245 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION244
// failed:
JavaLib.rtsAllAlternativesFailed("tst_reverse");
}



public
static
void
tstL_I(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
,

JavaNode yy_inparam_2
,

JavaNode yy_inparam_3
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
// DECLARE for proc PRED
JavaNode PRED = null;
CONDITION247:
while(javadummy) {
// ***** begin condlist 248 (in cond 247) *****
CONDLIST248: // @@@ begin of alternative group
while(javadummy) {
CONDITION249: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to PRED --- JJ.M4
PRED = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_2;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
{
JavaNode current0 = yy_inparam_3;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
};
Procs.
incTests
(
);
// ***** begin condlist 250 (in cond 249) *****
CONDLIST250: // @@@ begin of alternative group
while(javadummy) {
CONDITION251: // @@@ begin of alternative
while(javadummy) {
{
if (! JavaLib.rtsEqualInt(
EXP1
,
FND1
)
)
   if (javadummy) break  CONDITION251;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST250;
// $$$$$$$$ 
} // CONDITION251 // @@@ end of alternative
CONDITION252: // @@@ begin of alternative
while(javadummy) {
Procs.
incFailures
(
);
JavaLib.rtsEmitCode
("---------------------------------------------\n");
JavaLib.rtsEmitCode
("Failure in predicate ");
JavaLib.rtsEmitString
(
PRED
);
JavaLib.rtsEmitCode
("\n\n");
JavaLib.rtsEmitCode
("IN1 : ");
Procs.
output
(
IN1
);
JavaLib.rtsEmitCode
("EXP1: ");
JavaLib.rtsEmitString
(
EXP1
);
JavaLib.rtsEmitCode
("\n");
JavaLib.rtsEmitCode
("FND1: ");
JavaLib.rtsEmitString
(
FND1
);
JavaLib.rtsEmitCode
("\n");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST250;
// $$$$$$$$ 
} // CONDITION252 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=250 N=249
if (javadummy) break CONDITION249;
} // CONDLIST250 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST248;
// $$$$$$$$ 
} // CONDITION249 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=248 N=247
if (javadummy) break CONDITION247;
} // CONDLIST248 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION247
// failed:
JavaLib.rtsAllAlternativesFailed("tstL_I");
}



public
static
void
tstL_II(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
,

JavaNode yy_inparam_2
,

JavaNode yy_inparam_3
,

JavaNode yy_inparam_4
,

JavaNode yy_inparam_5
)
{
// DECLARE for proc FND2
JavaNode FND2 = null;
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP2
JavaNode EXP2 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
// DECLARE for proc PRED
JavaNode PRED = null;
CONDITION253:
while(javadummy) {
// ***** begin condlist 254 (in cond 253) *****
CONDLIST254: // @@@ begin of alternative group
while(javadummy) {
CONDITION255: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to PRED --- JJ.M4
PRED = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_2;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
{
JavaNode current0 = yy_inparam_3;
//assign current0 to EXP2 --- JJ.M4
EXP2 = current0 ;
};
{
JavaNode current0 = yy_inparam_4;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
};
{
JavaNode current0 = yy_inparam_5;
//assign current0 to FND2 --- JJ.M4
FND2 = current0 ;
};
Procs.
incTests
(
);
// ***** begin condlist 256 (in cond 255) *****
CONDLIST256: // @@@ begin of alternative group
while(javadummy) {
CONDITION257: // @@@ begin of alternative
while(javadummy) {
{
if (! JavaLib.rtsEqualInt(
EXP1
,
FND1
)
)
   if (javadummy) break  CONDITION257;
};
{
if (! JavaLib.rtsEqualInt(
EXP2
,
FND2
)
)
   if (javadummy) break  CONDITION257;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST256;
// $$$$$$$$ 
} // CONDITION257 // @@@ end of alternative
CONDITION258: // @@@ begin of alternative
while(javadummy) {
Procs.
incFailures
(
);
JavaLib.rtsEmitCode
("---------------------------------------------\n");
JavaLib.rtsEmitCode
("Failure in predicate ");
JavaLib.rtsEmitString
(
PRED
);
JavaLib.rtsEmitCode
("\n\n");
JavaLib.rtsEmitCode
("IN1 : ");
Procs.
output
(
IN1
);
JavaLib.rtsEmitCode
("EXP1: ");
JavaLib.rtsEmitString
(
EXP1
);
JavaLib.rtsEmitCode
("\n");
JavaLib.rtsEmitCode
("FND1: ");
JavaLib.rtsEmitString
(
FND1
);
JavaLib.rtsEmitCode
("\n");
JavaLib.rtsEmitCode
("EXP2: ");
JavaLib.rtsEmitString
(
EXP2
);
JavaLib.rtsEmitCode
("\n");
JavaLib.rtsEmitCode
("FND2: ");
JavaLib.rtsEmitString
(
FND2
);
JavaLib.rtsEmitCode
("\n");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST256;
// $$$$$$$$ 
} // CONDITION258 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=256 N=255
if (javadummy) break CONDITION255;
} // CONDLIST256 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST254;
// $$$$$$$$ 
} // CONDITION255 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=254 N=253
if (javadummy) break CONDITION253;
} // CONDLIST254 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION253
// failed:
JavaLib.rtsAllAlternativesFailed("tstL_II");
}



public
static
void
tstL_L(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
,

JavaNode yy_inparam_2
,

JavaNode yy_inparam_3
)
{
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
// DECLARE for proc PRED
JavaNode PRED = null;
CONDITION259:
while(javadummy) {
// ***** begin condlist 260 (in cond 259) *****
CONDLIST260: // @@@ begin of alternative group
while(javadummy) {
CONDITION261: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to PRED --- JJ.M4
PRED = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_2;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
{
JavaNode current0 = yy_inparam_3;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
};
Procs.
incTests
(
);
// ***** begin condlist 262 (in cond 261) *****
CONDLIST262: // @@@ begin of alternative group
while(javadummy) {
CONDITION263: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
check
(
EXP1
,
FND1
)
)
if (javadummy) break CONDITION263;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST262;
// $$$$$$$$ 
} // CONDITION263 // @@@ end of alternative
CONDITION264: // @@@ begin of alternative
while(javadummy) {
Procs.
incFailures
(
);
JavaLib.rtsEmitCode
("---------------------------------------------\n");
JavaLib.rtsEmitCode
("Failure in predicate ");
JavaLib.rtsEmitString
(
PRED
);
JavaLib.rtsEmitCode
("\n\n");
JavaLib.rtsEmitCode
("IN1 : ");
Procs.
output
(
IN1
);
JavaLib.rtsEmitCode
("EXP1: ");
Procs.
output
(
EXP1
);
JavaLib.rtsEmitCode
("FND1: ");
Procs.
output
(
FND1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST262;
// $$$$$$$$ 
} // CONDITION264 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=262 N=261
if (javadummy) break CONDITION261;
} // CONDLIST262 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST260;
// $$$$$$$$ 
} // CONDITION261 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=260 N=259
if (javadummy) break CONDITION259;
} // CONDLIST260 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION259
// failed:
JavaLib.rtsAllAlternativesFailed("tstL_L");
}



public
static
void
tstL_LL(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
,

JavaNode yy_inparam_2
,

JavaNode yy_inparam_3
,

JavaNode yy_inparam_4
,

JavaNode yy_inparam_5
)
{
// DECLARE for proc FND2
JavaNode FND2 = null;
// DECLARE for proc FND1
JavaNode FND1 = null;
// DECLARE for proc EXP2
JavaNode EXP2 = null;
// DECLARE for proc EXP1
JavaNode EXP1 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
// DECLARE for proc PRED
JavaNode PRED = null;
CONDITION265:
while(javadummy) {
// ***** begin condlist 266 (in cond 265) *****
CONDLIST266: // @@@ begin of alternative group
while(javadummy) {
CONDITION267: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to PRED --- JJ.M4
PRED = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_2;
//assign current0 to EXP1 --- JJ.M4
EXP1 = current0 ;
};
{
JavaNode current0 = yy_inparam_3;
//assign current0 to EXP2 --- JJ.M4
EXP2 = current0 ;
};
{
JavaNode current0 = yy_inparam_4;
//assign current0 to FND1 --- JJ.M4
FND1 = current0 ;
};
{
JavaNode current0 = yy_inparam_5;
//assign current0 to FND2 --- JJ.M4
FND2 = current0 ;
};
Procs.
incTests
(
);
// ***** begin condlist 268 (in cond 267) *****
CONDLIST268: // @@@ begin of alternative group
while(javadummy) {
CONDITION269: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
check
(
EXP1
,
FND1
)
)
if (javadummy) break CONDITION269;
if (! 
Procs.
check
(
EXP2
,
FND2
)
)
if (javadummy) break CONDITION269;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST268;
// $$$$$$$$ 
} // CONDITION269 // @@@ end of alternative
CONDITION270: // @@@ begin of alternative
while(javadummy) {
Procs.
incFailures
(
);
JavaLib.rtsEmitCode
("---------------------------------------------\n");
JavaLib.rtsEmitCode
("Failure in predicate ");
JavaLib.rtsEmitString
(
PRED
);
JavaLib.rtsEmitCode
("\n\n");
JavaLib.rtsEmitCode
("IN1 : ");
Procs.
output
(
IN1
);
JavaLib.rtsEmitCode
("EXP1: ");
Procs.
output
(
EXP1
);
JavaLib.rtsEmitCode
("FND1: ");
Procs.
output
(
FND1
);
JavaLib.rtsEmitCode
("EXP2: ");
Procs.
output
(
EXP2
);
JavaLib.rtsEmitCode
("FND2: ");
Procs.
output
(
FND2
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST268;
// $$$$$$$$ 
} // CONDITION270 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=268 N=267
if (javadummy) break CONDITION267;
} // CONDLIST268 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST266;
// $$$$$$$$ 
} // CONDITION267 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=266 N=265
if (javadummy) break CONDITION265;
} // CONDLIST266 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION265
// failed:
JavaLib.rtsAllAlternativesFailed("tstL_LL");
}



public
static
void
ermI(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc IN1
JavaNode IN1 = null;
// DECLARE for proc MSG
JavaNode MSG = null;
CONDITION271:
while(javadummy) {
// ***** begin condlist 272 (in cond 271) *****
CONDLIST272: // @@@ begin of alternative group
while(javadummy) {
CONDITION273: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to MSG --- JJ.M4
MSG = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
Procs.
incFailures
(
);
JavaLib.rtsEmitCode
("---------------------------------------------\n");
JavaLib.rtsEmitCode
("Unexpected behavior of a condition predicate:\n\n");
JavaLib.rtsEmitCode
("MSG: ");
JavaLib.rtsEmitString
(
MSG
);
JavaLib.rtsEmitCode
("\n");
JavaLib.rtsEmitCode
("IN1: ");
JavaLib.rtsEmitString
(
IN1
);
JavaLib.rtsEmitCode
("\n");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST272;
// $$$$$$$$ 
} // CONDITION273 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=272 N=271
if (javadummy) break CONDITION271;
} // CONDLIST272 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION271
// failed:
JavaLib.rtsAllAlternativesFailed("ermI");
}



public
static
void
ermL(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
// DECLARE for proc IN1
JavaNode IN1 = null;
// DECLARE for proc MSG
JavaNode MSG = null;
CONDITION274:
while(javadummy) {
// ***** begin condlist 275 (in cond 274) *****
CONDLIST275: // @@@ begin of alternative group
while(javadummy) {
CONDITION276: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to MSG --- JJ.M4
MSG = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
Procs.
incFailures
(
);
JavaLib.rtsEmitCode
("---------------------------------------------\n");
JavaLib.rtsEmitCode
("Unexpected behavior of a condition predicate:\n\n");
JavaLib.rtsEmitCode
("MSG: ");
JavaLib.rtsEmitString
(
MSG
);
JavaLib.rtsEmitCode
("\n");
JavaLib.rtsEmitCode
("IN1: ");
Procs.
output
(
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST275;
// $$$$$$$$ 
} // CONDITION276 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=275 N=274
if (javadummy) break CONDITION274;
} // CONDLIST275 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION274
// failed:
JavaLib.rtsAllAlternativesFailed("ermL");
}



public
static
void
ermLI(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
,

JavaNode yy_inparam_2
)
{
// DECLARE for proc IN2
JavaNode IN2 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
// DECLARE for proc MSG
JavaNode MSG = null;
CONDITION277:
while(javadummy) {
// ***** begin condlist 278 (in cond 277) *****
CONDLIST278: // @@@ begin of alternative group
while(javadummy) {
CONDITION279: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to MSG --- JJ.M4
MSG = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_2;
//assign current0 to IN2 --- JJ.M4
IN2 = current0 ;
};
Procs.
incFailures
(
);
JavaLib.rtsEmitCode
("---------------------------------------------\n");
JavaLib.rtsEmitCode
("Unexpected behavior of a condition predicate:\n\n");
JavaLib.rtsEmitCode
("MSG: ");
JavaLib.rtsEmitString
(
MSG
);
JavaLib.rtsEmitCode
("\n");
JavaLib.rtsEmitCode
("IN1: ");
Procs.
output
(
IN1
);
JavaLib.rtsEmitCode
("IN2: ");
JavaLib.rtsEmitString
(
IN2
);
JavaLib.rtsEmitCode
("\n");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST278;
// $$$$$$$$ 
} // CONDITION279 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=278 N=277
if (javadummy) break CONDITION277;
} // CONDLIST278 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION277
// failed:
JavaLib.rtsAllAlternativesFailed("ermLI");
}



public
static
void
ermLL(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
,

JavaNode yy_inparam_2
)
{
// DECLARE for proc IN2
JavaNode IN2 = null;
// DECLARE for proc IN1
JavaNode IN1 = null;
// DECLARE for proc MSG
JavaNode MSG = null;
CONDITION280:
while(javadummy) {
// ***** begin condlist 281 (in cond 280) *****
CONDLIST281: // @@@ begin of alternative group
while(javadummy) {
CONDITION282: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to MSG --- JJ.M4
MSG = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to IN1 --- JJ.M4
IN1 = current0 ;
};
{
JavaNode current0 = yy_inparam_2;
//assign current0 to IN2 --- JJ.M4
IN2 = current0 ;
};
Procs.
incFailures
(
);
JavaLib.rtsEmitCode
("---------------------------------------------\n");
JavaLib.rtsEmitCode
("Unexpected behavior of a condition predicate:\n\n");
JavaLib.rtsEmitCode
("MSG: ");
JavaLib.rtsEmitString
(
MSG
);
JavaLib.rtsEmitCode
("\n");
JavaLib.rtsEmitCode
("IN1: ");
Procs.
output
(
IN1
);
JavaLib.rtsEmitCode
("IN2: ");
Procs.
output
(
IN2
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST281;
// $$$$$$$$ 
} // CONDITION282 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=281 N=280
if (javadummy) break CONDITION280;
} // CONDLIST281 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION280
// failed:
JavaLib.rtsAllAlternativesFailed("ermLL");
}



public
static
void
output(

JavaNode yy_inparam_0
)
{
CONDITION283:
while(javadummy) {
// ***** begin condlist 284 (in cond 283) *****
CONDLIST284: // @@@ begin of alternative group
while(javadummy) {
CONDITION285: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION285;
};
JavaLib.rtsEmitCode
("int[]\n");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST284;
// $$$$$$$$ 
} // CONDITION285 // @@@ end of alternative
CONDITION286: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION286;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to H --- JJ.M4
H = current1 ;
current1 = current0.Child1[1];
//assign current1 to T --- JJ.M4
T = current1 ;
} //)) children level 1
};
JavaLib.rtsEmitCode
("int[");
JavaLib.rtsEmitString
(
H
);
Procs.
output2
(
T
);
JavaLib.rtsEmitCode
("]\n");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST284;
// $$$$$$$$ 
} // CONDITION286 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=284 N=283
if (javadummy) break CONDITION283;
} // CONDLIST284 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION283
// failed:
JavaLib.rtsAllAlternativesFailed("output");
}



public
static
void
output2(

JavaNode yy_inparam_0
)
{
CONDITION287:
while(javadummy) {
// ***** begin condlist 288 (in cond 287) *****
CONDLIST288: // @@@ begin of alternative group
while(javadummy) {
CONDITION289: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION289;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST288;
// $$$$$$$$ 
} // CONDITION289 // @@@ end of alternative
CONDITION290: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION290;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to H --- JJ.M4
H = current1 ;
current1 = current0.Child1[1];
//assign current1 to T --- JJ.M4
T = current1 ;
} //)) children level 1
};
JavaLib.rtsEmitCode
(", ");
JavaLib.rtsEmitString
(
H
);
Procs.
output2
(
T
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST288;
// $$$$$$$$ 
} // CONDITION290 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=288 N=287
if (javadummy) break CONDITION287;
} // CONDLIST288 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION287
// failed:
JavaLib.rtsAllAlternativesFailed("output2");
}



public
static
boolean
check(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
CONDITION291:
while(javadummy) {
// ***** begin condlist 292 (in cond 291) *****
CONDLIST292: // @@@ begin of alternative group
while(javadummy) {
CONDITION293: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION293;
};
{
JavaNode current0 = yy_inparam_1;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION293;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST292;
// $$$$$$$$ 
} // CONDITION293 // @@@ end of alternative
CONDITION294: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative T2
JavaNode T2= null;
// DECLARE for alternative H2
JavaNode H2= null;
// DECLARE for alternative T1
JavaNode T1= null;
// DECLARE for alternative H1
JavaNode H1= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION294;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to H1 --- JJ.M4
H1 = current1 ;
current1 = current0.Child1[1];
//assign current1 to T1 --- JJ.M4
T1 = current1 ;
} //)) children level 1
};
{
JavaNode current0 = yy_inparam_1;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION294;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to H2 --- JJ.M4
H2 = current1 ;
current1 = current0.Child1[1];
//assign current1 to T2 --- JJ.M4
T2 = current1 ;
} //)) children level 1
};
{
if (! JavaLib.rtsEqualInt(
H1
,
H2
)
)
   if (javadummy) break  CONDITION294;
};
if (! 
Procs.
check
(
T1
,
T2
)
)
if (javadummy) break CONDITION294;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST292;
// $$$$$$$$ 
} // CONDITION294 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=292 N=291
if (javadummy) break CONDITION291;
} // CONDLIST292 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION291
// failed:
return false;
}


public static void Semantics(JavaNode n)
{
}
}
