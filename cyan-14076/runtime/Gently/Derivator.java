
// PACKAGE GENTLY  -  GENTLE RUNTIME LIBRARY
// COPYRIGHT (C) 2000-2014 COMPILERTOOLS.NET
// ALL RIGHTS RESERVED.   MAY BE DISTRIBUTED
// AS PART OF SOFTWARE GENERATED WITH GENTLE

package Gently;

import java.util.HashSet;
import java.util.LinkedList;
//import Generated.Yylex;
//import Gently.Yylex;
import Generated.Grammar;

import static Gently.Print.P;
import static Gently.Print.P_;
import static Gently.Print.caught;

public class Derivator
{
   public static void PrepareGrammar()
   {
      Grammatik.RedefineGrammar();
   }

   public static int qqFrameCount = 0;
   //xxur public static FRAME qqcurframe;

   //public static JavaNode Parse(Yylex scanner)
   public static JavaNode Parse()
   {
      Llana.TestForRecursion();

      //DerivatorDo.ReadSourceFile(scanner);
      DerivatorDo.ReadSourceFile();
      //Print.On();

      // Step 1: Parse

      qqFrameCount = 0;
      DerivatorDo.InitStartFrame();

      do {


         qqFrameCount++;
         //PP P("///// frame " + qqFrameCount);

         DerivatorDo.Actions = 0;
         DerivatorDo.ThisFrame = DerivatorDo.NextFrame;
         DerivatorDo.NextFrame = new FRAME();
         //xxur qqcurframe = DerivatorDo.NextFrame;
         //xxur qqcurframe.qqcount = qqFrameCount;
         FRAME SavedFrame = new FRAME();
         FRAME SavedFrame2 = new FRAME();
         SavedFrame.lili = (LinkedList<DERIVATION>) (DerivatorDo.ThisFrame.lili
               .clone());
         SavedFrame2.lili = (LinkedList<DERIVATION>) (DerivatorDo.ThisFrame.lili
               .clone());

         DerivatorDo.TokenFound = false;
         DerivatorDo.EofFound = false;

         DerivatorDo.ProcessThisFrame();

         if (!DerivatorDo.TokenFound) {

            /*
            boolean EXPERIMENTAL = false;
            if (EXPERIMENTAL) {
               DerivatorDo.ErrorInfo(SavedFrame);
               DerivatorDo.Recover(SavedFrame2);
            }
            */

            TokenStream.SyntaxErrorNextPos();
         } else {

            TokenStream.ADVANCE();
         }

      } while (!DerivatorDo.EofFound);


      //Print.Off();
      // Step 2: TreeBuilder

      JavaNode ast;
      try {
         // LastDerivation : [ Eof ]
         if (!DerivatorDo.LastDerivation.Head().Name.equals("Eof")) {
            //xxx JavaLib.RuntimeError("LastDerivation: Eof expected");
         }
         //STATIC_DERI.TreeBuilder(DerivatorDo.LastDerivation);
         STATIC_DERI.TreeBuilder(DerivatorDo.EofDerivation);

         ast = STATIC_DERI.RUNTIME.SemanticValue;
      } catch (Exception e) {
         caught(e);
         JavaLib.RuntimeError("--- Exception in TreeBuilder");
         ast = null;
      }

      return ast;

   }

}

// =======================================================================

class STACK
{
   public Symbol symbol = null;
   public STACK next = null;

   public STACK(Symbol s, STACK n)
   {
     symbol = s;
     next = n;
   }


   void Print()
   {
      STACK p = this;
      P_("   STACK [");
      while (p != null) {
         P_(" " + p.symbol.Name);
         p = p.next;
      }
      P(" ]");
   }

   public boolean Equals(STACK that)
   {
      STACK p = this;
      STACK q = that;

      while (p != null) {
         if (p == q)
            return true;
         if (q == null)
            return false;
         if (p.symbol != q.symbol)
            return false;
         p = p.next;
         q = q.next;
      }

      return q == null;
   }
}

// =======================================================================

class DERIVATION
{
   // a DERIVATION is a list of elements that still are to be recognized
   // if ptr is { e1, e2, ... , en }
   // e1, e2, ... , en are to be recognized

   private STACK mussnoch;
   public DERIVATION habschon;
   //xxur public FRAME urframe; // qq

