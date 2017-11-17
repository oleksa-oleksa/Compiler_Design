;; Produced by JasminVisitor (BCEL)
;; http://bcel.sourceforge.net/
;; Sat Aug 04 15:41:59 CEST 2012

.source Target.j
.class public Target
.super java/lang/Object


; -------------------------------------------------------------------------
.method public <init>()V
.limit stack  1
.limit locals 1
.var 0 is this LTarget; from Label0 to Label1

Label0:
   aload_0                                                  ; 0000|2A 
   invokespecial java/lang/Object/<init>()V                 ; 0001|B7 00 4E 
Label1:
   return                                                   ; 0004|B1 

.end method ; <init>
; -------------------------------------------------------------------------
.method public static main([Ljava/lang/String;)V
.limit stack  10
.limit locals 1
.var 0 is arg0 [Ljava/lang/String; from Label12 to Label13

Label12:
   ldc "-------------------------------"                    ; 0000|12 49 
   invokestatic RTS/plnString(Ljava/lang/String;)V          ; 0002|B8 00 39 
   ldc "Here we go!"                                        ; 0005|12 47 
   invokestatic RTS/plnString(Ljava/lang/String;)V          ; 0007|B8 00 39 
   ldc 1                                                    ; 000a|12 16 
   ldc 0                                                    ; 000c|12 17 
   iand                                                     ; 000e|7E 
   invokestatic RTS/plnBool(I)V                             ; 000f|B8 00 0E 
   ldc 3                                                    ; 0012|12 14 
   ldc 2                                                    ; 0014|12 15 
   iadd                                                     ; 0016|60 
   invokestatic RTS/plnInt(I)V                              ; 0017|B8 00 4B 
   ldc 3                                                    ; 001a|12 14 
   ldc 2                                                    ; 001c|12 15 
   isub                                                     ; 001e|64 
   invokestatic RTS/plnInt(I)V                              ; 001f|B8 00 4B 
   ldc 3                                                    ; 0022|12 14 
   ldc 2                                                    ; 0024|12 15 
   imul                                                     ; 0026|68 
   invokestatic RTS/plnInt(I)V                              ; 0027|B8 00 4B 
   ldc 3                                                    ; 002a|12 14 
   ldc 2                                                    ; 002c|12 15 
   idiv                                                     ; 002e|6C 
   invokestatic RTS/plnInt(I)V                              ; 002f|B8 00 4B 
   ldc 1                                                    ; 0032|12 16 
   ldc 1                                                    ; 0034|12 16 
   ixor                                                     ; 0036|82 
   invokestatic RTS/plnBool(I)V                             ; 0037|B8 00 0E 
   ldc 1                                                    ; 003a|12 16 
   ldc 0                                                    ; 003c|12 17 
   ixor                                                     ; 003e|82 
   invokestatic RTS/plnBool(I)V                             ; 003f|B8 00 0E 
   ldc 0                                                    ; 0042|12 17 
   ldc 123                                                  ; 0044|12 0F 
   isub                                                     ; 0046|64 
   invokestatic RTS/plnInt(I)V                              ; 0047|B8 00 4B 
   ldc 0                                                    ; 004a|12 17 
   ldc 0                                                    ; 004c|12 17 
   ldc 123                                                  ; 004e|12 0F 
   isub                                                     ; 0050|64 
   isub                                                     ; 0051|64 
   invokestatic RTS/plnInt(I)V                              ; 0052|B8 00 4B 
   iconst_1                                                 ; 0055|04 
   ldc 3                                                    ; 0056|12 14 
   ldc 2                                                    ; 0058|12 15 
   if_icmplt Label0                                         ; 005a|A1 00 05 
   pop                                                      ; 005d|57 
   iconst_0                                                 ; 005e|03 
Label0:
   invokestatic RTS/plnBool(I)V                             ; 005f|B8 00 0E 
   iconst_1                                                 ; 0062|04 
   ldc 3                                                    ; 0063|12 14 
   ldc 2                                                    ; 0065|12 15 
   if_icmple Label1                                         ; 0067|A4 00 05 
   pop                                                      ; 006a|57 
   iconst_0                                                 ; 006b|03 
Label1:
   invokestatic RTS/plnBool(I)V                             ; 006c|B8 00 0E 
   iconst_1                                                 ; 006f|04 
   ldc 3                                                    ; 0070|12 14 
   ldc 2                                                    ; 0072|12 15 
   if_icmpeq Label2                                         ; 0074|9F 00 05 
   pop                                                      ; 0077|57 
   iconst_0                                                 ; 0078|03 
Label2:
   invokestatic RTS/plnBool(I)V                             ; 0079|B8 00 0E 
   iconst_1                                                 ; 007c|04 
   ldc 3                                                    ; 007d|12 14 
   ldc 2                                                    ; 007f|12 15 
   if_icmpne Label3                                         ; 0081|A0 00 05 
   pop                                                      ; 0084|57 
   iconst_0                                                 ; 0085|03 
Label3:
   invokestatic RTS/plnBool(I)V                             ; 0086|B8 00 0E 
   iconst_1                                                 ; 0089|04 
   ldc 2                                                    ; 008a|12 15 
   ldc 3                                                    ; 008c|12 14 
   if_icmplt Label4                                         ; 008e|A1 00 05 
   pop                                                      ; 0091|57 
   iconst_0                                                 ; 0092|03 
Label4:
   invokestatic RTS/plnBool(I)V                             ; 0093|B8 00 0E 
   iconst_1                                                 ; 0096|04 
   ldc 2                                                    ; 0097|12 15 
   ldc 3                                                    ; 0099|12 14 
   if_icmple Label5                                         ; 009b|A4 00 05 
   pop                                                      ; 009e|57 
   iconst_0                                                 ; 009f|03 
Label5:
   invokestatic RTS/plnBool(I)V                             ; 00a0|B8 00 0E 
   iconst_1                                                 ; 00a3|04 
   ldc 1                                                    ; 00a4|12 16 
   ldc 0                                                    ; 00a6|12 17 
   if_icmplt Label6                                         ; 00a8|A1 00 05 
   pop                                                      ; 00ab|57 
   iconst_0                                                 ; 00ac|03 
Label6:
   invokestatic RTS/plnBool(I)V                             ; 00ad|B8 00 0E 
   iconst_1                                                 ; 00b0|04 
   ldc 1                                                    ; 00b1|12 16 
   ldc 0                                                    ; 00b3|12 17 
   if_icmple Label7                                         ; 00b5|A4 00 05 
   pop                                                      ; 00b8|57 
   iconst_0                                                 ; 00b9|03 
Label7:
   invokestatic RTS/plnBool(I)V                             ; 00ba|B8 00 0E 
   iconst_1                                                 ; 00bd|04 
   ldc 1                                                    ; 00be|12 16 
   ldc 0                                                    ; 00c0|12 17 
   if_icmpeq Label8                                         ; 00c2|9F 00 05 
   pop                                                      ; 00c5|57 
   iconst_0                                                 ; 00c6|03 
Label8:
   invokestatic RTS/plnBool(I)V                             ; 00c7|B8 00 0E 
   iconst_1                                                 ; 00ca|04 
   ldc 1                                                    ; 00cb|12 16 
   ldc 0                                                    ; 00cd|12 17 
   if_icmpne Label9                                         ; 00cf|A0 00 05 
   pop                                                      ; 00d2|57 
   iconst_0                                                 ; 00d3|03 
Label9:
   invokestatic RTS/plnBool(I)V                             ; 00d4|B8 00 0E 
   iconst_1                                                 ; 00d7|04 
   ldc 0                                                    ; 00d8|12 17 
   ldc 1                                                    ; 00da|12 16 
   if_icmplt Label10                                        ; 00dc|A1 00 05 
   pop                                                      ; 00df|57 
   iconst_0                                                 ; 00e0|03 
Label10:
   invokestatic RTS/plnBool(I)V                             ; 00e1|B8 00 0E 
   iconst_1                                                 ; 00e4|04 
   ldc 0                                                    ; 00e5|12 17 
   ldc 1                                                    ; 00e7|12 16 
   if_icmple Label11                                        ; 00e9|A4 00 05 
   pop                                                      ; 00ec|57 
   iconst_0                                                 ; 00ed|03 
Label11:
   invokestatic RTS/plnBool(I)V                             ; 00ee|B8 00 0E 
   ldc "BBB"                                                ; 00f1|12 4F 
   ldc "AAA"                                                ; 00f3|12 0B 
   invokestatic RTS/lessThan(Ljava/lang/String;Ljava/lang/String;)I
                                                            ; 00f5|B8 00 3D 
   invokestatic RTS/plnBool(I)V                             ; 00f8|B8 00 0E 
   ldc "BBB"                                                ; 00fb|12 4F 
   ldc "AAA"                                                ; 00fd|12 0B 
   invokestatic RTS/lessEquals(Ljava/lang/String;Ljava/lang/String;)I
                                                            ; 00ff|B8 00 19 
   invokestatic RTS/plnBool(I)V                             ; 0102|B8 00 0E 
   ldc "BBB"                                                ; 0105|12 4F 
   ldc "AAA"                                                ; 0107|12 0B 
   invokestatic RTS/equals(Ljava/lang/String;Ljava/lang/String;)I
                                                            ; 0109|B8 00 2A 
   invokestatic RTS/plnBool(I)V                             ; 010c|B8 00 0E 
   ldc "BBB"                                                ; 010f|12 4F 
   ldc "AAA"                                                ; 0111|12 0B 
   invokestatic RTS/unEquals(Ljava/lang/String;Ljava/lang/String;)I
                                                            ; 0113|B8 00 31 
   invokestatic RTS/plnBool(I)V                             ; 0116|B8 00 0E 
   ldc "AAA"                                                ; 0119|12 0B 
   ldc "BBB"                                                ; 011b|12 4F 
   invokestatic RTS/lessThan(Ljava/lang/String;Ljava/lang/String;)I
                                                            ; 011d|B8 00 3D 
   invokestatic RTS/plnBool(I)V                             ; 0120|B8 00 0E 
   ldc "AAA"                                                ; 0123|12 0B 
   ldc "BBB"                                                ; 0125|12 4F 
   invokestatic RTS/lessEquals(Ljava/lang/String;Ljava/lang/String;)I
                                                            ; 0127|B8 00 19 
   invokestatic RTS/plnBool(I)V                             ; 012a|B8 00 0E 
   ldc "10"                                                 ; 012d|12 20 
   ldc "true"                                               ; 012f|12 1D 
   invokestatic RTS/concat(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
                                                            ; 0131|B8 00 44 
   invokestatic RTS/plnString(Ljava/lang/String;)V          ; 0134|B8 00 39 
   ldc 11                                                   ; 0137|12 26 
   invokestatic RTS/intToString(I)Ljava/lang/String;        ; 0139|B8 00 2C 
   ldc "true"                                               ; 013c|12 1D 
   invokestatic RTS/concat(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
                                                            ; 013e|B8 00 44 
   invokestatic RTS/plnString(Ljava/lang/String;)V          ; 0141|B8 00 39 
   ldc "12"                                                 ; 0144|12 1F 
   ldc 1                                                    ; 0146|12 16 
   invokestatic RTS/boolToString(I)Ljava/lang/String;       ; 0148|B8 00 41 
   invokestatic RTS/concat(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
                                                            ; 014b|B8 00 44 
   invokestatic RTS/plnString(Ljava/lang/String;)V          ; 014e|B8 00 39 
   ldc 13                                                   ; 0151|12 24 
   invokestatic RTS/intToString(I)Ljava/lang/String;        ; 0153|B8 00 2C 
   ldc 1                                                    ; 0156|12 16 
   invokestatic RTS/boolToString(I)Ljava/lang/String;       ; 0158|B8 00 41 
   invokestatic RTS/concat(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
                                                            ; 015b|B8 00 44 
   invokestatic RTS/plnString(Ljava/lang/String;)V          ; 015e|B8 00 39 
   ldc 1                                                    ; 0161|12 16 
   ldc 1                                                    ; 0163|12 16 
   ldc 0                                                    ; 0165|12 17 
   ixor                                                     ; 0167|82 
   iand                                                     ; 0168|7E 
   ldc 1                                                    ; 0169|12 16 
   ior                                                      ; 016b|80 
   invokestatic RTS/plnBool(I)V                             ; 016c|B8 00 0E 
   ldc 10                                                   ; 016f|12 27 
   ldc 0                                                    ; 0171|12 17 
   ldc 20                                                   ; 0173|12 11 
   isub                                                     ; 0175|64 
   ldc 0                                                    ; 0176|12 17 
   ldc 30                                                   ; 0178|12 07 
   isub                                                     ; 017a|64 
   imul                                                     ; 017b|68 
   ldc 40                                                   ; 017c|12 4D 
   idiv                                                     ; 017e|6C 
   iadd                                                     ; 017f|60 
   invokestatic RTS/plnInt(I)V                              ; 0180|B8 00 4B 
   ldc 1                                                    ; 0183|12 16 
   ldc 1                                                    ; 0185|12 16 
   ldc 1                                                    ; 0187|12 16 
   ldc 0                                                    ; 0189|12 17 
   ixor                                                     ; 018b|82 
   ixor                                                     ; 018c|82 
   ixor                                                     ; 018d|82 
   invokestatic RTS/plnBool(I)V                             ; 018e|B8 00 0E 
   ldc "That's all!"                                        ; 0191|12 29 
   invokestatic RTS/plnString(Ljava/lang/String;)V          ; 0193|B8 00 39 
   ldc "-------------------------------"                    ; 0196|12 49 
   invokestatic RTS/plnString(Ljava/lang/String;)V          ; 0198|B8 00 39 
Label13:
   return                                                   ; 019b|B1 

.end method ; main
; -------------------------------------------------------------------------
