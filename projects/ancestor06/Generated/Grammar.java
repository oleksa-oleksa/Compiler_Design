//
// GENERATED !
//
package Generated;

import Gently.*;
import Generated.*;

public class Grammar
{

public static int TokenCodes_T_Mary = 258;
public static int TokenCodes_T_John = 259;
public static int TokenCodes_T_the_32_mother_32_of = 260;
public static int TokenCodes_T_the_32_father_32_of = 261;
public static int TokenCodes_T_The_32_mother_32_of = 262;
public static int TokenCodes_T_The_32_father_32_of = 263;
public static int TokenCodes_INTEGER = 0;
public static int TokenCodes_STRING = 0;
public static int GetColor(int i)
{
   if (i == TokenCodes_T_The_32_father_32_of) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T_The_32_mother_32_of) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T_the_32_father_32_of) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T_the_32_mother_32_of) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T_John) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T_Mary) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   return 666;
}
public static String Parser = "Accent";

// (Symbols 1)
static Nonterm ancestor = new Nonterm("ancestor");
// (Symbols 2)

// (Symbols 3) neu
static Token T_Mary = new Token("T_Mary", TokenCodes_T_Mary,"Mary"); //1 fix token "Mary"
static Token T_John = new Token("T_John", TokenCodes_T_John,"John"); //1 fix token "John"
static Token T_the_32_mother_32_of = new Token("T_the_32_mother_32_of", TokenCodes_T_the_32_mother_32_of,"the mother of"); //1 fix token "the mother of"
static Token T_the_32_father_32_of = new Token("T_the_32_father_32_of", TokenCodes_T_the_32_father_32_of,"the father of"); //1 fix token "the father of"
static Token T_The_32_mother_32_of = new Token("T_The_32_mother_32_of", TokenCodes_T_The_32_mother_32_of,"The mother of"); //1 fix token "The mother of"
static Token T_The_32_father_32_of = new Token("T_The_32_father_32_of", TokenCodes_T_The_32_father_32_of,"The father of"); //1 fix token "The father of"

// (Symbols 4)
// (Symbols WeisserRiese)

// (Symbols 4a XXX)
static Token WeisserRiese_471101 = new Token("WeisserRiese_471101", -1, "<<<(\\r\\n|\\r|\\n|\\t|\\ )+>>>"); // whitespace <<<(\r\n|\r|\n|\t|\ )+>>>
static Token WeisserRiese_4711 = new Token("WeisserRiese_4711", -1, "<<<//[^\\n\\r]*>>>"); // whitespace <<<//[^\n\r]*>>>
public static void DefineGrammar0()
{
   ancestor.Rules = new Rule[] {
   new Rule (0,ancestor, new Symbol[] {
   /*TokenCodes_*/T_The_32_father_32_of
,
   ancestor
   })
,
   new Rule (1,ancestor, new Symbol[] {
   /*TokenCodes_*/T_The_32_mother_32_of
,
   ancestor
   })
,
   new Rule (2,ancestor, new Symbol[] {
   /*TokenCodes_*/T_the_32_father_32_of
,
   ancestor
   })
,
   new Rule (3,ancestor, new Symbol[] {
   /*TokenCodes_*/T_the_32_mother_32_of
,
   ancestor
   })
,
   new Rule (4,ancestor, new Symbol[] {
   /*TokenCodes_*/T_John
   })
,
   new Rule (5,ancestor, new Symbol[] {
   /*TokenCodes_*/T_Mary
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
NodeFactory.NewNode(
"fa"
, new JavaNode [] {
RT.EarleyStack(2)
}
)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(2), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 1:
   // yyaction (alternative)
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"mo"
, new JavaNode [] {
RT.EarleyStack(2)
}
)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(2), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 2:
   // yyaction (alternative)
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"fa"
, new JavaNode [] {
RT.EarleyStack(2)
}
)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(2), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 3:
   // yyaction (alternative)
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"mo"
, new JavaNode [] {
RT.EarleyStack(2)
}
)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(2), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 4:
   // yyaction (alternative)
   { // EAR_Translation
      JavaNode x =
NodeFactory.NewNode(
"pers"
, new JavaNode [] {
new JavaStringValue( "Johann" )
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
NodeFactory.NewNode(
"pers"
, new JavaNode [] {
new JavaStringValue( "Maria" )
}
)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   } // switch
} // Semantic Actions

}
