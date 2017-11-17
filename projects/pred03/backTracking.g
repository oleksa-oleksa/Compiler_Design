// -----------------------------------------------------------------------
// File pred03\backTracking.g
// An example of shallow backtracking
// (and what a difference deep backtracking would have made)
//
// Does not contain token or phrase predicates.
// -----------------------------------------------------------------------

// 5 Persons: Andy, Brit, Carl, Dian, Erny
type Person a() b() c() d() e()

// Who loves whom?
condition lov(Person -> Person)
   rule lov(a() -> b()):        // Rule lov1:   Andy loves Brit.
   rule lov(b() -> a()):        // Rule lov2:   Brit loves Andy.
   rule lov(d() -> c()):        // Rule lov3:   Dian loves Carl.
   rule lov(d() -> e()):        // Rule lov4:   Dian loves Erny.
   rule lov(e() -> d()):        // Rule lov5:   Erny loves Dian.

// Who is happy?
condition isH(Person)
   rule isH(P0):                // Rule isH1:   A person P0 is happy if
      lov(P0 -> P1)             //                 P0 loves P1 and
      lov(P1 -> P2)             //                 P1 loves P2 and
      Equal(P2, P0)             //                 P2 equals P0.

root
   "------------------------\n"
   "Is Andy happy?\n"
   { isH(a()) "Yes, he is!\n"   | "No, he is not!\n"  }
   "------------------------\n"
   "Is Erny happy?\n"
   { isH(e()) "Yes, he is!\n"   | "No, he is not!\n"  }
   "------------------------\n"

// -----------------------------------------------------------------------------------
// Output of this program:
//
// ------------------------
// Is Andy happy?
// Yes, he is!
// ------------------------
// Is Dian happy?
// No, she is not!
// ------------------------
// -----------------------------------------------------------------------------------
// The following and/or tree demonstrates an example of SHALLOW BACKTRACKING
// and shows that Andy is happy:
//
//   and        or       and               or
//
//   isH(a) -+- isH1 -+- lov(P0 -> P1) -+- lov1 -- true   // Andy loves Brit
//              P0=a  |      =a    =b
//                    |
//                    +- lov(P1 -> P2) -+- lov1 -- false
//                    |      =b    =a   +- lov2 -- true   // Brit loves P2
//                    |
//                    |
//                    +-- Equal(P2, P0) -- true           // P2 equals Andy
//                              =a  =a
// -----------------------------------------------------------------------------------
// The following and/or tree demonstrates an example of SHALLOW BACKTRACKING,
// and how it keeps Erny from being happy:
//
//   and        or       and               or
//
//   isH(e) -+- isH1 -+- lov(P0 -> P1) -+- lov1 -- false
//              P0=e  |      =e         +- lov2 -- false
//                    |                 +- lov3 -- false
//                    |                 +- lov4 -- false
//                    |            =d   +- lov5 -- true   // Erny loves Dian
//                    |
//                    +- lov(P1 -> P2) -+- lov1 -- false
//                    |      =d         +- lov2 -- false
//                    |            =c   +- lov3 -- true   // Dian loves P2
//                    |
//                    |
//                    +- Equal(P2, P0) -- false           // P2 not equals Erny
//                             =c  =e
//
// Erny loves Dian, but since Dian loves Carl and Carl is not Erny
// shallow backtracking concludes immediately, that Erny is not happy.
// This is how the above Gentle program works.
// -----------------------------------------------------------------------------------
// The following and/or tree demonstrates an example of DEEP BACKTRACKING,
// and shows that Erny is happy:
//
//   and        or       and              or
//
//   isH(e) -+- isH1 -+- lov(P0 -> P1) -+- lov1 -- false
//              P0=e  |      =e         +- lov2 -- false
//                    |                 +- lov3 -- false
//                    |                 +- lov4 -- false
//                    |            =d   +- lov5 -- true   // Erny loves Dian
//                    |
//                    +- lov(P1 -> P2) -+- lov1 -- false
//                    |      =d         +- lov2 -- false
//               +->  |            =c   +- lov3 -- true   // Dian loves P2
//               |    |
//               |    |
//               |    +- Equal(P2, P0) -- false           // P2 not equals Erny
//               |             =c  =e
//               |
// Backtrack to -+ and continue from there to search
// for other values for P2 (persons loved by Dian)
//
//                    +- lov(P1 -> P2) -+- lov4 -- true   // Dian loves P2
//                    |      =d    =e
//                    |
//                    +- Equal(P2, P0) -- true            // P2 equals Erny
//
// After finding, that from "Erny loves Dian" and "Dian loves Carl" the happiness
// of Erny does not follow, deep backtracking goes back and looks for alternatives
// for "Diana loves Carl". With rule lov4 it finds "Dian loves Erny" and now
// it follows that Erny is happy.
// This is in contrast to the above Gentle program and its findings.
// -----------------------------------------------------------------------------------
// Exercise: What would the Gentle program find out about the happiness of Dian?
// Solution: No, she is not happy. The program will find "Dian loves Carl" (with
// rule lov3), but because Carl does not love Dian (he does'n love anybody)
// shallow backtracking will conclude, that Dian is not happy.
// -----------------------------------------------------------------------------------