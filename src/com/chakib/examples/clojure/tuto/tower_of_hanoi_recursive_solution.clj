(ns com.chakib.examples.clojure.tuto.tower-of-hanoi-recursive-solution
  (:use [clojure.string :only [join split]]))

(defn hanoi
  "recursive solution for tower of hanoi _|_|_|_"
  [n source target spare]
  (if (= n 1)                                               ; Base Case / stop condition
    (str " " source " -> " target " ")
    (str                                                    ; Recursive call
      (hanoi (dec n) source spare target)                   ; moving from source to spare
      (str " " source " -> " target " ")                    ; moving from source to target
      (hanoi (dec n) spare target source))))                ; moving from spare to target

(defn hanoi-coll
  "recursive solution for tower of hanoi _|_|_|_, it returns a vector"
  [n source target spare]
  (if (= n 1)                                               ; Base Case / stop condition
    [(str " " source " -> " target)]
    (apply conj                                                    ; Recursive call
      (hanoi-coll (dec n) source spare target)                   ; moving from source to spare
      (str " " source " -> " target)                  ; moving from source to target
      (hanoi-coll (dec n) spare target source))))                ; moving from spare to target

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (let [hanoi-1 (hanoi 1 :a :b :c)
        hanoi-coll-1 (hanoi-coll 1 :a :b :c)]
    (println hanoi-1)                                       ; printing solution
    (println (count hanoi-1))                               ; counting instruction calls
    (println (count hanoi-coll-1))                          ; counting moves
    )
  (let [;hanoi-2 (hanoi 2 :a :b :c)
        hanoi-coll-2 (hanoi-coll 2 :a :b :c)]
    ;(println hanoi-2)
    ;(println (count hanoi-2))
    (println hanoi-coll-2)                                  ; printing collection of moves
    (println (join "" hanoi-coll-2))                 ; printing solution as string
    (println (count hanoi-coll-2))                          ; counting moves
    )
  (let [hanoi-coll-3 (hanoi-coll 3 :a :b :c)]
    (println hanoi-coll-3)
    (println (join hanoi-coll-3))
    (println (count hanoi-coll-3))
    )
  (let [hanoi-coll-4 (hanoi-coll 4 :a :b :c)]
    (println (join hanoi-coll-4))                    ; printing solution as string
    (println (count hanoi-coll-4))                          ; counting moves
    )
  (let [hanoi-coll-5 (hanoi-coll 5 :a :b :c)]
    (println (join hanoi-coll-5))
    (println (count hanoi-coll-5))
    )
  (let [hanoi-coll-6 (hanoi-coll 6 :a :b :c)]
    (println (join hanoi-coll-6))
    (println (count hanoi-coll-6))
    )
  (let [hanoi-coll-7 (hanoi-coll 7 :a :b :c)]
    (println (join hanoi-coll-7))
    (println (count hanoi-coll-7))
    )
  (let [hanoi-coll-8 (hanoi-coll 8 :a :b :c)]
    (println (join hanoi-coll-8))
    (println (count hanoi-coll-8))
    )
  (let [hanoi-coll-9 (hanoi-coll 9 :a :b :c)]
    (println (join hanoi-coll-9))
    (println (count hanoi-coll-9))
    )
  (let [hanoi-coll-10 (hanoi-coll 10 :a :b :c)]
    (println (join hanoi-coll-10))
    (println (count hanoi-coll-10))
    )
  (let [hanoi-coll-20 (hanoi-coll 20 :a :b :c)]
    (println (join hanoi-coll-20))
    (println (count hanoi-coll-20))
    )
  ;(let [hanoi-coll-100 (hanoi-coll 1000 :a :b :c)]
  ;  (println (join hanoi-coll-100))
  ;  (println (count hanoi-coll-100))
  ;  )
  ;(let [hanoi-coll-100 (hanoi-coll 5000 :a :b :c)]
  ;  (println (join hanoi-coll-100))
  ;  (println (count hanoi-coll-100))
  ;  )
  )
