(ns hello-world.core
  (:require [clojure.browser.repl :as repl]))

;; using defonce ensures that connection is created only one time
(defonce conn
  (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)

(println "Hello world!")

(defn foo [a b]
  (* a b)) ;; CHANGED
