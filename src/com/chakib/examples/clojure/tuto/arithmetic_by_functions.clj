(ns com.chakib.examples.clojure.tuto.arithmetic-by-functions)

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (+ 3 4))                                         ; adding 2 numbers
  (println (+ 1 2 3 4 5 6 7 8 9))                           ; adding multiple numbers
  (println (+ 2))                                           ; adding 1 number (+ function adds to zero by default)
  (println (+))                                             ; it returns a zero
  (println (* 2 3))                                         ; multiplying 2 numbers
  (println (* 1 2 3 4 5 6 7))                               ; multiplying multiple
  (println (* 2))                                           ; multiplying 1 number over 1 (* function multiply by one by default)
  (println (*))                                             ; it returns 1
  (println (- 2 3 4))                                       ; substructing numbers
  (println (- 2))                                           ; substructing from zero
  (println (/ 16 2))                                        ; division of 2 numbers
  (println (/ 16 2 2 2))                                    ; division by multiple, in order
  (println (/ 5))                                           ; division of 1 / the given number as argument
  (try
     (println (/ 0))                                        ; division by zero
     (catch Exception e (println (str "Exception: " (.toString (.getMessage e)))))
     (finally (println "This is our final block")
              ))
  (println (+ 2 (* 3 4)))                                   ; expression with priority
  (println (Math/PI))                                       ; using java.lang.Math
  (println (Math/E))
  (println (Math/cos 0))
  (println (Math/sin 45))
  (println (Math/abs -1))
  (println (Math/cbrt 90))
  )

