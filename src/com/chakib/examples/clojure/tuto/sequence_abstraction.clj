(ns com.chakib.examples.clojure.tuto.sequence-abstraction)

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (seq '(1 2 3 4 5)))                              ; Returns a seq on the collection. If the collection is empty, returns nil.
  (println (seq [1 2 3 4 5]))                               ; sequence of vector
  (println (seq "Hello world!"))                            ; sequence of string
  (println (seq #{1 2 3 4}))                                ; sequence of hashset
  (println (set (range 1 21)))
  (println (seq (set (range 1 21))))                        ; sequence of hashset
  (println (seq {:a 3 :b 4}))                               ; sequence of hashmap
  (println (map second {:a 3 :b 4}))                        ; returning values of hashmap
  (println (map first {:a 3 :b 4}))                         ; returning keys of hashmap
  )

