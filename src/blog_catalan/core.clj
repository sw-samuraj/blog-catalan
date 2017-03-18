(ns blog-catalan.core)

(defn factorial [n]
  "Counts a factorial."
  (reduce *' (range 1 (inc n))))

(defn binomial [n k]
  "Counts a binomial coefficient."
  (/ (factorial n)
     (*' (factorial k)
        (factorial (- n k)))))

(defn catalan [n]
  "Counts a Catalan number."
  (* (/ 1 (inc n))
     (binomial (* 2 n) n)))

(defn catalans
  "Returns a lazy seq of Catalan numbers."
  ([]
    (map catalan (range)))
  ([end]
    (map catalan (range end)))
  ([start end]
    (map catalan (range start end))))
