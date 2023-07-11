(ns com.chakib.examples.clojure.tuto.keywords)

(def hashmap {:a 2 :b 3})                                   ;a random hashmap with keywords
(def book {:author "Douglas Adams"
           :title "Hitch Hiker's guide to the galaxy"
           :year 1979})                                     ; hashmap as a record or db
(def books [{:author "Gang of Four (GoF)"
             :title "Design Patterns: Elements of Reusable Object-Oriented Software"
             :year 1994}
            book
            {:author "Rod Johnson"
             :title "One-to-One J2EE Development"
             :year 2004}
            {:author "Robert Cecil Martin"
             :title "Clean Code: A Handbook of Agile Software Craftsmanship"
             :year 2008}])                                  ; books as db
(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println :key)                                            ; keyword example
  (println :k)                                              ; another example
  (println {:a 2 :b 3})
  (println {:a 2, :b 3})
  (println (hashmap :b))                                    ; getting values using keywords
  (println (hashmap :a))
  (println (:a hashmap))
  (println (:b hashmap))
  (println "author: " (:author book))
  (println "title: " (:title book))
  (println "year: " (:year book))
  (println "publisher: " (:publisher book))                 ; it is a null safe thing
  (dorun (map #(println %) books))                          ; printing the books
  (dorun (map #(println "\n####################"
                        "\nauthor: " (:author %)
                        "\ntitle: " (:title %)
                        "\nyear: " (:year %)
                        "\n####################" ) books))  ; printing the books
  )

