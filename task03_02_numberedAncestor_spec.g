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

phrase  ancestor(->int)
   rule ancestor(->d) : ancestor1(->d)  // 1 generation  away
   rule ancestor(->d) : ancestor2(->d)  // 2 generations away
   rule ancestor(->d) : ancestor3(->d)  // 3 or more generations away

phrase  ancestor1(->int)
   rule ancestor1(->1) : "mother"
   rule ancestor1(->1) : "father"
   
phrase  ancestor2(->int)
   rule ancestor2(->d+1) : "grand" ancestor1(->d)

phrase  ancestor3(->int)
   rule ancestor3(->d+1) : "great" ancestor2(->d)
   rule ancestor3(->d+1) : "great" ancestor3(->d) 


// -----------------------------------------------------------------------
root
   ancestor(->DISTANCE)
   print DISTANCE
   "No parse error!\n"
// -----------------------------------------------------------------------
