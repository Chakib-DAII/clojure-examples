(defproject com.chakib.examples/clojure-examples "1.0.0-SNAPSHOT"
  :description "Clojure examples"
  :url "https://github.com/Chakib-DAII/clojure-examples"
  :license {:name "Eclipse Public License"
            :url "https://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure     "1.6.0"]
                 [com.novemberain/langohr "3.3.0"]]
  :main com.chakib.examples.clojure.recursion-utils
  ;:main ^:skip-aot com.chakib.examples.clojure.recursion-utils
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
