// -----------------------------------------------------------------------
// File pred01\prog1C.g
// A compiler which translates a word of the GreetingLanguage
// into German and Spanish
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

proc outDE(Greeting_AS)
   rule outDE(grt("go", "mo")): "Guten Morgen!\n"
   rule outDE(grt("go", "ev")): "Guten Abend!\n"
   rule outDE(grt("go", "ni")): "Gute Nacht!\n"
   rule outDE(grt("he", NAME)): "Hallo " $NAME "!\n"

proc outES(Greeting_AS)
   rule outES(grt("go", "mo")): "Buenas dias!\n"
   rule outES(grt("go", "ev")): "Buenas noches!\n"
   rule outES(grt("go", "ni")): "Buenas noches!\n"
   rule outES(grt("he", NAME)): "Hola " $NAME "!\n"

root
   Greeting_CS(-> G)
   outDE(G)
   outES(G)
