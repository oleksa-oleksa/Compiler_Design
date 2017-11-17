// -----------------------------------------------------------------------
// File test\test01.g
// -----------------------------------------------------------------------

// Fuer Test 4 VA
type Note c() d() e() f() g() a() h() c2()

type Melodie
   m0()
   m1(Erste:Note, Rest:Melodie)


// Fuer Test 4 VB
type Weg
   w1(Rest:Weg, Letzter:Schritt)
   w0()

type Schritt r() l() h1() t() //rechts, links, hoch, tief


// ------------------------------------------------------------------------
root
   "test01: Terme, Spezialfaelle, Grundspezialfaelle\n"

   // Test 4 VA
   N1 <- c()
   N2 <- d()
   M2 <- m0()

   v01 <- m1(N1, m1(N2, M2))
   v02 <- m1(N1, m1(N2, m0()))
   v03 <- m1(N1, m1(N2, M2))
   v04 <- N1
   v05 <- m1(c(), m1(e(), m1(g(), m0())))
   v06 <- M2

   // Test 4 VB
   S1 <- r()
   S2 <- l()
   W2 <- w0()

   w01 <- w1(w1(w0(), S1), S2)
   w02 <- w1(w1(W2, S1), S2)
   w03 <- w1(w1(W2, S1), S2)
   w04 <- W2
   w05 <- w1(w1(w1(w0(), r()), h1()), r())
   w06 <- S1


// ------------------------------------------------------------------------
