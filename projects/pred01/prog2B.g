// -----------------------------------------------------------------------
// File pred01\prog2B.g
// -----------------------------------------------------------------------

phrase Shout
   rule Shout:
      Shout1 Shout2

phrase Shout1(-> int)
   rule Shout1(-> 0):
   rule Shout1(Nr+1):
      "Hello!"
      Shout1(-> Nr)

phrase Shout2(-> string)
   rule Shout2(-> "version A"):
      "Do you hear me?"
   rule Shout2(-> "version B"):
      "Where are you?"

root
   Shout
   "No parse error found\n"
