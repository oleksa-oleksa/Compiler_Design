// -----------------------------------------------------------------------
// File pred01\baseMtoN.g
// A compiler which translates base M numbers into base N numbers
// -----------------------------------------------------------------------
// Example: The number 123456 represented in the concrete syntax of a
// based number with base 100 and three digits (12, 34 and 56)
//
// #100#12 34 56#
//
// The base and the digits are represented by base-10-numbers.
// The digits are separated by a space character.
// -----------------------------------------------------------------------
type AS_BasedNumber            // Abstract Syntax for based numbers
   bn(base:int, digits:int[])
   // The list digits contains the lowest valued digit
   // (the rightmost digit in the usual arabic notation) first and
   // the highest valued (the leftmost) digit last. Example:
   // The base 10 number 123 is represented by bn(10, int[3, 2, 1])
// -----------------------------------------------------------------------
// Parser: Concrete syntax to abstract syntax

phrase CS_BasedNumber(-> AS_BasedNumber)
   rule CS_BasedNumber(-> bn(BASE, DIGITS)):
      "#" NATURAL(-> BASE) "#" CS_Digits(-> DIGITS) "#"

phrase CS_Digits(-> int[])
   rule CS_Digits(-> int[DIGIT]):
      NATURAL(-> DIGIT)
   rule CS_Digits(-> int[DIGIT::DIGITS]):
      CS_Digits(-> DIGITS) " " NATURAL(-> DIGIT)

token NATURAL(-> int)
   <<<[0-9]+>>>

// Comments starting with // and extending to the end of the current line
// The dot . matches any character except newline \n
whitespace
   <<<//.*>>>

// The above whitespace definition switches off the standard definition.
// Therefore here we add spaces, tabs \t, newlines \n and
// carriage returns \r to the whitespace lexems:
whitespace
   <<<(\ |\t|\n|\r)>>>
// -----------------------------------------------------------------------
proc checkBasedNumber(AS_BasedNumber)
   // Checks if the base is 2 or greater and
   // if all digits are less than the base:
   rule checkBasedNumber(bn(BASE, DIGITS)):
      {
         Less(BASE, 2)
         "Illegal base " $BASE "\n"
      |
         checkDigits(BASE, DIGITS)
      }

proc checkDigits(Base:int, Digits:int[])
   // Checks if all digits are less than the base:
   rule checkDigits(BASE, DS):
      {
         DS -> int[]
      |
         DS -> int[D1::DS1]
         Less(D1, BASE)
         checkDigits(BASE, DS1)
      |
         DS -> int[D1::DS1]
         "Illegal digit " $D1 " in based number with base " $BASE "\n"
      }
// -----------------------------------------------------------------------
proc intToBased(NR:int, BASE:int -> BN:AS_BasedNumber)
   // Converts NR into a based number BN.
   // Expects the NR to be non-negative.
   rule intToBased(NR, BASE -> BN):
      {
         Less(NR, BASE)
         BN <- bn(BASE, int[NR])       // Last (possibly only) digit
      |
         intToBased(NR/BASE, BASE -> bn(_, DIGITS))
         DIGIT <- NR - NR/BASE*BASE    // NR mod BASE
         BN <- bn(BASE, int[DIGIT::DIGITS])
      }

proc basedToInt(BN:AS_BasedNumber -> NR:int)
   // Tries to convert the based number BN into an int value NR.
   // The result NR will be incorrect, if BN is too large.
   rule basedToInt(bn(BASE, DIGITS) -> NR):
      {
         DIGITS -> int[]
         NR <- 0
      |
         DIGITS -> int[D::DS]
         basedToInt(bn(BASE, DS) -> NRDS)
         NR <- D + NRDS*BASE
      }
// -----------------------------------------------------------------------
proc outBasedNumber(BN:AS_BasedNumber)
   // Outputs the based number BN in concrete syntax:
   rule outBasedNumber(bn(BASE, DIGITS))
      "#" $BASE "#" outDigits(DIGITS) "#"

proc outDigits(L:int[])
   // Outputs the elements of L separated by " "
   rule outDigits(DIGITS):
      {
         DIGITS -> int[]       ""
      |
         DIGITS -> int[D]      $D
      |
         DIGITS -> int[D::DS]  outDigits(DS) " " $D
      }
// -----------------------------------------------------------------------
proc tst1(NR:int, BASE:int)
   rule tst1(NR, BASE):
      intToBased(NR, BASE -> BN)
      "NR " $NR " in base " $BASE ": " outBasedNumber(BN) "\n"

proc tst2(NR1:int, BASE:int)
   // Converts the int value NR1 into a based number BN1 and
   // BN1 back into an int value NR2. Outputs NR1 and NR2.
   rule tst2(NR1, BASE):
      intToBased(NR1, BASE -> BN1)
      basedToInt(BN1       -> NR2)
      { Equal(NR1, NR2) "    OK: "  |  "NOT OK: " }
      $NR1 " = " $NR2 "\n"
