(ns fpoop.core)

(defn fact [n]
  (apply * (range 1 (inc n)))
)
