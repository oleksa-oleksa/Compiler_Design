
// PACKAGE GENTLY  -  GENTLE RUNTIME LIBRARY
// COPYRIGHT (C) 2000-2014 COMPILERTOOLS.NET
// ALL RIGHTS RESERVED.   MAY BE DISTRIBUTED
// AS PART OF SOFTWARE GENERATED WITH GENTLE

package Gently;

import Generated.Grammar;
//import Generated.Yylex;
//import Gently.Yylex;

import java.util.HashSet;
import java.util.ArrayList;

import static Gently.Print.P;
import static Gently.Print.P_;
import static Gently.Print.caught;

public class ExhaustiveParser
{
   public static Symbol UserRoot;

   private static EarleyRuntime RT;

   private ItSet CurItSet;
   private ItSet PrevItSet;
   private boolean Change;
   private int CurIndex;

   private Nonterm Root;
   private Token Eof;

   // ---------------------------------------------------------------------------
   //private static boolean Vorher = false;
/*
   public void unused_Matcher(Nonterm nt, EarleyRuntime rt)
   {

      TokenStream.MarkStart();
      DiesItem = null;
      DasItem = null;
      
     

      try {
         RT = rt;

         DefineRootRule();

         CurItSet = new ItSet(-1);
         InitialKernel(nt);
         Closure();

         for (CurIndex = 0;; CurIndex++) {
            PrevItSet = CurItSet;
            CurItSet = new ItSet(CurIndex);

            Kernel();

            if (CurItSet.LastIndex == -1) {
               break;

            }

            Closure();
            
            

            if (TokenStream.Aktuelles() == -1) { // Matcher
               // EOF
               break;
            }
         }
         

         CurItSet = PrevItSet;
         UNPARSE();
         if (Vorher)
            TokenStream.BackToSuccess();

      } catch (ErrorReportedByParser e) {
         caught(e);
         throw e;
      } catch (Exception e) {
         caught(e);
         JavaLib.RuntimeError("Error in Matcher");
      }

   }
   */

   // ........................................................................

   private static Profile ProfSequence = new Profile("Sequence");

   private void Sequence()
   {

      ProfSequence.Start();
      
      int totalcount = 0;

      CurItSet = new ItSet(-1);
      InitialKernel();
      Closure();


      for (CurIndex = 0;; CurIndex++) {
         PrevItSet = CurItSet;
         CurItSet = new ItSet(CurIndex);
         Kernel();
         if (CurItSet.LastIndex == -1) {
            // Empty Kernel: syntax error

            TokenStream.SyntaxError();

            res_ast = null;

            ProfSequence.Stop();
            return;

         }

         Closure();
         
         int count = CurItSet.LastIndex;
         P("das waren "+ count);
         totalcount += count;

         if (TokenStream.Aktuelles() == -1) { // Sequence
            // EOF
            break;
         }
      }


      P("das waren insgesamt "+ totalcount);

      ProfSequence.Stop();
   }

   // ---------------------------------------------------------------------------
   private static Profile ProfUNPARSE1 = new Profile("UNPARSE1");

   private void UNPARSE1()
   {
      ProfUNPARSE1.Start();

      //Item FinalItem = CurItSet.Items[0];
      Item FinalItem = CurItSet.GETITEM(0);
      TokenStream.ResetPtr();

      TRUEUNPARSE(FinalItem);

      ProfUNPARSE1.Stop();
   }

   private void TRUEUNPARSE(Item FinalItem)
   {
      try {
         Unparse(FinalItem);
         res_ast = RT.SemanticValue;

      } catch (StackOverflowError exc) {
      caught(exc);
         Stopp("Stack zu klein");
      }
   }

   // ---------------------------------------------------------------------------
   private void UNPARSE()
   {

      Item EofItem;

      if (DiesItem == null) {
         TokenStream.SyntaxError();
         EofItem = null;
      } else {
         if (DasItem == null) {
            EofItem = DiesItem;
            //Vorher = true;
         } else {
            EofItem = DasItem;
            //Vorher = false;
         }
      }

      TokenStream.BackToStart();

      TRUEUNPARSE(EofItem);
   }

   private void DefineGrammar()
   {
      Grammar.DefineGrammar();
      if (OPTIMIZE) {
         Llana.AnalizeGrammar();
      }

      DefineRootRule();
   }

   private void DefineRootRule()
   {
      Root = new Nonterm("Root");
      Eof = new Token("Eof", -1);

      Root.Rules = new Rule[] { new Rule(-999, Root, new Symbol[] { UserRoot,
            Eof }) };
   }

   // ---------------------------------------------------------------------------

   private void InitialKernel(Symbol nt)
   {
      Item It = new Item(Root.Rules[0], 0, CurItSet, null, null);
      Root.Rules[0].Rhs[0] = nt;
      CurItSet.Add(It);
   }

   private void InitialKernel()
   {
      Item It = new Item(Root.Rules[0], 0, CurItSet, null, null);
      CurItSet.Add(It);
   }

   // ---------------------------------------------------------------------------

   private Item DasItem = null;
   private Item DiesItem = null;

