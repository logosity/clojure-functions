(defn count-stream [msg]
  (if-let [n (get msg "foo")]
    (update-value "foo" (+ (read-value "foo" n)))))

