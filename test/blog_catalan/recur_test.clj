(ns blog-catalan.recur-test
  (:require [midje.sweet :refer :all]
            [blog-catalan.recur :refer :all]))

(tabular
  (fact "The Catalan numbers"
        (catalan ?n) => ?c)
  ?n       ?c
   0        1
   1        1
   2        2
   3        5
   4       14
   5       42
   6      132
   7      429
   8     1430
   9     4862
  10    16796
  11    58786
  12   208012
  13   742900
  14  2674440
  15  9694845)
