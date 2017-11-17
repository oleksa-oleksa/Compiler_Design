// Datei Bloecke.java
/* ------------------------------------------------------------------------
In der main-Methode dieser Klasse werden 6 Variablen vereinbart:
1 Parameter (wie in allen main-Methoden) namens v00 und
5 lokale Variablen (namens v10, v20, ..., v50).
Die Vereinbarungen der lokalen Variablen sind auf 3 geschachtelte Bloecke
verteilt (wobei der Methodenrumpf der aeusserste Block ist).
Waehrend der Ausfuehrung der main-Methode existieren immer nur 4 Variablen,
die im Bytecode die Nummern 0 bis 3 haben. Die 6 Variablen v00 bis v50
sind den 4 Variablen 0 bis 3 wie folgt zugeordnet:

Variable 0: immer v00 (Typ String[])
Variable 1: immer v10 (Typ int)
Variable 2: erst  v20 (Typ String), spaeter v50 (Typ int)
Variable 3: erst  v30 (Type int)  , spaeter v40 (Typ String)
------------------------------------------------------------------------ */
class Bloecke {
   // ---------------------------------------------------------------------
   static public void main(String[] v00) {

                              // Variablen-Nr
                              // im Bytecode:
      int v10 = 10;           //   1
      {
         String v20 = "20";   //   2
         {
            int v30 = 30;     //   3
         }
         String v40 = "40";   //   3
      }
      int v50 = 50;           //   2

   } // main
   // ---------------------------------------------------------------------
} // class Bloecke
/* ------------------------------------------------------------------------
Wenn man aus der obigen Klasse mit dem Sun-Compiler eine Bytecode-Datei
Bloecke.class erzeugt und den Back-Assembler JasminVisitor auf diese
Bytecode-Datei anwendet, erhaelt man die folgende Jasmin-Datei Bloecke.j:

;; Produced by JasminVisitor (BCEL)
;; http://bcel.sourceforge.net/
;; Tue Jul 31 22:15:05 CEST 2012

.source Bloecke.java
.class  Bloecke
.super java/lang/Object


; -------------------------------------------------------------------------
.method  <init>()V
.limit stack  1
.limit locals 1
.var 0 is this LBloecke; from Label0 to Label1

Label0:
.line 18
   aload_0                                                  ; 0000|2A
   invokespecial java/lang/Object/<init>()V                 ; 0001|B7 00 01
Label1:
   return                                                   ; 0004|B1

.end method ; <init>
; -------------------------------------------------------------------------
.method public static main([Ljava/lang/String;)V
.limit stack  1
.limit locals 4
.var 0 is arg0 [Ljava/lang/String; from Label0 to Label1

Label0:
.line 24
   bipush 10                                                ; 0000|10 0A
   istore_1                                                 ; 0002|3C
.line 26
   ldc "20"                                                 ; 0003|12 02
   astore_2                                                 ; 0005|4D
.line 28
   bipush 30                                                ; 0006|10 1E
   istore_3                                                 ; 0008|3E
.line 30
   ldc "40"                                                 ; 0009|12 03
   astore_3                                                 ; 000b|4E
.line 32
   bipush 50                                                ; 000c|10 32
   istore_2                                                 ; 000e|3D
Label1:
.line 34
   return                                                   ; 000f|B1

.end method ; main
; -------------------------------------------------------------------------

Erlaeuterungen:
Der Konstruktor (method  <init>()V) hat 0 Parameter und den Ergebnistyp
void. Innerhalb des Konstruktors ist die Variable 0 gleich der Variablen
this vom Typ Bloecke. Waehrend der Ausfuehrung des Konstruktors gibt es
nur eine Variable (limit locals 1).

In der Methode main ist die Variable 0 gleich dem ersten (und einzigen)
Parameter arg0. Waehrend der Ausfuehrung der main-Methode gibt es hoechstens
4 Variablen (limit locals 4).
------------------------------------------------------------------------ */
