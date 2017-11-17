(@ ------------------------------------------------------------------------
Vorgegebene Datei spec.g fuer die Aufgabe
2. Grammatiken A: Mengen von Dezimalzahlen

Das Startsymbol (hier MyStart) muss immer als erstes phrase-Praedikat
definiert werden. Das Praedikat MyStart erlaubt es, das "eigentliche
Startsymbol" an einer beliebigen Stelle des Programms zu vereinbaren.
------------------------------------------------------------------------ @)
phrase MyStart:
   Ziff0Bis9

phrase Ziff0Bis9
   rule Ziff0Bis9: "0"
   rule Ziff0Bis9: Ziff1Bis9

phrase Ziff0Bis4
   rule Ziff0Bis4: "0"
   rule Ziff0Bis4: Ziff1Bis4

phrase Ziff0Bis5
   rule Ziff0Bis5: Ziff0Bis4
   rule Ziff0Bis5: "5"

phrase Ziff1Bis4
   rule Ziff1Bis4: "1"
   rule Ziff1Bis4: "2"
   rule Ziff1Bis4: "3"
   rule Ziff1Bis4: "4"

phrase Ziff1Bis9
   rule Ziff1Bis9: Ziff1Bis4
   rule Ziff1Bis9: "5"
   rule Ziff1Bis9: "6"
   rule Ziff1Bis9: "7"
   rule Ziff1Bis9: "8"
   rule Ziff1Bis9: "9"

root
   MyStart
   "No parse error found!\n"
