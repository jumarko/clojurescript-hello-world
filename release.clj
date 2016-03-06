(require 'cljs.build.api)

;; notice that :main is not required since we are building single javascript file
(cljs.build.api/build "src"
                      {:output-to "out/main.js"
                       :optimizations :advanced})

;; we're done, just exit (Google Closure compiler creates thread pool that isn't shutdown)
(System/exit 0)
