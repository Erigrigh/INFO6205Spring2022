package com.algorithm;

import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums) {
            map.put( i, map.getOrDefault( i,0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for ( Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int[] cur = new int[2];
            cur[0] = entry.getKey();
            cur[1] = entry.getValue();

            pq.offer(cur);
            if ( pq.size() > k) {
                pq.poll();
            }

        }

        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = pq.poll()[0];
        }

        return res;

    }
}