   public Rule regel;

   // === constructors ===

   // constructor 1 BIGBANG
   // r = Root : UserRoot Eof
   // called from InitStartFrame
   //static DERIVATION BIGBANG(Rule r)
   static DERIVATION BIGBANG()
   {
      //===
      Nonterm nt = (Nonterm) ExhaustiveParser.UserRoot;

      Nonterm Root = new Nonterm("Root");
      Token Eof = new Token("Eof", -1);

      Rule rootrule = new Rule(-999, Root, new Symbol[] { nt, Eof });
      Root.Rules = new Rule[] { rootrule };
      DERIVATION NewDerivation = new DERIVATION();
      NewDerivation.habschon = null; // 1
      //xxur NewDerivation.urframe = Derivator.qqcurframe;
      //===

      //NewDerivation.regel = r;
      NewDerivation.regel = rootrule;

      STACK head = null;
      for (int i = rootrule.Rhs.length - 1; i >= 0; i--) {
         Symbol s = rootrule.Rhs[i];
         STACK p = new STACK(s, head);
         //p.symbol = s;
         //p.next = head;
         head = p;
      }
      NewDerivation.mussnoch = head;

      return NewDerivation;
   }

   // constructor 2 PREDICTOR

   // oldder = { e1, e2, ..., en }
   // r = M0 : M1, M2, ..., Mk
   // newder = { M1, M2, ..., Mk, e2, ..., en }
   // i.e. e1 is replaced by M1, M2, ..., Mk

   static DERIVATION PREDICTOR(Rule r, DERIVATION oldder)
   {
      //PP P("***PREDICTOR***");
      DERIVATION NewDerivation = new DERIVATION();
      //xxur NewDerivation.urframe = Derivator.qqcurframe;
      NewDerivation.habschon = oldder; // 2
      NewDerivation.regel = r;

      STACK head = oldder.mussnoch.next;
      for (int i = r.Rhs.length - 1; i >= 0; i--) {
         Symbol s = r.Rhs[i];
         STACK p = new STACK(s, head);
         //p.symbol = s;
         //p.next = head;
         head = p;
      }
      NewDerivation.mussnoch = head;
      //PP P("***End***");

      return NewDerivation;
   }

   // constructor 3 SCANNER
   // same as constructor 2 but no rule
   //
   static DERIVATION SCANNER(DERIVATION oldder)
   {
      DERIVATION NewDerivation = new DERIVATION();
      //xxur NewDerivation.urframe = Derivator.qqcurframe;
      NewDerivation.habschon = oldder; // 3
      NewDerivation.regel = null;

      NewDerivation.mussnoch = oldder.mussnoch.next;

      return NewDerivation;
   }

   public Symbol Head()
   {
      return mussnoch.symbol;
   }

   public boolean Equals(DERIVATION that)
   {
      STACK p = this.mussnoch;
      STACK q = that.mussnoch;

      return p.Equals(q);

      /*
      while (p != null) {
         if (p == q)
            return true;
         if (q == null)
            return false;
         if (p.symbol != q.symbol)
            return false;
         p = p.next;
         q = q.next;
      }

      return q == null;
      */
   }

   void PrintDerivation()
   {
      STACK p = mussnoch;

      P_("   DERIVATION [");
      while (p != null) {
         //P_(" " + p.symbol.Name);
         //P_(" -> " + p.id + "::" + p.backptr + "::" + p.symbol.Name);
         P_(" -> " + p.symbol.Name);
         p = p.next;
      }
      P(" ]");
   }

   void PrintHistory()
   {
      DERIVATION ur = habschon;
      if (ur != null) {
         ur.PrintHistory();
      }
      PrintDerivation();
   }
}

// =======================================================================

class STATIC_DERI
{
   public static final int CODE_APRIME_EMPTY = 666712;
   public static final int CODE_TOKEN = 666713;

   static DERIVATION[] History = new DERIVATION[900000];
   static DERIVATION[] XHistory = new DERIVATION[900000];
   static int HistoryIndex = -1;
   static int POS;
   public static int level = 0;
   public static EarleyRuntime RUNTIME;

   static void CollectHistory(DERIVATION deri)
   {

      XCollectHistory(deri);
   }

