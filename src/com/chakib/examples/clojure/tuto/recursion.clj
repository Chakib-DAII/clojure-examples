(ns com.chakib.examples.clojure.tuto.recursion)

(defn reverse-string
  "Returns input with its characters reversed."
  [^String input]
  (if (= input "")                                          ; Base Case / stop condition
    ""
    (str (reverse-string (.substring input 1)) (.charAt input 0))) ; Recursive call
  )

(defn is-palindrome?
  "checks if string is palindrome"
  [^String input]
  (if (or (= (.length input) 0) (= (.length input) 1))     ; Base Case / stop condition
    true
    (if (= (.charAt input 0) (.charAt input (- (.length input) 1))) ; Recursive call
      (is-palindrome? (.substring input 1 (- (.length input) 1)))
      false))                                               ; additional base-case to handle non-palindromes
  )

(defn find-binary
  "find binary of a decimal number"
  [decimal ^String result]
  (if (= decimal 0)                                         ; Base Case / stop condition
    result
    (find-binary (int (/ decimal 2) ) (str (mod decimal 2) result))) ; Recursive call
  )

(defn recursive-summation
  "sum numbers recursively"
  [input]
  (if (<= input 0)                                          ; Base Case / stop condition
    input
    (+ input (recursive-summation (- input 1))))            ; Recursive call
  )

(defn binary-search
  "recursive binary search"
  [coll left right x]
  (if (> left right)                                        ; Base Case / stop condition
    -1
    (let [mid (int (/ (+ left right) 2))] (               ; declaring mid
                                           (if (= (nth coll mid) x)                           ; Base Case / stop condition
                                             mid
                                             (if (> (nth coll mid) x)                         ; Recursive call
                                               (binary-search coll left (- mid 1) x)
                                               (binary-search coll (+ mid 1) right x)))
                                           )))
  )

(defn fib
  "fibonacci recursive method"
  [input]
  (if (or (= input 0) (= input 1))                          ; Base Case / stop condition
    input
    (+ (fib (- input 1)) (fib (- input 2))))                ; Recursive call
  )

(defn merge-sort
  "recursive merge sort"
  [coll]
  (if (<= (count coll) 1)
    coll
    (let [mid (quot (count coll) 2)
          left (subvec coll 0 mid)
          right (subvec coll mid)
          merge (fn [left right](if (empty? left)           ; the same merge helper method declared locally
                                  right
                                  (if (empty? right)
                                    left
                                    (if (<= (first left) (first right))
                                      (cons (first left) (merge (rest left) right))
                                      (cons (first right) (merge left (rest right)))))))]
      (merge (merge-sort left) (merge-sort right)))))

(defn reverse-list
  "reverse list recursively"
  [lst]
  (if (empty? lst)
    lst
    (let [rest (rest lst)]
      (if (empty? rest)
        lst
        (conj (reverse-list rest) (first lst))))))

(defn insert-node
  "insert node to tree recursively"
  [tree value]
  (cond
    (nil? tree) [value nil nil]             ; Empty tree, create a new node [value left right]
    (< value (first tree))                   ; Value is smaller, insert in the left subtree
    [(first tree) (insert-node (second tree) value) (nth tree 3)]
    :else                                   ; Value is greater or equal, insert in the right subtree
    [(first tree) (second tree) (insert-node (nth tree 3) value)]))

(defn print-leaves
  "print tree leaves recursively"
  [tree]
  (when (seq tree)
    (let [[value left right] tree]
      (when-not (or left right)
        (println value))
      (print-leaves left)
      (print-leaves right))))
(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (reverse-string "clojure"))
  (println (is-palindrome? "racecar"))
  (println (is-palindrome? "notPalindrome"))
  (println (find-binary 1212 ""))
  (println (recursive-summation 1500))
  (let [data [1 2 3 4 5 6 7 8 9 10]]
    (println (= (nth data 9) 10))
    )
  (println (fib 10))
  (println (merge-sort [5 2 10 10 20 1 0 3 6 100 99 88]))
  (println (reverse-list '(1 2 3 4 5)))
  (let [tree [5 [3 [2 nil nil] [4 nil nil]] [8 nil [10 nil nil]]] values []]
    (println (loop [t tree
                    vs values]
               (if (empty? vs)
                 t
                 (let [value (first vs)]
                   (recur (insert-node t value) (rest vs))))))
    (print-leaves tree)
    )
  )

