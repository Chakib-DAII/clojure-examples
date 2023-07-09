(ns com.chakib.examples.clojure.tuto.predicate-functions)

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (zero? 0))                                       ; is zero test predicate
  (println (zero? (dec 2)))
  (println (pos? 4))                                        ; is positive test predicate
  (println (pos? 0))
  (println (neg? -1))                                       ; is negative test predicate
  (println (< 0 1))                                         ; 0 < 1
  (println (< 1 2 3 4 5 6))                                 ; 1 < 2 < 3 < 4 < 5 < 6
  (println (< 1 2 -1))                                      ; 1 < 2 < -1
  (println (<= 0 1 2 3 4))                                  ; 0 <= 1 <= 2 <= 3 <= 4
  (println (= 42 (inc 41) (dec 43)))
  (println (number? 42))
  (println (number? inc))
  (println (fn? inc))
  (println (fn? +))
  (println (= 3 3.0))
  (println (integer? 3))
  (println (integer? 3.0))
  (println (float? 3))
  (println (float? 3.0))
  (println (rational? (/ 1 2)))
  (println (= (/ 1 2) 0.5))
  )