   static void XCollectHistory(DERIVATION deri)
   {
      DERIVATION d = deri.habschon;
      int i = 0;
      XHistory[i] = deri;
      while (d != null) {
         i++;
         XHistory[i] = d;
         // P("i="+i);
         d = d.habschon;
      }
      while (i >= 0) {
         HistoryIndex++;
         History[HistoryIndex] = XHistory[i];
         i--;
      }
   }

   static void RCollectHistory(DERIVATION deri)
   {
      DERIVATION ur = deri.habschon;
      if (ur != null) {
         RCollectHistory(ur);
      }
      HistoryIndex++;
      History[HistoryIndex] = deri;
   }

   static void ShowHistory()
   {
      int k = HistoryIndex;
      for (int i = 0; i <= k; i++) {
         P_("Show i = " + i + " : ");
         DERIVATION deri = History[i];
         Rule r = deri.regel;
         if (r == null) {
            P("(token)");
         } else {
            int id = r.Id;
            String str = r.Lhs.Name;
            P("id = " + id + ", str = " + str);
         }
      }
   }

   static Knoten ConvertHistory()
   {
      POS = 1; // skip root
      Knoten k = ConvertHistoryR();
      return k;
   }

   public static void indent()
   {
      for (int i = 1; i <= level; i++) {
         P_("   ");
      }
   }

   static Knoten ConvertHistoryR()
   {
      int i = POS;
      POS++;
      DERIVATION deri = History[i];
      Rule r = deri.regel;

      if (r == null) {
         Knoten k = new Knoten();
         k.Child = null;
         k.Code = CODE_TOKEN;
         k.Name = "(token)";
         return k;
      } else {
         int id = r.Id;
         String str = r.Lhs.Name;
         int len = r.Rhs.length;
         Knoten[] child = new Knoten[len];
         for (int k = 0; k < len; k++) {
            // level++;
            child[k] = ConvertHistoryR();
            // level--;
         }
         Knoten k = new Knoten();
         k.Child = child;
         k.Code = id;
         k.Name = str;
         return k;
      }
   }

   static Knoten Trafo(Knoten k)
   // r = Trafo ( k )
   // k ist a node corresponding to the converted grammar
   // (left recursion converted to right recursion)
   // r is the corresponding node of the original grammar
   {
      // 1. token
      if (k.Code == CODE_TOKEN) {
         return k;
      }
      // 2: A -> beta APRIME
      else if (IsLeftRecursiveBeta(k.Code)) {

         Knoten newk = ApplList(null, k);

         return newk;

      }
      // 3. other (no APRIME, no A)
      else {
         // P("Trafo else : " + k.Name + " " + k.Code);
         Knoten tk = new Knoten();
         tk.Name = k.Name;
         tk.Code = k.Code;
         tk.Child = new Knoten[k.Child.length];
         for (int i = 0; i < k.Child.length; i++) {
            tk.Child[i] = Trafo(k.Child[i]);
         }
         return tk;
      }
   }

   static HashSet<Integer> AlphaSet = new HashSet<Integer>();

   static void MarkLeftRecursiveAlpha(int code)
   {
      AlphaSet.add(code);
   }

   static boolean IsLeftRecursiveAlpha(int code)
   {
      return AlphaSet.contains(code);
   }

   static HashSet<Integer> BetaSet = new HashSet<Integer>();

   static void MarkLeftRecursiveBeta(int code)
   {
      BetaSet.add(code);
   }

   static boolean IsLeftRecursiveBeta(int code)
   {
      return BetaSet.contains(code);
   }

   static Knoten ApplList(Knoten inner, Knoten k)
   {
      int code = k.Code;
      String name = k.Name;
      Knoten[] child = k.Child;

      if (code == CODE_APRIME_EMPTY) {
         return inner;
      }

      if (!IsLeftRecursiveBeta(code) && !IsLeftRecursiveAlpha(code)) {
         JavaLib.RuntimeError("Unexpected code : " + code);
      }

      Knoten rec = Last(child);

      Knoten newinner = new Knoten();
      newinner.Code = code;
      newinner.Name = name;
      int len = child.length;

      if (inner == null) {
         Knoten[] newchild = new Knoten[len - 1];
         for (int i = 0; i < len - 1; i++) {
            newchild[i] = Trafo(child[i]);
         }
         newinner.Child = newchild;
      } else {
         Knoten[] newchild = new Knoten[len];
         newchild[0] = inner;
         for (int i = 0; i < len - 1; i++) {
            newchild[i + 1] = Trafo(child[i]);
         }
         newinner.Child = newchild;
      }

      Knoten conv = ApplList(newinner, rec);

      return conv;

   }

