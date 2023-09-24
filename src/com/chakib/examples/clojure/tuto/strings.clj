(ns com.chakib.examples.clojure.tuto.strings
  (:require [clojure.string :as string]))

(defn anagrams
  [str str1]
  (= (sort str) (sort str1)))

(def prime-numbers [2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101 103])

(defn str->prime-numbers
  "mapping a character to a prime number"
  [str]
  (map
    #(nth
       prime-numbers
       (- (int %) 97))                                      ; character to ascii - 97
    (seq str)))
(defn anagrams-using-primes
  [^String str ^String str1]
  (= (reduce * (str->prime-numbers str)) (reduce * (str->prime-numbers str1)))) ; reduce * over prime numbers lists and checking if the products are equal

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println "HELLO!")                                        ; print a string
  (println (str \h \e \l \l \o \!))                         ; print a string after transformation
  (println \h)                                              ; print a character
  (println (str))                                           ; print an empty string
  (println (= 42 "42"))                                     ; comparison of a number and string
  (println "(inc 1)")
  (println (string/capitalize  "hello"))                    ; applying capitalize
  (println (string/upper-case  "hello"))                    ; applying upper-case
  (println (.toUpperCase  (String. "hello")))               ; applying upper-case in java style
  (println (string/lower-case  "HI"))                       ; applying lower-case
  (println (.toLowerCase  (String. "HI")))                  ; applying lower-case in java way
  (println (string/replace "banana and mango" "an" "um"))   ; applying replace
  (println (string/replace "banana" "an" "anan"))           ; applying replace
  (println (.replace (String. "banana")  "an" "anan" ))     ; applying replace in java way
  (println (anagrams "car" "arc"))
  (println (anagrams "brag" "grab"))
  (println (anagrams "no" "test"))
  (println (map #(int %) (seq "1")))
  (println (map #(nth prime-numbers (- (int %) 97)) (seq "abc")))
  (println prime-numbers)
  (println (nth prime-numbers 1))
  (println (str->prime-numbers "car"))
  (println (reduce * (str->prime-numbers "car")))
  (println (str->prime-numbers "arc"))
  (println (reduce * (str->prime-numbers "arc")))
  (println (anagrams-using-primes "car" "arc"))
  (println (anagrams-using-primes "brag" "grab"))
  (println (anagrams-using-primes "no" "test"))
  )

