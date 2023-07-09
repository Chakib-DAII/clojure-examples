(ns com.chakib.examples.clojure.tuto.lists)

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (quote (1 2 3 4 5)))                             ; quote is a way to skip evaluation, mainly used in case of Lists ()
  (println '(1 2 3 4 5))                                    ; ' is equal to quote
  (println '(inc 1))                                        ; the function will be returned as the list
  (println (list 1 2 3 4 5))                                ; (list 1 2 3 4 5) = (quote (1 2 3 4 5)) = '(1 2 3 4 5)
  (println (list inc "hello" 42 1.3))
  (println (cons 1 '(2 3 4 5)))                             ; add an element in index zero
  (println (first '(1 2 3 4 5)))                            ; return the first element in a list
  (println (rest '(1 2 3 4 5)))                             ; return the list without the first element
  (println (rest (rest '(1 2 3 4 5))))                      ; applying the same function multiple times
  (println (first (rest '(1 2 3 4 5))))                     ; returns the second element of the list
  (println (first ()))                                      ; it returns nil
  (println (rest ()))                                       ; it returns an empty list
  (println (concat '(1 2) '(3 4 5) () '(6)))                ; concatenate lists
  (println (count '(1 2 3 4 5 6 7 8)))                      ; counts the elements of a list
  (println (count ()))                                      ; it returns zero
  (println (reverse '(1 2 3 4 5)))                          ; reverses the list
  (println (last '(1 2 3 4 5)))                             ; returns the last element of the list
  (println (first (reverse '(1 2 3 4 5))))                  ; returns the last element of the list
  (println ((comp first reverse) '(1 2 3 4 5)))             ; returns the last element of the list
  )

