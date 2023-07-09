(ns com.chakib.examples.clojure.tuto.strings
  (:require [clojure.string :as string]))

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
  )

