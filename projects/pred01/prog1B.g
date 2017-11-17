// -----------------------------------------------------------------------
// File pred01\prog1B.g
// A parser which translates a word of the GreetingLanguage
// into some abstract syntax (a value of type Greeting_AS)
// -----------------------------------------------------------------------

type Greeting_AS
   grt(Part1:string, Part2:string)

phrase Greeting_CS(-> Greeting_AS)
   rule Greeting_CS(-> grt("go", S)): "Good" TimeOfDay_CS(-> S) "!"
   rule Greeting_CS(-> grt("he", S)): "Hello" Name_CS(-> S) "!"

phrase TimeOfDay_CS(-> string)
   rule TimeOfDay_CS(-> "mo"): "morning"
   rule TimeOfDay_CS(-> "ev"): "evening"
   rule TimeOfDay_CS(-> "ni"): "night"

token Name_CS(-> string)
   <<<[A-Z][a-z]+>>>

root
   Greeting_CS(-> G)
   print G
