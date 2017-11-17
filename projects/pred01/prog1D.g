// -----------------------------------------------------------------------
// File pred01\prog1D.g
// A compiler which translates a word of the GreetingLanguage
// into German and Spanish (exactly like prog1C.g)
// Here the proc predicates outDE and outES are written with
// alternatives statements.
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
   rule outDE(grt(P1, P2)):
      {
         Equal(P1, "go")
         "Guten "
         {
            Equal(P2, "mo") "Morgen!\n"
         |
            Equal(P2, "ev") "Abend!\n"
         |
            Equal(P2, "ni") "Nacht!\n"
         }
      |
         "Hallo " $P2 "!\n"
      }

proc outES(Greeting_AS)
   rule outES(grt(P1, P2)):
      {
         Equal(P1, "go")
         "Buenas "
         {
            Equal(P2, "mo") "dias!\n"
         |
            Equal(P2, "ev") "noches!\n"
         |
            Equal(P2, "ni") "noches!\n"
         }
      |
         "Hola " $P2 "!\n"
      }

root
   Greeting_CS(-> G)
   outDE(G)
   outES(G)
