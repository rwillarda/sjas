(defproject stellar "0.1.0-SNAPSHOT"
  :description "Implementation of Stellar Resolution from 'Multiplicative Linear Logic from Logic Programs
and Tilings' (Eng and Seiller, 2021)"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
       		 [org.clojure/core.match "1.0.0"]
		 [org.clojure/core.logic "1.0.0"]]
  :repl-options {:init-ns stellar.core})