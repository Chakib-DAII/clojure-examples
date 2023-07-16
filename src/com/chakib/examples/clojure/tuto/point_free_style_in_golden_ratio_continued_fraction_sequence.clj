(ns com.chakib.examples.clojure.tuto.point-free-style-in-golden-ratio-continued-fraction-sequence)

(def golden-ratio-continued-fraction-seq (iterate (comp inc /) 1)) ; -> f(x) = 1/x + 1 = 1 + 1/x
(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (/ 1 2))
  (println ((comp inc /) 1))                                ; -> f(1) = 1/1 + 1 = 2
  (println (take 10 (iterate (comp inc /) 1)))              ; -> taking 10 of f(f(f(f(f(f(f(f(f(f(1))))))))))
  (println (take 100 golden-ratio-continued-fraction-seq))  ; -> taking 100 of golden-ratio-continued-fraction-seq
  )

