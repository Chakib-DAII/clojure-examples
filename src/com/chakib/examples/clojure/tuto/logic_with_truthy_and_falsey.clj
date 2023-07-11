(ns com.chakib.examples.clojure.tuto.logic-with-truthy-and-falsey)

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (not true))                                      ; negation
  (println (not false))
  (println (and true false true))                           ; logical and
  (println (or true false))                                 ; logical or
  (println (if 42 "consequent" "alternative"))              ; a number is truthy
  (println (if [] "consequent" "alternative"))              ; a vector is truthy
  (println (if nil "consequent" "alternative"))             ; nil is falsey
  (println (filter identity [1 2 nil 4 51 nil nil]))
  (println (and 1 nil 42))                                  ; falsey as there is nil
  (println (or 42 false nil false nil nil))                 ; logical or, truthy
  (println (boolean 0))                                     ; falsey
  (println (boolean false))                                 ; falsey
  (println (boolean 1))                                     ; truthy
  (println (boolean true))                                  ; truthy
  )

