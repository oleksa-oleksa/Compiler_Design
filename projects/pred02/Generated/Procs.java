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
Procs.
tst_nrsOfPosNegElems
(
LIST1
,
new JavaIntValue(3)
,
new JavaIntValue(3)
);
Procs.
tst_nrsOfPosNegElems
(
LIST2
,
new JavaIntValue(3)
,
new JavaIntValue(4)
);
Procs.
tst_nrsOfPosNegElems
(
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
,
new JavaIntValue(0)
,
new JavaIntValue(0)
);
Procs.
tst_nrsOfNegEvenElems
(
LIST1
,
new JavaIntValue(3)
,
new JavaIntValue(1)
);
Procs.
tst_nrsOfNegEvenElems
(
LIST2
,
new JavaIntValue(4)
,
new JavaIntValue(3)
);
Procs.
tst_nrsOfNegEvenElems
(
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
,
new JavaIntValue(0)
,
new JavaIntValue(0)
);
Procs.
tst_listOfPosElems
(
LIST1
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
new JavaIntValue(5)
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
);
Procs.
tst_listOfPosElems
(
LIST2
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(2)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(4)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(6)
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
);
Procs.
tst_listOfPosElems
(
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
);
Procs.
tst_listOfNegElems
(
LIST1
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
JavaLib.UnaryMinus(
new JavaIntValue(3)
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
);
Procs.
tst_listOfNegElems
(
LIST2
,
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
JavaLib.UnaryMinus(
new JavaIntValue(3)
)
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
);
Procs.
tst_listOfNegElems
(
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
);
Procs.
tst_listsOfPosNegElems
(
LIST1
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
new JavaIntValue(5)
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
JavaLib.UnaryMinus(
new JavaIntValue(3)
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
);
Procs.
tst_listsOfPosNegElems
(
LIST2
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(2)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(4)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(6)
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
,
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
JavaLib.UnaryMinus(
new JavaIntValue(3)
)
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
);
Procs.
tst_listsOfPosNegElems
(
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
);
Procs.
tst_listOfEvenElems
(
LIST1
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
);
Procs.
tst_listOfEvenElems
(
LIST2
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(2)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(4)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(6)
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
);
Procs.
tst_listOfEvenElems
(
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
);
Procs.
tst_nrOfEqualNeighbors
(
LIST1
,
new JavaIntValue(2)
);
Procs.
tst_nrOfEqualNeighbors
(
LIST2
,
new JavaIntValue(0)
);
Procs.
tst_nrOfEqualNeighbors
(
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
new JavaIntValue(5)
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
,
new JavaIntValue(1)
);
Procs.
tst_containsElem
(
LIST1
,
new JavaIntValue(0)
,
new JavaStringValue( "succ" )
);
Procs.
tst_containsElem
(
LIST2
,
new JavaIntValue(5)
,
new JavaStringValue( "fail" )
);
Procs.
tst_containsList
(
LIST1
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(5)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(0)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
JavaLib.UnaryMinus(
new JavaIntValue(3)
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
,
new JavaStringValue( "succ" )
);
Procs.
tst_containsList
(
LIST1
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(5)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(0)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(3)
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
,
new JavaStringValue( "fail" )
);
Procs.
tst_containsList
(
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(1)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(2)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
}
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
new JavaIntValue(1)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(2)
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
,
new JavaStringValue( "succ" )
);
Procs.
tst_containsEqualElems
(
LIST1
,
new JavaStringValue( "succ" )
);
Procs.
tst_containsEqualElems
(
LIST2
,
new JavaStringValue( "fail" )
);
Procs.
tst_containEqualElems
(
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(1)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(2)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(3)
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
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(3)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(1)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(2)
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
,
new JavaStringValue( "succ" )
);
Procs.
tst_containEqualElems
(
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(1)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(2)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(3)
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
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(1)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(2)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
}
)
,
new JavaStringValue( "fail" )
);
Procs.
tst_containEqualElems
(
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(1)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(2)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(2)
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
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(2)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(1)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
}
)
,
new JavaStringValue( "succ" )
);
Procs.
tst_isSortedAscending
(
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(1)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(2)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(3)
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
,
new JavaStringValue( "succ" )
);
Procs.
tst_isSortedAscending
(
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(1)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(2)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(1)
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
,
new JavaStringValue( "fail" )
);
Procs.
tst_isSortedDescending
(
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(3)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(2)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(1)
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
,
new JavaStringValue( "succ" )
);
Procs.
tst_isSortedDescending
(
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(1)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(2)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(1)
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
,
new JavaStringValue( "fail" )
);
Procs.
tst_firstElem
(
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
);
Procs.
tst_firstElem
(
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(10)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(10)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
);
Procs.
tst_firstElem
(
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(10)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(20)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(30)
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
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(10)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
);
Procs.
tst_butFirstElem
(
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
);
Procs.
tst_butFirstElem
(
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(10)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
);
Procs.
tst_butFirstElem
(
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(10)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(20)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(30)
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
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(20)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(30)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
}
)
);
Procs.
tst_lastElem
(
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
);
Procs.
tst_lastElem
(
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(10)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(10)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
);
Procs.
tst_lastElem
(
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(10)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(20)
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(30)
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
,
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
new JavaIntValue(30)
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
);
if (! JavaLib.rtsTestDefined(NrOfTests,"/line,offset,length,file=/ 176 7109 9 prob01.g"))
if (javadummy) break CONDITION2;
{
JavaNode current0 = NrOfTests;
//assign current0 to T --- JJ.M4
T = current0 ;
};
if (! JavaLib.rtsTestDefined(NrOfFailures,"/line,offset,length,file=/ 177 7136 12 prob01.g"))
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
CONDITION66:
while(javadummy) {
// ***** begin condlist 67 (in cond 66) *****
CONDLIST67: // @@@ begin of alternative group
while(javadummy) {
CONDITION68: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION68;
};
yy_outparam_0 = 
new JavaIntValue(0)
;
yy_outparam_1 = 
new JavaIntValue(0)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST67;
// $$$$$$$$ 
} // CONDITION68 // @@@ end of alternative
CONDITION69: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative K
JavaNode K= null;
// DECLARE for alternative L
JavaNode L= null;
// DECLARE for alternative m
JavaNode m= null;
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
if (javadummy) break CONDITION69;
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
isPositive
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
isNegative
(
H
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to m --- JJ.M4
m = current0 ;
}
Procs.
nrsOfPosNegElems
(
T
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to L --- JJ.M4
L = current0 ;
}
{
JavaNode current0 = 
 JavaLib.yyoutvalue2;
//assign current0 to K --- JJ.M4
K = current0 ;
}
yy_outparam_0 = 
JavaLib.Plus(
L
,
n
)
;
yy_outparam_1 = 
JavaLib.Plus(
K
,
m
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST67;
// $$$$$$$$ 
} // CONDITION69 // @@@ end of alternative
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
CONDITION70:
while(javadummy) {
// ***** begin condlist 71 (in cond 70) *****
CONDLIST71: // @@@ begin of alternative group
while(javadummy) {
CONDITION72: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION72;
};
yy_outparam_0 = 
new JavaIntValue(0)
;
yy_outparam_1 = 
new JavaIntValue(0)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST71;
// $$$$$$$$ 
} // CONDITION72 // @@@ end of alternative
CONDITION73: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative E
JavaNode E= null;
// DECLARE for alternative N
JavaNode N= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION73;
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
{
if (! JavaLib.rtsGreaterOrEqualInt(
H
,
new JavaIntValue(0)
)
)
   if (javadummy) break  CONDITION73;
};
if (! 
Procs.
isEven
(
H
)
)
if (javadummy) break CONDITION73;
Procs.
nrsOfNegEvenElems
(
T
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to N --- JJ.M4
N = current0 ;
}
{
JavaNode current0 = 
 JavaLib.yyoutvalue2;
//assign current0 to E --- JJ.M4
E = current0 ;
}
yy_outparam_0 = 
N
;
yy_outparam_1 = 
JavaLib.Plus(
E
,
new JavaIntValue(1)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST71;
// $$$$$$$$ 
} // CONDITION73 // @@@ end of alternative
CONDITION74: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative E
JavaNode E= null;
// DECLARE for alternative N
JavaNode N= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION74;
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
{
if (! JavaLib.rtsLessInt(
H
,
new JavaIntValue(0)
)
)
   if (javadummy) break  CONDITION74;
};
if (! 
Procs.
isEven
(
H
)
)
if (javadummy) break CONDITION74;
Procs.
nrsOfNegEvenElems
(
T
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to N --- JJ.M4
N = current0 ;
}
{
JavaNode current0 = 
 JavaLib.yyoutvalue2;
//assign current0 to E --- JJ.M4
E = current0 ;
}
yy_outparam_0 = 
JavaLib.Plus(
N
,
new JavaIntValue(1)
)
;
yy_outparam_1 = 
JavaLib.Plus(
E
,
new JavaIntValue(1)
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST71;
// $$$$$$$$ 
} // CONDITION74 // @@@ end of alternative
CONDITION75: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative E
JavaNode E= null;
// DECLARE for alternative N
JavaNode N= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION75;
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
{
if (! JavaLib.rtsLessInt(
H
,
new JavaIntValue(0)
)
)
   if (javadummy) break  CONDITION75;
};
Procs.
nrsOfNegEvenElems
(
T
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to N --- JJ.M4
N = current0 ;
}
{
JavaNode current0 = 
 JavaLib.yyoutvalue2;
//assign current0 to E --- JJ.M4
E = current0 ;
}
yy_outparam_0 = 
JavaLib.Plus(
N
,
new JavaIntValue(1)
)
;
yy_outparam_1 = 
E
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST71;
// $$$$$$$$ 
} // CONDITION75 // @@@ end of alternative
CONDITION76: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative E
JavaNode E= null;
// DECLARE for alternative N
JavaNode N= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION76;
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
nrsOfNegEvenElems
(
T
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to N --- JJ.M4
N = current0 ;
}
{
JavaNode current0 = 
 JavaLib.yyoutvalue2;
//assign current0 to E --- JJ.M4
E = current0 ;
}
yy_outparam_0 = 
N
;
yy_outparam_1 = 
E
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST71;
// $$$$$$$$ 
} // CONDITION76 // @@@ end of alternative
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
CONDITION77:
while(javadummy) {
// ***** begin condlist 78 (in cond 77) *****
CONDLIST78: // @@@ begin of alternative group
while(javadummy) {
CONDITION79: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION79;
};
yy_outparam_0 = 
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST78;
// $$$$$$$$ 
} // CONDITION79 // @@@ end of alternative
CONDITION80: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative R
JavaNode R= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION80;
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
{
if (! JavaLib.rtsGreaterInt(
H
,
new JavaIntValue(0)
)
)
   if (javadummy) break  CONDITION80;
};
Procs.
listOfPosElems
(
T
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to R --- JJ.M4
R = current0 ;
}
yy_outparam_0 = 
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
H
,
R
}
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST78;
// $$$$$$$$ 
} // CONDITION80 // @@@ end of alternative
CONDITION81: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative R
JavaNode R= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION81;
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
{
if (! JavaLib.rtsLessOrEqualInt(
H
,
new JavaIntValue(0)
)
)
   if (javadummy) break  CONDITION81;
};
Procs.
listOfPosElems
(
T
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to R --- JJ.M4
R = current0 ;
}
yy_outparam_0 = 
R
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST78;
// $$$$$$$$ 
} // CONDITION81 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=78 N=77
if (javadummy) break CONDITION77;
} // CONDLIST78 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION77
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
CONDITION82:
while(javadummy) {
// ***** begin condlist 83 (in cond 82) *****
CONDLIST83: // @@@ begin of alternative group
while(javadummy) {
CONDITION84: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION84;
};
yy_outparam_0 = 
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST83;
// $$$$$$$$ 
} // CONDITION84 // @@@ end of alternative
CONDITION85: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative R
JavaNode R= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION85;
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
{
if (! JavaLib.rtsGreaterInt(
new JavaIntValue(0)
,
H
)
)
   if (javadummy) break  CONDITION85;
};
Procs.
listOfNegElems
(
T
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to R --- JJ.M4
R = current0 ;
}
yy_outparam_0 = 
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
H
,
R
}
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST83;
// $$$$$$$$ 
} // CONDITION85 // @@@ end of alternative
CONDITION86: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative R
JavaNode R= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION86;
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
{
if (! JavaLib.rtsGreaterOrEqualInt(
H
,
new JavaIntValue(0)
)
)
   if (javadummy) break  CONDITION86;
};
Procs.
listOfNegElems
(
T
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to R --- JJ.M4
R = current0 ;
}
yy_outparam_0 = 
R
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST83;
// $$$$$$$$ 
} // CONDITION86 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=83 N=82
if (javadummy) break CONDITION82;
} // CONDLIST83 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION82
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
CONDITION87:
while(javadummy) {
// ***** begin condlist 88 (in cond 87) *****
CONDLIST88: // @@@ begin of alternative group
while(javadummy) {
CONDITION89: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION89;
};
yy_outparam_0 = 
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
;
yy_outparam_1 = 
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST88;
// $$$$$$$$ 
} // CONDITION89 // @@@ end of alternative
CONDITION90: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative RN
JavaNode RN= null;
// DECLARE for alternative RP
JavaNode RP= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION90;
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
{
if (! JavaLib.rtsGreaterInt(
H
,
new JavaIntValue(0)
)
)
   if (javadummy) break  CONDITION90;
};
Procs.
listsOfPosNegElems
(
T
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to RP --- JJ.M4
RP = current0 ;
}
{
JavaNode current0 = 
 JavaLib.yyoutvalue2;
//assign current0 to RN --- JJ.M4
RN = current0 ;
}
yy_outparam_0 = 
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
H
,
RP
}
)
;
yy_outparam_1 = 
RN
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST88;
// $$$$$$$$ 
} // CONDITION90 // @@@ end of alternative
CONDITION91: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative RN
JavaNode RN= null;
// DECLARE for alternative RP
JavaNode RP= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION91;
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
{
if (! JavaLib.rtsLessInt(
H
,
new JavaIntValue(0)
)
)
   if (javadummy) break  CONDITION91;
};
Procs.
listsOfPosNegElems
(
T
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to RP --- JJ.M4
RP = current0 ;
}
{
JavaNode current0 = 
 JavaLib.yyoutvalue2;
//assign current0 to RN --- JJ.M4
RN = current0 ;
}
yy_outparam_0 = 
RP
;
yy_outparam_1 = 
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
H
,
RN
}
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST88;
// $$$$$$$$ 
} // CONDITION91 // @@@ end of alternative
CONDITION92: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative RN
JavaNode RN= null;
// DECLARE for alternative RP
JavaNode RP= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION92;
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
{
if (! JavaLib.rtsEqualInt(
H
,
new JavaIntValue(0)
)
)
   if (javadummy) break  CONDITION92;
};
Procs.
listsOfPosNegElems
(
T
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to RP --- JJ.M4
RP = current0 ;
}
{
JavaNode current0 = 
 JavaLib.yyoutvalue2;
//assign current0 to RN --- JJ.M4
RN = current0 ;
}
yy_outparam_0 = 
RP
;
yy_outparam_1 = 
RN
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST88;
// $$$$$$$$ 
} // CONDITION92 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=88 N=87
if (javadummy) break CONDITION87;
} // CONDLIST88 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
JavaLib.yyoutvalue2 = yy_outparam_1;
if (javadummy) return;
} // CONDITION87
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
CONDITION93:
while(javadummy) {
// ***** begin condlist 94 (in cond 93) *****
CONDLIST94: // @@@ begin of alternative group
while(javadummy) {
CONDITION95: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION95;
};
yy_outparam_0 = 
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST94;
// $$$$$$$$ 
} // CONDITION95 // @@@ end of alternative
CONDITION96: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative R
JavaNode R= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION96;
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
if (javadummy) break CONDITION96;
Procs.
listOfEvenElems
(
T
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to R --- JJ.M4
R = current0 ;
}
yy_outparam_0 = 
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
H
,
R
}
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST94;
// $$$$$$$$ 
} // CONDITION96 // @@@ end of alternative
CONDITION97: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative R
JavaNode R= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION97;
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
listOfEvenElems
(
T
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to R --- JJ.M4
R = current0 ;
}
yy_outparam_0 = 
R
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST94;
// $$$$$$$$ 
} // CONDITION97 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=94 N=93
if (javadummy) break CONDITION93;
} // CONDLIST94 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION93
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
CONDITION98:
while(javadummy) {
// ***** begin condlist 99 (in cond 98) *****
CONDLIST99: // @@@ begin of alternative group
while(javadummy) {
CONDITION100: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION100;
};
yy_outparam_0 = 
new JavaIntValue(0)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST99;
// $$$$$$$$ 
} // CONDITION100 // @@@ end of alternative
CONDITION101: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative L
JavaNode L= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H2
JavaNode H2= null;
// DECLARE for alternative H1
JavaNode H1= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION101;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to H1 --- JJ.M4
H1 = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "SeqOf-int")
if (javadummy) break CONDITION101;
{ //(( children level 2
JavaNode current2 =
   current1 .Child1[0];
//assign current2 to H2 --- JJ.M4
H2 = current2 ;
current2 = current1.Child1[1];
//assign current2 to T --- JJ.M4
T = current2 ;
} //)) children level 2
} //)) children level 1
};
{
if (! JavaLib.rtsEqualInt(
H1
,
H2
)
)
   if (javadummy) break  CONDITION101;
};
Procs.
nrOfEqualNeighbors
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
if (javadummy) break CONDLIST99;
// $$$$$$$$ 
} // CONDITION101 // @@@ end of alternative
CONDITION102: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative L
JavaNode L= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H2
JavaNode H2= null;
// DECLARE for alternative H1
JavaNode H1= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION102;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to H1 --- JJ.M4
H1 = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "SeqOf-int")
if (javadummy) break CONDITION102;
{ //(( children level 2
JavaNode current2 =
   current1 .Child1[0];
//assign current2 to H2 --- JJ.M4
H2 = current2 ;
current2 = current1.Child1[1];
//assign current2 to T --- JJ.M4
T = current2 ;
} //)) children level 2
} //)) children level 1
};
{
if (! JavaLib.rtsUnequalInt(
H1
,
H2
)
)
   if (javadummy) break  CONDITION102;
};
Procs.
nrOfEqualNeighbors
(
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
H2
,
T
}
)
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
if (javadummy) break CONDLIST99;
// $$$$$$$$ 
} // CONDITION102 // @@@ end of alternative
CONDITION103: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION103;
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
yy_outparam_0 = 
new JavaIntValue(0)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST99;
// $$$$$$$$ 
} // CONDITION103 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=99 N=98
if (javadummy) break CONDITION98;
} // CONDLIST99 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION98
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
// DECLARE for proc E
JavaNode E = null;
// DECLARE for proc T
JavaNode T = null;
// DECLARE for proc H
JavaNode H = null;
CONDITION104:
while(javadummy) {
// ***** begin condlist 105 (in cond 104) *****
CONDLIST105: // @@@ begin of alternative group
while(javadummy) {
CONDITION106: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION106;
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
{
JavaNode current0 = yy_inparam_1;
//assign current0 to E --- JJ.M4
E = current0 ;
};
{
if (! JavaLib.rtsEqualInt(
H
,
E
)
)
   if (javadummy) break  CONDITION106;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST105;
// $$$$$$$$ 
} // CONDITION106 // @@@ end of alternative
CONDITION107: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION107;
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
{
JavaNode current0 = yy_inparam_1;
//assign current0 to E --- JJ.M4
E = current0 ;
};
{
if (! JavaLib.rtsUnequalInt(
H
,
E
)
)
   if (javadummy) break  CONDITION107;
};
if (! 
Procs.
containsElem
(
T
,
E
)
)
if (javadummy) break CONDITION107;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST105;
// $$$$$$$$ 
} // CONDITION107 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=105 N=104
if (javadummy) break CONDITION104;
} // CONDLIST105 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION104
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
// DECLARE for proc L1
JavaNode L1 = null;
CONDITION108:
while(javadummy) {
// ***** begin condlist 109 (in cond 108) *****
CONDLIST109: // @@@ begin of alternative group
while(javadummy) {
CONDITION110: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L1 --- JJ.M4
L1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION110;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST109;
// $$$$$$$$ 
} // CONDITION110 // @@@ end of alternative
CONDITION111: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
//assign current0 to L1 --- JJ.M4
L1 = current0 ;
};
{
JavaNode current0 = yy_inparam_1;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION111;
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
containsElem
(
L1
,
H
)
)
if (javadummy) break CONDITION111;
if (! 
Procs.
containsList
(
L1
,
T
)
)
if (javadummy) break CONDITION111;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST109;
// $$$$$$$$ 
} // CONDITION111 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=109 N=108
if (javadummy) break CONDITION108;
} // CONDLIST109 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION108
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
// DECLARE for proc T
JavaNode T = null;
// DECLARE for proc H
JavaNode H = null;
CONDITION112:
while(javadummy) {
// ***** begin condlist 113 (in cond 112) *****
CONDLIST113: // @@@ begin of alternative group
while(javadummy) {
CONDITION114: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION114;
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
containsElem
(
T
,
H
)
)
if (javadummy) break CONDITION114;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST113;
// $$$$$$$$ 
} // CONDITION114 // @@@ end of alternative
CONDITION115: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION115;
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
containsEqualElems
(
T
)
)
if (javadummy) break CONDITION115;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST113;
// $$$$$$$$ 
} // CONDITION115 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=113 N=112
if (javadummy) break CONDITION112;
} // CONDLIST113 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION112
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
// DECLARE for proc L2
JavaNode L2 = null;
// DECLARE for proc L1
JavaNode L1 = null;
CONDITION116:
while(javadummy) {
// ***** begin condlist 117 (in cond 116) *****
CONDLIST117: // @@@ begin of alternative group
while(javadummy) {
CONDITION118: // @@@ begin of alternative
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
if (! 
Procs.
containsList
(
L1
,
L2
)
)
if (javadummy) break CONDITION118;
if (! 
Procs.
containsList
(
L2
,
L1
)
)
if (javadummy) break CONDITION118;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST117;
// $$$$$$$$ 
} // CONDITION118 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=117 N=116
if (javadummy) break CONDITION116;
} // CONDLIST117 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION116
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
CONDITION119:
while(javadummy) {
// ***** begin condlist 120 (in cond 119) *****
CONDLIST120: // @@@ begin of alternative group
while(javadummy) {
CONDITION121: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION121;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST120;
// $$$$$$$$ 
} // CONDITION121 // @@@ end of alternative
CONDITION122: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H2
JavaNode H2= null;
// DECLARE for alternative H1
JavaNode H1= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION122;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to H1 --- JJ.M4
H1 = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "SeqOf-int")
if (javadummy) break CONDITION122;
{ //(( children level 2
JavaNode current2 =
   current1 .Child1[0];
//assign current2 to H2 --- JJ.M4
H2 = current2 ;
current2 = current1.Child1[1];
//assign current2 to T --- JJ.M4
T = current2 ;
} //)) children level 2
} //)) children level 1
};
{
if (! JavaLib.rtsLessOrEqualInt(
H1
,
H2
)
)
   if (javadummy) break  CONDITION122;
};
if (! 
Procs.
isSortedAscending
(
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
H2
,
T
}
)
)
)
if (javadummy) break CONDITION122;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST120;
// $$$$$$$$ 
} // CONDITION122 // @@@ end of alternative
CONDITION123: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative H1
JavaNode H1= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION123;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to H1 --- JJ.M4
H1 = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "NilOf-int")
if (javadummy) break CONDITION123;
} //)) children level 1
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST120;
// $$$$$$$$ 
} // CONDITION123 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=120 N=119
if (javadummy) break CONDITION119;
} // CONDLIST120 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION119
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
CONDITION124:
while(javadummy) {
// ***** begin condlist 125 (in cond 124) *****
CONDLIST125: // @@@ begin of alternative group
while(javadummy) {
CONDITION126: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION126;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST125;
// $$$$$$$$ 
} // CONDITION126 // @@@ end of alternative
CONDITION127: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H2
JavaNode H2= null;
// DECLARE for alternative H1
JavaNode H1= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION127;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to H1 --- JJ.M4
H1 = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "SeqOf-int")
if (javadummy) break CONDITION127;
{ //(( children level 2
JavaNode current2 =
   current1 .Child1[0];
//assign current2 to H2 --- JJ.M4
H2 = current2 ;
current2 = current1.Child1[1];
//assign current2 to T --- JJ.M4
T = current2 ;
} //)) children level 2
} //)) children level 1
};
{
if (! JavaLib.rtsGreaterOrEqualInt(
H1
,
H2
)
)
   if (javadummy) break  CONDITION127;
};
if (! 
Procs.
isSortedDescending
(
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
H2
,
T
}
)
)
)
if (javadummy) break CONDITION127;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST125;
// $$$$$$$$ 
} // CONDITION127 // @@@ end of alternative
CONDITION128: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative H1
JavaNode H1= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION128;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to H1 --- JJ.M4
H1 = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "NilOf-int")
if (javadummy) break CONDITION128;
} //)) children level 1
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST125;
// $$$$$$$$ 
} // CONDITION128 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=125 N=124
if (javadummy) break CONDITION124;
} // CONDLIST125 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION124
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
CONDITION129:
while(javadummy) {
// ***** begin condlist 130 (in cond 129) *****
CONDLIST130: // @@@ begin of alternative group
while(javadummy) {
CONDITION131: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION131;
};
yy_outparam_0 = 
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST130;
// $$$$$$$$ 
} // CONDITION131 // @@@ end of alternative
CONDITION132: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION132;
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
yy_outparam_0 = 
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
H
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST130;
// $$$$$$$$ 
} // CONDITION132 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=130 N=129
if (javadummy) break CONDITION129;
} // CONDLIST130 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION129
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
CONDITION133:
while(javadummy) {
// ***** begin condlist 134 (in cond 133) *****
CONDLIST134: // @@@ begin of alternative group
while(javadummy) {
CONDITION135: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION135;
};
yy_outparam_0 = 
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST134;
// $$$$$$$$ 
} // CONDITION135 // @@@ end of alternative
CONDITION136: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION136;
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
yy_outparam_0 = 
T
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST134;
// $$$$$$$$ 
} // CONDITION136 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=134 N=133
if (javadummy) break CONDITION133;
} // CONDLIST134 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION133
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
CONDITION137:
while(javadummy) {
// ***** begin condlist 138 (in cond 137) *****
CONDLIST138: // @@@ begin of alternative group
while(javadummy) {
CONDITION139: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION139;
};
yy_outparam_0 = 
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST138;
// $$$$$$$$ 
} // CONDITION139 // @@@ end of alternative
CONDITION140: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative L
JavaNode L= null;
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H2
JavaNode H2= null;
// DECLARE for alternative H1
JavaNode H1= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION140;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to H1 --- JJ.M4
H1 = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "SeqOf-int")
if (javadummy) break CONDITION140;
{ //(( children level 2
JavaNode current2 =
   current1 .Child1[0];
//assign current2 to H2 --- JJ.M4
H2 = current2 ;
current2 = current1.Child1[1];
//assign current2 to T --- JJ.M4
T = current2 ;
} //)) children level 2
} //)) children level 1
};
Procs.
lastElem
(
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
H2
,
T
}
)
);
{
JavaNode current0 = 
 JavaLib.yyoutvalue1;
//assign current0 to L --- JJ.M4
L = current0 ;
}
yy_outparam_0 = 
L
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST138;
// $$$$$$$$ 
} // CONDITION140 // @@@ end of alternative
CONDITION141: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative H1
JavaNode H1= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION141;
{ //(( children level 1
JavaNode current1 =
   current0 .Child1[0];
//assign current1 to H1 --- JJ.M4
H1 = current1 ;
current1 = current0.Child1[1];
if (current1.Name
!= "NilOf-int")
if (javadummy) break CONDITION141;
} //)) children level 1
};
yy_outparam_0 = 
NodeFactory.NewNode (
"SeqOf-int"
, new JavaNode [] {
H1
,
NodeFactory.NewNode (
"NilOf-int"
,  new JavaNode [] {})
}
)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST138;
// $$$$$$$$ 
} // CONDITION141 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=138 N=137
if (javadummy) break CONDITION137;
} // CONDLIST138 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION137
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
CONDITION142:
while(javadummy) {
// ***** begin condlist 143 (in cond 142) *****
CONDLIST143: // @@@ begin of alternative group
while(javadummy) {
CONDITION144: // @@@ begin of alternative
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
if (javadummy) break CONDLIST143;
// $$$$$$$$ 
} // CONDITION144 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=143 N=142
if (javadummy) break CONDITION142;
} // CONDLIST143 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION142
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
CONDITION145:
while(javadummy) {
// ***** begin condlist 146 (in cond 145) *****
CONDLIST146: // @@@ begin of alternative group
while(javadummy) {
CONDITION147: // @@@ begin of alternative
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
if (javadummy) break CONDLIST146;
// $$$$$$$$ 
} // CONDITION147 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=146 N=145
if (javadummy) break CONDITION145;
} // CONDLIST146 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
JavaLib.yyoutvalue1 = yy_outparam_0;
if (javadummy) return;
} // CONDITION145
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
CONDITION148:
while(javadummy) {
// ***** begin condlist 149 (in cond 148) *****
CONDLIST149: // @@@ begin of alternative group
while(javadummy) {
CONDITION150: // @@@ begin of alternative
while(javadummy) {
NrOfTests=
new JavaIntValue(0)
;
NrOfFailures=
new JavaIntValue(0)
;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST149;
// $$$$$$$$ 
} // CONDITION150 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=149 N=148
if (javadummy) break CONDITION148;
} // CONDLIST149 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION148
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
CONDITION151:
while(javadummy) {
// ***** begin condlist 152 (in cond 151) *****
CONDLIST152: // @@@ begin of alternative group
while(javadummy) {
CONDITION153: // @@@ begin of alternative
while(javadummy) {
if (! JavaLib.rtsTestDefined(NrOfTests,"/line,offset,length,file=/ 497 21191 9 prob01.g"))
if (javadummy) break CONDITION153;
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
CONDITION154:
while(javadummy) {
// ***** begin condlist 155 (in cond 154) *****
CONDLIST155: // @@@ begin of alternative group
while(javadummy) {
CONDITION156: // @@@ begin of alternative
while(javadummy) {
if (! JavaLib.rtsTestDefined(NrOfFailures,"/line,offset,length,file=/ 502 21291 12 prob01.g"))
if (javadummy) break CONDITION156;
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
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"succ"))
   if (javadummy) break  CONDITION183;
};
Procs.
incTests
(
);
// ***** begin condlist 184 (in cond 183) *****
CONDLIST184: // @@@ begin of alternative group
while(javadummy) {
CONDITION185: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isEven
(
IN1
)
)
if (javadummy) break CONDITION185;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST184;
// $$$$$$$$ 
} // CONDITION185 // @@@ end of alternative
CONDITION186: // @@@ begin of alternative
while(javadummy) {
Procs.
ermI
(
new JavaStringValue( "isEven failed" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST184;
// $$$$$$$$ 
} // CONDITION186 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=184 N=183
if (javadummy) break CONDITION183;
} // CONDLIST184 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST182;
// $$$$$$$$ 
} // CONDITION183 // @@@ end of alternative
CONDITION187: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION187;
};
Procs.
incTests
(
);
// ***** begin condlist 188 (in cond 187) *****
CONDLIST188: // @@@ begin of alternative group
while(javadummy) {
CONDITION189: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isEven
(
IN1
)
)
if (javadummy) break CONDITION189;
Procs.
ermI
(
new JavaStringValue( "isEven succeeded" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST188;
// $$$$$$$$ 
} // CONDITION189 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=188 N=187
if (javadummy) break CONDLIST188;
} // CONDLIST188 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST182;
// $$$$$$$$ 
} // CONDITION187 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=182 N=181
if (javadummy) break CONDITION181;
} // CONDLIST182 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION181
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
isOdd
(
IN1
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
ermI
(
new JavaStringValue( "isOdd failed" )
,
IN1
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
isOdd
(
IN1
)
)
if (javadummy) break CONDITION198;
Procs.
ermI
(
new JavaStringValue( "isOdd succeeded" )
,
IN1
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
if (javadummy) break CONDLIST200;
// $$$$$$$$ 
} // CONDITION201 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=200 N=199
if (javadummy) break CONDITION199;
} // CONDLIST200 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION199
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
CONDITION202:
while(javadummy) {
// ***** begin condlist 203 (in cond 202) *****
CONDLIST203: // @@@ begin of alternative group
while(javadummy) {
CONDITION204: // @@@ begin of alternative
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
if (javadummy) break CONDLIST203;
// $$$$$$$$ 
} // CONDITION204 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=203 N=202
if (javadummy) break CONDITION202;
} // CONDLIST203 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION202
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
if (javadummy) break CONDLIST206;
// $$$$$$$$ 
} // CONDITION207 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=206 N=205
if (javadummy) break CONDITION205;
} // CONDLIST206 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION205
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
if (javadummy) break CONDLIST209;
// $$$$$$$$ 
} // CONDITION210 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=209 N=208
if (javadummy) break CONDITION208;
} // CONDLIST209 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION208
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
CONDITION211:
while(javadummy) {
// ***** begin condlist 212 (in cond 211) *****
CONDLIST212: // @@@ begin of alternative group
while(javadummy) {
CONDITION213: // @@@ begin of alternative
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
if (javadummy) break CONDLIST212;
// $$$$$$$$ 
} // CONDITION213 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=212 N=211
if (javadummy) break CONDITION211;
} // CONDLIST212 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION211
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
if (javadummy) break CONDLIST215;
// $$$$$$$$ 
} // CONDITION216 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=215 N=214
if (javadummy) break CONDITION214;
} // CONDLIST215 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION214
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
if (javadummy) break CONDLIST218;
// $$$$$$$$ 
} // CONDITION219 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=218 N=217
if (javadummy) break CONDITION217;
} // CONDLIST218 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION217
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
CONDITION220:
while(javadummy) {
// ***** begin condlist 221 (in cond 220) *****
CONDLIST221: // @@@ begin of alternative group
while(javadummy) {
CONDITION222: // @@@ begin of alternative
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
if (javadummy) break CONDLIST221;
// $$$$$$$$ 
} // CONDITION222 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=221 N=220
if (javadummy) break CONDITION220;
} // CONDLIST221 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION220
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
if (javadummy) break CONDLIST224;
// $$$$$$$$ 
} // CONDITION225 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=224 N=223
if (javadummy) break CONDITION223;
} // CONDLIST224 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION223
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
//assign current0 to IN2 --- JJ.M4
IN2 = current0 ;
};
{
JavaNode current0 = yy_inparam_2;
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
containsElem
(
IN1
,
IN2
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
ermLI
(
new JavaStringValue( "containsElem failed" )
,
IN1
,
IN2
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
//assign current0 to IN2 --- JJ.M4
IN2 = current0 ;
};
{
JavaNode current0 = yy_inparam_2;
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
containsElem
(
IN1
,
IN2
)
)
if (javadummy) break CONDITION234;
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
//assign current0 to IN2 --- JJ.M4
IN2 = current0 ;
};
{
JavaNode current0 = yy_inparam_2;
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
containsList
(
IN1
,
IN2
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
ermLL
(
new JavaStringValue( "containsList failed" )
,
IN1
,
IN2
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
//assign current0 to IN2 --- JJ.M4
IN2 = current0 ;
};
{
JavaNode current0 = yy_inparam_2;
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
containsList
(
IN1
,
IN2
)
)
if (javadummy) break CONDITION243;
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
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"succ"))
   if (javadummy) break  CONDITION246;
};
Procs.
incTests
(
);
// ***** begin condlist 247 (in cond 246) *****
CONDLIST247: // @@@ begin of alternative group
while(javadummy) {
CONDITION248: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
containsEqualElems
(
IN1
)
)
if (javadummy) break CONDITION248;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST247;
// $$$$$$$$ 
} // CONDITION248 // @@@ end of alternative
CONDITION249: // @@@ begin of alternative
while(javadummy) {
Procs.
ermL
(
new JavaStringValue( "containsEqualElems failed" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST247;
// $$$$$$$$ 
} // CONDITION249 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=247 N=246
if (javadummy) break CONDITION246;
} // CONDLIST247 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST245;
// $$$$$$$$ 
} // CONDITION246 // @@@ end of alternative
CONDITION250: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION250;
};
Procs.
incTests
(
);
// ***** begin condlist 251 (in cond 250) *****
CONDLIST251: // @@@ begin of alternative group
while(javadummy) {
CONDITION252: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
containsEqualElems
(
IN1
)
)
if (javadummy) break CONDITION252;
Procs.
ermL
(
new JavaStringValue( "containsEqualElems succeeded" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST251;
// $$$$$$$$ 
} // CONDITION252 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=251 N=250
if (javadummy) break CONDLIST251;
} // CONDLIST251 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST245;
// $$$$$$$$ 
} // CONDITION250 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=245 N=244
if (javadummy) break CONDITION244;
} // CONDLIST245 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION244
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
//assign current0 to IN2 --- JJ.M4
IN2 = current0 ;
};
{
JavaNode current0 = yy_inparam_2;
//JJ.M5
if (! JavaStringValue.MatchesString(current0,"succ"))
   if (javadummy) break  CONDITION255;
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
if (! 
Procs.
containEqualElems
(
IN1
,
IN2
)
)
if (javadummy) break CONDITION257;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST256;
// $$$$$$$$ 
} // CONDITION257 // @@@ end of alternative
CONDITION258: // @@@ begin of alternative
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
CONDITION259: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION259;
};
Procs.
incTests
(
);
// ***** begin condlist 260 (in cond 259) *****
CONDLIST260: // @@@ begin of alternative group
while(javadummy) {
CONDITION261: // @@@ begin of alternative
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
if (javadummy) break CONDITION261;
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
if (javadummy) break CONDLIST260;
// $$$$$$$$ 
} // CONDITION261 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=260 N=259
if (javadummy) break CONDLIST260;
} // CONDLIST260 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST254;
// $$$$$$$$ 
} // CONDITION259 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=254 N=253
if (javadummy) break CONDITION253;
} // CONDLIST254 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION253
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
CONDITION262:
while(javadummy) {
// ***** begin condlist 263 (in cond 262) *****
CONDLIST263: // @@@ begin of alternative group
while(javadummy) {
CONDITION264: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION264;
};
Procs.
incTests
(
);
// ***** begin condlist 265 (in cond 264) *****
CONDLIST265: // @@@ begin of alternative group
while(javadummy) {
CONDITION266: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isSortedAscending
(
IN1
)
)
if (javadummy) break CONDITION266;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST265;
// $$$$$$$$ 
} // CONDITION266 // @@@ end of alternative
CONDITION267: // @@@ begin of alternative
while(javadummy) {
Procs.
ermL
(
new JavaStringValue( "isSortedAscending failed" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST265;
// $$$$$$$$ 
} // CONDITION267 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=265 N=264
if (javadummy) break CONDITION264;
} // CONDLIST265 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST263;
// $$$$$$$$ 
} // CONDITION264 // @@@ end of alternative
CONDITION268: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION268;
};
Procs.
incTests
(
);
// ***** begin condlist 269 (in cond 268) *****
CONDLIST269: // @@@ begin of alternative group
while(javadummy) {
CONDITION270: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isSortedAscending
(
IN1
)
)
if (javadummy) break CONDITION270;
Procs.
ermL
(
new JavaStringValue( "isSortedAscending succeeded" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST269;
// $$$$$$$$ 
} // CONDITION270 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=269 N=268
if (javadummy) break CONDLIST269;
} // CONDLIST269 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST263;
// $$$$$$$$ 
} // CONDITION268 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=263 N=262
if (javadummy) break CONDITION262;
} // CONDLIST263 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION262
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
CONDITION271:
while(javadummy) {
// ***** begin condlist 272 (in cond 271) *****
CONDLIST272: // @@@ begin of alternative group
while(javadummy) {
CONDITION273: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION273;
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
isSortedDescending
(
IN1
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
ermL
(
new JavaStringValue( "isSortedDescending failed" )
,
IN1
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
CONDITION277: // @@@ begin of alternative
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
   if (javadummy) break  CONDITION277;
};
Procs.
incTests
(
);
// ***** begin condlist 278 (in cond 277) *****
CONDLIST278: // @@@ begin of alternative group
while(javadummy) {
CONDITION279: // @@@ begin of alternative
while(javadummy) {
if (! 
Procs.
isSortedDescending
(
IN1
)
)
if (javadummy) break CONDITION279;
Procs.
ermL
(
new JavaStringValue( "isSortedDescending succeeded" )
,
IN1
);
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST278;
// $$$$$$$$ 
} // CONDITION279 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=278 N=277
if (javadummy) break CONDLIST278;
} // CONDLIST278 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST272;
// $$$$$$$$ 
} // CONDITION277 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=272 N=271
if (javadummy) break CONDITION271;
} // CONDLIST272 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION271
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
CONDITION280:
while(javadummy) {
// ***** begin condlist 281 (in cond 280) *****
CONDLIST281: // @@@ begin of alternative group
while(javadummy) {
CONDITION282: // @@@ begin of alternative
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
CONDITION283:
while(javadummy) {
// ***** begin condlist 284 (in cond 283) *****
CONDLIST284: // @@@ begin of alternative group
while(javadummy) {
CONDITION285: // @@@ begin of alternative
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
CONDITION286:
while(javadummy) {
// ***** begin condlist 287 (in cond 286) *****
CONDLIST287: // @@@ begin of alternative group
while(javadummy) {
CONDITION288: // @@@ begin of alternative
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
CONDITION289:
while(javadummy) {
// ***** begin condlist 290 (in cond 289) *****
CONDLIST290: // @@@ begin of alternative group
while(javadummy) {
CONDITION291: // @@@ begin of alternative
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
CONDITION292:
while(javadummy) {
// ***** begin condlist 293 (in cond 292) *****
CONDLIST293: // @@@ begin of alternative group
while(javadummy) {
CONDITION294: // @@@ begin of alternative
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
CONDITION295:
while(javadummy) {
// ***** begin condlist 296 (in cond 295) *****
CONDLIST296: // @@@ begin of alternative group
while(javadummy) {
CONDITION297: // @@@ begin of alternative
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
// ***** begin condlist 298 (in cond 297) *****
CONDLIST298: // @@@ begin of alternative group
while(javadummy) {
CONDITION299: // @@@ begin of alternative
while(javadummy) {
{
if (! JavaLib.rtsEqualInt(
EXP1
,
FND1
)
)
   if (javadummy) break  CONDITION299;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST298;
// $$$$$$$$ 
} // CONDITION299 // @@@ end of alternative
CONDITION300: // @@@ begin of alternative
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
if (javadummy) break CONDLIST298;
// $$$$$$$$ 
} // CONDITION300 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=298 N=297
if (javadummy) break CONDITION297;
} // CONDLIST298 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST296;
// $$$$$$$$ 
} // CONDITION297 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=296 N=295
if (javadummy) break CONDITION295;
} // CONDLIST296 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION295
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
CONDITION301:
while(javadummy) {
// ***** begin condlist 302 (in cond 301) *****
CONDLIST302: // @@@ begin of alternative group
while(javadummy) {
CONDITION303: // @@@ begin of alternative
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
// ***** begin condlist 304 (in cond 303) *****
CONDLIST304: // @@@ begin of alternative group
while(javadummy) {
CONDITION305: // @@@ begin of alternative
while(javadummy) {
{
if (! JavaLib.rtsEqualInt(
EXP1
,
FND1
)
)
   if (javadummy) break  CONDITION305;
};
{
if (! JavaLib.rtsEqualInt(
EXP2
,
FND2
)
)
   if (javadummy) break  CONDITION305;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST304;
// $$$$$$$$ 
} // CONDITION305 // @@@ end of alternative
CONDITION306: // @@@ begin of alternative
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
if (javadummy) break CONDLIST304;
// $$$$$$$$ 
} // CONDITION306 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=304 N=303
if (javadummy) break CONDITION303;
} // CONDLIST304 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST302;
// $$$$$$$$ 
} // CONDITION303 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=302 N=301
if (javadummy) break CONDITION301;
} // CONDLIST302 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION301
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
CONDITION307:
while(javadummy) {
// ***** begin condlist 308 (in cond 307) *****
CONDLIST308: // @@@ begin of alternative group
while(javadummy) {
CONDITION309: // @@@ begin of alternative
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
// ***** begin condlist 310 (in cond 309) *****
CONDLIST310: // @@@ begin of alternative group
while(javadummy) {
CONDITION311: // @@@ begin of alternative
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
if (javadummy) break CONDITION311;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST310;
// $$$$$$$$ 
} // CONDITION311 // @@@ end of alternative
CONDITION312: // @@@ begin of alternative
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
if (javadummy) break CONDLIST310;
// $$$$$$$$ 
} // CONDITION312 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=310 N=309
if (javadummy) break CONDITION309;
} // CONDLIST310 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST308;
// $$$$$$$$ 
} // CONDITION309 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=308 N=307
if (javadummy) break CONDITION307;
} // CONDLIST308 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION307
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
CONDITION313:
while(javadummy) {
// ***** begin condlist 314 (in cond 313) *****
CONDLIST314: // @@@ begin of alternative group
while(javadummy) {
CONDITION315: // @@@ begin of alternative
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
// ***** begin condlist 316 (in cond 315) *****
CONDLIST316: // @@@ begin of alternative group
while(javadummy) {
CONDITION317: // @@@ begin of alternative
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
if (javadummy) break CONDITION317;
if (! 
Procs.
check
(
EXP2
,
FND2
)
)
if (javadummy) break CONDITION317;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST316;
// $$$$$$$$ 
} // CONDITION317 // @@@ end of alternative
CONDITION318: // @@@ begin of alternative
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
if (javadummy) break CONDLIST316;
// $$$$$$$$ 
} // CONDITION318 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=316 N=315
if (javadummy) break CONDITION315;
} // CONDLIST316 @@@ end of alternative group
// *** CONTINUE ***
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST314;
// $$$$$$$$ 
} // CONDITION315 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=314 N=313
if (javadummy) break CONDITION313;
} // CONDLIST314 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION313
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
CONDITION319:
while(javadummy) {
// ***** begin condlist 320 (in cond 319) *****
CONDLIST320: // @@@ begin of alternative group
while(javadummy) {
CONDITION321: // @@@ begin of alternative
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
if (javadummy) break CONDLIST320;
// $$$$$$$$ 
} // CONDITION321 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=320 N=319
if (javadummy) break CONDITION319;
} // CONDLIST320 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION319
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
CONDITION322:
while(javadummy) {
// ***** begin condlist 323 (in cond 322) *****
CONDLIST323: // @@@ begin of alternative group
while(javadummy) {
CONDITION324: // @@@ begin of alternative
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
if (javadummy) break CONDLIST323;
// $$$$$$$$ 
} // CONDITION324 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=323 N=322
if (javadummy) break CONDITION322;
} // CONDLIST323 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION322
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
CONDITION325:
while(javadummy) {
// ***** begin condlist 326 (in cond 325) *****
CONDLIST326: // @@@ begin of alternative group
while(javadummy) {
CONDITION327: // @@@ begin of alternative
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
if (javadummy) break CONDLIST326;
// $$$$$$$$ 
} // CONDITION327 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=326 N=325
if (javadummy) break CONDITION325;
} // CONDLIST326 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION325
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
CONDITION328:
while(javadummy) {
// ***** begin condlist 329 (in cond 328) *****
CONDLIST329: // @@@ begin of alternative group
while(javadummy) {
CONDITION330: // @@@ begin of alternative
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
if (javadummy) break CONDLIST329;
// $$$$$$$$ 
} // CONDITION330 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=329 N=328
if (javadummy) break CONDITION328;
} // CONDLIST329 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION328
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
CONDITION331:
while(javadummy) {
// ***** begin condlist 332 (in cond 331) *****
CONDLIST332: // @@@ begin of alternative group
while(javadummy) {
CONDITION333: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION333;
};
JavaLib.rtsEmitCode
("int[]\n");
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST332;
// $$$$$$$$ 
} // CONDITION333 // @@@ end of alternative
CONDITION334: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION334;
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
if (javadummy) break CONDLIST332;
// $$$$$$$$ 
} // CONDITION334 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=332 N=331
if (javadummy) break CONDITION331;
} // CONDLIST332 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION331
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
CONDITION335:
while(javadummy) {
// ***** begin condlist 336 (in cond 335) *****
CONDLIST336: // @@@ begin of alternative group
while(javadummy) {
CONDITION337: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION337;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST336;
// $$$$$$$$ 
} // CONDITION337 // @@@ end of alternative
CONDITION338: // @@@ begin of alternative
while(javadummy) {
// DECLARE for alternative T
JavaNode T= null;
// DECLARE for alternative H
JavaNode H= null;
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "SeqOf-int")
if (javadummy) break CONDITION338;
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
if (javadummy) break CONDLIST336;
// $$$$$$$$ 
} // CONDITION338 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=336 N=335
if (javadummy) break CONDITION335;
} // CONDLIST336 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
if (javadummy) return;
} // CONDITION335
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
CONDITION339:
while(javadummy) {
// ***** begin condlist 340 (in cond 339) *****
CONDLIST340: // @@@ begin of alternative group
while(javadummy) {
CONDITION341: // @@@ begin of alternative
while(javadummy) {
{
JavaNode current0 = yy_inparam_0;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION341;
};
{
JavaNode current0 = yy_inparam_1;
if (current0.Name
!= "NilOf-int")
if (javadummy) break CONDITION341;
};
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST340;
// $$$$$$$$ 
} // CONDITION341 // @@@ end of alternative
CONDITION342: // @@@ begin of alternative
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
if (javadummy) break CONDITION342;
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
if (javadummy) break CONDITION342;
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
   if (javadummy) break  CONDITION342;
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
if (javadummy) break CONDITION342;
// $$$$$$$$ java success: this alternative matched 
if (javadummy) break CONDLIST340;
// $$$$$$$$ 
} // CONDITION342 // @@@ end of alternative
// $$$$$$$$ java failure: no alternative matched $$$$
// *** ESCAPE *** CondListIndex=340 N=339
if (javadummy) break CONDITION339;
} // CONDLIST340 @@@ end of alternative group
// *** CONTINUE ***
// succeeded:
return true;
} // CONDITION339
// failed:
return false;
}


public static void Semantics(JavaNode n)
{
}
}
