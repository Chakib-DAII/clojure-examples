(ns com.chakib.examples.clojure.tuto.reducing-a-collection-aka-abstraction)

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (conj [1 2] [3 4 5]))                            ; conjoin adds the second vector in the last index of the first
  (println (reduce conj [1 2] [3 4 5]))                     ; with reduce, the two vectors will be merged to one
  (println (reductions conj [1 2] [3 4 5]))                 ; Returns a lazy seq of the intermediate values of the reduction
  (println (conj (conj (conj [1 2] 3) 4) 5))                ; it returns the same result as (reduce conj [1 2] [3 4 5])
  (println (reduce max [1 2 3 8 6 7 9 10 5 4]))             ; reducing max function
  (println (apply max [1 2 3 8 6 7 9 10 5 4]))              ; it gives the same result as apply doesn't mean those are similar
  (println (reductions max [1 2 3 8 6 7 9 10 5 4]))         ; reduce rf initial-value [x y z] -> (rf (rf (rf initial-value x) y) z)
  (println (reduce + [1 2 3]))                              ; translates to (+ (+ 1 2) 3)
  (println (apply + [1 2 3]))                               ; translates to (+ 1 2 3)
  (println (apply + 1 2 [3 4 5]))                           ; we cannot make (reduce + 1 2 [3 4 5]) it accepts a function and collection as args
  (println (apply hash-map [:a 5 :b 6]))                    ; it returns {:b 6, :a 5}
  (println (reduce hash-map [:a 5 :b 6]))                   ; it returns {{{:a 5} :b} 6}
  (println (reductions hash-map [:a 5 :b 6]))
  )

