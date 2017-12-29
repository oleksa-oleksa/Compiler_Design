//
// GENERATED !
//
package Generated;

import Gently.*;
import Generated.*;

public class Grammar
{

public static int TokenCodes_Gb = 258;
public static int TokenCodes_Kb = 259;
public static int TokenCodes_Ziff = 260;
public static int TokenCodes_SoZe = 261;
public static int TokenCodes_T__sharp_ = 262;
public static int TokenCodes_INTEGER = 0;
public static int TokenCodes_STRING = 0;
public static int GetColor(int i)
{
   if (i == TokenCodes_T__sharp_) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_SoZe) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_Ziff) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_Kb) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_Gb) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   return 666;
}
public static String Parser = "Accent";

// (Symbols 1)
static Nonterm NZ_Getr_0104 = new Nonterm("NZ_Getr_0104");
static Nonterm A = new Nonterm("A");
static Nonterm B = new Nonterm("B");
static Nonterm ZiffFo = new Nonterm("ZiffFo");
static Nonterm digits = new Nonterm("digits");
static Nonterm GK_BuFo = new Nonterm("GK_BuFo");
static Nonterm words = new Nonterm("words");
static Token Gb = new Token("Gb", TokenCodes_Gb,"<<<[A-Z]>>>" );//new Gently.Converter()); //2 noconverter flex token <<<[A-Z]>>>
static Token Kb = new Token("Kb", TokenCodes_Kb,"<<<[a-z]>>>" );//new Gently.Converter()); //2 noconverter flex token <<<[a-z]>>>
static Token Ziff = new Token("Ziff", TokenCodes_Ziff,"<<<[0-9]>>>" );//new Gently.Converter()); //2 noconverter flex token <<<[0-9]>>>
static Token SoZe = new Token("SoZe", TokenCodes_SoZe,"<<<[.!?#]>>>" );//new Gently.Converter()); //2 noconverter flex token <<<[.!?#]>>>
// (Symbols 2)

// (Symbols 3) neu
static Token T__sharp_ = new Token("T__sharp_", TokenCodes_T__sharp_,"#"); //1 fix token "#"

// (Symbols 4)
// (Symbols WeisserRiese)

// (Symbols 4a XXX)
static Token WeisserRiese_471101 = new Token("WeisserRiese_471101", -1, "<<<(\\r\\n|\\r|\\n|\\t|\\ )+>>>"); // whitespace <<<(\r\n|\r|\n|\t|\ )+>>>
static Token WeisserRiese_4711 = new Token("WeisserRiese_4711", -1, "<<<//[^\\n\\r]*>>>"); // whitespace <<<//[^\n\r]*>>>
public static void DefineGrammar0()
{
   NZ_Getr_0104.Rules = new Rule[] {
   new Rule (0,NZ_Getr_0104, new Symbol[] {
   GK_BuFo
,
   /*TokenCodes_*/T__sharp_
,
   A
   })
,
   new Rule (1,NZ_Getr_0104, new Symbol[] {
   ZiffFo
,
   /*TokenCodes_*/T__sharp_
,
   B
   })
   };
   A.Rules = new Rule[] {
   new Rule (2,A, new Symbol[] {
   ZiffFo
,
   /*TokenCodes_*/T__sharp_
,
   B
   })
,
   new Rule (3,A, new Symbol[] {
   })
   };
   B.Rules = new Rule[] {
   new Rule (4,B, new Symbol[] {
   GK_BuFo
,
   /*TokenCodes_*/T__sharp_
,
   A
   })
,
   new Rule (5,B, new Symbol[] {
   })
   };
   ZiffFo.Rules = new Rule[] {
   new Rule (6,ZiffFo, new Symbol[] {
   Ziff
,
   digits
   })
   };
   digits.Rules = new Rule[] {
   new Rule (7,digits, new Symbol[] {
   Ziff
,
   digits
   })
,
   new Rule (8,digits, new Symbol[] {
   })
   };
   GK_BuFo.Rules = new Rule[] {
   new Rule (9,GK_BuFo, new Symbol[] {
   Gb
,
   words
   })
,
   new Rule (10,GK_BuFo, new Symbol[] {
   Kb
,
   words
   })
   };
   words.Rules = new Rule[] {
   new Rule (11,words, new Symbol[] {
   Kb
,
   words
   })
,
   new Rule (12,words, new Symbol[] {
   })
   };

ExhaustiveParser.UserRoot = NZ_Getr_0104;
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
"NZ_Getr_0104#1"
      , new JavaNode[]{
RT.DollarI(1)
,RT.DollarI(3)
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(3), x, 0);
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
"NZ_Getr_0104#2"
      , new JavaNode[]{
RT.DollarI(1)
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
"A#1"
      , new JavaNode[]{
RT.DollarI(1)
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
"A#2"
      , new JavaNode[]{
})
      ;
      Gently.SemanticActions.SourceRangeEmpty(x);
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
"B#1"
      , new JavaNode[]{
RT.DollarI(1)
,RT.DollarI(3)
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(3), x, 0);
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
"B#2"
      , new JavaNode[]{
})
      ;
      Gently.SemanticActions.SourceRangeEmpty(x);
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
"ZiffFo#1"
      , new JavaNode[]{
RT.DollarI(1)
,RT.DollarI(2)
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(2), x, 0);
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
"digits#1"
      , new JavaNode[]{
RT.DollarI(1)
,RT.DollarI(2)
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(2), x, 0);
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
"digits#2"
      , new JavaNode[]{
})
      ;
      Gently.SemanticActions.SourceRangeEmpty(x);
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
"GK_BuFo#1"
      , new JavaNode[]{
RT.DollarI(1)
,RT.DollarI(2)
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(2), x, 0);
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
"GK_BuFo#2"
      , new JavaNode[]{
RT.DollarI(1)
,RT.DollarI(2)
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(2), x, 0);
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
"words#1"
      , new JavaNode[]{
RT.DollarI(1)
,RT.DollarI(2)
})
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(2), x, 0);
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
"words#2"
      , new JavaNode[]{
})
      ;
      Gently.SemanticActions.SourceRangeEmpty(x);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   } // switch
} // Semantic Actions

}
