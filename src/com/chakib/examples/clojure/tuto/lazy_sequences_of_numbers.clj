(ns com.chakib.examples.clojure.tuto.lazy-sequences-of-numbers)

(def natural-numbers (range))                               ; defining range as a global ref
(defn -main
  [& args]
  (println (format " [x] args %s" args))
  ;(println (range))                                        ; infinite loop even if it is lazy, because we are using println
  (println (range 10))                                      ; range from 0 to 9
  (println (range 10 10000))                                ; range from 10 to 9999
  (println (range 10 10000 2))                              ; range from 10 to 9999 with 2 as a step
  (println (take 6 natural-numbers))                        ; taking 6 from range
  (println (take 20 natural-numbers))                       ; taking 20 from range
  ;(println (drop 5 natural-numbers))                       ; dropping first 5 from range
  ;(println (drop 10 natural-numbers))                      ; dropping first 10 from range
  ;(println (take 4 (drop 5 natural-numbers)))              ; taking first 4 after dropping first 5 from range
  ;(println (comp take drop) 4 natural-numbers)             ; taking first 4 after dropping first 4 from range
  (println (take-while neg? [-2 -1 -1 0 -1 1 2]))           ; taking while negative numbers, it stops when it finds a positive number
  (println (drop-while neg? [-2 -1 -1 0 -1 1 2]))           ; dropping while negative numbers
  (println (drop-while zero? [0 0 0 0 0 0 0 0 0 0 0 -1 1 2])) ; dropping while zeros
  )

