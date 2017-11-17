// -----------------------------------------------------------------------
// File pred03\optionTypes01.g
// Demonstrates option types.
//------------------------------------------------------------------------
type NAME
   n(LastName:string, FirstName:string?)

proc pNAME(NAME)
   rule pNAME(n(LN, string?())):
      "Last name: " $LN "\n"
   rule pNAME(n(LN, string?(FN))):
      "First and last Name: " $FN " " $LN "\n"

root
   Present <- int?(123)
   "---------------------------\n"
   "Present: " print Present
   Present -> int?(N)
   "---------------------------\n"
   "N      : " print N
   "---------------------------\n"

   Missing <- int?()
   "Missing: " print Missing
   "---------------------------\n"
   Missing -> int?()
   "Missing -> int?() suceeded!\n"
   "---------------------------\n"
   // A NAME with the optional first name:
   NAM1 <- n("Meyer", string?("Otto"))
   "NAM1: " print NAM1
   pNAME(NAM1)
   "---------------------------\n"
   // A NAME without the optional first name:
   NAM2 <- n("Schulz", string?())
   "NAM2: " print NAM2
   pNAME(NAM2)
   "---------------------------\n"
(@ ------------------------------------------------------------------------
Ausgabe:

---------------------------
Present: 'OneOf-int' {
123
}
---------------------------
N      : 123
---------------------------
Missing: 'NoneOf-int' {
}
---------------------------
Missing -> int?() suceeded!
---------------------------
NAM1: 'n' {
Meyer
'OneOf-string' {
Otto
}
}
First and last Name: Otto Meyer
---------------------------
NAM2: 'n' {
Schulz
'NoneOf-string' {
}
}
Last name: Schulz
---------------------------
------------------------------------------------------------------------ @)
