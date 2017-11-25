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
Procs.
tst_nrOfNegElems
(
LIST1
,
new JavaIntValue(3)
);
Procs.
tst_nrOfNegElems
(
LIST2
,
new JavaIntValue(4)
);
Procs.
tst_nrOfNegElems
(
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
,
new JavaIntValue(0)
);
Procs.
tst_sumOfPosElems
(
LIST1
,
new JavaIntValue(15)
);
Procs.
tst_sumOfPosElems
(
LIST2
,
new JavaIntValue(12)
);
Procs.
tst_sumOfPosElems
(
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
,
new JavaIntValue(0)
);
Procs.
tst_sumOfNegElems
(
LIST1
,
JavaLib.UnaryMinus(
new JavaIntValue(9)
)
);
Procs.
tst_sumOfNegElems
(
LIST2
,
JavaLib.UnaryMinus(
new JavaIntValue(16)
)
);
Procs.
tst_sumOfNegElems
(
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
,
new JavaIntValue(0)
);
Procs.
tst_maxPosElem
(
LIST1
,
new JavaIntValue(5)
);
Procs.
tst_maxPosElem
(
LIST2
,
new JavaIntValue(6)
);
Procs.
tst_maxPosElem
(
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
,
new JavaIntValue(0)
);
Procs.
tst_minNegElem
(
LIST1
,
JavaLib.UnaryMinus(
new JavaIntValue(3)
)
);
Procs.
tst_minNegElem
(
LIST2
,
JavaLib.UnaryMinus(
new JavaIntValue(7)
)
);
Procs.
tst_minNegElem
(
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
,
new JavaIntValue(0)
);
Procs.
tst_isEven
(
new JavaIntValue(6)
,
new JavaStringValue( "succ" )
);
Procs.
tst_isEven
(
new JavaIntValue(3)
,
new JavaStringValue( "fail" )
);
if (! JavaLib.rtsTestDefined(NrOfTests,"/line,offset,length,file=/ 176 7301 9 prob01.g"))
if (javadummy) break CONDITION2;
{
JavaNode current0 = NrOfTests;
//assign current0 to T --- JJ.M4
T = current0 ;
};
if (! JavaLib.rtsTestDefined(NrOfFailures,"/line,offset,length,file=/ 177 7328 12 prob01.g"))
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
CONDITION19:
while(javadummy) {
// ***** begin condlist 20 (in cond 19) *****
CONDLIST20: // @@@ begin of alternative group
while(javadummy) {
CONDITION21: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION21;
};
yy_outparam_0 = 
new JavaIntValue(0)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST20;
// $$$$$$$$ 
} // CONDITION21 // @@@ end of alternative
CONDITION22: // @@@ begin of alternative
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
if (javadummy) break CONDITION22;
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
isNegative
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
nrOfNegElems
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
if (javadummy) break CONDLIST20;
// $$$$$$$$ 
} // CONDITION22 // @@@ end of alternative
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
isNegative(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
// DECLARE for proc n
JavaNode n = null;
CONDITION23:
while(javadummy) {
// ***** begin condlist 24 (in cond 23) *****
CONDLIST24: // @@@ begin of alternative group
while(javadummy) {
CONDITION25: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to n --- JJ.M4
n = current0 ;
};
{
if (! JavaLib.rtsLessInt(
n
,
new JavaIntValue(0)
)
)
   if (javadummy) break  CONDITION25;
};
yy_outparam_0 = 
new JavaIntValue(1)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST24;
// $$$$$$$$ 
} // CONDITION25 // @@@ end of alternative
CONDITION26: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to n --- JJ.M4
n = current0 ;
};
yy_outparam_0 = 
new JavaIntValue(0)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST24;
// $$$$$$$$ 
} // CONDITION26 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=24 N=23
if (javadummy) break CONDITION23;
} // CONDLIST24 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION23
// failed:
JavaLib.rtsAllAlternativesFailed("isNegative");
}



