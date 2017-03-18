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
