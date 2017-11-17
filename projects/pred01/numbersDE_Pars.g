// -----------------------------------------------------------------------
// File pred01\numbersDE_Pars.g
// -----------------------------------------------------------------------
// A parser for a list of German words for numbers between 0 and 999
// (zwischen null und neunhundertundneunundneunzig)
// including "ein", "eine" and "eins"
// (e.g. "dreihundertein" [Euro, Autos], "dreihunderteine" [DM] and
// "dreihunderteins" when just counting)
// and with or without the optional "und" after "hundert"
// (e.g. "hundertunddrei" and "hundertdrei" are accepted).
// -----------------------------------------------------------------------

phrase listOfNumberWords
   rule listOfNumberWords:
      "string" "[" numbers "]"

phrase numbers
   // A list of words for numbers, each number in double quotes:
   rule numbers: "\"" number0_999 "\"" "," numbers
   rule numbers: "\"" number0_999 "\""

phrase number0_999
   // The German word for a number between 0 and 999
   rule number0_999: "null"
   rule number0_999: n100
   rule number0_999: n100 und n1_99
   rule number0_999: n1_99

phrase n100
   // The hundreds part of a number word (optional part)
   // e.g. "hundert" or "einhundert" or "dreihundert"
   rule n100: "hundert"
   rule n100: n1_9 "hundert"

phrase n1_99
   // The word for a number between 1 and 99
   rule n1_99: n1_9G
   rule n1_99: n10_19
   rule n1_99: n20_90
   rule n1_99: n1_9G "und" n20_90

phrase  n1_9
   // The word for a number between 1 and 9
   // (only masculine "ein")
   rule n1_9:  "ein"
   rule n1_9:  n2_9

phrase  n1_9G
   // The word for a number between 1 and 9
   // (G like "gendered")
   rule n1_9G: "ein"
   rule n1_9G: "eine"
   rule n1_9G: "eins"
   rule n1_9G: n2_9

phrase  n2_9
   // The word for a number between 2 and 9
   rule n2_9: "zwei"
   rule n2_9: "drei"
   rule n2_9: "vier"
   rule n2_9: "fuenf"
   rule n2_9: "sechs"
   rule n2_9: "sieben"
   rule n2_9: "acht"
   rule n2_9: "neun"

phrase  n10_19
   // The word for a number between 10 and 19
   rule n10_19: "zehn"
   rule n10_19: "elf"
   rule n10_19: "zwoelf"
   rule n10_19: "dreizehn"
   rule n10_19: "vierzehn"
   rule n10_19: "fuenfzehn"
   rule n10_19: "sechzehn"
   rule n10_19: "siebzehn"
   rule n10_19: "achtzehn"
   rule n10_19: "neunzehn"

phrase n20_90
   // The word for a multiple of ten: 20, 30, ..., 90
   rule n20_90: "zwanzig"
   rule n20_90: "dreissig"
   rule n20_90: "vierzig"
   rule n20_90: "fuenfzig"
   rule n20_90: "sechzig"
   rule n20_90: "siebzig"
   rule n20_90: "achtzig"
   rule n20_90: "neunzig"

phrase und
   // After "hundert" the word "und" is optional
   rule und:
   rule und: "und"
// -----------------------------------------------------------------------
whitespace
   <<<//.*|\ |\t|\r|\n>>>
// -----------------------------------------------------------------------

root
   listOfNumberWords
   "No parse error found!\n"