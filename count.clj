(defn count-stream [msg]
  (let [k "foo" old-val (read-value k)]
    (when-let [n (get msg k)]
      (update-value k (+ (if old-val old-val 0) n)))
    (read-value k)))