   private static Profile ProfKernel = new Profile("Kernel");

   private void Kernel()
   {
      ProfKernel.Start();

      TokenStream.ADVANCE();

      DasItem = null;

      int i = 0;
      while (i <= PrevItSet.LastIndex) {
         //Item it = PrevItSet.Items[i];
         Item it = PrevItSet.GETITEM(i);
         P_("Kernel: check item ... "); it.Print();
         if (it.Pos < it.Rule.Rhs.length) {
            Symbol sym = it.Rule.Rhs[it.Pos];
            if (sym instanceof Token) {

               if (((Token) sym).Code == TokenStream.Aktuelles()) { // Kernel

                  CurItSet
                        .Add(new Item(it.Rule, it.Pos + 1, it.Back, it, null));
               }

               if (((Token) sym).Code == -1) {
                  // -1 : EOF
                  DasItem = it;
                  DiesItem = it;
                  TokenStream.MarkSuccess();

               }
            }
         }
         i++;
      }
      ProfKernel.Stop();
   }

   private static Profile ProfileClosure = new Profile("Closure");

   private void Closure()
   {
      ProfileClosure.Start();
      do {
         Change = false;

         int i = 0;
         P("Closure iteration . . . . . . . . . . .");
         while (i <= CurItSet.LastIndex) {
            //Item it = CurItSet.Items[i];
            Item it = CurItSet.GETITEM(i);
            if (it.Pos < it.Rule.Rhs.length) {
               Symbol sym = it.Rule.Rhs[it.Pos];
               if (sym instanceof Nonterm) {
                  Nonterm nt = (Nonterm) sym;
                  Predictor(nt);
               }
            } else {
               // pos at end
               Completer(it);
            }
            i++;
         }

      } while (Change);
      ProfileClosure.Stop();
   }

   // ---------------------------------------------------------------------------

   private static Profile ProfileCompleter = new Profile("Completer");

   private void Completer(Item It)
   {
      // It = Nont : gamma * , BackSet

      // for each PreItem in BackSet = Lhs : alpha * Nont beta , DDD
      // insert PostItem = Lhs : alpha Nont * beta , DDD
      
      

      ProfileCompleter.Start();
      
      P_("Completer: item ... "); It.Print();

      Nonterm Nont = It.Rule.Lhs;
      ItSet BackSet = It.Back;
      int i = 0;
      while (i <= BackSet.LastIndex) {
         //Item PreItem = BackSet.Items[i];
         Item PreItem = BackSet.GETITEM(i);
         if (PreItem.Pos < PreItem.Rule.Rhs.length) {
            Symbol sym = PreItem.Rule.Rhs[PreItem.Pos];
            if (sym == Nont) {
               Item PostItem = new Item(PreItem.Rule, PreItem.Pos + 1,
                     PreItem.Back, PreItem, It);
               CurItSet.Add(PostItem);
               if (CurItSet.Added)
                  Change = true;
            }
         }

         i++;
      }
      ProfileCompleter.Stop();
   }

   // ---------------------------------------------------------------------------

   private static final boolean OPTIMIZE = true
         ;
   private static Profile ProfilePredictor = new Profile("Predictor");

   private void Predictor(Nonterm nt)
   {
      // A: alpha * B beta, I
      // =>
      // B : * gamma , J
      // hier

      ProfilePredictor.Start();
      
      int viable = 0;

      for (Rule r : nt.Rules) {
         
         P_("Predictor: check rule ... fork candidate ... "); r.Print();

         boolean jawoll = true;
         // ++++++++++
         if (OPTIMIZE) {
            HashSet<Symbol> d = Llana.Dir(r);
            int t = TokenStream.EinsWeiter();
            // int t = TokenStream.NextTok();
            jawoll = false;
            if (t == -1) {
               P("fuer -1");
               jawoll = true;
            }
            else {
               for (Symbol s : d) {
                  if (((Token) s).Code == t) {
                     P("fuer "+s.Name);
                     jawoll = true;
                     break;
                  }
               }
            }
            if (! jawoll) {
               P("keinesfalls");
            }

         }
         // ++++++++++

         if (jawoll) {

            Item It = new Item(r, 0, CurItSet, null, null);
            CurItSet.Add(It);
            if (CurItSet.Added) {
               Change = true;
               viable++;
            }

         }
      }
      
      if (viable > 1) {
         P("..............................................FORK ..."+nt.Name);
      }

      ProfilePredictor.Stop();

   }

   // ---------------------------------------------------------------------------

   private static void Stopp(String str)
   {
      P(str);
      throw new Error();
   }

   // ---------------------------------------------------------------------------

   private void Unparse(Item It)
   {
      Item left = It.Left;
      Item sub = It.Sub;
      Rule r = It.Rule;
      int len = r.Rhs.length;
      int p = It.Pos;
      boolean atend = (len == p);

      if (left != null)
         Unparse(left);

      if (sub != null) {
         Unparse(sub);
      } else {

         if (left != null) {
            // sub == null & left != null : token

            TokenStream.ADVANCE();
            JavaNode n = TokenStream.EarleyCurRep();

            RT.Push(n);
         }
      }

      if (atend) {
         RT.LengthOfCurrentRule = len;
         Grammar.SwitchSemAction(RT, r.Id);
         RT.Pop(len);
         RT.Push(RT.SemanticValue);
      }
   }

