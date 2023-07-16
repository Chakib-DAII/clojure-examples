(ns com.chakib.examples.clojure.tuto.side-effects)

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (str))                                           ; in functional programming functions are pure
  (println (str 42))                                        ; the output is always determined by the input
  (println (rand))                                          ; internally using Math.random() -> (. Math (random)
  (println (rand 10))                                       ; this is not a pure function ( not a mathematical function)
  (println "Hello world!")
  (println (do (inc 1) (inc 1)))
  (doseq [a [1 2]                                           ; Repeatedly executes body (presumably for side-effects)
          b [:x :y]]                                        ; with bindings and filtering as provided by "for".
    (println a b))
  )

