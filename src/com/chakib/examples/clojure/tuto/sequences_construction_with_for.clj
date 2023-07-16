(ns com.chakib.examples.clojure.tuto.sequences-construction-with-for)

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (map vector [:a :b :c]))                         ; creating vectors from a vector
  (println (mapcat                                          ; Returns the result of applying concat to the result of applying map to f and colls
             (fn [x] (map #(conj x %) [1 2 3]))
             (map vector [:a :b :c])))                      ; here we are mapping the cols to conj of another vector
  (println (for [a [:a :b :c]]
             a))                                            ; a foreach loop example
  (println (for [a [:a :b :c]
                 b [1 2 3]
                 c ["hi" "hello"]]
             [a b c]))                                      ; for each loop with multiple sequence-expressions
  (println (for [x (range 1 4)
                 y (range 1 4)
                 :when (<= x y)]
             [x y]))                                        ; for loop with condition
  (println (for [x (range 3) :while (not= x 1)
                 y (range 3)]
             [x y]))                                        ; for loop with condition
  (println (for [x (range 3)                                ; the position of this condition changes the logic
                 y (range 3) :while (not= x 1)]             ; it didn't take effect here before the loop was already executed
             [x y]))                                        ; for loop with condition
  (println (for [x (range 3)
                 y (range 3)
                 :let [sum (+ x y)                          ; declaring local bindings
                       prod (* x y)]]
             [sum prod]))
  )

