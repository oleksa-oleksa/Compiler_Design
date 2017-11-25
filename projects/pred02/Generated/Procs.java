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
tst_isOdd
(
new JavaIntValue(3)
,
new JavaStringValue( "succ" )
);
Procs.
tst_isOdd
(
new JavaIntValue(6)
,
new JavaStringValue( "fail" )
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
Procs.
tst_nrOfEvenElems
(
LIST1
,
new JavaIntValue(1)
);
Procs.
tst_nrOfEvenElems
(
LIST2
,
new JavaIntValue(3)
);
Procs.
tst_nrOfEvenElems
(
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
,
new JavaIntValue(0)
);
Procs.
tst_nrOfOddElems
(
LIST1
,
new JavaIntValue(6)
);
Procs.
tst_nrOfOddElems
(
LIST2
,
new JavaIntValue(4)
);
Procs.
tst_nrOfOddElems
(
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
,
new JavaIntValue(0)
);
if (! JavaLib.rtsTestDefined(NrOfTests,"/line,offset,length,file=/ 176 7275 9 prob01.g"))
if (javadummy) break CONDITION2;
{
JavaNode current0 = NrOfTests;
//assign current0 to T --- JJ.M4
T = current0 ;
};
if (! JavaLib.rtsTestDefined(NrOfFailures,"/line,offset,length,file=/ 177 7302 12 prob01.g"))
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
// DECLARE for proc k
JavaNode k = null;
// DECLARE for proc n
JavaNode n = null;
CONDITION45:
while(javadummy) {
// ***** begin condlist 46 (in cond 45) *****
CONDLIST46: // @@@ begin of alternative group
while(javadummy) {
CONDITION47: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to n --- JJ.M4
n = current0 ;
};
Procs.
mod
(
n
,
new JavaIntValue(2)
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to k --- JJ.M4
k = current0 ;
}
{
if (! JavaLib.rtsEqualInt(
k
,
new JavaIntValue(0)
)
)
   if (javadummy) break  CONDITION47;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST46;
// $$$$$$$$ 
} // CONDITION47 // @@@ end of alternative
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
void
mod(

JavaNode yy_inparam_0
,

JavaNode yy_inparam_1
)
{
JavaNode yy_outparam_0 = null;
// DECLARE for proc b
JavaNode b = null;
// DECLARE for proc a
JavaNode a = null;
CONDITION48:
while(javadummy) {
// ***** begin condlist 49 (in cond 48) *****
CONDLIST49: // @@@ begin of alternative group
while(javadummy) {
CONDITION50: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative k
JavaNode k= null;
{
JavaNode current0 = yy_inparam_0;
//assign current0 to a --- JJ.M4
a = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to b --- JJ.M4
b = current0 ;
};
{
if (! JavaLib.rtsLessInt(
a
,
new JavaIntValue(0)
)
)
   if (javadummy) break  CONDITION50;
};
{
if (! JavaLib.rtsGreaterOrEqualInt(
b
,
a
)
)
   if (javadummy) break  CONDITION50;
};
Procs.
mod
(
JavaLib.Plus(
a
,
b
)
,
b
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to k --- JJ.M4
k = current0 ;
}
yy_outparam_0 = 
k
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST49;
// $$$$$$$$ 
} // CONDITION50 // @@@ end of alternative
CONDITION51: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative k
JavaNode k= null;
{
JavaNode current0 = yy_inparam_0;
//assign current0 to a --- JJ.M4
a = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to b --- JJ.M4
b = current0 ;
};
{
if (! JavaLib.rtsGreaterOrEqualInt(
a
,
b
)
)
   if (javadummy) break  CONDITION51;
};
Procs.
mod
(
JavaLib.Minus(
a
,
b
)
,
b
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to k --- JJ.M4
k = current0 ;
}
yy_outparam_0 = 
k
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST49;
// $$$$$$$$ 
} // CONDITION51 // @@@ end of alternative
CONDITION52: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to a --- JJ.M4
a = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
//assign current0 to b --- JJ.M4
b = current0 ;
};
yy_outparam_0 = 
a
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST49;
// $$$$$$$$ 
} // CONDITION52 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=49 N=48
if (javadummy) break CONDITION48;
} // CONDLIST49 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION48
// failed:
JavaLib.rtsAllAlternativesFailed("mod");
}



