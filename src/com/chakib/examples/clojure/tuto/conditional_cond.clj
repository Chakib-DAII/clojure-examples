(ns com.chakib.examples.clojure.tuto.conditional-cond)

(defn what-is-it                                            ; defining a function with cond
  [x]
  (cond
    (number? x) "It's a number."
    (string? x) "It's a string."
    (list? x) "It's a list."
    (vector? x) "It's a vector"
    (map? x) "It's a map"
    (fn? x) "It's a function"
    (seq? x) "It's a sequence"
    (set? x) "It's a set"
    (coll? x) "It's a collection"
    (class? x) "It's a class"
    (record? x) "It's a record"
    (nil? x) "It's nil"
    true "No idea"
    ))
(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (what-is-it 1))
  (println (what-is-it "Hello"))
  (println (what-is-it '(1 2 3 4 5)))
  (println (what-is-it [1 2 3 4 5]))
  (println (what-is-it {:name "Chakib" :age 28 }))
  (println (what-is-it #{1 4 3 2 5}))
  (println (what-is-it what-is-it))
  (println (what-is-it (seq "Lorem ipsum dolor sit amet")))
  (println (what-is-it nil))
  (println (what-is-it (class (String. "Hi"))))
  (println (what-is-it (defrecord R [x])))
  (println (what-is-it println))
  )

