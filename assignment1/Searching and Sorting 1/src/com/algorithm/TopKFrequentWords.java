package com.algorithm;

import java.util.*;

public class TopKFrequentWords {

    // Hashmap +  PriorityQueue
    // Time Complexity O(nlogn)
    public List<String> topKFrequent(String[] words, int k) {

        // calculate frequency
        Map<String, Integer> map = new HashMap<>();
        for (String word : words)
            map.put(word, map.getOrDefault(word, 0) + 1);

        // min root heap  self define PriorityQueue sorting order
        PriorityQueue<Map.Entry<String, Integer>> pq =
                new PriorityQueue<>((e1, e2) -> {
                    return e1.getValue() == e2.getValue() ?
                            e2.getKey().compareTo(e1.getKey()) :
                            e1.getValue() - e2.getValue();
                });

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (pq.size() == k) {
                // Consider the case of comparing lexicographical order
                if (entry.getValue() >= pq.peek().getValue()) {
                    pq.offer(entry);
                    pq.poll();
                }
            }
            else {
                pq.offer(entry);
            }
        }

        // return result
        List<String> res = new LinkedList<>();
        for (int i = 0; i < k; ++i) {
            res.add(pq.poll().getKey());
        }
        Collections.reverse(res);
        return res;
    }
}
