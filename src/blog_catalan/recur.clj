(ns blog-catalan.recur)

(defn catalan [n]
  "Counts a Catalan number by recursion."
  (loop [cnt n acc 1]
    (if (zero? cnt)
      acc
      (recur (dec cnt)
             (* acc (- 4 (/ 6 (inc cnt))))))))