   // ---------------------------------------------------------------------------

   private static void CheckAmbiguity(Item a, Item b)
   {
      if (a.Left == b.Left & a.Sub == b.Sub)
         return;
      /*
       * P("++++++++++++++++++++++++++++++ umbiguous"); if
       * (a.Left != b.Left) { P("+++ Conjunctive ambiguity"); }
       * if (a.Sub != b.Sub) { P("+++ Disjunctive ambiguity");
       * }
       */
   }

   // ---------------------------------------------------------------------------
   private JavaNode res_ast;

   //public Gently.JavaNode EarleyParseProc(Yylex scanner)
   public Gently.JavaNode EarleyParseProc()
   {
      //
      boolean Experimental = false
            ;
      if (Experimental) {

      Grammar.DefineGrammar();

      Derivator.PrepareGrammar();
      Llana.AnalizeGrammar();
      Llana.CollectNonterms();
      
      DefineRootRule();

      }else {

      DefineGrammar();
      }

      RT = new EarleyRuntime();

      RT.ClearStack();

      //TokenStream.InitTokenStream("earleyseq", scanner);
      TokenStream.InitTokenStream("earleyseq");

      Sequence();
      UNPARSE1();

      return res_ast;

   }

   // ==============================================================================

   static Profile ProfAddItem = new Profile("AddItem");

   class Item
   {
      public int No;
      public Rule Rule;
      public int Pos;
      public ItSet Back;
      public Item Left;
      public Item Sub;

      public Item(Rule r, int p, ItSet b, Item left, Item sub)
      {
         Rule = r;
         Pos = p;
         Back = b;
         Left = left;
         Sub = sub;
         No = -1;
      }

      public void Print()
      {
         P_(""+No);
         P_("   ");
         P_(Rule.Lhs.Name);
         P_(":  ");
         for (int i = 0; i < Pos; i++) {
            P_(Rule.Rhs[i].Name);
            P_(" ");
         }
         P_("* ");
         for (int i = Pos; i < Rule.Rhs.length; i++) {
            P_(Rule.Rhs[i].Name);
            P_(" ");
         }
         P_("    ");
         P_(""+Back.Idx);
         P_(" ");
         if (Left == null)
            P_("-");
         else
            P_(""+Left.No);
         P_(" ");
         if (Sub == null)
            P_("-");
         else
            P_(""+Sub.No);
         P("");
      }
   }

   // ==============================================================================

   class ItSet
   {
      public int Idx;


      // --- meinItems ------------------------------------------------
      //private Item[] meinItems;
      ArrayList<Item> ITEMLIST;
      public Item GETITEM(int i)
      {
         //return meinItems[i];
         return ITEMLIST.get(i);
      }
      private void SETITEM(int i, Item it)
      {
         //meinItems[i] = it;
         ITEMLIST.set(i, it);
      }
      private void EXPANDITEM()
      {
                  LastIndex++;
                  if (LastIndex >= MaxIndex) {
                      //Control.Exit("too many items");
                  }
                  Item It = new Item((Rule) null, -1, (ItSet) null, (Item) null, (Item) null);
                  ITEMLIST.add(It);
      }
      private void ALLOCITEMS()
      {
         //meinItems = new Item[MaxIndex+1];
         ITEMLIST = new ArrayList<Item>();
         EXPANDITEM();
      }
      // --- end meinItems --------------------------------------------

      public int LastIndex;

      //final static int MaxIndex = 20000;
      //final static int MaxIndex = 10000;
      final static int MaxIndex = 1750;

      public boolean Added;

      public void Add(Item It)
      {
         ProfAddItem.Start();

         //myItems[LastIndex + 1] = It;
         SETITEM(LastIndex + 1, It);
         for (int i = 0;; i++) {
            //Item Inspected = myItems[i];
            Item Inspected = GETITEM(i);
            if (Inspected.Rule == It.Rule && Inspected.Pos == It.Pos
                  && Inspected.Back == It.Back) {
               if (i == LastIndex + 1) {
                  EXPANDITEM();
                  It.No = 99999;
                  Added = true;
                  P_("Added item... "); It.Print();

                  ProfAddItem.Stop();

                  return;
               } else {
                  Added = false;
                  //CheckAmbiguity(It, myItems[i]);
                  CheckAmbiguity(It, GETITEM(i));

                  ProfAddItem.Stop();

                  return;
               }
            }
         }
      }

      public ItSet(int idx)
      {
         //myItems = new Item[MaxIndex+1];
         ALLOCITEMS();
         LastIndex = -1;
         Idx = idx;
      }

      public void Print()
      {
         P("ItSet {");
         for (int i = 0; i <= LastIndex; i++) {
            P_("(" + i + ") ");
            //myItems[i].Print();
            GETITEM(i).Print();
         }
         P("}");
      }
   }
}
