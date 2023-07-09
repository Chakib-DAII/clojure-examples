(ns com.chakib.examples.clojure.tuto.symbol-binding)
(def x 1)                                                   ; defining x as global, it pollutes the environment: better to use let at the moment of using it
                                                            ; but we do define functions the same way xD
(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (+ x 1))                                         ; incrementing x
  (println (let [x 2] (+ x 1)))                             ; increment x, the local one will be used
  (println x)                                               ; the global defined x
  (println (let [x 4, y 2] (+ x y)))                        ; defining local x and y, local bindings are seen only inside the function
  )

