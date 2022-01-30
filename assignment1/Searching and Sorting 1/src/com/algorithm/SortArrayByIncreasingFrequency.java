package com.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortArrayByIncreasingFrequency {

    // Hashmap + PriorityQueue self define PriorityQueue sorting order
    // Time Complexity O(nlogn)
    public int[] frequencySort(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int size = nums.length;
        int[] res = new int[size];
        int idx = 0;

        for (int i = 0; i < size; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        // use lambda expression to redefine the sorting order of PriorityQueue
        PriorityQueue<int[]> q = new PriorityQueue<>((e1, e2) -> e1[0] == e2[0] ? e2[1] - e1[1] : e1[0] - e2[0]);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            q.add(new int[]{entry.getValue(), entry.getKey()});
        }

        while (!q.isEmpty()){
            int[] cur = q.poll();
            for (int i = 0; i < cur[0]; i++) {
                res[idx] = cur[1];
                idx++;
            }
        }
        return res;
    }

}
