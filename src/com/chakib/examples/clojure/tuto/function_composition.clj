(ns com.chakib.examples.clojure.tuto.function-composition)

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println ((comp inc inc) 1))                              ; composition of functions, it is the same way in maths fºg aNd it can be applied to number of args passed to comp
  (println ((comp inc dec inc inc dec) 1))                  ; composition of different functions
  (println (identity "Hello worlds!"))                      ; printing identity of argument
  (println (identity inc))
  (println ((comp inc) 1))                                  ; it applies inc one time
  (println ((comp) 3))                                      ; it returns the arg
  (println (comp))                                          ; evaluated as identity
  )

