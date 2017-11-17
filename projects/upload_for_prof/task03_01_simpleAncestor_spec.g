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
   rule ancestor1 : "mother"
   rule ancestor1 : "father"
   
phrase  ancestor2
   rule ancestor2 : "grand" ancestor1

phrase  ancestor3
   rule ancestor3 : "great" ancestor2
   rule ancestor3 : "great" ancestor3 

// -----------------------------------------------------------------------
root
   ancestor
   "No parse error!\n"
// -----------------------------------------------------------------------
