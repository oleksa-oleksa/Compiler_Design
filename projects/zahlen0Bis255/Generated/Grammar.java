//
// GENERATED !
//
package Generated;

import Gently.*;
import Generated.*;

public class Grammar
{

public static int TokenCodes_T_9 = 258;
public static int TokenCodes_T_8 = 259;
public static int TokenCodes_T_7 = 260;
public static int TokenCodes_T_6 = 261;
public static int TokenCodes_T_4 = 262;
public static int TokenCodes_T_3 = 263;
public static int TokenCodes_T_5 = 264;
public static int TokenCodes_T_0 = 265;
public static int TokenCodes_T_25 = 266;
public static int TokenCodes_T_2 = 267;
public static int TokenCodes_T_1 = 268;
public static int TokenCodes_INTEGER = 0;
public static int TokenCodes_STRING = 0;
public static int GetColor(int i)
{
   if (i == TokenCodes_T_1) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T_2) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T_25) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T_0) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T_5) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T_3) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T_4) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T_6) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T_7) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T_8) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T_9) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   return 666;
}
public static String Parser = "Accent";

// (Symbols 1)
static Nonterm Zahlen0Bis255 = new Nonterm("Zahlen0Bis255");
static Nonterm Zahlen0Bis99 = new Nonterm("Zahlen0Bis99");
static Nonterm Ziff0Bis4 = new Nonterm("Ziff0Bis4");
static Nonterm Ziff0Bis5 = new Nonterm("Ziff0Bis5");
static Nonterm Ziff0Bis9 = new Nonterm("Ziff0Bis9");
static Nonterm Ziff1Bis4 = new Nonterm("Ziff1Bis4");
static Nonterm Ziff1Bis9 = new Nonterm("Ziff1Bis9");
// (Symbols 2)

// (Symbols 3) neu
static Token T_9 = new Token("T_9", TokenCodes_T_9,"9"); //1 fix token "9"
static Token T_8 = new Token("T_8", TokenCodes_T_8,"8"); //1 fix token "8"
static Token T_7 = new Token("T_7", TokenCodes_T_7,"7"); //1 fix token "7"
static Token T_6 = new Token("T_6", TokenCodes_T_6,"6"); //1 fix token "6"
static Token T_4 = new Token("T_4", TokenCodes_T_4,"4"); //1 fix token "4"
static Token T_3 = new Token("T_3", TokenCodes_T_3,"3"); //1 fix token "3"
static Token T_5 = new Token("T_5", TokenCodes_T_5,"5"); //1 fix token "5"
static Token T_0 = new Token("T_0", TokenCodes_T_0,"0"); //1 fix token "0"
static Token T_25 = new Token("T_25", TokenCodes_T_25,"25"); //1 fix token "25"
static Token T_2 = new Token("T_2", TokenCodes_T_2,"2"); //1 fix token "2"
static Token T_1 = new Token("T_1", TokenCodes_T_1,"1"); //1 fix token "1"

// (Symbols 4)
// (Symbols WeisserRiese)

