(ns com.chakib.examples.clojure.tuto.point-free-style
  (:use [clojure.string :only [upper-case]]))

(def negative-product (comp - *))                           ; composing functions

(def ten-times (partial * 10))                              ; partial functions, partial takes a function f and fewer than the normal arguments to f

(defn take-drop-3 [coll]                                    ; functions juxtaposition, juxt takes a set of functions and returns a fn that is the juxtaposition of those fns
  ((juxt take drop) 3 coll))                                ; here take and drop will be executed separately and results will be returned in a vector

(def take-drop (juxt (partial take) (partial drop)))

(def even-odd-sep
  (juxt (partial filter even?) (partial filter odd?)))      ; separating even and odd numbers

(def count-if (comp count filter))                          ; composing count and filter to count only if the condition of filter is satisfied

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (negative-product 1 2 3 4 5))                    ; calling a composed function
  (println (ten-times 1))                                   ; calling a partial function
  (println (map ten-times [1 2 3 4 5]))                     ; mapping a partial fi«unction over a vector
  (println (take-drop-3 [1 2 3 4 5 6]))
  (println (take-drop 2 [1 2 3 4 5 6]))
  (let [book {:author "Gang of Four (GoF)"
         :title "Design Patterns: Elements of Reusable Object-Oriented Software"
         :year 1994}]
    (println ((juxt :title :year) book))                    ; keyword as a function
    )
  (println (even-odd-sep (range 20)))                       ; even, odd separation
  (let [letters-string "abcdefghijklmnopqrstuvwxyz"         ; string of letter
        letters (set letters-string)                        ; converting letters to set
        count-lower-case (partial count-if letters)         ; partial fn to count lower case letters
        upper-letters (set (upper-case letters-string))     ; converting letters to set of uppercase
        count-upper-case (partial count-if upper-letters)   ; partial fn to count upper case letters
        ]
    (println letters)
    (println (count-lower-case "AbcGIoWQdfRansio"))
    (println upper-letters)
    (println (count-upper-case "AbcGIoWQdfRansio"))
    )
  )

