(@ ------------------------------------------------------------------------
File pred03\comments.g
Demonstrates multiline comments which
start with a left parenthesis and an at sign and
end   with an at sign and a right parenthesis
Such comments must not contain any at sign
------------------------------------------------------------------------ @)

root
   "Hello 1\n" (@ Comment 1 @) "Hello 2\n"  (@ Comment 2 @) print "Hello 3"
   (@ Comment 3 line 1
      Comment 3 line 2
      Comment 3 line 3 @)
   print "Hello 4"

(@ ------------------------------------------------------------------------
Output of this program:

Hello 1
Hello 2
Hello 3
Hello 4
------------------------------------------------------------------------ @)