   static void Evaluate()
   {
      HistoryIndex++;
      int i = HistoryIndex;
      DERIVATION d = History[i];

      if (d == null) {
         P_("++++++++++++++++ unexpected: d == null");
         TokenStream.SyntaxErrorNextPos();
      }

      if (d.regel == null) // constructor SCANNER
      {

         JavaNode nd = TokenStream.NaechstesRep();
         RUNTIME.Push(nd);
         TokenStream.ADVANCE();
      } else {

         Rule r = d.regel;
         int len = r.Rhs.length;
         for (int m = 0; m < len; m++) {
            Symbol sym = r.Rhs[m];
            if (!sym.Name.equals("Eof")) {
               Evaluate();
            }
         }

         if (i != 0) {
            // ------------------------------semantic action
            RUNTIME.LengthOfCurrentRule = len;
            int code = r.Id;

            Grammar.SwitchSemAction(RUNTIME, code);

            RUNTIME.Pop(len);
            RUNTIME.Push(RUNTIME.SemanticValue);
            // ------------------------------semantic action
         }
      }
   }

   static void TreeBuilder(DERIVATION d)
   {
      RUNTIME = new EarleyRuntime();

      HistoryIndex = -1;
      TokenStream.ResetPtr();

      boolean EXTENDED = true;
      if (EXTENDED) {
         CollectHistory(d);
         Knoten k = ConvertHistory();
         Knoten tk = Trafo(k);
         tk.Aktion();
      } else {
         Evaluate();
      }
   }

   static Knoten Last(Knoten[] ks)
   {
      return ks[ks.length - 1];
   }

   static Knoten[] ButLast(Knoten[] ks)
   {
      int len = ks.length;
      Knoten[] rs = new Knoten[len - 1];
      for (int i = 0; i < len - 1; i++) {
         rs[i] = ks[i];
      }
      return ks;
   }
}

// =======================================================================

class Knoten
{
   int Code;
   String Name;
   Knoten[] Child;

   void Print()
   {
      STATIC_DERI.indent();
      P(Name + " " + Code + " {");
      if (Child != null) {
         STATIC_DERI.level++;
         for (Knoten k : Child) {
            k.Print();
         }
         STATIC_DERI.level--;
      }
      STATIC_DERI.indent();
      P("}");
   }

   void PrintDeri()
   {
      STATIC_DERI.indent();
      P(Name + " " + Code + " {");
      if (Child != null) {
         STATIC_DERI.level++;
         for (Knoten k : Child) {
            k.PrintDeri();
         }
         STATIC_DERI.level--;
      }
      STATIC_DERI.indent();
      P("}");
   }

   public void Aktion()
   {
      if (Code == STATIC_DERI.CODE_TOKEN) // token
      {

         JavaNode nd = TokenStream.NaechstesRep();
         STATIC_DERI.RUNTIME.Push(nd);
         TokenStream.ADVANCE();

      } else {
         if (Child != null) {
            for (Knoten k : Child) {
               k.Aktion();
            }
         }

         int code = Code;
         int len = Child.length;

         // ------------------------------semantic action
         STATIC_DERI.RUNTIME.LengthOfCurrentRule = len;

         Grammar.SwitchSemAction(STATIC_DERI.RUNTIME, code);

         STATIC_DERI.RUNTIME.Pop(len);
         STATIC_DERI.RUNTIME.Push(STATIC_DERI.RUNTIME.SemanticValue);
         // ------------------------------semantic action

      }
   }
}

// =======================================================================

class FRAME
{

   public int qqcount;
   public LinkedList<DERIVATION> lili = new LinkedList<DERIVATION>();

   void Print()
   {
      P("FRAME {");
      int n = lili.size();
      for (int i = 0; i < n; i++) {
         lili.get(i).PrintDerivation();
      }
      P("}");
   }

   public int qqElements()
   {
      return lili.size();
   }

