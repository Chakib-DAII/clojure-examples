(ns com.chakib.examples.clojure.tuto.zipmap)

(def number-names ["Zero" "One" "Two" "Three" "Four" "Five" "Six" "Seven" "Eight" "Nine" "Ten"])
(def numbers->names (zipmap (range 11) number-names))       ; mapping numbers to names
(def names->numbers (zipmap number-names (range) ))         ; mapping names to numbers, it works even with infinite range
                                                            ; because the zipmap works until reaching the min of collections sizes

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (zipmap [:a :b :c] [1 2 3]))                     ; Returns a map with the keys mapped to the corresponding vals.
  (println (zipmap (take 6 number-names) (range 6)))        ;even without take it works
  (println numbers->names)
  (println (numbers->names 6))
  (println (numbers->names 10))
  (println names->numbers)
  (println (names->numbers "Two"))
  (println (names->numbers "Nine"))
  (println ())
  (println ())
  (println ())
  (println ())
  (println ())
  (println ())
  (println ())
  (println ())
  )

