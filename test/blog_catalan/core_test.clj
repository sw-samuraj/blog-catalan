(ns blog-catalan.core-test
  (:require [midje.sweet :refer :all]
            [blog-catalan.core :refer :all]))

(tabular
  (fact "The factorial"
        (factorial ?n) => ?f)
  ?n      ?f
  0       1
  1       1
  2       2
  3       6
  4      24
  5     120
  6     720
  7    5040
  8   40320
  9  362880)

(tabular
  (fact "The binomial"
        (binomial ?n ?k) => ?b)
  ?n ?k ?b
  0  0  1
  1  0  1
  2  0  1
  2  1  2
  3  2  3
  4  2  6
  6  3  20)

(tabular
  (fact "The Catalan numbers"
        (catalan ?n) => ?c)
  ?n ?c
  0  1
  1  1
  2  2
  3  5
  4  14)

(fact "Seq of the 1st ten Catalan numbers"
      (take 10 (catalans)) => (contains [1 1 2 5 14 42 132 429 1430 4862]))

(fact "Seq of the Catalan numbers up to 10"
      (catalans 10) => (contains [1 1 2 5 14 42 132 429 1430 4862]))

(fact "Seq of fthe Catalan numbers from 5 to 10"
      (catalans 5 10) => (contains [42 132 429 1430 4862]))
