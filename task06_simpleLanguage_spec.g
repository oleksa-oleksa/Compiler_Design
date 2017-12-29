//(@ ------------------------------------------------------------------------
//Vorgegebene Datei spec.g fuer die Aufgabe
//3. Grammatiken B: Einfache Sprachen

//Die Zwischensymbole Gb, Kb und Ziff kann man (ohne viel Schreibarbeit)
//als token-Praedikate definieren.

//Das Startsymbol (hier MyStart) muss immer als erstes phrase-Praedikat
//definiert werden. Das Praedikat MyStart erlaubt es, das "eigentliche
//Startsymbol" an einer beliebigen Stelle des Programms zu vereinbaren.
//------------------------------------------------------------------------ @)

// Task: FS12: Same as FS11, but every word from FS01 or FS04 should be terminated by a number sign "#"

// FS01: Alle nicht-leeren Ziffernfolgen All non-empty numbers (yes: 123, 0, 0007654, no: abc, a123, 123BC, äöüß).  Start symbol: ZiffFo.

// FS04: All non-empty letter sequences that begin with a capital or small letter, but otherwise only consist of (0 or more) small letters (yes: abc, abc, dddeeefff, dddeeefff, a, A, no: AB, endSum, x Y). Start: GK_BuFo.


//=====================================
// Created by Oleksandra Baga, 20.12.17
//=====================================

phrase NZ_Getr_0104
   rule NZ_Getr_0104 : GK_BuFo "#" A
   rule NZ_Getr_0104: ZiffFo "#" B

phrase A
   rule A: ZiffFo "#" B
   rule A:

phrase B
   rule B: GK_BuFo "#" A
   rule B:

phrase ZiffFo
   rule ZiffFo: Ziff digits

phrase digits
   rule digits: Ziff digits
   rule digits:

phrase GK_BuFo
   rule GK_BuFo: Gb words
   rule GK_BuFo: Kb words

phrase words
   rule words: Kb words
   rule words:

token Gb
   <<<[A-Z]>>>

token Kb
   <<<[a-z]>>>

token Ziff
   <<<[0-9]>>>

token SoZe
   <<<[.!?#]>>>

root
   NZ_Getr_0104
   "No parse error found!\n"
