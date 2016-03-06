(require 'cljs.repl)
(require 'cljs.build.api)
(require 'cljs.repl.browser)

(cljs.build.api/build "src"
                      {:main 'hello-world.core
                       :output-to "out/main.js"
                       :verbose true})

;; the first argument to cljs.repl/repl is the REPL evaluation environment,
;; that is (Node.js, Rhino, Nashorn, browser).
;; Notice also that auto building process will write its activity to out/watch.log
(cljs.repl/repl (cljs.repl.browser/repl-env)
                :watch "src"
                :output-dir "out")
