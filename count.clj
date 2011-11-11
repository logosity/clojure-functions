(defn count-stream [msg]
  (if-let [n (get msg "foo")]
    (update-value "foo" (+ (get-value "foo" n)))))

