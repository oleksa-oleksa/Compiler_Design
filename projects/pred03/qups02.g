(@ ------------------------------------------------------------------------
File qups02.g
------------------------------------------------------------------------ @)

data NaechsteMatNr(-> int)

data MatNr(string -> int)

proc imma(Name:string -> MatNr:int)
   // imma soll an "Immatrikulation" erinnern
   // Holt sich aus dem Qups NaechsteMatNr die naechste (noch freie)
   // Matrikrel-Nr NM.
   // Erhoeht den momentanen Wert des Qups NaechsteMatNr um 1.
   // Traegt den Name als Schluessel mit dem Wert NM in das Qups
   // MatNr ein.
   // Liefert NM als Wert des out-Params MatNr.
   rule imma(NAM -> NM):
      Get-NaechsteMatNr(-> NM)
      Set-NaechsteMatNr(NM+1)

      Set-MatNr(NAM, NM)

proc p(Name:string)
   rule p(NAM):
      {
         Get-MatNr(NAM -> MN)
         "Name: " $NAM ", MatNr: " $MN "\n"
      |
         $NAM " ist noch nicht immatrikuliert!\n"
      }


root
   Set-NaechsteMatNr(100101)

   imma("Anna" -> ANR)
   imma("Bert" -> BNR)

   p("Anna")
   p("Bert")
   p("Carl")
(@ ------------------------------------------------------------------------
Ausgabe:

Name: Anna, MatNr: 100101
Name: Bert, MatNr: 100102
Carl ist noch nicht immatrikuliert!
------------------------------------------------------------------------ @)

