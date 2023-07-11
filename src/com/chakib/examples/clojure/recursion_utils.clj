;I am just trying to recreate some that I already did in Java, not 100% recursive
(ns com.chakib.examples.clojure.recursion-utils
  (:gen-class)
  (:require ;;[x.x.x :as x] another requirement example
            [clojure.string :as s]))

;clojure has a builtin reverse function
;(reverse s) Returns s with its characters reversed.
(defn reverse-string
  "Returns input with its characters reversed."
  [^CharSequence input]
  (.toString (.reverse (StringBuilder. input))))

(defn reverse-string-using-builtin-reverse
  "Returns input with its characters reversed."
  [^String input]
  (apply str (reverse input))
  ;(reverse input)
  )

(defn reverse-sequence
  "Returns input with its characters reversed."
  [coll]
  (loop [r (rest coll)
         acc (conj () (first coll))]
    (if (= (count r) 0)
      acc
      (recur (rest r) (conj acc (first r))))))


(defn reverse-string-recursive
  "Returns input with its characters reversed."
  [^String input]
  (if (= input "")                                          ; Base Case / stop condition
    ""
    (str (reverse-string-recursive (.substring input 1)) (.charAt input 0))) ; Recursive call
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

;(defn merge-sort
;  "recursive merge sort"
;  [coll start end]
;  (if (< start end)
;    (let [mid (int (/ (+ start end) 2))]
;      (merge-sort coll start mid)
;      (merge-sort coll (+ mid 1) end)
;      (letfn [(merge [coll start mid end] (let [temp (make-array Integer/TYPE (+ (- end start) 1))]
;                                            (let [i start
;                                                  j (+ mid 1)
;                                                  k 0]
;                                              (while (and (<= i mid) (<= j end))
;                                                (if (<= (aget coll i) (aget coll j))
;                                                  (do (aset temp k (aget coll i))
;                                                      (set! i (inc i)))
;                                                  (do (aset temp k (aget coll j))
;                                                      (set! j (inc j)))
;                                                  (set! k (inc k))))
;                                              (while (<= i mid)
;                                                (do (aset temp k (aget coll i))
;                                                    (set! i (inc i))
;                                                    (set! k (inc k))))
;                                              (while (<= j end)
;                                                (do (aset temp k (aget coll j))
;                                                    (set! j (inc j))
;                                                    (set! k (inc k))))
;                                              (dotimes [x (- end start)]
;                                                (aset coll (+ start x) (aget temp x))))))]
;        (merge coll start mid end))
;      ))
;  )

;(defn merge [left right]                                    ; this is a helper function that takes two sorted sequences (left and right) and merges them into a single sorted sequence.
;  (if (empty? left)
;    right
;    (if (empty? right)
;      left
;      (if (<= (first left) (first right))
;        (cons (first left) (merge (rest left) right))
;        (cons (first right) (merge left (rest right)))))))

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
    (println (reverse-string-recursive "clojure"))
    (println (reverse-sequence [1 2 3 4 5 6]))
    (println (is-palindrome? "racecar"))
    (println (is-palindrome? "notPalindrome"))
    (println (find-binary 1212 ""))
    (println (recursive-summation 1500))
    (let [data [1 2 3 4 5 6 7 8 9 10]]
      (println (= (nth data 9) 10))
      ;(println (binary-search data 0 (- (count data) 1) 9))
      )
    (println (fib 10))
    (println (merge-sort [5 2 10 10 20 1 0 3 6 100 99 88]))
    (println (reverse-list '(1 2 3 4 5)))
    ;(let [tree [5 [3 [2 nil nil] [4 nil nil]] [8 nil [10 nil nil]]] values [6 7 1]]
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


;java code

;public interface RecursionUtils {
;
;   static String reverseString(String input) {
;                                              //Base Case / stop condition
;                                              if(input.equals("")) return "";
;                                              //Recursive call
;                                              return reverseString(input.substring(1)) + input.charAt(0);
;                                              }
;
;   static boolean isPalindrome(String input){
;                                             //Base Case / stop condition
;                                             if(input.length() == 0 || input.length() == 1) return true;
;                                             //Recursive call
;                                             if(input.charAt(0) == input.charAt(input.length()-1)){
;                                                                                                   return isPalindrome(input.substring(1, input.length()-1));
;                                                                                                   }
;                                             // additional base-case to handle non-palindromes
;                                             return false;
;                                             }
;
;   static String findBinary(long decimal, String... result){
;                                                            //Base Case / stop condition
;                                                            if(decimal == 0) return result.length < 1 ? "" : result[0];
;                                                            //creating binary
;                                                            String result1 = decimal % 2 + (result.length < 1 ? "" : result[0]);
;                                                            //Recursive call
;                                                            return findBinary(decimal / 2, result1);
;                                                            }
;
;   static int recursiveSummation(int inputNumber){
;                                                  //Base Case / stop condition
;                                                  if(inputNumber <=1) return inputNumber;
;                                                  //Recursive call
;                                                  return inputNumber + recursiveSummation(inputNumber-1);
;                                                  }
;
;   static int binarySearch(int[] A, int left, int right, int x){
;                                                                //Base Case / stop condition
;                                                                if(left > right) return -1;
;
;                                                                int mid = (left + right) / 2;
;
;                                                                if(x == A[mid]) return mid;
;
;                                                                //Recursive call
;                                                                if(x < A[mid])
;                                                                return binarySearch(A, left,mid-1, x);
;                                                                return binarySearch(A, mid+1, right, x);
;                                                                }
;
;   static long fib(long n){
;                           //Base Case / stop condition
;                           if(n == 0 || n == 1) return n;
;                           //Recursive call
;                           return fib(n-1) + fib(n-2);
;                           }
;
;   static void mergeSort(int[] data, int start, int end){
;                                                         if(start < end){
;                                                                         int mid = (start + end) / 2;
;                                                                         mergeSort(data, start, mid);
;                                                                         mergeSort(data, mid+1, end);
;                                                                         merge(data, start, mid, end);
;                                                                         }
;                                                         }
;
;   static void merge(int[] data, int start, int mid, int end) {
;                                                               //build a temporary array to avoid modifying the original data
;                                                               int[] temp = new int[end - start + 1];
;
;                                                               int i = start, j = mid + 1, k = 0;
;
;                                                               //while both sub-array have values, then try and merge them in sorted order
;                                                               while (i <= mid && j <= end){
;                                                                                            if (data[i] <= data[j]) {
;                                                                                                                     temp[k++] = data[i++];
;                                                                                                                     }else {
;                                                                                                                            temp[k++] = data[j++];
;                                                                                                                            }
;                                                                                            }
;
;                                                               //add the rest of the values from the left sub-array into the result
;                                                               while (i <= mid){
;                                                                                temp[k++] = data[i++];
;                                                                                }
;
;                                                               //add the rest of the values from the right sub-array into the result
;                                                               while (j <= end){
;                                                                                temp[k++] = data[j++];
;                                                                                }
;
;                                                               //copy result to data
;                                                               for(i = start; i <= end; i++)
;                                                                     data[i] = temp[i - start];
;
;                                                               }
;
;   static NodeLL reverseLinkedList(NodeLL head){
;                                                if(head == null || head.getNext() == null) return head;
;                                                NodeLL p = reverseLinkedList(head.getNext());
;                                                head.getNext().setNext(head);
;                                                head.setNext(null);
;                                                return p;
;                                                }
;
;   static NodeLL sortedMergeLinkedLists(NodeLL headA, NodeLL headB){
;                                                                    //Base Case / stop condition
;                                                                    if(headA == null) return headB;
;                                                                    if(headB == null) return headA;
;                                                                    //Recursive call
;                                                                    if(headA.getVal() <= headB.getVal()){
;                                                                                                         headA.setNext(sortedMergeLinkedLists(headA.getNext(), headB));
;                                                                                                         return headA;
;                                                                                                         }else{
;                                                                                                               headB.setNext(sortedMergeLinkedLists(headA, headB.getNext()));
;                                                                                                               return headB;
;                                                                                                               }
;                                                                    }
;
;   static NodeTree insertNodeInTree(NodeTree root, int data){
;                                                             //Base Case / stop condition
;                                                             if(root == null){
;                                                                              root = new NodeTree(data);
;                                                                              return root;
;                                                                              }
;                                                             //Recursive call
;                                                             if(root.getVal() <= data){
;                                                                                       root.setRight(insertNodeInTree(root.getRight(), data));
;                                                                                       }else{
;                                                                                             root.setRight(insertNodeInTree(root.getLeft(), data));
;                                                                                             }
;                                                             return root;
;                                                             }
;
;   static void printLeaves(NodeTree root){
;                                          //Base Case / stop condition
;                                          if (root == null) return;
;                                          if(root.getLeft() == null && root.getRight() == null){
;                                                                                                System.out.print(root.getVal() + ", ");
;                                                                                                return;
;                                                                                                }
;                                          //Recursive call
;                                          if (root.getLeft() != null)
;                                          printLeaves(root.getLeft());
;                                          if (root.getRight() != null)
;                                          printLeaves(root.getRight());
;                                          }
;
;                                 }