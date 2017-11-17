// -----------------------------------------------------------------------
// File pred01\prog2A.g
// -----------------------------------------------------------------------

phrase Shout            // <-+
   rule Shout:          //   +-- Definition of phrase predicate Shout
      Shout1 Shout2     // <-+

phrase Shout1           // <---- Head of predicate Shout1
   rule Shout1:         // <-+
   rule Shout1:         //   +-- Body of predicate Shout1
      "Hello!"          //   |
      Shout1            // <-+

phrase Shout2
   rule Shout2:         // <---- Head of 1. rule of Shout2
      "Do you hear me?" // <---- Body of 1. rule of Shout2
   rule Shout2:         // <---- Head of 2. rule of Shout2
      "Where are you?"  // <---- Body of 2. rule of Shout2

root
   Shout
   "No parse error found\n"
// ------------------------------------------------------------------------
// 6 examples of sentences this parser accepts:
// Do you hear me?   Hello! Do you hear me?   Hello! Hello! Do you hear me?
// Where are you?    Hello! Where are you?    Hello! Hello! Where are you?