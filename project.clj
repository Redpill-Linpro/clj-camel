(def camel-version "3.15.0")

(defproject redpill-linpro/clj-camel "2.1.0"
  :description "Clojure wrapper for Apache Camel, a fork of takeoff/clj-camel"
  :url "https://github.com/Redpill-Linpro/clj-camel"
  :license {:name "Apache License Version 2.0"
            :url  "https://www.apache.org/licenses/LICENSE-2.0.txt"}
  :dependencies [[org.clojure/clojure "1.11.0"]
                 [org.clojure/tools.logging "1.2.4"]

                 [org.apache.camel/camel-core       ~camel-version]
                 [org.apache.camel/camel-sql        ~camel-version]
                 [org.apache.camel/camel-jcache     ~camel-version]
                 [org.apache.camel/camel-management ~camel-version]
                 [org.apache.camel/camel-ftp        ~camel-version]
                 [malabarba/lazy-map "1.3"]

                 [camel-snake-kebab "0.4.2"]
                 [metosin/jsonista "0.3.5"]
                 [clj-time "0.15.2"]]
  :target-path "target/%s"

  :source-paths ["src/main/clj"]
  :java-source-paths ["src/main/java"]
  :test-paths ["src/test/clj" "src/test/resources"]

  :deploy-repositories [["clojars" {:url           "https://clojars.org/repo"
                                    :username      :env/clojars_user
                                    :password      :env/clojars_pass
                                    :sign-releases false}]]

  :profiles {:test    {:dependencies [[com.rpl/specter "1.1.3"]
                                      [org.ehcache/ehcache "3.8.1"]
                                      [org.apache.camel/camel-http     ~camel-version]
                                      [org.apache.camel/camel-jsonpath ~camel-version]
                                      [ch.qos.logback/logback-classic "1.2.3"]]}
             :uberjar {:aot :all}})
