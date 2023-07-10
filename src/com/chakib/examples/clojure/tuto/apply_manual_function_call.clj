(ns com.chakib.examples.clojure.tuto.apply-manual-function-call)

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (max 1 2 3 4 5 6))                               ; it returns the maximum
  (println (max [1 2 3 4 5 6]))                             ; it returns the vector because the max is not applied
  (println (apply max [1 2 3 4 5 6]))                       ; max fn will be applied on the vector
  (println (apply + [1 2 3]))                               ; using apply
  (println (str \h \e \l \l \o))                            ; str joining
  (println (str [\h \e \l \l \o]))                          ; str not applied
  (println (apply str [\h \e \l \l \o]))                    ; apply f [args...] -> f args... = manual function call
  )
