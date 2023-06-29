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

(defn reverse-string-recursive
  "Returns input with its characters reversed."
  [^String input]
  (apply str (reverse input))
  ;(reverse input)
  )

(defn reverse-sequence-recursive
  "Returns input with its characters reversed."
  [coll]
  (loop [r (rest coll)
         acc (conj () (first coll))]
    (if (= (count r) 0)
      acc
      (recur (rest r) (conj acc (first r))))))

(defn -main
  [& args]
    (println (format " [x] args %s" args))
    (println (reverse-string "clojure"))
    (println (reverse-string-recursive "clojure"))
    (println (reverse-sequence-recursive [1 2 3 4 5 6]))
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