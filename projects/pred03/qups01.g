(@ ------------------------------------------------------------------------
File pred03\qups01.g
Demonstrates global variables.
------------------------------------------------------------------------ @)
// Ein einstelliges Qups:
data Otto(-> int)                                          // Z01

type CPB
   cpb(AnzTests:int, Note:int)

// Ein zweistelliges Qups:
data Ergebnis(string -> CPB)                               // Z02

root
   "----------------------------------- A\n"
   Set-Otto(17)                                            // Z03
   Get-Otto(-> N)                                          // Z04
   "Otto hat den Wert: " $N "\n"

   Set-Otto(N+3)                                           // Z05
   Get-Otto(-> M)
   "Otto hat den Wert: " $M "\n"
   "----------------------------------- B\n"
   Set-Ergebnis("Anna", cpb(15, 1))                        // Z06
   Set-Ergebnis("Bert", cpb(12, 3))

   Get-Ergebnis("Anna" -> ERG_A)                           // Z07
   "Anna: " pCPB(ERG_A) "\n"                               // Z08

   Get-Ergebnis("Bert" -> cpb(AT, NO))                     // Z09
   "Bert: Anzahl Tests: " $AT ", Note: " $NO "\n"

   Set-Ergebnis("Bert", cpb(AT, NO-1))                     // Z10
   Get-Ergebnis("Bert" -> ERG_B)
   "Bert: " pCPB(ERG_B) "\n"                               // Z11
   "----------------------------------- C\n"
   pERG("Bert")
   pERG("Karl")                                            // Z12
   "----------------------------------- D\n"

proc pCPB(CPB)
   rule pCPB(cpb(AT, NO)):
      "Anzahl Tests: " $AT ", Note: " $NO

proc pERG(Name:string)
   rule pERG(NAM):                                         // Z13
      Get-Ergebnis(NAM -> cpb(AT, NO))                     // Z14
      $NAM ": Anzahl Tests: " $AT ", Note: " $NO "\n"
   rule pERG(NAM):
      "Fuer " $NAM " kein Ergebnis gefunden!\n"
(@ ------------------------------------------------------------------------
Die Ausgabe dieses Programms:

----------------------------------- A
Otto hat den Wert: 17
Otto hat den Wert: 20
----------------------------------- B
Anna: Anzahl Tests: 15, Note: 1
Bert: Anzahl Tests: 12, Note: 3
Bert: Anzahl Tests: 12, Note: 2
----------------------------------- C
Bert: Anzahl Tests: 12, Note: 2
Fuer Karl kein Ergebnis gefunden!
----------------------------------- D
------------------------------------------------------------------------ @)
