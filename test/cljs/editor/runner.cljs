(ns editor.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [editor.core-test]))

(doo-tests 'editor.core-test)
