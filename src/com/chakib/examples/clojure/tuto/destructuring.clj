(ns com.chakib.examples.clojure.tuto.destructuring)

(defn slope                                                 ; -> m = (y2 - y1) / (x2 - x1)
  [line]                                                    ; line is always [[x1 y1] [x2 y2]]
  (/
    (- (second (second line)) (second (first line)))        ; getting y2 and y1 and applying - function
    (- (first (second line)) (first (first line)))))        ; getting x2 and x1 and applying - function

(defn slope2                                                ; another way of defining function
  [line]                                                    ; multiple pattern matching on inputs of functions can exist
  (let [p1 (first line)                                     ; getting [x1 y1]
        p2 (second line)                                    ; getting [x2 y2]
        x1 (first p1)                                       ; getting x1
        y1 (second p1)                                      ; getting y1
        x2 (first p2)                                       ; getting x2
        y2 (second p2)                                      ; getting y2
        ]
    (/ (- y2 y1) (- x2 x1))                                 ; applying functions
    ))

(defn slope3                                                ; another way of defining function
  [[[x1 y1] [x2 y2]]]
  (/ (- y2 y1) (- x2 x1)))                                  ; taking straight vals

(defn -main
  [& args]
  (println (format " [x] args %s" args))
  (println (slope [[1 2] [2 4]]))                           ; same way to call the three functions
  (println (slope2 [[1 2] [2 4]]))
  (println (slope3 [[1 2] [2 4]]))
  (let [m {:a 3 :b 5}
        {a :a, b :b} m]                                     ; binding values of map using keys
    (println a)
    (println b)
    )
  )

