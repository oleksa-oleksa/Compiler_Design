// Datei mehrd01.g

phrase bal
   rule bal: "0" bal "1"
   rule bal: "1" bal "0"
   rule bal:
   rule bal: bal bal

root
   bal
   "Keine Syntaxfehler entdeckt!\n"
   "-------------------------------------\n"