public
static
void
sumOfPosElems(

JavaNode yy_inparam_0
)
{
JavaNode yy_outparam_0 = null;
CONDITION27:
while(javadummy) {
// ***** begin condlist 28 (in cond 27) *****
CONDLIST28: // @@@ begin of alternative group
while(javadummy) {
CONDITION29: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION29;
};
yy_outparam_0 = 
new JavaIntValue(0)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST28;
// $$$$$$$$ 
} // CONDITION29 // @@@ end of alternative
CONDITION30: // @@@ begin of alternative
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
if (javadummy) break CONDITION30;
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
sumOfPosElems
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
JavaLib.Times(
E
,
n
)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST28;
// $$$$$$$$ 
} // CONDITION30 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=28 N=27
if (javadummy) break CONDITION27;
} // CONDLIST28 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION27
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
CONDITION31:
while(javadummy) {
// ***** begin condlist 32 (in cond 31) *****
CONDLIST32: // @@@ begin of alternative group
while(javadummy) {
CONDITION33: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION33;
};
yy_outparam_0 = 
new JavaIntValue(0)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST32;
// $$$$$$$$ 
} // CONDITION33 // @@@ end of alternative
CONDITION34: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative L
JavaNode L= null;
// DECLARE for alternative n
JavaNode n= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION34;
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
Procs.
isNegative
(
H
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to n --- JJ.M4
n = current0 ;
}
Procs.
sumOfNegElems
(
T
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
JavaLib.Times(
H
,
n
)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST32;
// $$$$$$$$ 
} // CONDITION34 // @@@ end of alternative
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
CONDITION35:
while(javadummy) {
// ***** begin condlist 36 (in cond 35) *****
CONDLIST36: // @@@ begin of alternative group
while(javadummy) {
CONDITION37: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION37;
};
yy_outparam_0 = 
new JavaIntValue(0)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST36;
// $$$$$$$$ 
} // CONDITION37 // @@@ end of alternative
CONDITION38: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative MT
JavaNode MT= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION38;
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
Procs.
maxPosElem
(
T
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to MT --- JJ.M4
MT = current0 ;
}
{
if (! JavaLib.rtsGreaterInt(
H
,
MT
)
)
   if (javadummy) break  CONDITION38;
};
yy_outparam_0 = 
H
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST36;
// $$$$$$$$ 
} // CONDITION38 // @@@ end of alternative
CONDITION39: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative MT
JavaNode MT= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION39;
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
Procs.
maxPosElem
(
T
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to MT --- JJ.M4
MT = current0 ;
}
yy_outparam_0 = 
MT
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST36;
// $$$$$$$$ 
} // CONDITION39 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=36 N=35
if (javadummy) break CONDITION35;
} // CONDLIST36 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION35
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
CONDITION40:
while(javadummy) {
// ***** begin condlist 41 (in cond 40) *****
CONDLIST41: // @@@ begin of alternative group
while(javadummy) {
CONDITION42: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION42;
};
yy_outparam_0 = 
new JavaIntValue(0)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST41;
// $$$$$$$$ 
} // CONDITION42 // @@@ end of alternative
CONDITION43: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative MT
JavaNode MT= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION43;
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
Procs.
minNegElem
(
T
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to MT --- JJ.M4
MT = current0 ;
}
{
if (! JavaLib.rtsLessInt(
H
,
MT
)
)
   if (javadummy) break  CONDITION43;
};
yy_outparam_0 = 
H
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST41;
// $$$$$$$$ 
} // CONDITION43 // @@@ end of alternative
CONDITION44: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative MT
JavaNode MT= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION44;
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
Procs.
minNegElem
(
T
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to MT --- JJ.M4
MT = current0 ;
}
yy_outparam_0 = 
MT
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST41;
// $$$$$$$$ 
} // CONDITION44 // @@@ end of alternative
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
JavaLib.rtsAllAlternativesFailed("minNegElem");
}



