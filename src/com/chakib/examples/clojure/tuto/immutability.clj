(ns com.chakib.examples.clojure.tuto.immutability)

(def v [1 2 3])
(def v1 (conj v 4))                                         ; creating a new vector based on the first

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println v)                                               ; printing the defined vector
  (println (conj v 4))                                      ; adding to the vector
  (println v)                                               ; the vector doesn't change -> immutability
  (println v1)
  )