   public boolean HasElements()
   {
      return lili.size() != 0;
   }

   DERIVATION PollFromFrame()
   {
      return lili.poll();
   }

   void AddToFrame(DERIVATION Derivation)
   {
      DerivatorDo.Actions++;
      for (DERIVATION D : lili) {
         if (Derivation.Equals(D)) {
            return;
         }
      }

      lili.add(Derivation);
   }

}

// =======================================================================

class DerivatorDo
{

   public static FRAME ThisFrame;
   public static FRAME NextFrame;
   public static boolean TokenFound;
   public static boolean EofFound;

   public static int Actions;
   public static DERIVATION LastDerivation = null;
   public static DERIVATION EofDerivation = null;

   //public static void ReadSourceFile(Yylex scanner)
   public static void ReadSourceFile()
   {
      GrammarLib.SignalWhitespace = false;
      //scanner.YyState = new LexerState();
      //TokenStream.InitTokenStream("llana", scanner);
      TokenStream.InitTokenStream("llana");
   }

   public static void InitStartFrame()
   {
      /*
      Nonterm nt = (Nonterm) ExhaustiveParser.UserRoot;

      Nonterm Root = new Nonterm("Root");
      Token Eof = new Token("Eof", -1);

      Rule rootrule = new Rule(-999, Root, new Symbol[] { nt, Eof });
      Root.Rules = new Rule[] { rootrule };
      DERIVATION FirstDerivation = DERIVATION.BIGBANG(rootrule);
      */
      DERIVATION FirstDerivation = DERIVATION.BIGBANG();

      NextFrame = new FRAME();
      //xxur Derivator.qqcurframe = NextFrame;
      //xxur Derivator.qqcurframe.qqcount = Derivator.qqFrameCount;
      NextFrame.AddToFrame(FirstDerivation); // initial
   }

   public static void ProcessThisFrame()
   {

      //PP P("<<< Process Frame");
      while (ThisFrame.HasElements()) {
         DERIVATION Der = ThisFrame.PollFromFrame();
         LastDerivation = Der;

         ProcessDerivation(Der);
      }
      //PP P(">>> Frame processed");

   }

   static void ProcessDerivation(DERIVATION Der)
   {
      // called from Parse/ProcessThisFrame

      Symbol s0 = Der.Head();

      if (s0 instanceof Nonterm) {

         //PP P_("{{{ ProcessDerivation / Nonterm (Predictor) ");
         
         //PP Der.PrintDerivation();

         Nonterm s = (Nonterm) s0;

         for (Rule r : s.Rules) {
            boolean viable = false;
            for (Symbol t : Llana.Dir(r)) {
               if (((Token) t).Code == TokenStream.EinsWeiter()) {
                  viable = true;
                  break;
               }
            }

            // cyclic ?

            if (r.Rhs.length > 0 && r.Rhs[0] == s) {
               P("Adding cycle...");
            }

            if (viable) {
               // constructor 2
               DERIVATION NewerDerivation = DERIVATION.PREDICTOR(r, Der);

               //PP P_("Add to this frame:");
               //PP NewerDerivation.PrintDerivation();
               ThisFrame.AddToFrame(NewerDerivation); // nonterm
            }

         }
         //PP P("}}}");

      } else {

         //PP P_("((( ProcessDerivation / Token (Scanner) ");
         
         //PP Der.PrintDerivation();

         Token s = (Token) s0;

         if (s.Code == TokenStream.EinsWeiter()) {
            // constructor 3
            if (s.Code == -1) {
               EofFound = true;
               EofDerivation = Der;
            } else {
               DERIVATION next = DERIVATION.SCANNER(Der);
               //PP P_("Add to next frame:");
               //PP next.PrintDerivation();

               NextFrame.AddToFrame(next); // token
            }

            TokenFound = true;
         }
         //PP P(")))");
      }
   }