public
static
boolean
isEven(

JavaNode yy_inparam_0
)
{
CONDITION45:
while(javadummy) {
// ***** begin condlist 46 (in cond 45) *****
CONDLIST46: // @@@ begin of alternative group
while(javadummy) {
CONDITION47: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//JJ.M6
if (! JavaIntValue.MatchesInt(current0,0))
   if (javadummy) break  CONDITION47;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST46;
// $$$$$$$$ 
} // CONDITION47 // @@@ end of alternative
CONDITION48: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative n
JavaNode n= null;
{
JavaNode current0 = yy_inparam_0;
//assign current0 to n --- JJ.M4
n = current0 ;
};
if (! 
Procs.
isEven
(
JavaLib.Minus(
n
,
new JavaIntValue(2)
)
)
)
if (javadummy) break CONDITION48;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST46;
// $$$$$$$$ 
} // CONDITION48 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=46 N=45
if (javadummy) break CONDITION45;
} // CONDLIST46 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION45
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
// DECLARE for proc n
JavaNode n = null;
CONDITION49:
while(javadummy) {
// ***** begin condlist 50 (in cond 49) *****
CONDLIST50: // @@@ begin of alternative group
while(javadummy) {
CONDITION51: // @@@ begin of alternative
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
new JavaIntValue(1)
)
)
   if (javadummy) break  CONDITION51;
};
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
return true;
} // CONDITION49
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
JavaLib.UnaryMinus(
new JavaIntValue(999)
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
JavaLib.UnaryMinus(
new JavaIntValue(999)
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
JavaLib.yyoutvalue2 = yy_outparam_1;
if (javadummy) return;
} // CONDITION61
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
if (javadummy) break CONDLIST68;
// $$$$$$$$ 
} // CONDITION69 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=68 N=67
if (javadummy) break CONDITION67;
} // CONDLIST68 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION67
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
CONDITION70:
while(javadummy) {
// ***** begin condlist 71 (in cond 70) *****
CONDLIST71: // @@@ begin of alternative group
while(javadummy) {
CONDITION72: // @@@ begin of alternative
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
if (javadummy) break CONDLIST71;
// $$$$$$$$ 
} // CONDITION72 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=71 N=70
if (javadummy) break CONDITION70;
} // CONDLIST71 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
JavaLib.yyoutvalue2 = yy_outparam_1;
if (javadummy) return;
} // CONDITION70
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
if (javadummy) break CONDLIST74;
// $$$$$$$$ 
} // CONDITION75 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=74 N=73
if (javadummy) break CONDITION73;
} // CONDLIST74 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION73
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
CONDITION76:
while(javadummy) {
// ***** begin condlist 77 (in cond 76) *****
CONDLIST77: // @@@ begin of alternative group
while(javadummy) {
CONDITION78: // @@@ begin of alternative
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
if (javadummy) break CONDLIST77;
// $$$$$$$$ 
} // CONDITION78 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=77 N=76
if (javadummy) break CONDITION76;
} // CONDLIST77 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION76
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
JavaNode current0 = yy_inparam_1;
//assign current0 to E --- JJ.M4
E = current0 ;
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
CONDITION82:
while(javadummy) {
// ***** begin condlist 83 (in cond 82) *****
CONDLIST83: // @@@ begin of alternative group
while(javadummy) {
CONDITION84: // @@@ begin of alternative
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
if (javadummy) break CONDITION84;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to N --- JJ.M4
N = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "NilOf-int")
if (javadummy) break CONDITION84;
} //)) children level 1
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
boolean
containsEqualElems(

JavaNode yy_inparam_0
)
{
// DECLARE for proc N
JavaNode N = null;
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
{
JavaNode current0 = L;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION87;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to N --- JJ.M4
N = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "NilOf-int")
if (javadummy) break CONDITION87;
} //)) children level 1
};
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
return true;
} // CONDITION85
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
CONDITION88:
while(javadummy) {
// ***** begin condlist 89 (in cond 88) *****
CONDLIST89: // @@@ begin of alternative group
while(javadummy) {
CONDITION90: // @@@ begin of alternative
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
if (javadummy) break CONDITION90;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to N --- JJ.M4
N = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "NilOf-int")
if (javadummy) break CONDITION90;
} //)) children level 1
};
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
return true;
} // CONDITION88
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
{
JavaNode current0 = L;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION93;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to N --- JJ.M4
N = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "NilOf-int")
if (javadummy) break CONDITION93;
} //)) children level 1
};
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
return true;
} // CONDITION91
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
{
JavaNode current0 = L;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION96;
};
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
return true;
} // CONDITION94
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
CONDITION100:
while(javadummy) {
// ***** begin condlist 101 (in cond 100) *****
CONDLIST101: // @@@ begin of alternative group
while(javadummy) {
CONDITION102: // @@@ begin of alternative
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
if (javadummy) break CONDLIST101;
// $$$$$$$$ 
} // CONDITION102 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=101 N=100
if (javadummy) break CONDITION100;
} // CONDLIST101 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION100
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
CONDITION103:
while(javadummy) {
// ***** begin condlist 104 (in cond 103) *****
CONDLIST104: // @@@ begin of alternative group
while(javadummy) {
CONDITION105: // @@@ begin of alternative
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
if (javadummy) break CONDLIST104;
// $$$$$$$$ 
} // CONDITION105 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=104 N=103
if (javadummy) break CONDITION103;
} // CONDLIST104 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION103
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
CONDITION106:
while(javadummy) {
// ***** begin condlist 107 (in cond 106) *****
CONDLIST107: // @@@ begin of alternative group
while(javadummy) {
CONDITION108: // @@@ begin of alternative
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
if (javadummy) break CONDLIST107;
// $$$$$$$$ 
} // CONDITION108 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=107 N=106
if (javadummy) break CONDITION106;
} // CONDLIST107 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION106
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
CONDITION109:
while(javadummy) {
// ***** begin condlist 110 (in cond 109) *****
CONDLIST110: // @@@ begin of alternative group
while(javadummy) {
CONDITION111: // @@@ begin of alternative
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
if (javadummy) break CONDLIST110;
// $$$$$$$$ 
} // CONDITION111 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=110 N=109
if (javadummy) break CONDITION109;
} // CONDLIST110 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION109
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
CONDITION112:
while(javadummy) {
// ***** begin condlist 113 (in cond 112) *****
CONDLIST113: // @@@ begin of alternative group
while(javadummy) {
CONDITION114: // @@@ begin of alternative
while(javadummy) {
NrOfTests=
new JavaIntValue(0)
;
NrOfFailures=
new JavaIntValue(0)
;
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
CONDITION115:
while(javadummy) {
// ***** begin condlist 116 (in cond 115) *****
CONDLIST116: // @@@ begin of alternative group
while(javadummy) {
CONDITION117: // @@@ begin of alternative
while(javadummy) {
if (! JavaLib.rtsTestDefined(NrOfTests,"/line,offset,length,file=/ 414 17634 9 prob01.g"))
if (javadummy) break CONDITION117;
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
CONDITION118:
while(javadummy) {
// ***** begin condlist 119 (in cond 118) *****
CONDLIST119: // @@@ begin of alternative group
while(javadummy) {
CONDITION120: // @@@ begin of alternative
while(javadummy) {
if (! JavaLib.rtsTestDefined(NrOfFailures,"/line,offset,length,file=/ 419 17734 12 prob01.g"))
if (javadummy) break CONDITION120;
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
if (javadummy) break CONDLIST134;
// $$$$$$$$ 
} // CONDITION135 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=134 N=133
if (javadummy) break CONDITION133;
} // CONDLIST134 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION133
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
CONDITION136:
while(javadummy) {
// ***** begin condlist 137 (in cond 136) *****
CONDLIST137: // @@@ begin of alternative group
while(javadummy) {
CONDITION138: // @@@ begin of alternative
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
if (javadummy) break CONDLIST137;
// $$$$$$$$ 
} // CONDITION138 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=137 N=136
if (javadummy) break CONDITION136;
} // CONDLIST137 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION136
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
CONDITION139:
while(javadummy) {
// ***** begin condlist 140 (in cond 139) *****
CONDLIST140: // @@@ begin of alternative group
while(javadummy) {
CONDITION141: // @@@ begin of alternative
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
if (javadummy) break CONDLIST140;
// $$$$$$$$ 
} // CONDITION141 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=140 N=139
if (javadummy) break CONDITION139;
} // CONDLIST140 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION139
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
if (javadummy) break CONDLIST143;
// $$$$$$$$ 
} // CONDITION144 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=143 N=142
if (javadummy) break CONDITION142;
} // CONDLIST143 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION142
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
CONDITION145:
while(javadummy) {
// ***** begin condlist 146 (in cond 145) *****
CONDLIST146: // @@@ begin of alternative group
while(javadummy) {
CONDITION147: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION147;
};
Procs.
incTests
(
);
// ***** begin condlist 148 (in cond 147) *****
CONDLIST148: // @@@ begin of alternative group
while(javadummy) {
CONDITION149: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isEven
(
IN1
)
)
if (javadummy) break CONDITION149;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST148;
// $$$$$$$$ 
} // CONDITION149 // @@@ end of alternative
CONDITION150: // @@@ begin of alternative
while(javadummy) {
Procs.
ermI
(
new JavaStringValue( "isEven failed" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST148;
// $$$$$$$$ 
} // CONDITION150 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=148 N=147
if (javadummy) break CONDITION147;
} // CONDLIST148 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST146;
// $$$$$$$$ 
} // CONDITION147 // @@@ end of alternative
CONDITION151: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION151;
};
Procs.
incTests
(
);
// ***** begin condlist 152 (in cond 151) *****
CONDLIST152: // @@@ begin of alternative group
while(javadummy) {
CONDITION153: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isEven
(
IN1
)
)
if (javadummy) break CONDITION153;
Procs.
ermI
(
new JavaStringValue( "isEven succeeded" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST152;
// $$$$$$$$ 
} // CONDITION153 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=152 N=151
if (javadummy) break CONDLIST152;
} // CONDLIST152 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST146;
// $$$$$$$$ 
} // CONDITION151 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=146 N=145
if (javadummy) break CONDITION145;
} // CONDLIST146 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION145
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
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"succ"))
   if (javadummy) break  CONDITION156;
};
Procs.
incTests
(
);
// ***** begin condlist 157 (in cond 156) *****
CONDLIST157: // @@@ begin of alternative group
while(javadummy) {
CONDITION158: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isOdd
(
IN1
)
)
if (javadummy) break CONDITION158;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST157;
// $$$$$$$$ 
} // CONDITION158 // @@@ end of alternative
CONDITION159: // @@@ begin of alternative
while(javadummy) {
Procs.
ermI
(
new JavaStringValue( "isOdd failed" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST157;
// $$$$$$$$ 
} // CONDITION159 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=157 N=156
if (javadummy) break CONDITION156;
} // CONDLIST157 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST155;
// $$$$$$$$ 
} // CONDITION156 // @@@ end of alternative
CONDITION160: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION160;
};
Procs.
incTests
(
);
// ***** begin condlist 161 (in cond 160) *****
CONDLIST161: // @@@ begin of alternative group
while(javadummy) {
CONDITION162: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isOdd
(
IN1
)
)
if (javadummy) break CONDITION162;
Procs.
ermI
(
new JavaStringValue( "isOdd succeeded" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST161;
// $$$$$$$$ 
} // CONDITION162 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=161 N=160
if (javadummy) break CONDLIST161;
} // CONDLIST161 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST155;
// $$$$$$$$ 
} // CONDITION160 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=155 N=154
if (javadummy) break CONDITION154;
} // CONDLIST155 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION154
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
if (javadummy) break CONDLIST179;
// $$$$$$$$ 
} // CONDITION180 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=179 N=178
if (javadummy) break CONDITION178;
} // CONDLIST179 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION178
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
CONDITION181:
while(javadummy) {
// ***** begin condlist 182 (in cond 181) *****
CONDLIST182: // @@@ begin of alternative group
while(javadummy) {
CONDITION183: // @@@ begin of alternative
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
if (javadummy) break CONDLIST182;
// $$$$$$$$ 
} // CONDITION183 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=182 N=181
if (javadummy) break CONDITION181;
} // CONDLIST182 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION181
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
CONDITION184:
while(javadummy) {
// ***** begin condlist 185 (in cond 184) *****
CONDLIST185: // @@@ begin of alternative group
while(javadummy) {
CONDITION186: // @@@ begin of alternative
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
if (javadummy) break CONDLIST185;
// $$$$$$$$ 
} // CONDITION186 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=185 N=184
if (javadummy) break CONDITION184;
} // CONDLIST185 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION184
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
if (javadummy) break CONDLIST188;
// $$$$$$$$ 
} // CONDITION189 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=188 N=187
if (javadummy) break CONDITION187;
} // CONDLIST188 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION187
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
CONDITION190:
while(javadummy) {
// ***** begin condlist 191 (in cond 190) *****
CONDLIST191: // @@@ begin of alternative group
while(javadummy) {
CONDITION192: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION192;
};
Procs.
incTests
(
);
// ***** begin condlist 193 (in cond 192) *****
CONDLIST193: // @@@ begin of alternative group
while(javadummy) {
CONDITION194: // @@@ begin of alternative
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
if (javadummy) break CONDITION194;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST193;
// $$$$$$$$ 
} // CONDITION194 // @@@ end of alternative
CONDITION195: // @@@ begin of alternative
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
if (javadummy) break CONDLIST193;
// $$$$$$$$ 
} // CONDITION195 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=193 N=192
if (javadummy) break CONDITION192;
} // CONDLIST193 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST191;
// $$$$$$$$ 
} // CONDITION192 // @@@ end of alternative
CONDITION196: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION196;
};
Procs.
incTests
(
);
// ***** begin condlist 197 (in cond 196) *****
CONDLIST197: // @@@ begin of alternative group
while(javadummy) {
CONDITION198: // @@@ begin of alternative
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
if (javadummy) break CONDITION198;
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
if (javadummy) break CONDLIST197;
// $$$$$$$$ 
} // CONDITION198 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=197 N=196
if (javadummy) break CONDLIST197;
} // CONDLIST197 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST191;
// $$$$$$$$ 
} // CONDITION196 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=191 N=190
if (javadummy) break CONDITION190;
} // CONDLIST191 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION190
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
CONDITION199:
while(javadummy) {
// ***** begin condlist 200 (in cond 199) *****
CONDLIST200: // @@@ begin of alternative group
while(javadummy) {
CONDITION201: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION201;
};
Procs.
incTests
(
);
// ***** begin condlist 202 (in cond 201) *****
CONDLIST202: // @@@ begin of alternative group
while(javadummy) {
CONDITION203: // @@@ begin of alternative
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
if (javadummy) break CONDITION203;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST202;
// $$$$$$$$ 
} // CONDITION203 // @@@ end of alternative
CONDITION204: // @@@ begin of alternative
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
if (javadummy) break CONDLIST202;
// $$$$$$$$ 
} // CONDITION204 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=202 N=201
if (javadummy) break CONDITION201;
} // CONDLIST202 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST200;
// $$$$$$$$ 
} // CONDITION201 // @@@ end of alternative
CONDITION205: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION205;
};
Procs.
incTests
(
);
// ***** begin condlist 206 (in cond 205) *****
CONDLIST206: // @@@ begin of alternative group
while(javadummy) {
CONDITION207: // @@@ begin of alternative
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
if (javadummy) break CONDITION207;
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
if (javadummy) break CONDLIST206;
// $$$$$$$$ 
} // CONDITION207 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=206 N=205
if (javadummy) break CONDLIST206;
} // CONDLIST206 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST200;
// $$$$$$$$ 
} // CONDITION205 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=200 N=199
if (javadummy) break CONDITION199;
} // CONDLIST200 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION199
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
CONDITION208:
while(javadummy) {
// ***** begin condlist 209 (in cond 208) *****
CONDLIST209: // @@@ begin of alternative group
while(javadummy) {
CONDITION210: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION210;
};
Procs.
incTests
(
);
// ***** begin condlist 211 (in cond 210) *****
CONDLIST211: // @@@ begin of alternative group
while(javadummy) {
CONDITION212: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
containsEqualElems
(
IN1
)
)
if (javadummy) break CONDITION212;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST211;
// $$$$$$$$ 
} // CONDITION212 // @@@ end of alternative
CONDITION213: // @@@ begin of alternative
while(javadummy) {
Procs.
ermL
(
new JavaStringValue( "containsEqualElems failed" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST211;
// $$$$$$$$ 
} // CONDITION213 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=211 N=210
if (javadummy) break CONDITION210;
} // CONDLIST211 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST209;
// $$$$$$$$ 
} // CONDITION210 // @@@ end of alternative
CONDITION214: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION214;
};
Procs.
incTests
(
);
// ***** begin condlist 215 (in cond 214) *****
CONDLIST215: // @@@ begin of alternative group
while(javadummy) {
CONDITION216: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
containsEqualElems
(
IN1
)
)
if (javadummy) break CONDITION216;
Procs.
ermL
(
new JavaStringValue( "containsEqualElems succeeded" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST215;
// $$$$$$$$ 
} // CONDITION216 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=215 N=214
if (javadummy) break CONDLIST215;
} // CONDLIST215 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST209;
// $$$$$$$$ 
} // CONDITION214 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=209 N=208
if (javadummy) break CONDITION208;
} // CONDLIST209 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION208
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
CONDITION217:
while(javadummy) {
// ***** begin condlist 218 (in cond 217) *****
CONDLIST218: // @@@ begin of alternative group
while(javadummy) {
CONDITION219: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION219;
};
Procs.
incTests
(
);
// ***** begin condlist 220 (in cond 219) *****
CONDLIST220: // @@@ begin of alternative group
while(javadummy) {
CONDITION221: // @@@ begin of alternative
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
if (javadummy) break CONDITION221;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST220;
// $$$$$$$$ 
} // CONDITION221 // @@@ end of alternative
CONDITION222: // @@@ begin of alternative
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
if (javadummy) break CONDLIST220;
// $$$$$$$$ 
} // CONDITION222 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=220 N=219
if (javadummy) break CONDITION219;
} // CONDLIST220 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST218;
// $$$$$$$$ 
} // CONDITION219 // @@@ end of alternative
CONDITION223: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION223;
};
Procs.
incTests
(
);
// ***** begin condlist 224 (in cond 223) *****
CONDLIST224: // @@@ begin of alternative group
while(javadummy) {
CONDITION225: // @@@ begin of alternative
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
if (javadummy) break CONDITION225;
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
if (javadummy) break CONDLIST224;
// $$$$$$$$ 
} // CONDITION225 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=224 N=223
if (javadummy) break CONDLIST224;
} // CONDLIST224 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST218;
// $$$$$$$$ 
} // CONDITION223 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=218 N=217
if (javadummy) break CONDITION217;
} // CONDLIST218 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION217
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
CONDITION226:
while(javadummy) {
// ***** begin condlist 227 (in cond 226) *****
CONDLIST227: // @@@ begin of alternative group
while(javadummy) {
CONDITION228: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION228;
};
Procs.
incTests
(
);
// ***** begin condlist 229 (in cond 228) *****
CONDLIST229: // @@@ begin of alternative group
while(javadummy) {
CONDITION230: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isSortedAscending
(
IN1
)
)
if (javadummy) break CONDITION230;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST229;
// $$$$$$$$ 
} // CONDITION230 // @@@ end of alternative
CONDITION231: // @@@ begin of alternative
while(javadummy) {
Procs.
ermL
(
new JavaStringValue( "isSortedAscending failed" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST229;
// $$$$$$$$ 
} // CONDITION231 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=229 N=228
if (javadummy) break CONDITION228;
} // CONDLIST229 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST227;
// $$$$$$$$ 
} // CONDITION228 // @@@ end of alternative
CONDITION232: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION232;
};
Procs.
incTests
(
);
// ***** begin condlist 233 (in cond 232) *****
CONDLIST233: // @@@ begin of alternative group
while(javadummy) {
CONDITION234: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isSortedAscending
(
IN1
)
)
if (javadummy) break CONDITION234;
Procs.
ermL
(
new JavaStringValue( "isSortedAscending succeeded" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST233;
// $$$$$$$$ 
} // CONDITION234 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=233 N=232
if (javadummy) break CONDLIST233;
} // CONDLIST233 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST227;
// $$$$$$$$ 
} // CONDITION232 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=227 N=226
if (javadummy) break CONDITION226;
} // CONDLIST227 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION226
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
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"succ"))
   if (javadummy) break  CONDITION237;
};
Procs.
incTests
(
);
// ***** begin condlist 238 (in cond 237) *****
CONDLIST238: // @@@ begin of alternative group
while(javadummy) {
CONDITION239: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isSortedDescending
(
IN1
)
)
if (javadummy) break CONDITION239;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST238;
// $$$$$$$$ 
} // CONDITION239 // @@@ end of alternative
CONDITION240: // @@@ begin of alternative
while(javadummy) {
Procs.
ermL
(
new JavaStringValue( "isSortedDescending failed" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST238;
// $$$$$$$$ 
} // CONDITION240 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=238 N=237
if (javadummy) break CONDITION237;
} // CONDLIST238 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST236;
// $$$$$$$$ 
} // CONDITION237 // @@@ end of alternative
CONDITION241: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION241;
};
Procs.
incTests
(
);
// ***** begin condlist 242 (in cond 241) *****
CONDLIST242: // @@@ begin of alternative group
while(javadummy) {
CONDITION243: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isSortedDescending
(
IN1
)
)
if (javadummy) break CONDITION243;
Procs.
ermL
(
new JavaStringValue( "isSortedDescending succeeded" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST242;
// $$$$$$$$ 
} // CONDITION243 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=242 N=241
if (javadummy) break CONDLIST242;
} // CONDLIST242 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST236;
// $$$$$$$$ 
} // CONDITION241 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=236 N=235
if (javadummy) break CONDITION235;
} // CONDLIST236 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION235
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
CONDITION247:
while(javadummy) {
// ***** begin condlist 248 (in cond 247) *****
CONDLIST248: // @@@ begin of alternative group
while(javadummy) {
CONDITION249: // @@@ begin of alternative
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
CONDITION250:
while(javadummy) {
// ***** begin condlist 251 (in cond 250) *****
CONDLIST251: // @@@ begin of alternative group
while(javadummy) {
CONDITION252: // @@@ begin of alternative
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
if (javadummy) break CONDLIST251;
// $$$$$$$$ 
} // CONDITION252 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=251 N=250
if (javadummy) break CONDITION250;
} // CONDLIST251 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION250
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
CONDITION253:
while(javadummy) {
// ***** begin condlist 254 (in cond 253) *****
CONDLIST254: // @@@ begin of alternative group
while(javadummy) {
CONDITION255: // @@@ begin of alternative
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
CONDITION256:
while(javadummy) {
// ***** begin condlist 257 (in cond 256) *****
CONDLIST257: // @@@ begin of alternative group
while(javadummy) {
CONDITION258: // @@@ begin of alternative
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
if (javadummy) break CONDLIST257;
// $$$$$$$$ 
} // CONDITION258 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=257 N=256
if (javadummy) break CONDITION256;
} // CONDLIST257 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION256
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
{
if (! JavaLib.rtsEqualInt(
EXP1
,
FND1
)
)
   if (javadummy) break  CONDITION263;
};
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
{
if (! JavaLib.rtsEqualInt(
EXP1
,
FND1
)
)
   if (javadummy) break  CONDITION269;
};
{
if (! JavaLib.rtsEqualInt(
EXP2
,
FND2
)
)
   if (javadummy) break  CONDITION269;
};
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
CONDITION271:
while(javadummy) {
// ***** begin condlist 272 (in cond 271) *****
CONDLIST272: // @@@ begin of alternative group
while(javadummy) {
CONDITION273: // @@@ begin of alternative
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
// ***** begin condlist 274 (in cond 273) *****
CONDLIST274: // @@@ begin of alternative group
while(javadummy) {
CONDITION275: // @@@ begin of alternative
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
if (javadummy) break CONDITION275;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST274;
// $$$$$$$$ 
} // CONDITION275 // @@@ end of alternative
CONDITION276: // @@@ begin of alternative
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
if (javadummy) break CONDLIST274;
// $$$$$$$$ 
} // CONDITION276 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=274 N=273
if (javadummy) break CONDITION273;
} // CONDLIST274 @@@ end of alternative group
// *** CONTINUE ***
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
CONDITION277:
while(javadummy) {
// ***** begin condlist 278 (in cond 277) *****
CONDLIST278: // @@@ begin of alternative group
while(javadummy) {
CONDITION279: // @@@ begin of alternative
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
// ***** begin condlist 280 (in cond 279) *****
CONDLIST280: // @@@ begin of alternative group
while(javadummy) {
CONDITION281: // @@@ begin of alternative
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
if (javadummy) break CONDITION281;
if (! 
Procs.
check
(
EXP2
,
FND2
)
)
if (javadummy) break CONDITION281;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST280;
// $$$$$$$$ 
} // CONDITION281 // @@@ end of alternative
CONDITION282: // @@@ begin of alternative
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
if (javadummy) break CONDLIST280;
// $$$$$$$$ 
} // CONDITION282 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=280 N=279
if (javadummy) break CONDITION279;
} // CONDLIST280 @@@ end of alternative group
// *** CONTINUE ***
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
CONDITION283:
while(javadummy) {
// ***** begin condlist 284 (in cond 283) *****
CONDLIST284: // @@@ begin of alternative group
while(javadummy) {
CONDITION285: // @@@ begin of alternative
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
if (javadummy) break CONDLIST284;
// $$$$$$$$ 
} // CONDITION285 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=284 N=283
if (javadummy) break CONDITION283;
} // CONDLIST284 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION283
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
CONDITION286:
while(javadummy) {
// ***** begin condlist 287 (in cond 286) *****
CONDLIST287: // @@@ begin of alternative group
while(javadummy) {
CONDITION288: // @@@ begin of alternative
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
if (javadummy) break CONDLIST287;
// $$$$$$$$ 
} // CONDITION288 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=287 N=286
if (javadummy) break CONDITION286;
} // CONDLIST287 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION286
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
CONDITION289:
while(javadummy) {
// ***** begin condlist 290 (in cond 289) *****
CONDLIST290: // @@@ begin of alternative group
while(javadummy) {
CONDITION291: // @@@ begin of alternative
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
if (javadummy) break CONDLIST290;
// $$$$$$$$ 
} // CONDITION291 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=290 N=289
if (javadummy) break CONDITION289;
} // CONDLIST290 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION289
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
CONDITION292:
while(javadummy) {
// ***** begin condlist 293 (in cond 292) *****
CONDLIST293: // @@@ begin of alternative group
while(javadummy) {
CONDITION294: // @@@ begin of alternative
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
if (javadummy) break CONDLIST293;
// $$$$$$$$ 
} // CONDITION294 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=293 N=292
if (javadummy) break CONDITION292;
} // CONDLIST293 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION292
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
CONDITION295:
while(javadummy) {
// ***** begin condlist 296 (in cond 295) *****
CONDLIST296: // @@@ begin of alternative group
while(javadummy) {
CONDITION297: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION297;
};
JavaLib.rtsEmitCode
("int[]\n");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST296;
// $$$$$$$$ 
} // CONDITION297 // @@@ end of alternative
CONDITION298: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION298;
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
if (javadummy) break CONDLIST296;
// $$$$$$$$ 
} // CONDITION298 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=296 N=295
if (javadummy) break CONDITION295;
} // CONDLIST296 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION295
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
CONDITION299:
while(javadummy) {
// ***** begin condlist 300 (in cond 299) *****
CONDLIST300: // @@@ begin of alternative group
while(javadummy) {
CONDITION301: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION301;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST300;
// $$$$$$$$ 
} // CONDITION301 // @@@ end of alternative
CONDITION302: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION302;
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
if (javadummy) break CONDLIST300;
// $$$$$$$$ 
} // CONDITION302 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=300 N=299
if (javadummy) break CONDITION299;
} // CONDLIST300 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION299
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
CONDITION303:
while(javadummy) {
// ***** begin condlist 304 (in cond 303) *****
CONDLIST304: // @@@ begin of alternative group
while(javadummy) {
CONDITION305: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION305;
};
{
JavaNode current0 = yy_inparam_1;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION305;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST304;
// $$$$$$$$ 
} // CONDITION305 // @@@ end of alternative
CONDITION306: // @@@ begin of alternative
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
if (javadummy) break CONDITION306;
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
if (javadummy) break CONDITION306;
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
   if (javadummy) break  CONDITION306;
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
if (javadummy) break CONDITION306;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST304;
// $$$$$$$$ 
} // CONDITION306 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=304 N=303
if (javadummy) break CONDITION303;
} // CONDLIST304 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION303
// failed:
return false;
}


public static void Semantics(JavaNode n)
{
}
}
