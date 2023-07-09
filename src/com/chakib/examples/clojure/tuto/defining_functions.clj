(ns com.chakib.examples.clojure.tuto.defining-functions)
(def sq (fn [x] (* x x)))                                   ; defining a function
(defn sq1 [x] (* x x))                                      ; another way of defining a function
(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println ((fn [x] (* x x)) 13))                           ; using a custom function instantly without defining it
  (println (sq 13))                                         ; using a defined function
  (println (sq 123234))                                     ; using a defined function
  (println (sq1 -1))                                        ; using a defined function
  (println (sq1 2))                                         ; using a defined function
  )