   /*{
   static HashSet<Token> Valid;

   public static void ErrorInfo(FRAME SavedFrame)
   {
      ErrInf_CollectValidTokens(SavedFrame);
      P("+++ Valid:");
      for (Token t : Valid) {
         P(" " + t.Name);
      }
   }

   static void ErrInf_CollectValidTokens(FRAME SavedFrame)
   {
      NextFrame = SavedFrame;

      ThisFrame = NextFrame;
      NextFrame = new FRAME();

      TokenFound = false;
      EofFound = false;

      Valid = new HashSet<Token>();

      ErrInf_CollectValidTokensThisFrame();
   }

   static void ErrInf_CollectValidTokensThisFrame()
   {
      while (ThisFrame.HasElements()) {
         DERIVATION Der = ThisFrame.PollFromFrame();
         LastDerivation = Der;

         ErrInf_CollectValidTokensDerivation(Der);
      }
   }

   static void ErrInf_CollectValidTokensDerivation(DERIVATION Der)
   {
      Symbol s0 = Der.Head();

      if (s0 instanceof Nonterm) {

         Nonterm s = (Nonterm) s0;

         for (Rule r : s.Rules) {
            // constructor 2
            DERIVATION NewerDerivation = DERIVATION.PREDICTOR(r, Der);

            ThisFrame.AddToFrame(NewerDerivation); // here error info
         }

      } else {
         Token s = (Token) s0;
         Valid.add(s);
      }
   }

   public static void Recover(FRAME SavedFrame)
   {
      NextFrame = SavedFrame;
      int i = 0;
      do {
         i++;

         ThisFrame = NextFrame;
         NextFrame = new FRAME();

         TokenFound = false;
         EofFound = false;

         Valid = new HashSet<Token>();

         RecoverThisFrame();
         P("===== Step: " + i);
         NextFrame.Print();
         for (Token t : Valid) {
            P(" " + t.Name);
            if (t.Code == TokenStream.EinsWeiter()) {
               P("gefunden ! " + t.Name);
               TokenStream.ADVANCE();
               return;
            }
            if (t.Code == TokenStream.NWeiter(2)) {
               P("2 weiter gefunden ! " + t.Name);
               TokenStream.ADVANCE();
               TokenStream.ADVANCE();
               return;
            }
            if (t.Code == TokenStream.NWeiter(3)) {
               P("3 weiter gefunden ! " + t.Name);
               TokenStream.ADVANCE();
               TokenStream.ADVANCE();
               TokenStream.ADVANCE();
               return;
            }
         }

      } while (NextFrame.HasElements() && i < 10);
      JavaLib.RuntimeError("Recover failed");
   }

   static void RecoverThisFrame()
   {
      while (ThisFrame.HasElements()) {
         DERIVATION Der = ThisFrame.PollFromFrame();
         LastDerivation = Der;

         RecoverDerivation(Der);
      }

   }

   static void RecoverDerivation(DERIVATION Der)
   {
      Symbol s0 = Der.Head();

      if (s0 instanceof Nonterm) {

         Nonterm s = (Nonterm) s0;

         for (Rule r : s.Rules) {

            // constructor 2
            DERIVATION NewerDerivation = DERIVATION.PREDICTOR(r, Der);

            ThisFrame.AddToFrame(NewerDerivation); // recover; nonterm

         }

      } else {

         Token s = (Token) s0;

         Valid.add(s);
         // constructor 3
         if (s.Code == -1) {
            EofFound = true;
         } else {
            DERIVATION next = DERIVATION.SCANNER(Der);

            NextFrame.AddToFrame(next); // recover; token
         }

         TokenFound = true;
      }
   }
   }*/

}

// =======================================================================

class Grammatik
{

   public static void RedefineGrammar()
   {
      P("************************************** RedefineGrammar");
      Nonterm root = (Nonterm) ExhaustiveParser.UserRoot;
      NontermSet = new HashSet<Nonterm>();
      CollectNonterminals(root);
      for (Nonterm nt : NontermSet) {
         if (Recursive(nt)) {
            P_("Recursive ...."); nt.Print();
            TransformRecursiveNt(nt);
         }
      }
   }
   

   // private

   private static HashSet<Nonterm> NontermSet;

   private static void CollectNonterminals(Nonterm nt)
   {
      for (Rule r : nt.Rules) {
         for (Symbol s : r.Rhs) {
            if (s instanceof Nonterm) {
               Nonterm k = (Nonterm) s;
               if (!NontermSet.contains(k)) {
                  NontermSet.add(k);
                  CollectNonterminals(k);
               }
            }
         }
      }
   }

