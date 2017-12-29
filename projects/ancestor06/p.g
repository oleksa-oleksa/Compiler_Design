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

phrase  ancestor
   rule ancestor : ancestor1  // 1 generation  away
   rule ancestor : ancestor2  // 2 generations away
   rule ancestor : ancestor3  // 3 or more generations away

phrase  ancestor1
   rule ancestor1 : "The mother of" ancestor2
   rule ancestor1 : "The father of" ancestor2

phrase  ancestor2
   rule ancestor2 : "the mother of" ancestor2
   rule ancestor2 : "the father of" ancestor2
   rule ancestor2 : ancestor3
   rule ancestor2 : ancestor3


phrase  ancestor3
   rule ancestor3 : "Mary" ancestor2
   rule ancestor3 : "John" ancestor2

// -----------------------------------------------------------------------
root
   ancestor
   "No parse error!\n"
// -----------------------------------------------------------------------
