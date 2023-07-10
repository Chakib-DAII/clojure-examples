(ns com.chakib.examples.clojure.tuto.selecting-from-a-collection)

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (filter even? [1 2 3 4 5 6]))                    ; taking even numbers only
  (println (filter zero? [1 2 0 0 3 0 4 0]))                ; taking zeros
  (println (remove zero? [1 2 0 0 3 0 4 0]))                ; removing zeros
  (println (filter pos? (remove zero? [1 2 0 0 3 0 4 0])))  ; taking positive numbers after removing zeros
  )

