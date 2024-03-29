
(ns validator.reg
    (:require [common-state.api :as common-state]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn reg-test!
  ; @description
  ; Registers a reusable test.
  ;
  ; @param (keyword) test-id
  ; @param (map) test
  ;
  ; @usage
  ; (reg-test! :my-test {:f* string? :e* "Value must be a string!"})
  ;
  ; @return (map)
  [test-id test]
  (common-state/assoc-state! :validator :tests test-id test))
