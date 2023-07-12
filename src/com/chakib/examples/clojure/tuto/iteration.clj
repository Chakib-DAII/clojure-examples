(ns com.chakib.examples.clojure.tuto.iteration)

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (iterate inc 0))                                 ; Returns a lazy sequence of x, (f x), (f (f x)), same as (range)
  (println (inc (inc (inc 0))))                             ; iterate does like this in a lazy sequence
  (println (iterate (fn [x] (* x 2)) 1))                    ; iterating another function
  )

