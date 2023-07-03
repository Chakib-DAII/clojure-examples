(ns com.chakib.examples.clojure.tuto.functional-collection-transformation)

(defn hello [s] (str "Hello " s "!"))                      ; defining a function that returns hello

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (map inc [1 2 3 4 5]))                           ; mapping inc method to all elements in vector
  (println (hello "world"))
  (println (map hello ["Chakib" "Chokri" "Mohamed"]))       ; mapping hello method to a vector of strings
  (println (take 20 (map dec (range))))                     ; taking 20 elements from the infinite range (lazily evaluated) after mapping dec function
  (println (map + [1 2 3] [10 20 30] [100 200 300]))        ; mapping + on vectors to return a list of sum
  )

