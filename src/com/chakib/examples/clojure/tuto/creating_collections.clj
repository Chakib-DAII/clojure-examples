(ns com.chakib.examples.clojure.tuto.creating-collections)

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (vector 1 2 3 4 5 6))                            ; creating a vector
  (println (vector [1 2 3 4]))                              ; creating a vector where the first index is a vector
  (println (apply vector [1 2 3 4]))                        ; using apply
  (println (vec [1 2 3 4]))                                 ; using vec, it creates a new vector containing the contents of coll.
  (println (vec '(1 2 3 4)))                                ; from list
  (println (vec #{ 1 2 3 4}))                               ; from set
  (println (vec {:a 1 :b 2 :c 3 :d 4}))                     ; from map
  (println (vector [1 2 3 4] 1 "Hi"))                       ; creating a vector of multi types
  (println (hash-map :a 1 :b 2))                            ; creating a hashmap
  (println (into '() [1 2]))                                ; Returns a new coll consisting of to-coll with all of the items of from-coll conjoined.
  (println (into {} [[:c 3] [:b 2] [:d 4] [:a 1]]))         ; inverse of vec {:a 1 :b 2 :c 3 :d 4} reversed, vector -> hashmap
  (println (into '() [1 2 3]))                              ; vector -> list
  (println (into #{} [1 2 2 3 3]))                          ; vector -> set
  (println (into #{} '(1  2 2 4 3 3)))                      ; list -> set
  )