// -----------------------------------------------------------------------
 root
    "-----------------------------\n"
    CS_BasedNumber(-> BN)
    checkBasedNumber(BN)
    basedToInt(BN  -> NR)
    "Output:\n"
    "BN: " outBasedNumber(BN) "\n"
    "NR: " $NR "\n"
   "-----------------------------\n"
    tst1(0,     2)
    tst1(1,     2)
    tst1(15,    2)
    tst1(4095,  2)
    tst1(4096,  2)
    "-----------------------------\n"
    tst1(0,     5)
    tst1(1,     5)
    tst1(15,    5)
    tst1(4095,  5)
    tst1(4096,  5)
    "-----------------------------\n"
    tst1(0,    10)
    tst1(1,    10)
    tst1(15,   10)
    tst1(4095, 10)
    tst1(4096, 10)
    "-----------------------------\n"
    tst1(0,    16)
    tst1(1,    16)
    tst1(15,   16)
    tst1(4095, 16)
    tst1(4096, 16)
    "-----------------------------\n"
    tst1(0,    1000)
    tst1(1,    1000)
    tst1(15,   1000)
    tst1(4095, 1000)
    tst1(4096, 1000)
    "-----------------------------\n"
    tst2(0,     2)
    tst2(1,     2)
    tst2(15,    2)
    tst2(4095,  2)
    tst2(4096,  2)
    "-----------------------------\n"
    tst2(0,     5)
    tst2(1,     5)
    tst2(15,    5)
    tst2(4095,  5)
    tst2(4096,  5)
    "-----------------------------\n"
    tst2(0,    10)
    tst2(1,    10)
    tst2(15,   10)
    tst2(4095, 10)
    tst2(4096, 10)
    "-----------------------------\n"
    tst2(0,    16)
    tst2(1,    16)
    tst2(15,   16)
    tst2(4095, 16)
    tst2(4096, 16)
    "-----------------------------\n"
    tst2(0,    1000)
    tst2(1,    1000)
    tst2(15,   1000)
    tst2(4095, 1000)
    tst2(4096, 1000)
    "-----------------------------\n"
// ------------------------------------------------------------------------
// Output of this program:
//
// -----------------------------
// Input:
// // A based number with base 100
//
// #100#12 34 56 78 90#
// *** java -classpath . YySupportPackage.Program t03
// -----------------------------
// Output:
// BN: #100#12 34 56 78 90#
// NR: 1234567890
// -----------------------------
// NR 0 in base 2: #2#0#
// NR 1 in base 2: #2#1#
// NR 15 in base 2: #2#1 1 1 1#
// NR 4095 in base 2: #2#1 1 1 1 1 1 1 1 1 1 1 1#
// NR 4096 in base 2: #2#1 0 0 0 0 0 0 0 0 0 0 0 0#
// -----------------------------
// NR 0 in base 5: #5#0#
// NR 1 in base 5: #5#1#
// NR 15 in base 5: #5#3 0#
// NR 4095 in base 5: #5#1 1 2 3 4 0#
// NR 4096 in base 5: #5#1 1 2 3 4 1#
// -----------------------------
// NR 0 in base 10: #10#0#
// NR 1 in base 10: #10#1#
// NR 15 in base 10: #10#1 5#
// NR 4095 in base 10: #10#4 0 9 5#
// NR 4096 in base 10: #10#4 0 9 6#
// -----------------------------
// NR 0 in base 16: #16#0#
// NR 1 in base 16: #16#1#
// NR 15 in base 16: #16#15#
// NR 4095 in base 16: #16#15 15 15#
// NR 4096 in base 16: #16#1 0 0 0#
// -----------------------------
// NR 0 in base 1000: #1000#0#
// NR 1 in base 1000: #1000#1#
// NR 15 in base 1000: #1000#15#
// NR 4095 in base 1000: #1000#4 95#
// NR 4096 in base 1000: #1000#4 96#
// -----------------------------
// 0 = 0 ?
// 1 = 1 ?
// 15 = 15 ?
// 4095 = 4095 ?
// 4096 = 4096 ?
// -----------------------------
// 0 = 0 ?
// 1 = 1 ?
// 15 = 15 ?
// 4095 = 4095 ?
// 4096 = 4096 ?
// -----------------------------
// 0 = 0 ?
// 1 = 1 ?
// 15 = 15 ?
// 4095 = 4095 ?
// 4096 = 4096 ?
// -----------------------------
// 0 = 0 ?
// 1 = 1 ?
// 15 = 15 ?
// 4095 = 4095 ?
// 4096 = 4096 ?
// -----------------------------
// 0 = 0 ?
// 1 = 1 ?
// 15 = 15 ?
// 4095 = 4095 ?
// 4096 = 4096 ?
// -----------------------------
// -----------------------------