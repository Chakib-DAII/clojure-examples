(ns com.chakib.examples.clojure.tuto.evaluation)

;REPL : Read Evaluate Print Loop

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println 42)                                              ; printing a literal
  (println "Hello!")                                        ; printing a string literal
  (println (inc 41))                                        ; printing an expression (command args...)
  (println (inc (inc 41)))                                  ; calling inc on an expression using inc function also : it can be called as much as we want
  (println (dec 1))
  (println (dec (dec 10)))                                  ; it is avaluated the same way with ((comp dec dec) 10)
  )
