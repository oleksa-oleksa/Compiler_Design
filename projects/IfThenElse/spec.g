// File specNOA.g

phrase stm
   rule stm: "s"
   rule stm: "i" stm
   rule stm: "i" stm "e" stm

root
   stm
   "No parse errors!\n"