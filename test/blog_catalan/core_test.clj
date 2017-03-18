(ns blog-catalan.core-test
  (:require [midje.sweet :refer :all]
            [blog-catalan.core :refer :all]))

(facts
  (fact (nil? nil) => true)
  (fact (even? 42) => true))
