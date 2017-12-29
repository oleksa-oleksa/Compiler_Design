type Person
  pers(string)
  mo(Person)
  fa(Person)

phrase ancestor(->Person)
    rule ancestor(->fa(P)) : "The father of" ancestor(->P)
    rule ancestor(->mo(P)) : "The mother of" ancestor(->P)

    rule ancestor(->fa(P)) : "the father of" ancestor(->P)
    rule ancestor(->mo(P)) : "the mother of" ancestor(->P)

    rule ancestor(->pers("Johann")) : "John"
    rule ancestor(->pers("Maria")) : "Mary"

proc t_tr(Person)
    rule t_tr(pers(X)) : t_name(pers(X)) // pattern matching for a call t_name

    rule t_tr(X) : // whole sequence is here
        t_article(X)
        " "
        t_ancs1(X, 1) // finds sequence
        " von "
        t_name(X)
        "\n"

        
proc t_article(Person)
    rule t_article(fa(pers(_))) : "Der" // first level
    rule t_article(mo(pers(_))) : "Die"
    rule t_article(fa(_)) : "Ein" // the rest of cases
    rule t_article(mo(_)) : "Eine"

        
proc t_name(Person)
    rule t_name(pers(X)) : $X // $ prints variable content
    rule t_name(mo(X)) : t_name(X)
    rule t_name(fa(X)) : t_name(X)

proc ancs(Person, int)
   rule ancs(fa(X), 1) : "vater" // detects the gender
   rule ancs(mo(X), 1) : "mutter"

   rule ancs(K, 2) : "gross" // K means the var exits
   rule ancs(K, _) : "ur" // all rest > 2

proc t_ancs1(Person, int) 
  rule t_ancs1(pers(_), X) :

  rule t_ancs1(fa(P), X) :
        t_ancs1(P, X+1) // we know how far we are, so we can print it
        ancs(fa(P), X)

  rule t_ancs1(mo(P), X) :
        t_ancs1(P, X+1)
        ancs(mo(P), X)


root
  ancestor(->AS)
  t_tr(AS)
