// -----------------------------------------------------------------------
// File pred03\alternatives04.g
// Alternatives statement, a first example
//------------------------------------------------------------------------

proc DoSomethingB(string)
   rule DoSomethingB(S):
      check(S -> 1)
      action1()
   rule DoSomethingB(S):
      check(S -> 2)
      action2()
   rule DoSomethingB(S):
      action3()

proc DoSomethingA(string)
   rule DoSomethingA(S):
      check(S -> N)
      {
         N -> 1
         action1()
      |
         N -> 2
         action2()
      |
         action3()
      }

proc check(string -> int)
   rule check(S -> E):
      "check with S=" $S "\n"
      {
         S -> "X"
         E <-  1
      |
         S -> "Y"
         E <-  2
      |
         E <- 3
      }

proc action1()
   rule action1(): "action1\n"

proc action2()
   rule action2(): "action2\n"

proc action3()
   rule action3(): "action3\n"

root
   "---------------- DoSomethingB(\"X\")\n"
   DoSomethingB("X")
   "---------------- DoSomethingB(\"Y\")\n"
   DoSomethingB("Y")
   "---------------- DoSomethingB(\"Z\")\n"
   DoSomethingB("Z")

   "---------------- DoSomethingA(\"X\")\n"
   DoSomethingA("X")
   "---------------- DoSomethingA(\"Y\")\n"
   DoSomethingA("Y")
   "---------------- DoSomethingA(\"Z\")\n"
   DoSomethingA("Z")
(@ ------------------------------------------------------------------------
Output of this program:

---------------- DoSomethingB("X")
check with S=X
action1
---------------- DoSomethingB("Y")
check with S=Y
check with S=Y
action2
---------------- DoSomethingB("Z")
check with S=Z
check with S=Z
action3
---------------- DoSomethingA("X")
check with S=X
action1
---------------- DoSomethingA("Y")
check with S=Y
action2
---------------- DoSomethingA("Z")
check with S=Z
action3
------------------------------------------------------------------------ @)

