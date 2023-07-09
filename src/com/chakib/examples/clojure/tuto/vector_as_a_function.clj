(ns com.chakib.examples.clojure.tuto.vector-as-a-function)

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println [42 "Hello" 13])                                 ; it returns the vectors values
  (println (nth [42 "Hello" 13] 0))                         ; index 0 of the vector
  (println (nth [42 "Hello" 13] 1))                         ; index 1 of the vector
  (println (nth [42 "Hello" 13] 2))                         ; index 2 of the vector
  (try
    (println (nth [42 "Hello" 13] 3))                       ; index 3 of the vector, out of index error
    (catch Exception e (println (str "Exception: " (.toString (.getStackTrace e)))))
    )
  (println ([42 "Hello" 13] 0))                             ; index 0 of the vector
  (println ([42 "Hello" 13] 1))                             ; index 1 of the vector
  (println ([42 "Hello" 13] 2))                             ; index 2 of the vector
  (println ((comp ["apple" "mango" "banana"] [1 0 2 1]) 0)) ; mapping indexes with another vector and returning index 0
  (println ((comp ["apple" "mango" "banana"] [1 0 2 1]) 1)) ; mapping indexes with another vector and returning index 1
  (println ((comp ["apple" "mango" "banana"] [1 0 2 1]) 2)) ; mapping indexes with another vector and returning index 2
  (println ((comp ["apple" "mango" "banana"] [1 0 2 1]) 3)) ; mapping indexes with another vector and returning index 3
  )

