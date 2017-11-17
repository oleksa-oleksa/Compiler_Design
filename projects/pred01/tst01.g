// -----------------------------------------------------------------------
// File pred01\tst01.g

phrase CS_BasedNumber(-> int)
   rule CS_BasedNumber(-> BASE):
      "#" INTEGER(-> BASE) "#" CS_DIGITS(-> DIGITS) "#"

phrase CS_DIGITS(-> int[])
   rule CS_DIGITS(-> int[DIGIT]):
      INTEGER(-> DIGIT)
   rule CS_DIGITS(-> int[DIGIT::DIGITS]):
      INTEGER(-> DIGIT) " " CS_DIGITS(-> DIGITS)

token INTEGER(-> int)

root
   CS_BasedNumber(->N)
   "N: " $N "\n"