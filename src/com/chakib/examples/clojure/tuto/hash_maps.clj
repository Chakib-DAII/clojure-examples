(ns com.chakib.examples.clojure.tuto.hash-maps)

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println {"answer" 42
             "question" "?"
             2 "two"
             "list" '(1 2)
             () '()})                                       ; printing an example map
  (let [hashmap {"answer" 42
                 "question" "?"
                 2 "two"
                 "list" '(1 2)
                 () '()}]
    (println hashmap)                                       ; printing an example map
    (println "keys: " (keys hashmap))                       ; printing keys
    (println "values: " (vals hashmap))                     ; printing values
    (println (hashmap "answer" 42))                         ; get value by key
    (println (hashmap "answer"))
    (println (hashmap "question"))
    (println (hashmap 2))
    (println (hashmap "list"))
    (println (hashmap ()))
    (println (hashmap 42))
    (println (count hashmap))                               ; counting keysets
    )
  (println (vals {}))                                       ; values of empty map
  (println ({nil "nothing"} nil))                           ; get value by key
  (println (conj {} ["key" "value"]))                       ; growing a hashmap
  (println (conj (conj {} ["key" "value"]) ["key1" "value1"])) ; growing a hashmap
  (println (reduce conj {} [["key" "value"] ["key1" "value1"]])) ; growing a hashmap
  )

