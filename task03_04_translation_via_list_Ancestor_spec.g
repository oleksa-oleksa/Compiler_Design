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

phrase  ancestor(->string[])
   rule ancestor(->d) : ancestor1(->d)  // 1 generation  away
   rule ancestor(->d) : ancestor2(->d)  // 2 generations away
   rule ancestor(->d) : ancestor3(->d)  // 3 or more generations away


phrase ancestor1(-> string[])
       rule ancestor1(-> string["mutter"]) : "mother"
       rule ancestor1(-> string["vater"]) : "father"


phrase ancestor2(-> string[])
       rule ancestor2(-> string["gross"::d]) : "grand" ancestor1(->d)


phrase  ancestor3(-> string[])
   rule ancestor3(-> string["ur"::d]) : "great" ancestor2(->d)
   rule ancestor3(-> string["ur"::d]) : "great" ancestor3(->d)

// ----------------------------------------------------------------------

proc makeString(string[])
   rule makeString(string["ur"::d]) : "ur" makeString(d)
   rule makeString(string["gross"::d]) : "gross" makeString(d)
   rule makeString(string["mutter"]) : "mutter\n"
   rule makeString(string["vater"]) : "vater\n"

// -----------------------------------------------------------------------
root
   ancestor(->TR)
   makeString(TR)
  // proc gives generated string on the terminal
  // print will show the internal seq of the string
   "No parse error!\n"
// -----------------------------------------------------------------------
