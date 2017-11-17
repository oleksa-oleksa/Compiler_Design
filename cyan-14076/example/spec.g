root
   expression(-> X)
   log X

phrase expression(-> int)

   rule expression(-> X): expr2(-> X)
   rule expression(-> X+Y): expression(-> X) "+" expr2(-> Y)
   rule expression(-> X-Y): expression(-> X) "-" expr2(-> Y)

phrase expr2(-> int)

   rule expr2(-> X): expr3(-> X)
   rule expr2(-> X*Y): expr2(-> X) "*" expr3(-> Y)
   rule expr2(-> X/Y): expr2(-> X) "/" expr3(-> Y)

phrase expr3(-> int)

   rule expr3(-> X): INTEGER(-> X)
   rule expr3(-> - X): "-" expr3(-> X)
   rule expr3(-> + X): "+" expr3(-> X)
   rule expr3(-> X): "(" expression(-> X) ")"

token INTEGER(-> int)
