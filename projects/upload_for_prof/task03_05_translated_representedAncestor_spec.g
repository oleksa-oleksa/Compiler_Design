// -----------------------------------------------------------------------
// File ancestor01\spec.g
// A parser for the ancestor language A1.
//
// A1 = {mother, father, grandmother, grandfather,
//       greatgrandmother, greatgrandfather, greatgreatgrandmother, ...
//       greatgreatgreatgreatgreatgreatgreatgrandfather, ...
//      }
// -----------------------------------------------------------------------
// Grammar of the ancestor language A1:

type AS_ancestor03 // Abstract
   mo()
   fa()
   g(AS_ancestor03)

phrase  ancestor(-> AS_ancestor03)
   rule ancestor(-> AS) : ancestor1(-> AS)  // 1 generation  away
   rule ancestor(-> AS) : ancestor2(-> AS)  // 2 generations away
   rule ancestor(-> AS) : ancestor3(-> AS)  // 3 or more generations away

phrase  ancestor1(-> AS_ancestor03)
   rule ancestor1(-> mo()) : "mother"
   rule ancestor1(-> fa()) : "father"
   
phrase  ancestor2(-> AS_ancestor03)
   rule ancestor2(-> g(AS)) : "grand" ancestor1(-> AS)

phrase  ancestor3(-> AS_ancestor03)
   rule ancestor3(-> g(AS)) : "great" ancestor2(-> AS)
   rule ancestor3(-> g(AS)) : "great" ancestor3(-> AS)

// ----------------------------------------------------------------------

proc translate(AS_ancestor03)
   rule translate(g(g(AS))) : "ur" translate(g(AS))
   rule translate(g(AS)) : "gross" translate(AS)
   rule translate(mo()) : "mutter\n"
   rule translate(fa()) : "vater\n"


// -----------------------------------------------------------------------
root
   ancestor(->AS)
   translate(AS)
   "No parse error!\n"

// -----------------------------------------------------------------------
