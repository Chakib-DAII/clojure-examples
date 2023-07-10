(ns com.chakib.examples.clojure.tuto.conditional-if)

(defn abs [a]                                               ; defining a function with decision
               (if (>= a 0)                                 ; condition
                a                                           ; consequent
                (- a)))                                     ; alternative
(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (abs 2))
  (println (abs -1))
  )

