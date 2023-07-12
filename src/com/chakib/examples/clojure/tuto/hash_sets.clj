(ns com.chakib.examples.clojure.tuto.hash-sets)

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println #{1 2 3 4})
  ;(println #{1 2 3 3 4}) this one causes an IllegalArgumentException because of duplicate key
  (let [numbers-set #{1 2 3 4}]
    (println (numbers-set 4))                               ; hashset as a function
    (println (get numbers-set 3 :default))                  ; return default if the key in argument not found
    (println (get numbers-set 0))                           ; it returns nil
    (println (get numbers-set 0 :default))                  ; it returns :default
    )
  (let [fruits #{:apple :mango :pear :grape :banana :orange} ; defining sets of fruits, vegetables and vectors of baskets
        vegetables #{:cucumber :tomato :carrot :onion}
        basket [:apple :apple :onion :carrot :grape]
        basket-1 [:apple :cucumber :cucumber :carrot :grape :banana :banana]]
    (println (filter vegetables basket))                    ; filtering sets from vectors
    (println (remove fruits basket))
    (println (remove vegetables basket))
    (println (filter fruits basket))
    (println (filter vegetables basket-1))
    (println (remove fruits basket-1))
    (println (remove vegetables basket-1))
    (println (filter fruits basket-1))
    )
  )

