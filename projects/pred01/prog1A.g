// -----------------------------------------------------------------------
// File pred01\prog1A.g
// A parser for the GreetingLanguage.
// -----------------------------------------------------------------------

phrase Greeting
   rule Greeting: "Good" TimeOfDay "!"
   rule Greeting: "Hello" Name "!"

phrase TimeOfDay
   rule TimeOfDay: "morning"
   rule TimeOfDay: "evening"
   rule TimeOfDay: "night"

token Name
   <<<[A-Z][a-z]+>>>

root
   Greeting
   "No parse error found!\n"