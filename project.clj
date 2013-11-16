(defproject flaming-happiness "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2030"]
                 [ring "1.2.1"]
                 [propaganda "0.2.0"]]
  :plugins [[lein-cljsbuild "0.3.2"]
            [lein-ring "0.8.3"]
            [lein-ancient "0.5.4"]]
  :hooks [leiningen.cljsbuild]
  :source-paths ["src/clj"]
  :cljsbuild { 
    :builds {
      :main {
        :source-paths ["src/cljs"]
        :compiler {:output-to "resources/public/js/cljs.js"
                   :optimizations :simple
                   :pretty-print true}
        :jar true}}}
  :main flaming-happiness.server
  :ring {:handler flaming-happiness.server/app})

