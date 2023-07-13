(ns com.chakib.examples.clojure.tuto.vectors)

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println [1 2 3 4 5])                                     ; returns a vector
  (println [1 "two" 3])                                     ; returns a vector
  (println (vector 1 2 3 4 inc))                            ; returns a vector
  (println (vec '(1 2 3)))                                  ; returns a vector
  (println (nth [1 "two" 3] 1))                             ; returns the index 1 element in a list
  (println (nth [1 "two" 3] 0))                             ; returns the index 0 element  in a list
  (println (nth [1 "two" 3] 2))                             ; returns the index 3 element  in a list
  (println [])                                              ; returns an empty list
  )

