(defn count-stream [msg]
  (let [old-val (read-value "foo")]
  (if-let [n (get msg "foo")]
    (update-value "foo" (+ (if old-val old-val 0) n)))))

