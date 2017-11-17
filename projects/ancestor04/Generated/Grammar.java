//
// GENERATED !
//
package Generated;

import Gently.*;
import Generated.*;

public class Grammar
{

public static int TokenCodes_T_great = 258;
public static int TokenCodes_T_grand = 259;
public static int TokenCodes_T_father = 260;
public static int TokenCodes_T_mother = 261;
public static int TokenCodes_INTEGER = 0;
public static int TokenCodes_STRING = 0;
public static int GetColor(int i)
{
   if (i == TokenCodes_T_mother) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T_father) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T_grand) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T_great) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   return 666;
}
public static String Parser = "Accent";

// (Symbols 1)
static Nonterm ancestor = new Nonterm("ancestor");
static Nonterm ancestor1 = new Nonterm("ancestor1");
static Nonterm ancestor2 = new Nonterm("ancestor2");
static Nonterm ancestor3 = new Nonterm("ancestor3");
// (Symbols 2)

// (Symbols 3) neu
static Token T_great = new Token("T_great", TokenCodes_T_great,"great"); //1 fix token "great"
static Token T_grand = new Token("T_grand", TokenCodes_T_grand,"grand"); //1 fix token "grand"
static Token T_father = new Token("T_father", TokenCodes_T_father,"father"); //1 fix token "father"
static Token T_mother = new Token("T_mother", TokenCodes_T_mother,"mother"); //1 fix token "mother"

// (Symbols 4)
// (Symbols WeisserRiese)

// (Symbols 4a XXX)
static Token WeisserRiese_471101 = new Token("WeisserRiese_471101", -1, "<<<(\\r\\n|\\r|\\n|\\t|\\ )+>>>"); // whitespace <<<(\r\n|\r|\n|\t|\ )+>>>
static Token WeisserRiese_4711 = new Token("WeisserRiese_4711", -1, "<<<//[^\\n\\r]*>>>"); // whitespace <<<//[^\n\r]*>>>
public static void DefineGrammar0()
{
   ancestor.Rules = new Rule[] {
   new Rule (0,ancestor, new Symbol[] {
   ancestor1
   })
,
   new Rule (1,ancestor, new Symbol[] {
   ancestor2
   })
,
   new Rule (2,ancestor, new Symbol[] {
   ancestor3
   })
   };
   ancestor1.Rules = new Rule[] {
   new Rule (3,ancestor1, new Symbol[] {
   /*TokenCodes_*/T_mother
   })
,
   new Rule (4,ancestor1, new Symbol[] {
   /*TokenCodes_*/T_father
   })
   };
   ancestor2.Rules = new Rule[] {
   new Rule (5,ancestor2, new Symbol[] {
   /*TokenCodes_*/T_grand
,
   ancestor1
   })
   };
   ancestor3.Rules = new Rule[] {
   new Rule (6,ancestor3, new Symbol[] {
   /*TokenCodes_*/T_great
,
   ancestor2
   })
,
   new Rule (7,ancestor3, new Symbol[] {
   /*TokenCodes_*/T_great
,
   ancestor3
   })
   };

ExhaustiveParser.UserRoot = ancestor;
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
   { // EAR_Translation
      JavaNode x =
RT.EarleyStack(1)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 1:
   // yyaction (alternative)
   { // EAR_Translation
      JavaNode x =
RT.EarleyStack(1)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 2:
   // yyaction (alternative)
   { // EAR_Translation
      JavaNode x =
RT.EarleyStack(1)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 3:
   // yyaction (alternative)
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode (
"SeqOf-string"
, new JavaNode [] {
new JavaStringValue( "mutter" )
,
NodeFactory.NewNode (
"NilOf-string"
,  new JavaNode [] {})
}
)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 4:
   // yyaction (alternative)
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode (
"SeqOf-string"
, new JavaNode [] {
new JavaStringValue( "vater" )
,
NodeFactory.NewNode (
"NilOf-string"
,  new JavaNode [] {})
}
)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 5:
   // yyaction (alternative)
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode (
"SeqOf-string"
, new JavaNode [] {
new JavaStringValue( "gross" )
,
RT.EarleyStack(2)
}
)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(2), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 6:
   // yyaction (alternative)
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode (
"SeqOf-string"
, new JavaNode [] {
new JavaStringValue( "ur" )
,
RT.EarleyStack(2)
}
)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(2), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 7:
   // yyaction (alternative)
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode (
"SeqOf-string"
, new JavaNode [] {
new JavaStringValue( "ur" )
,
RT.EarleyStack(2)
}
)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(2), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   } // switch
} // Semantic Actions

}