public
static
boolean
isOdd(

JavaNode yy_inparam_0
)
{
// DECLARE for proc k
JavaNode k = null;
// DECLARE for proc n
JavaNode n = null;
CONDITION53:
while(javadummy) {
// ***** begin condlist 54 (in cond 53) *****
CONDLIST54: // @@@ begin of alternative group
while(javadummy) {
CONDITION55: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to n --- JJ.M4
n = current0 ;
};
Procs.
mod
(
n
,
new JavaIntValue(2)
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to k --- JJ.M4
k = current0 ;
}
{
if (! JavaLib.rtsEqualInt(
k
,
new JavaIntValue(1)
)
)
   if (javadummy) break  CONDITION55;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST54;
// $$$$$$$$ 
} // CONDITION55 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=54 N=53
if (javadummy) break CONDITION53;
} // CONDLIST54 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION53
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
CONDITION56:
while(javadummy) {
// ***** begin condlist 57 (in cond 56) *****
CONDLIST57: // @@@ begin of alternative group
while(javadummy) {
CONDITION58: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION58;
};
yy_outparam_0 = 
new JavaIntValue(0)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST57;
// $$$$$$$$ 
} // CONDITION58 // @@@ end of alternative
CONDITION59: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative L
JavaNode L= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION59;
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
if (! 
Procs.
isEven
(
H
)
)
if (javadummy) break CONDITION59;
Procs.
nrOfEvenElems
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
new JavaIntValue(1)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST57;
// $$$$$$$$ 
} // CONDITION59 // @@@ end of alternative
CONDITION60: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative L
JavaNode L= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION60;
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
if (! 
Procs.
isOdd
(
H
)
)
if (javadummy) break CONDITION60;
Procs.
nrOfEvenElems
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
new JavaIntValue(0)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST57;
// $$$$$$$$ 
} // CONDITION60 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=57 N=56
if (javadummy) break CONDITION56;
} // CONDLIST57 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION56
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
CONDITION61:
while(javadummy) {
// ***** begin condlist 62 (in cond 61) *****
CONDLIST62: // @@@ begin of alternative group
while(javadummy) {
CONDITION63: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION63;
};
yy_outparam_0 = 
new JavaIntValue(0)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST62;
// $$$$$$$$ 
} // CONDITION63 // @@@ end of alternative
CONDITION64: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative L
JavaNode L= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION64;
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
if (! 
Procs.
isOdd
(
H
)
)
if (javadummy) break CONDITION64;
Procs.
nrOfOddElems
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
new JavaIntValue(1)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST62;
// $$$$$$$$ 
} // CONDITION64 // @@@ end of alternative
CONDITION65: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative L
JavaNode L= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION65;
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
nrOfOddElems
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
new JavaIntValue(0)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST62;
// $$$$$$$$ 
} // CONDITION65 // @@@ end of alternative
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
CONDITION66:
while(javadummy) {
// ***** begin condlist 67 (in cond 66) *****
CONDLIST67: // @@@ begin of alternative group
while(javadummy) {
CONDITION68: // @@@ begin of alternative
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
if (javadummy) break CONDLIST67;
// $$$$$$$$ 
} // CONDITION68 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=67 N=66
if (javadummy) break CONDITION66;
} // CONDLIST67 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
JavaLib.yyoutvalue2 = yy_outparam_1;
if (javadummy) return;
} // CONDITION66
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
CONDITION69:
while(javadummy) {
// ***** begin condlist 70 (in cond 69) *****
CONDLIST70: // @@@ begin of alternative group
while(javadummy) {
CONDITION71: // @@@ begin of alternative
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
if (javadummy) break CONDLIST70;
// $$$$$$$$ 
} // CONDITION71 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=70 N=69
if (javadummy) break CONDITION69;
} // CONDLIST70 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
JavaLib.yyoutvalue2 = yy_outparam_1;
if (javadummy) return;
} // CONDITION69
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
CONDITION72:
while(javadummy) {
// ***** begin condlist 73 (in cond 72) *****
CONDLIST73: // @@@ begin of alternative group
while(javadummy) {
CONDITION74: // @@@ begin of alternative
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
if (javadummy) break CONDLIST73;
// $$$$$$$$ 
} // CONDITION74 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=73 N=72
if (javadummy) break CONDITION72;
} // CONDLIST73 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION72
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
CONDITION75:
while(javadummy) {
// ***** begin condlist 76 (in cond 75) *****
CONDLIST76: // @@@ begin of alternative group
while(javadummy) {
CONDITION77: // @@@ begin of alternative
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
if (javadummy) break CONDLIST76;
// $$$$$$$$ 
} // CONDITION77 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=76 N=75
if (javadummy) break CONDITION75;
} // CONDLIST76 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION75
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
CONDITION78:
while(javadummy) {
// ***** begin condlist 79 (in cond 78) *****
CONDLIST79: // @@@ begin of alternative group
while(javadummy) {
CONDITION80: // @@@ begin of alternative
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
if (javadummy) break CONDLIST79;
// $$$$$$$$ 
} // CONDITION80 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=79 N=78
if (javadummy) break CONDITION78;
} // CONDLIST79 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
JavaLib.yyoutvalue2 = yy_outparam_1;
if (javadummy) return;
} // CONDITION78
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
CONDITION81:
while(javadummy) {
// ***** begin condlist 82 (in cond 81) *****
CONDLIST82: // @@@ begin of alternative group
while(javadummy) {
CONDITION83: // @@@ begin of alternative
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
if (javadummy) break CONDLIST82;
// $$$$$$$$ 
} // CONDITION83 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=82 N=81
if (javadummy) break CONDITION81;
} // CONDLIST82 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION81
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
CONDITION84:
while(javadummy) {
// ***** begin condlist 85 (in cond 84) *****
CONDLIST85: // @@@ begin of alternative group
while(javadummy) {
CONDITION86: // @@@ begin of alternative
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
if (javadummy) break CONDLIST85;
// $$$$$$$$ 
} // CONDITION86 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=85 N=84
if (javadummy) break CONDITION84;
} // CONDLIST85 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION84
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
CONDITION87:
while(javadummy) {
// ***** begin condlist 88 (in cond 87) *****
CONDLIST88: // @@@ begin of alternative group
while(javadummy) {
CONDITION89: // @@@ begin of alternative
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
if (javadummy) break CONDITION89;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to N --- JJ.M4
N = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "NilOf-int")
if (javadummy) break CONDITION89;
} //)) children level 1
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST88;
// $$$$$$$$ 
} // CONDITION89 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=88 N=87
if (javadummy) break CONDITION87;
} // CONDLIST88 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION87
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
CONDITION90:
while(javadummy) {
// ***** begin condlist 91 (in cond 90) *****
CONDLIST91: // @@@ begin of alternative group
while(javadummy) {
CONDITION92: // @@@ begin of alternative
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
if (javadummy) break CONDITION92;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to N --- JJ.M4
N = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "NilOf-int")
if (javadummy) break CONDITION92;
} //)) children level 1
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST91;
// $$$$$$$$ 
} // CONDITION92 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=91 N=90
if (javadummy) break CONDITION90;
} // CONDLIST91 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION90
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
CONDITION93:
while(javadummy) {
// ***** begin condlist 94 (in cond 93) *****
CONDLIST94: // @@@ begin of alternative group
while(javadummy) {
CONDITION95: // @@@ begin of alternative
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
if (javadummy) break CONDITION95;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to N --- JJ.M4
N = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "NilOf-int")
if (javadummy) break CONDITION95;
} //)) children level 1
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST94;
// $$$$$$$$ 
} // CONDITION95 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=94 N=93
if (javadummy) break CONDITION93;
} // CONDLIST94 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION93
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
CONDITION96:
while(javadummy) {
// ***** begin condlist 97 (in cond 96) *****
CONDLIST97: // @@@ begin of alternative group
while(javadummy) {
CONDITION98: // @@@ begin of alternative
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
if (javadummy) break CONDITION98;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to N --- JJ.M4
N = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "NilOf-int")
if (javadummy) break CONDITION98;
} //)) children level 1
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST97;
// $$$$$$$$ 
} // CONDITION98 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=97 N=96
if (javadummy) break CONDITION96;
} // CONDLIST97 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION96
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
CONDITION99:
while(javadummy) {
// ***** begin condlist 100 (in cond 99) *****
CONDLIST100: // @@@ begin of alternative group
while(javadummy) {
CONDITION101: // @@@ begin of alternative
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
if (javadummy) break CONDITION101;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to N --- JJ.M4
N = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "NilOf-int")
if (javadummy) break CONDITION101;
} //)) children level 1
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST100;
// $$$$$$$$ 
} // CONDITION101 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=100 N=99
if (javadummy) break CONDITION99;
} // CONDLIST100 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION99
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
CONDITION102:
while(javadummy) {
// ***** begin condlist 103 (in cond 102) *****
CONDLIST103: // @@@ begin of alternative group
while(javadummy) {
CONDITION104: // @@@ begin of alternative
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
if (javadummy) break CONDITION104;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST103;
// $$$$$$$$ 
} // CONDITION104 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=103 N=102
if (javadummy) break CONDITION102;
} // CONDLIST103 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION102
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
CONDITION105:
while(javadummy) {
// ***** begin condlist 106 (in cond 105) *****
CONDLIST106: // @@@ begin of alternative group
while(javadummy) {
CONDITION107: // @@@ begin of alternative
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
if (javadummy) break CONDLIST106;
// $$$$$$$$ 
} // CONDITION107 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=106 N=105
if (javadummy) break CONDITION105;
} // CONDLIST106 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION105
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
CONDITION108:
while(javadummy) {
// ***** begin condlist 109 (in cond 108) *****
CONDLIST109: // @@@ begin of alternative group
while(javadummy) {
CONDITION110: // @@@ begin of alternative
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
if (javadummy) break CONDLIST109;
// $$$$$$$$ 
} // CONDITION110 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=109 N=108
if (javadummy) break CONDITION108;
} // CONDLIST109 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION108
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
CONDITION111:
while(javadummy) {
// ***** begin condlist 112 (in cond 111) *****
CONDLIST112: // @@@ begin of alternative group
while(javadummy) {
CONDITION113: // @@@ begin of alternative
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
if (javadummy) break CONDLIST112;
// $$$$$$$$ 
} // CONDITION113 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=112 N=111
if (javadummy) break CONDITION111;
} // CONDLIST112 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION111
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
CONDITION114:
while(javadummy) {
// ***** begin condlist 115 (in cond 114) *****
CONDLIST115: // @@@ begin of alternative group
while(javadummy) {
CONDITION116: // @@@ begin of alternative
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
if (javadummy) break CONDLIST115;
// $$$$$$$$ 
} // CONDITION116 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=115 N=114
if (javadummy) break CONDITION114;
} // CONDLIST115 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION114
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
CONDITION117:
while(javadummy) {
// ***** begin condlist 118 (in cond 117) *****
CONDLIST118: // @@@ begin of alternative group
while(javadummy) {
CONDITION119: // @@@ begin of alternative
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
if (javadummy) break CONDLIST118;
// $$$$$$$$ 
} // CONDITION119 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=118 N=117
if (javadummy) break CONDITION117;
} // CONDLIST118 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION117
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
CONDITION120:
while(javadummy) {
// ***** begin condlist 121 (in cond 120) *****
CONDLIST121: // @@@ begin of alternative group
while(javadummy) {
CONDITION122: // @@@ begin of alternative
while(javadummy) {
NrOfTests=
new JavaIntValue(0)
;
NrOfFailures=
new JavaIntValue(0)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST121;
// $$$$$$$$ 
} // CONDITION122 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=121 N=120
if (javadummy) break CONDITION120;
} // CONDLIST121 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION120
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
CONDITION123:
while(javadummy) {
// ***** begin condlist 124 (in cond 123) *****
CONDLIST124: // @@@ begin of alternative group
while(javadummy) {
CONDITION125: // @@@ begin of alternative
while(javadummy) {
if (! JavaLib.rtsTestDefined(NrOfTests,"/line,offset,length,file=/ 437 18285 9 prob01.g"))
if (javadummy) break CONDITION125;
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
if (javadummy) break CONDLIST124;
// $$$$$$$$ 
} // CONDITION125 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=124 N=123
if (javadummy) break CONDITION123;
} // CONDLIST124 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION123
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
CONDITION126:
while(javadummy) {
// ***** begin condlist 127 (in cond 126) *****
CONDLIST127: // @@@ begin of alternative group
while(javadummy) {
CONDITION128: // @@@ begin of alternative
while(javadummy) {
if (! JavaLib.rtsTestDefined(NrOfFailures,"/line,offset,length,file=/ 442 18385 12 prob01.g"))
if (javadummy) break CONDITION128;
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
if (javadummy) break CONDLIST127;
// $$$$$$$$ 
} // CONDITION128 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=127 N=126
if (javadummy) break CONDITION126;
} // CONDLIST127 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION126
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
CONDITION129:
while(javadummy) {
// ***** begin condlist 130 (in cond 129) *****
CONDLIST130: // @@@ begin of alternative group
while(javadummy) {
CONDITION131: // @@@ begin of alternative
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
if (javadummy) break CONDLIST130;
// $$$$$$$$ 
} // CONDITION131 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=130 N=129
if (javadummy) break CONDITION129;
} // CONDLIST130 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION129
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
CONDITION132:
while(javadummy) {
// ***** begin condlist 133 (in cond 132) *****
CONDLIST133: // @@@ begin of alternative group
while(javadummy) {
CONDITION134: // @@@ begin of alternative
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
if (javadummy) break CONDLIST133;
// $$$$$$$$ 
} // CONDITION134 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=133 N=132
if (javadummy) break CONDITION132;
} // CONDLIST133 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION132
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
CONDITION135:
while(javadummy) {
// ***** begin condlist 136 (in cond 135) *****
CONDLIST136: // @@@ begin of alternative group
while(javadummy) {
CONDITION137: // @@@ begin of alternative
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
if (javadummy) break CONDLIST136;
// $$$$$$$$ 
} // CONDITION137 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=136 N=135
if (javadummy) break CONDITION135;
} // CONDLIST136 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION135
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
CONDITION138:
while(javadummy) {
// ***** begin condlist 139 (in cond 138) *****
CONDLIST139: // @@@ begin of alternative group
while(javadummy) {
CONDITION140: // @@@ begin of alternative
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
if (javadummy) break CONDLIST139;
// $$$$$$$$ 
} // CONDITION140 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=139 N=138
if (javadummy) break CONDITION138;
} // CONDLIST139 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION138
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
CONDITION141:
while(javadummy) {
// ***** begin condlist 142 (in cond 141) *****
CONDLIST142: // @@@ begin of alternative group
while(javadummy) {
CONDITION143: // @@@ begin of alternative
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
if (javadummy) break CONDLIST142;
// $$$$$$$$ 
} // CONDITION143 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=142 N=141
if (javadummy) break CONDITION141;
} // CONDLIST142 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION141
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
CONDITION144:
while(javadummy) {
// ***** begin condlist 145 (in cond 144) *****
CONDLIST145: // @@@ begin of alternative group
while(javadummy) {
CONDITION146: // @@@ begin of alternative
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
if (javadummy) break CONDLIST145;
// $$$$$$$$ 
} // CONDITION146 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=145 N=144
if (javadummy) break CONDITION144;
} // CONDLIST145 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION144
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
CONDITION147:
while(javadummy) {
// ***** begin condlist 148 (in cond 147) *****
CONDLIST148: // @@@ begin of alternative group
while(javadummy) {
CONDITION149: // @@@ begin of alternative
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
if (javadummy) break CONDLIST148;
// $$$$$$$$ 
} // CONDITION149 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=148 N=147
if (javadummy) break CONDITION147;
} // CONDLIST148 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION147
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
CONDITION150:
while(javadummy) {
// ***** begin condlist 151 (in cond 150) *****
CONDLIST151: // @@@ begin of alternative group
while(javadummy) {
CONDITION152: // @@@ begin of alternative
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
if (javadummy) break CONDLIST151;
// $$$$$$$$ 
} // CONDITION152 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=151 N=150
if (javadummy) break CONDITION150;
} // CONDLIST151 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION150
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
CONDITION153:
while(javadummy) {
// ***** begin condlist 154 (in cond 153) *****
CONDLIST154: // @@@ begin of alternative group
while(javadummy) {
CONDITION155: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION155;
};
Procs.
incTests
(
);
// ***** begin condlist 156 (in cond 155) *****
CONDLIST156: // @@@ begin of alternative group
while(javadummy) {
CONDITION157: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isEven
(
IN1
)
)
if (javadummy) break CONDITION157;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST156;
// $$$$$$$$ 
} // CONDITION157 // @@@ end of alternative
CONDITION158: // @@@ begin of alternative
while(javadummy) {
Procs.
ermI
(
new JavaStringValue( "isEven failed" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST156;
// $$$$$$$$ 
} // CONDITION158 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=156 N=155
if (javadummy) break CONDITION155;
} // CONDLIST156 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST154;
// $$$$$$$$ 
} // CONDITION155 // @@@ end of alternative
CONDITION159: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION159;
};
Procs.
incTests
(
);
// ***** begin condlist 160 (in cond 159) *****
CONDLIST160: // @@@ begin of alternative group
while(javadummy) {
CONDITION161: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isEven
(
IN1
)
)
if (javadummy) break CONDITION161;
Procs.
ermI
(
new JavaStringValue( "isEven succeeded" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST160;
// $$$$$$$$ 
} // CONDITION161 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=160 N=159
if (javadummy) break CONDLIST160;
} // CONDLIST160 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST154;
// $$$$$$$$ 
} // CONDITION159 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=154 N=153
if (javadummy) break CONDITION153;
} // CONDLIST154 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION153
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
CONDITION162:
while(javadummy) {
// ***** begin condlist 163 (in cond 162) *****
CONDLIST163: // @@@ begin of alternative group
while(javadummy) {
CONDITION164: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION164;
};
Procs.
incTests
(
);
// ***** begin condlist 165 (in cond 164) *****
CONDLIST165: // @@@ begin of alternative group
while(javadummy) {
CONDITION166: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isOdd
(
IN1
)
)
if (javadummy) break CONDITION166;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST165;
// $$$$$$$$ 
} // CONDITION166 // @@@ end of alternative
CONDITION167: // @@@ begin of alternative
while(javadummy) {
Procs.
ermI
(
new JavaStringValue( "isOdd failed" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST165;
// $$$$$$$$ 
} // CONDITION167 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=165 N=164
if (javadummy) break CONDITION164;
} // CONDLIST165 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST163;
// $$$$$$$$ 
} // CONDITION164 // @@@ end of alternative
CONDITION168: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION168;
};
Procs.
incTests
(
);
// ***** begin condlist 169 (in cond 168) *****
CONDLIST169: // @@@ begin of alternative group
while(javadummy) {
CONDITION170: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isOdd
(
IN1
)
)
if (javadummy) break CONDITION170;
Procs.
ermI
(
new JavaStringValue( "isOdd succeeded" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST169;
// $$$$$$$$ 
} // CONDITION170 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=169 N=168
if (javadummy) break CONDLIST169;
} // CONDLIST169 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST163;
// $$$$$$$$ 
} // CONDITION168 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=163 N=162
if (javadummy) break CONDITION162;
} // CONDLIST163 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION162
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
CONDITION171:
while(javadummy) {
// ***** begin condlist 172 (in cond 171) *****
CONDLIST172: // @@@ begin of alternative group
while(javadummy) {
CONDITION173: // @@@ begin of alternative
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
if (javadummy) break CONDLIST172;
// $$$$$$$$ 
} // CONDITION173 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=172 N=171
if (javadummy) break CONDITION171;
} // CONDLIST172 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION171
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
CONDITION174:
while(javadummy) {
// ***** begin condlist 175 (in cond 174) *****
CONDLIST175: // @@@ begin of alternative group
while(javadummy) {
CONDITION176: // @@@ begin of alternative
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
if (javadummy) break CONDLIST175;
// $$$$$$$$ 
} // CONDITION176 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=175 N=174
if (javadummy) break CONDITION174;
} // CONDLIST175 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION174
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
CONDITION177:
while(javadummy) {
// ***** begin condlist 178 (in cond 177) *****
CONDLIST178: // @@@ begin of alternative group
while(javadummy) {
CONDITION179: // @@@ begin of alternative
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
if (javadummy) break CONDLIST178;
// $$$$$$$$ 
} // CONDITION179 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=178 N=177
if (javadummy) break CONDITION177;
} // CONDLIST178 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION177
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
CONDITION180:
while(javadummy) {
// ***** begin condlist 181 (in cond 180) *****
CONDLIST181: // @@@ begin of alternative group
while(javadummy) {
CONDITION182: // @@@ begin of alternative
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
if (javadummy) break CONDLIST181;
// $$$$$$$$ 
} // CONDITION182 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=181 N=180
if (javadummy) break CONDITION180;
} // CONDLIST181 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION180
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
CONDITION183:
while(javadummy) {
// ***** begin condlist 184 (in cond 183) *****
CONDLIST184: // @@@ begin of alternative group
while(javadummy) {
CONDITION185: // @@@ begin of alternative
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
if (javadummy) break CONDLIST184;
// $$$$$$$$ 
} // CONDITION185 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=184 N=183
if (javadummy) break CONDITION183;
} // CONDLIST184 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION183
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
CONDITION186:
while(javadummy) {
// ***** begin condlist 187 (in cond 186) *****
CONDLIST187: // @@@ begin of alternative group
while(javadummy) {
CONDITION188: // @@@ begin of alternative
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
if (javadummy) break CONDLIST187;
// $$$$$$$$ 
} // CONDITION188 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=187 N=186
if (javadummy) break CONDITION186;
} // CONDLIST187 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION186
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
CONDITION189:
while(javadummy) {
// ***** begin condlist 190 (in cond 189) *****
CONDLIST190: // @@@ begin of alternative group
while(javadummy) {
CONDITION191: // @@@ begin of alternative
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
if (javadummy) break CONDLIST190;
// $$$$$$$$ 
} // CONDITION191 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=190 N=189
if (javadummy) break CONDITION189;
} // CONDLIST190 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION189
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
CONDITION192:
while(javadummy) {
// ***** begin condlist 193 (in cond 192) *****
CONDLIST193: // @@@ begin of alternative group
while(javadummy) {
CONDITION194: // @@@ begin of alternative
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
if (javadummy) break CONDLIST193;
// $$$$$$$$ 
} // CONDITION194 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=193 N=192
if (javadummy) break CONDITION192;
} // CONDLIST193 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION192
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
CONDITION195:
while(javadummy) {
// ***** begin condlist 196 (in cond 195) *****
CONDLIST196: // @@@ begin of alternative group
while(javadummy) {
CONDITION197: // @@@ begin of alternative
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
if (javadummy) break CONDLIST196;
// $$$$$$$$ 
} // CONDITION197 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=196 N=195
if (javadummy) break CONDITION195;
} // CONDLIST196 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION195
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
CONDITION198:
while(javadummy) {
// ***** begin condlist 199 (in cond 198) *****
CONDLIST199: // @@@ begin of alternative group
while(javadummy) {
CONDITION200: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION200;
};
Procs.
incTests
(
);
// ***** begin condlist 201 (in cond 200) *****
CONDLIST201: // @@@ begin of alternative group
while(javadummy) {
CONDITION202: // @@@ begin of alternative
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
if (javadummy) break CONDITION202;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST201;
// $$$$$$$$ 
} // CONDITION202 // @@@ end of alternative
CONDITION203: // @@@ begin of alternative
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
if (javadummy) break CONDLIST201;
// $$$$$$$$ 
} // CONDITION203 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=201 N=200
if (javadummy) break CONDITION200;
} // CONDLIST201 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST199;
// $$$$$$$$ 
} // CONDITION200 // @@@ end of alternative
CONDITION204: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION204;
};
Procs.
incTests
(
);
// ***** begin condlist 205 (in cond 204) *****
CONDLIST205: // @@@ begin of alternative group
while(javadummy) {
CONDITION206: // @@@ begin of alternative
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
if (javadummy) break CONDITION206;
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
if (javadummy) break CONDLIST205;
// $$$$$$$$ 
} // CONDITION206 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=205 N=204
if (javadummy) break CONDLIST205;
} // CONDLIST205 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST199;
// $$$$$$$$ 
} // CONDITION204 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=199 N=198
if (javadummy) break CONDITION198;
} // CONDLIST199 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION198
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
CONDITION207:
while(javadummy) {
// ***** begin condlist 208 (in cond 207) *****
CONDLIST208: // @@@ begin of alternative group
while(javadummy) {
CONDITION209: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION209;
};
Procs.
incTests
(
);
// ***** begin condlist 210 (in cond 209) *****
CONDLIST210: // @@@ begin of alternative group
while(javadummy) {
CONDITION211: // @@@ begin of alternative
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
if (javadummy) break CONDITION211;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST210;
// $$$$$$$$ 
} // CONDITION211 // @@@ end of alternative
CONDITION212: // @@@ begin of alternative
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
if (javadummy) break CONDLIST210;
// $$$$$$$$ 
} // CONDITION212 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=210 N=209
if (javadummy) break CONDITION209;
} // CONDLIST210 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST208;
// $$$$$$$$ 
} // CONDITION209 // @@@ end of alternative
CONDITION213: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION213;
};
Procs.
incTests
(
);
// ***** begin condlist 214 (in cond 213) *****
CONDLIST214: // @@@ begin of alternative group
while(javadummy) {
CONDITION215: // @@@ begin of alternative
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
if (javadummy) break CONDITION215;
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
if (javadummy) break CONDLIST214;
// $$$$$$$$ 
} // CONDITION215 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=214 N=213
if (javadummy) break CONDLIST214;
} // CONDLIST214 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST208;
// $$$$$$$$ 
} // CONDITION213 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=208 N=207
if (javadummy) break CONDITION207;
} // CONDLIST208 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION207
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
CONDITION216:
while(javadummy) {
// ***** begin condlist 217 (in cond 216) *****
CONDLIST217: // @@@ begin of alternative group
while(javadummy) {
CONDITION218: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION218;
};
Procs.
incTests
(
);
// ***** begin condlist 219 (in cond 218) *****
CONDLIST219: // @@@ begin of alternative group
while(javadummy) {
CONDITION220: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
containsEqualElems
(
IN1
)
)
if (javadummy) break CONDITION220;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST219;
// $$$$$$$$ 
} // CONDITION220 // @@@ end of alternative
CONDITION221: // @@@ begin of alternative
while(javadummy) {
Procs.
ermL
(
new JavaStringValue( "containsEqualElems failed" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST219;
// $$$$$$$$ 
} // CONDITION221 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=219 N=218
if (javadummy) break CONDITION218;
} // CONDLIST219 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST217;
// $$$$$$$$ 
} // CONDITION218 // @@@ end of alternative
CONDITION222: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION222;
};
Procs.
incTests
(
);
// ***** begin condlist 223 (in cond 222) *****
CONDLIST223: // @@@ begin of alternative group
while(javadummy) {
CONDITION224: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
containsEqualElems
(
IN1
)
)
if (javadummy) break CONDITION224;
Procs.
ermL
(
new JavaStringValue( "containsEqualElems succeeded" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST223;
// $$$$$$$$ 
} // CONDITION224 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=223 N=222
if (javadummy) break CONDLIST223;
} // CONDLIST223 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST217;
// $$$$$$$$ 
} // CONDITION222 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=217 N=216
if (javadummy) break CONDITION216;
} // CONDLIST217 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION216
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
CONDITION225:
while(javadummy) {
// ***** begin condlist 226 (in cond 225) *****
CONDLIST226: // @@@ begin of alternative group
while(javadummy) {
CONDITION227: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION227;
};
Procs.
incTests
(
);
// ***** begin condlist 228 (in cond 227) *****
CONDLIST228: // @@@ begin of alternative group
while(javadummy) {
CONDITION229: // @@@ begin of alternative
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
if (javadummy) break CONDITION229;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST228;
// $$$$$$$$ 
} // CONDITION229 // @@@ end of alternative
CONDITION230: // @@@ begin of alternative
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
if (javadummy) break CONDLIST228;
// $$$$$$$$ 
} // CONDITION230 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=228 N=227
if (javadummy) break CONDITION227;
} // CONDLIST228 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST226;
// $$$$$$$$ 
} // CONDITION227 // @@@ end of alternative
CONDITION231: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION231;
};
Procs.
incTests
(
);
// ***** begin condlist 232 (in cond 231) *****
CONDLIST232: // @@@ begin of alternative group
while(javadummy) {
CONDITION233: // @@@ begin of alternative
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
if (javadummy) break CONDITION233;
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
if (javadummy) break CONDLIST232;
// $$$$$$$$ 
} // CONDITION233 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=232 N=231
if (javadummy) break CONDLIST232;
} // CONDLIST232 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST226;
// $$$$$$$$ 
} // CONDITION231 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=226 N=225
if (javadummy) break CONDITION225;
} // CONDLIST226 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION225
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
CONDITION234:
while(javadummy) {
// ***** begin condlist 235 (in cond 234) *****
CONDLIST235: // @@@ begin of alternative group
while(javadummy) {
CONDITION236: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION236;
};
Procs.
incTests
(
);
// ***** begin condlist 237 (in cond 236) *****
CONDLIST237: // @@@ begin of alternative group
while(javadummy) {
CONDITION238: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isSortedAscending
(
IN1
)
)
if (javadummy) break CONDITION238;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST237;
// $$$$$$$$ 
} // CONDITION238 // @@@ end of alternative
CONDITION239: // @@@ begin of alternative
while(javadummy) {
Procs.
ermL
(
new JavaStringValue( "isSortedAscending failed" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST237;
// $$$$$$$$ 
} // CONDITION239 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=237 N=236
if (javadummy) break CONDITION236;
} // CONDLIST237 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST235;
// $$$$$$$$ 
} // CONDITION236 // @@@ end of alternative
CONDITION240: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION240;
};
Procs.
incTests
(
);
// ***** begin condlist 241 (in cond 240) *****
CONDLIST241: // @@@ begin of alternative group
while(javadummy) {
CONDITION242: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isSortedAscending
(
IN1
)
)
if (javadummy) break CONDITION242;
Procs.
ermL
(
new JavaStringValue( "isSortedAscending succeeded" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST241;
// $$$$$$$$ 
} // CONDITION242 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=241 N=240
if (javadummy) break CONDLIST241;
} // CONDLIST241 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST235;
// $$$$$$$$ 
} // CONDITION240 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=235 N=234
if (javadummy) break CONDITION234;
} // CONDLIST235 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION234
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
CONDITION243:
while(javadummy) {
// ***** begin condlist 244 (in cond 243) *****
CONDLIST244: // @@@ begin of alternative group
while(javadummy) {
CONDITION245: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION245;
};
Procs.
incTests
(
);
// ***** begin condlist 246 (in cond 245) *****
CONDLIST246: // @@@ begin of alternative group
while(javadummy) {
CONDITION247: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isSortedDescending
(
IN1
)
)
if (javadummy) break CONDITION247;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST246;
// $$$$$$$$ 
} // CONDITION247 // @@@ end of alternative
CONDITION248: // @@@ begin of alternative
while(javadummy) {
Procs.
ermL
(
new JavaStringValue( "isSortedDescending failed" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST246;
// $$$$$$$$ 
} // CONDITION248 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=246 N=245
if (javadummy) break CONDITION245;
} // CONDLIST246 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST244;
// $$$$$$$$ 
} // CONDITION245 // @@@ end of alternative
CONDITION249: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION249;
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
if (! 
Procs.
isSortedDescending
(
IN1
)
)
if (javadummy) break CONDITION251;
Procs.
ermL
(
new JavaStringValue( "isSortedDescending succeeded" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST250;
// $$$$$$$$ 
} // CONDITION251 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=250 N=249
if (javadummy) break CONDLIST250;
} // CONDLIST250 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST244;
// $$$$$$$$ 
} // CONDITION249 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=244 N=243
if (javadummy) break CONDITION243;
} // CONDLIST244 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION243
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
CONDITION252:
while(javadummy) {
// ***** begin condlist 253 (in cond 252) *****
CONDLIST253: // @@@ begin of alternative group
while(javadummy) {
CONDITION254: // @@@ begin of alternative
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
if (javadummy) break CONDLIST253;
// $$$$$$$$ 
} // CONDITION254 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=253 N=252
if (javadummy) break CONDITION252;
} // CONDLIST253 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION252
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
CONDITION255:
while(javadummy) {
// ***** begin condlist 256 (in cond 255) *****
CONDLIST256: // @@@ begin of alternative group
while(javadummy) {
CONDITION257: // @@@ begin of alternative
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
if (javadummy) break CONDLIST256;
// $$$$$$$$ 
} // CONDITION257 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=256 N=255
if (javadummy) break CONDITION255;
} // CONDLIST256 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION255
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
CONDITION258:
while(javadummy) {
// ***** begin condlist 259 (in cond 258) *****
CONDLIST259: // @@@ begin of alternative group
while(javadummy) {
CONDITION260: // @@@ begin of alternative
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
if (javadummy) break CONDLIST259;
// $$$$$$$$ 
} // CONDITION260 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=259 N=258
if (javadummy) break CONDITION258;
} // CONDLIST259 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION258
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
CONDITION261:
while(javadummy) {
// ***** begin condlist 262 (in cond 261) *****
CONDLIST262: // @@@ begin of alternative group
while(javadummy) {
CONDITION263: // @@@ begin of alternative
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
if (javadummy) break CONDLIST262;
// $$$$$$$$ 
} // CONDITION263 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=262 N=261
if (javadummy) break CONDITION261;
} // CONDLIST262 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION261
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
CONDITION264:
while(javadummy) {
// ***** begin condlist 265 (in cond 264) *****
CONDLIST265: // @@@ begin of alternative group
while(javadummy) {
CONDITION266: // @@@ begin of alternative
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
if (javadummy) break CONDLIST265;
// $$$$$$$$ 
} // CONDITION266 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=265 N=264
if (javadummy) break CONDITION264;
} // CONDLIST265 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION264
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
CONDITION267:
while(javadummy) {
// ***** begin condlist 268 (in cond 267) *****
CONDLIST268: // @@@ begin of alternative group
while(javadummy) {
CONDITION269: // @@@ begin of alternative
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
// ***** begin condlist 270 (in cond 269) *****
CONDLIST270: // @@@ begin of alternative group
while(javadummy) {
CONDITION271: // @@@ begin of alternative
while(javadummy) {
{
if (! JavaLib.rtsEqualInt(
EXP1
,
FND1
)
)
   if (javadummy) break  CONDITION271;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST270;
// $$$$$$$$ 
} // CONDITION271 // @@@ end of alternative
CONDITION272: // @@@ begin of alternative
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
if (javadummy) break CONDLIST270;
// $$$$$$$$ 
} // CONDITION272 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=270 N=269
if (javadummy) break CONDITION269;
} // CONDLIST270 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST268;
// $$$$$$$$ 
} // CONDITION269 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=268 N=267
if (javadummy) break CONDITION267;
} // CONDLIST268 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION267
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
CONDITION273:
while(javadummy) {
// ***** begin condlist 274 (in cond 273) *****
CONDLIST274: // @@@ begin of alternative group
while(javadummy) {
CONDITION275: // @@@ begin of alternative
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
// ***** begin condlist 276 (in cond 275) *****
CONDLIST276: // @@@ begin of alternative group
while(javadummy) {
CONDITION277: // @@@ begin of alternative
while(javadummy) {
{
if (! JavaLib.rtsEqualInt(
EXP1
,
FND1
)
)
   if (javadummy) break  CONDITION277;
};
{
if (! JavaLib.rtsEqualInt(
EXP2
,
FND2
)
)
   if (javadummy) break  CONDITION277;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST276;
// $$$$$$$$ 
} // CONDITION277 // @@@ end of alternative
CONDITION278: // @@@ begin of alternative
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
if (javadummy) break CONDLIST276;
// $$$$$$$$ 
} // CONDITION278 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=276 N=275
if (javadummy) break CONDITION275;
} // CONDLIST276 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST274;
// $$$$$$$$ 
} // CONDITION275 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=274 N=273
if (javadummy) break CONDITION273;
} // CONDLIST274 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION273
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
CONDITION279:
while(javadummy) {
// ***** begin condlist 280 (in cond 279) *****
CONDLIST280: // @@@ begin of alternative group
while(javadummy) {
CONDITION281: // @@@ begin of alternative
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
// ***** begin condlist 282 (in cond 281) *****
CONDLIST282: // @@@ begin of alternative group
while(javadummy) {
CONDITION283: // @@@ begin of alternative
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
if (javadummy) break CONDITION283;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST282;
// $$$$$$$$ 
} // CONDITION283 // @@@ end of alternative
CONDITION284: // @@@ begin of alternative
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
if (javadummy) break CONDLIST282;
// $$$$$$$$ 
} // CONDITION284 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=282 N=281
if (javadummy) break CONDITION281;
} // CONDLIST282 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST280;
// $$$$$$$$ 
} // CONDITION281 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=280 N=279
if (javadummy) break CONDITION279;
} // CONDLIST280 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION279
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
CONDITION285:
while(javadummy) {
// ***** begin condlist 286 (in cond 285) *****
CONDLIST286: // @@@ begin of alternative group
while(javadummy) {
CONDITION287: // @@@ begin of alternative
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
// ***** begin condlist 288 (in cond 287) *****
CONDLIST288: // @@@ begin of alternative group
while(javadummy) {
CONDITION289: // @@@ begin of alternative
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
if (javadummy) break CONDITION289;
if (! 
Procs.
check
(
EXP2
,
FND2
)
)
if (javadummy) break CONDITION289;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST288;
// $$$$$$$$ 
} // CONDITION289 // @@@ end of alternative
CONDITION290: // @@@ begin of alternative
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
if (javadummy) break CONDLIST288;
// $$$$$$$$ 
} // CONDITION290 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=288 N=287
if (javadummy) break CONDITION287;
} // CONDLIST288 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST286;
// $$$$$$$$ 
} // CONDITION287 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=286 N=285
if (javadummy) break CONDITION285;
} // CONDLIST286 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION285
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
CONDITION291:
while(javadummy) {
// ***** begin condlist 292 (in cond 291) *****
CONDLIST292: // @@@ begin of alternative group
while(javadummy) {
CONDITION293: // @@@ begin of alternative
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
if (javadummy) break CONDLIST292;
// $$$$$$$$ 
} // CONDITION293 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=292 N=291
if (javadummy) break CONDITION291;
} // CONDLIST292 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION291
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
CONDITION294:
while(javadummy) {
// ***** begin condlist 295 (in cond 294) *****
CONDLIST295: // @@@ begin of alternative group
while(javadummy) {
CONDITION296: // @@@ begin of alternative
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
if (javadummy) break CONDLIST295;
// $$$$$$$$ 
} // CONDITION296 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=295 N=294
if (javadummy) break CONDITION294;
} // CONDLIST295 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION294
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
CONDITION297:
while(javadummy) {
// ***** begin condlist 298 (in cond 297) *****
CONDLIST298: // @@@ begin of alternative group
while(javadummy) {
CONDITION299: // @@@ begin of alternative
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
if (javadummy) break CONDLIST298;
// $$$$$$$$ 
} // CONDITION299 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=298 N=297
if (javadummy) break CONDITION297;
} // CONDLIST298 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION297
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
CONDITION300:
while(javadummy) {
// ***** begin condlist 301 (in cond 300) *****
CONDLIST301: // @@@ begin of alternative group
while(javadummy) {
CONDITION302: // @@@ begin of alternative
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
if (javadummy) break CONDLIST301;
// $$$$$$$$ 
} // CONDITION302 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=301 N=300
if (javadummy) break CONDITION300;
} // CONDLIST301 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION300
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
JavaLib.rtsEmitCode
("int[]\n");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST304;
// $$$$$$$$ 
} // CONDITION305 // @@@ end of alternative
CONDITION306: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION306;
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
if (javadummy) break CONDLIST304;
// $$$$$$$$ 
} // CONDITION306 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=304 N=303
if (javadummy) break CONDITION303;
} // CONDLIST304 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION303
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
CONDITION307:
while(javadummy) {
// ***** begin condlist 308 (in cond 307) *****
CONDLIST308: // @@@ begin of alternative group
while(javadummy) {
CONDITION309: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION309;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST308;
// $$$$$$$$ 
} // CONDITION309 // @@@ end of alternative
CONDITION310: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION310;
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
if (javadummy) break CONDLIST308;
// $$$$$$$$ 
} // CONDITION310 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=308 N=307
if (javadummy) break CONDITION307;
} // CONDLIST308 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION307
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
CONDITION311:
while(javadummy) {
// ***** begin condlist 312 (in cond 311) *****
CONDLIST312: // @@@ begin of alternative group
while(javadummy) {
CONDITION313: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION313;
};
{
JavaNode current0 = yy_inparam_1;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION313;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST312;
// $$$$$$$$ 
} // CONDITION313 // @@@ end of alternative
CONDITION314: // @@@ begin of alternative
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
if (javadummy) break CONDITION314;
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
if (javadummy) break CONDITION314;
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
   if (javadummy) break  CONDITION314;
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
if (javadummy) break CONDITION314;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST312;
// $$$$$$$$ 
} // CONDITION314 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=312 N=311
if (javadummy) break CONDITION311;
} // CONDLIST312 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION311
// failed:
return false;
}


public static void Semantics(JavaNode n)
{
}
}
