//
// GENERATED !
//
package Generated;

import Gently.*;
import Generated.*;

public class Grammar
{

public static int TokenCodes_INTEGER = 258;
public static int TokenCodes_T__rparen_ = 259;
public static int TokenCodes_T__lparen_ = 260;
public static int TokenCodes_T__slash_ = 261;
public static int TokenCodes_T__asterisk_ = 262;
public static int TokenCodes_T__minus_ = 263;
public static int TokenCodes_T__plus_ = 264;
public static int TokenCodes_STRING = 0;
public static int GetColor(int i)
{
   if (i == TokenCodes_T__plus_) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T__minus_) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T__asterisk_) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T__slash_) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T__lparen_) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_T__rparen_) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   if (i == TokenCodes_INTEGER) return 0;
   if (i == Gently.GrammarLib.WhitespaceToken) return 1;
   return 666;
}
public static String Parser = "Accent";

// (Symbols 1)
static Nonterm expression = new Nonterm("expression");
static Nonterm expr2 = new Nonterm("expr2");
static Nonterm expr3 = new Nonterm("expr3");
static Token INTEGER = new Token("INTEGER", TokenCodes_INTEGER, "<<<[0-9]+>>>", new Gently.Converter() { public JavaNode convert(JavaNode n) { return JavaLib.BuiltinConverterINTEGER(n); } }); //2 flex token 
// (Symbols 2)

// (Symbols 3) neu
static Token T__rparen_ = new Token("T__rparen_", TokenCodes_T__rparen_,")"); //1 fix token ")"
static Token T__lparen_ = new Token("T__lparen_", TokenCodes_T__lparen_,"("); //1 fix token "("
static Token T__slash_ = new Token("T__slash_", TokenCodes_T__slash_,"/"); //1 fix token "/"
static Token T__asterisk_ = new Token("T__asterisk_", TokenCodes_T__asterisk_,"*"); //1 fix token "*"
static Token T__minus_ = new Token("T__minus_", TokenCodes_T__minus_,"-"); //1 fix token "-"
static Token T__plus_ = new Token("T__plus_", TokenCodes_T__plus_,"+"); //1 fix token "+"

// (Symbols 4)
// (Symbols WeisserRiese)

// (Symbols 4a XXX)
static Token WeisserRiese_471101 = new Token("WeisserRiese_471101", -1, "<<<(\\r\\n|\\r|\\n|\\t|\\ )+>>>"); // whitespace <<<(\r\n|\r|\n|\t|\ )+>>>
static Token WeisserRiese_4711 = new Token("WeisserRiese_4711", -1, "<<<//[^\\n\\r]*>>>"); // whitespace <<<//[^\n\r]*>>>
public static void DefineGrammar0()
{
   expression.Rules = new Rule[] {
   new Rule (0,expression, new Symbol[] {
   expr2
   })
,
   new Rule (1,expression, new Symbol[] {
   expression
,
   /*TokenCodes_*/T__plus_
,
   expr2
   })
,
   new Rule (2,expression, new Symbol[] {
   expression
,
   /*TokenCodes_*/T__minus_
,
   expr2
   })
   };
   expr2.Rules = new Rule[] {
   new Rule (3,expr2, new Symbol[] {
   expr3
   })
,
   new Rule (4,expr2, new Symbol[] {
   expr2
,
   /*TokenCodes_*/T__asterisk_
,
   expr3
   })
,
   new Rule (5,expr2, new Symbol[] {
   expr2
,
   /*TokenCodes_*/T__slash_
,
   expr3
   })
   };
   expr3.Rules = new Rule[] {
   new Rule (6,expr3, new Symbol[] {
   INTEGER
   })
,
   new Rule (7,expr3, new Symbol[] {
   /*TokenCodes_*/T__minus_
,
   expr3
   })
,
   new Rule (8,expr3, new Symbol[] {
   /*TokenCodes_*/T__plus_
,
   expr3
   })
,
   new Rule (9,expr3, new Symbol[] {
   /*TokenCodes_*/T__lparen_
,
   expression
,
   /*TokenCodes_*/T__rparen_
   })
   };

ExhaustiveParser.UserRoot = expression;
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
JavaLib.Plus(
RT.EarleyStack(1)
,
RT.EarleyStack(3)
)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(3), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 2:
   // yyaction (alternative)
   { // EAR_Translation
      JavaNode x =
JavaLib.Minus(
RT.EarleyStack(1)
,
RT.EarleyStack(3)
)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(3), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 3:
   // yyaction (alternative)
   { // EAR_Translation
      JavaNode x =
RT.EarleyStack(1)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 4:
   // yyaction (alternative)
   { // EAR_Translation
      JavaNode x =
JavaLib.Times(
RT.EarleyStack(1)
,
RT.EarleyStack(3)
)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(3), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 5:
   // yyaction (alternative)
   { // EAR_Translation
      JavaNode x =
JavaLib.Div(
RT.EarleyStack(1)
,
RT.EarleyStack(3)
)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(3), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 6:
   // yyaction (alternative)
   { // EAR_Translation
      JavaNode x =
RT.EarleyStack(1)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(1), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 7:
   // yyaction (alternative)
   { // EAR_Translation
      JavaNode x =
JavaLib.UnaryMinus(
RT.EarleyStack(2)
)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(2), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 8:
   // yyaction (alternative)
   { // EAR_Translation
      JavaNode x =
RT.EarleyStack(2)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(2), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   case 9:
   // yyaction (alternative)
   { // EAR_Translation
      JavaNode x =
RT.EarleyStack(2)
      ;
Gently.SemanticActions.SourceRange(RT.Dollar1(), RT.DollarI(3), x, 0);
      RT.DefDollarDollar(x);
   }//EAR_Translation
   break;
   } // switch
} // Semantic Actions

}
