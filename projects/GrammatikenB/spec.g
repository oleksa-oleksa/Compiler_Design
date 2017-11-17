(@ ------------------------------------------------------------------------
Vorgegebene Datei spec.g fuer die Aufgabe
3. Grammatiken B: Einfache Sprachen

Die Zwischensymbole Gb, Kb und Ziff kann man (ohne viel Schreibarbeit)
als token-Praedikate definieren.

Das Startsymbol (hier MyStart) muss immer als erstes phrase-Praedikat
definiert werden. Das Praedikat MyStart erlaubt es, das "eigentliche
Startsymbol" an einer beliebigen Stelle des Programms zu vereinbaren.
------------------------------------------------------------------------ @)

phrase MyStart
   rule S: Gb

token Gb
   <<<[A-Z]>>>

token Kb
   <<<[a-z]>>>

token Ziff
   <<<[0-9]>>>

token SoZe
   <<<[.!?#]>>>

root
   MyStart
   "No parse error found!\n"