   private static void TransformRecursiveNt(Nonterm nt)
   {
      // P("recursive : " + nt.Name);

      Nonterm APRIME = new Nonterm("APRIME" + "_" + nt.Name);
      Llana.Register(APRIME);

      LinkedList<Rule> RuleList = new LinkedList<Rule>();
      int NRuleList = 0;

      Token IMPOSSIBLE_TOKEN = new Token("/Rumpelstilzchen/", -888);

      for (Rule r : nt.Rules) {
         if (r.Rhs.length > 0 && r.Rhs[0] == nt) {
            // A -> A alpha
            // =>
            // APRIME -> alpha APRIME
            // APRIME -> epsilon // CODE_APRIME_EMPTY

            int code = r.Id;

            int len = r.Rhs.length;

            STATIC_DERI.MarkLeftRecursiveAlpha(code);

            Symbol[] Syms = new Symbol[len];
            for (int i = 0; i < len - 1; i++) {
               Syms[i] = r.Rhs[i + 1];
            }
            Syms[len - 1] = APRIME;

            Rule newrule = new Rule(code, APRIME, Syms);
            RuleList.add(newrule);
            NRuleList++;

            // delete rule (make invisible)
            r.Rhs = new Symbol[] { IMPOSSIBLE_TOKEN };
         } else {
            // A -> beta
            // =>
            // A -> beta APRIME

            STATIC_DERI.MarkLeftRecursiveBeta(r.Id);

            int len = r.Rhs.length;
            Symbol[] newrhs = new Symbol[len + 1];
            for (int i = 0; i < len; i++) {
               newrhs[i] = r.Rhs[i];
            }
            newrhs[len] = APRIME;
            r.Rhs = newrhs;
         }
      }

      Rule[] rules = new Rule[NRuleList + 1];
      int i = 0;
      for (Rule r : RuleList) {
         rules[i] = r;
         i++;
      }
      rules[i] = new Rule(STATIC_DERI.CODE_APRIME_EMPTY, APRIME,
            new Symbol[] {});

      APRIME.Rules = rules;

   }

   private static boolean Recursive(Nonterm nt)
   {
      for (Rule r : nt.Rules) {
         if (r.Rhs.length > 0 && r.Rhs[0] == nt)
            return true;
      }
      return false;
   }

}
// ================================================================

class LL   
{
   static void ProcessSymbol(Symbol s0)
   {
      System.out.println("expecting symbol " + s0.Name);

      if (s0 instanceof Nonterm) {

         ProcessNonterm((Nonterm) s0);

      } else {

         ProcessToken((Token) s0);
      }
   }

   static void ProcessNonterm(Nonterm s)
   {

      for (Rule r : s.Rules) {

         boolean viable = false;
         for (Symbol t : Llana.Dir(r)) {
            if (((Token) t).Code == TokenStream.EinsWeiter()) {
               viable = true;
               break;
            }
         }

         if (viable) {
            ProcessRule(r);
            return;
         }

      }
      System.out.println("no rule applicable");
   }

   static void ProcessToken(Token s)
   {
      if (s.Code == TokenStream.EinsWeiter()) {
         if (s.Code == -1) {
            // Eof
            System.out.println("EOF......................");
            // success
         } else {
            System.out.println("ERKANNT.........."+s.Name);
            // advance
            TokenStream.ADVANCE();

         }

      }
      else {
         // error
         System.out.println("expected symbol not found");
      }
   }

   static void ProcessRule(Rule r)
   {
      for (Symbol s: r.Rhs)
      {
         ProcessSymbol(s);
      }
   }

   //public static JavaNode Parse(Yylex scanner)
   public static JavaNode Parse()
   {
      System.out.println("This is Backtrack.Parse");

      //DerivatorDo.ReadSourceFile(scanner);
      DerivatorDo.ReadSourceFile();


      Nonterm nt = (Nonterm) ExhaustiveParser.UserRoot;

      /*
      Nonterm Root = new Nonterm("Root");
      Token Eof = new Token("Eof", -1);

      Rule rootrule = new Rule(-999, Root, new Symbol[] { nt, Eof });
      Root.Rules = new Rule[] { rootrule };
      */

      Llana.TestForRecursion();

      ProcessSymbol(nt);

      System.out.println("End Backtrack.Parse");
      System.exit(-1);
      return null;

   }
}   