// (Symbols 4a XXX)
static Token WeisserRiese_471101 = new Token("WeisserRiese_471101", -1, "<<<(\\r\\n|\\r|\\n|\\t|\\ )+>>>"); // whitespace <<<(\r\n|\r|\n|\t|\ )+>>>
static Token WeisserRiese_4711 = new Token("WeisserRiese_4711", -1, "<<<//[^\\n\\r]*>>>"); // whitespace <<<//[^\n\r]*>>>
public static void DefineGrammar0()
{
   Zahlen0Bis255.Rules = new Rule[] {
   new Rule (0,Zahlen0Bis255, new Symbol[] {
   Zahlen0Bis99
   })
,
   new Rule (1,Zahlen0Bis255, new Symbol[] {
   /*TokenCodes_*/T_1
,
   Ziff0Bis9
,
   Ziff0Bis9
   })
,
   new Rule (2,Zahlen0Bis255, new Symbol[] {
   /*TokenCodes_*/T_2
,
   Ziff0Bis4
,
   Ziff0Bis9
   })
,
   new Rule (3,Zahlen0Bis255, new Symbol[] {
   /*TokenCodes_*/T_25
,
   Ziff0Bis5
   })
   };
   Zahlen0Bis99.Rules = new Rule[] {
   new Rule (4,Zahlen0Bis99, new Symbol[] {
   Ziff0Bis9
   })
,
   new Rule (5,Zahlen0Bis99, new Symbol[] {
   Ziff1Bis9
,
   Ziff0Bis9
   })
   };
   Ziff0Bis4.Rules = new Rule[] {
   new Rule (6,Ziff0Bis4, new Symbol[] {
   /*TokenCodes_*/T_0
   })
,
   new Rule (7,Ziff0Bis4, new Symbol[] {
   Ziff1Bis4
   })
   };
   Ziff0Bis5.Rules = new Rule[] {
   new Rule (8,Ziff0Bis5, new Symbol[] {
   Ziff0Bis4
   })
,
   new Rule (9,Ziff0Bis5, new Symbol[] {
   /*TokenCodes_*/T_5
   })
   };
   Ziff0Bis9.Rules = new Rule[] {
   new Rule (10,Ziff0Bis9, new Symbol[] {
   /*TokenCodes_*/T_0
   })
,
   new Rule (11,Ziff0Bis9, new Symbol[] {
   Ziff1Bis9
   })
   };
   Ziff1Bis4.Rules = new Rule[] {
   new Rule (12,Ziff1Bis4, new Symbol[] {
   /*TokenCodes_*/T_1
   })
,
   new Rule (13,Ziff1Bis4, new Symbol[] {
   /*TokenCodes_*/T_2
   })
,
   new Rule (14,Ziff1Bis4, new Symbol[] {
   /*TokenCodes_*/T_3
   })
,
   new Rule (15,Ziff1Bis4, new Symbol[] {
   /*TokenCodes_*/T_4
   })
   };
   Ziff1Bis9.Rules = new Rule[] {
   new Rule (16,Ziff1Bis9, new Symbol[] {
   Ziff1Bis4
   })
,
   new Rule (17,Ziff1Bis9, new Symbol[] {
   /*TokenCodes_*/T_5
   })
,
   new Rule (18,Ziff1Bis9, new Symbol[] {
   /*TokenCodes_*/T_6
   })
,
   new Rule (19,Ziff1Bis9, new Symbol[] {
   /*TokenCodes_*/T_7
   })
,
   new Rule (20,Ziff1Bis9, new Symbol[] {
   /*TokenCodes_*/T_8
   })
,
   new Rule (21,Ziff1Bis9, new Symbol[] {
   /*TokenCodes_*/T_9
   })
   };

ExhaustiveParser.UserRoot = Zahlen0Bis255;
} // DefineGrammar

public static void DefineGrammar()
{
   DefineGrammar0();
}

public static void SwitchSemAction(EarleyRuntime RT, int ruleid)
{
   switch (ruleid) {
   case 0:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Zahlen0Bis255#1"
      , new JavaNode[]{
RT.DollarI(1)
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 1:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Zahlen0Bis255#2"
      , new JavaNode[]{
RT.DollarI(2)
,RT.DollarI(3)
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(3), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 2:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Zahlen0Bis255#3"
      , new JavaNode[]{
RT.DollarI(2)
,RT.DollarI(3)
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(3), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 3:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Zahlen0Bis255#4"
      , new JavaNode[]{
RT.DollarI(2)
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(2), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 4:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Zahlen0Bis99#1"
      , new JavaNode[]{
RT.DollarI(1)
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 5:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Zahlen0Bis99#2"
      , new JavaNode[]{
RT.DollarI(1)
,RT.DollarI(2)
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(2), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 6:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Ziff0Bis4#1"
      , new JavaNode[]{
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 7:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Ziff0Bis4#2"
      , new JavaNode[]{
RT.DollarI(1)
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 8:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Ziff0Bis5#1"
      , new JavaNode[]{
RT.DollarI(1)
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 9:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Ziff0Bis5#2"
      , new JavaNode[]{
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 10:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Ziff0Bis9#1"
      , new JavaNode[]{
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 11:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Ziff0Bis9#2"
      , new JavaNode[]{
RT.DollarI(1)
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 12:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Ziff1Bis4#1"
      , new JavaNode[]{
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 13:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Ziff1Bis4#2"
      , new JavaNode[]{
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 14:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Ziff1Bis4#3"
      , new JavaNode[]{
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 15:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Ziff1Bis4#4"
      , new JavaNode[]{
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 16:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Ziff1Bis9#1"
      , new JavaNode[]{
RT.DollarI(1)
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 17:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Ziff1Bis9#2"
      , new JavaNode[]{
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 18:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Ziff1Bis9#3"
      , new JavaNode[]{
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 19:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Ziff1Bis9#4"
      , new JavaNode[]{
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 20:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Ziff1Bis9#5"
      , new JavaNode[]{
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 21:
   // yyaction (alternative)
   { // EAR_Translation default
   } // EAR_Translation default
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"Ziff1Bis9#6"
      , new JavaNode[]{
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   } // switch
} // Semantic Actions

}
