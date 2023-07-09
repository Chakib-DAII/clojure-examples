(ns com.chakib.examples.clojure.tuto.lambda-functions)

(defn add2 [n] (+ 2 n))                                     ; defining add2 function
(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (add2 10))                                       ; using a defined function
  (println (add2 -2))                                       ; using a defined function
  (println (map add2 [1 2 3 4 5 6]))                        ; mapping a defined function on a vector
  (println (map add2 '( 1 2 3 4 5 6)))                      ; mapping a defined function on a list
  (println (map (fn [n] (+ 2 n)) [1 2 3 4 5 6]))            ; mapping a function on a vector
  (println (map #(+ 2 %) [1 2 3 4 5 6]))                    ; mapping a lambda function on a vector
  (println (map #(+ %1 %2 10) [1 2] [3 4]))                 ; mapping a lambda function with 2 arguments on a vectors
  (println (map #(+ % %2 10) [1 2] [3 4]))                  ; mapping a lambda function with 2 arguments on a vectors
  )

