(ns blog-catalan.core)

(defn factorial [n]
  "Counts a factorial."
  (reduce * (range 1 (inc n))))
