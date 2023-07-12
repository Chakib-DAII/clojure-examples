(ns com.chakib.examples.clojure.tuto.conj-the-universal-way-of-growing-collections)

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (conj [1 2] 3))                                  ; conj[oin]. Returns a new collection with the xs at the end
  (println (conj [1 2] [3 4]))                              ; it adds the list in the last index
  (println (reduce conj [1 2] [3 4]))                       ; using reduce it adds one by one
  (println (conj [] 42))
  (println (conj '(1 2) 3))
  )

