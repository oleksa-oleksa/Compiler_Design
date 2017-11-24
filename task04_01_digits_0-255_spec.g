// Datei Zahlen0Bis255.g

root
   Zahlen0Bis255
   "Kein Parse-Fehler!\n"

phrase Zahlen0Bis255
   // SOLUTION:
   rule Zahlen0Bis255: Zahlen0Bis99
   rule Zahlen0Bis255: "1" Ziff0Bis9 Ziff0Bis9
   rule Zahlen0Bis255: "2" Ziff0Bis4 Ziff0Bis9
   rule Zahlen0Bis255: "25" Ziff0Bis5

phrase Zahlen0Bis99
   rule Zahlen0Bis99: Ziff0Bis9
   rule Zahlen0Bis99: Ziff1Bis9 Ziff0Bis9

   // Given in the task:
phrase Ziff0Bis4
   rule Ziff0Bis4: "0"
   rule Ziff0Bis4: Ziff1Bis4

phrase Ziff0Bis5
   rule Ziff0Bis5: Ziff0Bis4
   rule Ziff0Bis5: "5"

phrase Ziff0Bis9
   rule Ziff0Bis9: "0"
   rule Ziff0Bis9: Ziff1Bis9

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
