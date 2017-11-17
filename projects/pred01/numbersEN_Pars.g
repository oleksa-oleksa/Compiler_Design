// -----------------------------------------------------------------------
// File pred01\numbersEN_Pars.g
// -----------------------------------------------------------------------
// A parser for a list of English words for numbers between 0 and 999
// (between  zero  and  nine hundred and ninety nine)
// -----------------------------------------------------------------------

phrase listOfNumberWords
   rule listOfNumberWords:
      "string" "[" numbers "]"

phrase numbers
   // A list of words for numbers, each number in double quotes:
   rule numbers: "\"" number0_999 "\"" "," numbers
   rule numbers: "\"" number0_999 "\""

phrase number0_999
   // The word for a number between 0 and 999
   rule number0_999: "zero"
   rule number0_999: n100
   rule number0_999: n100 and n1_99
   rule number0_999: n1_99

phrase n100
   // The hundreds part of a number word (optional part)
   // e.g. "one hundred" or "eight hundred"
   rule n100: n1_9 "hundred"

phrase n1_99
   // The word for a number between 1 and 99
   rule n1_99: n1_9
   rule n1_99: n10_19
   rule n1_99: n20_90
   rule n1_99: n20_90 n1_9

phrase  n1_9
   // The word for a number between 1 and 9
   rule n1_9: "one"
   rule n1_9: "two"
   rule n1_9: "three"
   rule n1_9: "four"
   rule n1_9: "five"
   rule n1_9: "six"
   rule n1_9: "seven"
   rule n1_9: "eight"
   rule n1_9: "nine"

phrase  n10_19
   // The word for a number between 10 and 19
   rule n10_19: "ten"
   rule n10_19: "eleven"
   rule n10_19: "twelve"
   rule n10_19: "thirteen"
   rule n10_19: "fourteen"
   rule n10_19: "fifteen"
   rule n10_19: "sixteen"
   rule n10_19: "seventeen"
   rule n10_19: "eighteen"
   rule n10_19: "nineteen"

phrase n20_90
   // The word for a multiple of ten: 20, 30, ..., 90
   rule n20_90: "twenty"
   rule n20_90: "thirty"
   rule n20_90: "fourty"
   rule n20_90: "fifty"
   rule n20_90: "sixty"
   rule n20_90: "seventy"
   rule n20_90: "eighty"
   rule n20_90: "ninety"

phrase and
   // After "hundred" the word "and" is optional
   rule and:
   rule and: "and"


root
   listOfNumberWords
   "No parse error found!\n"