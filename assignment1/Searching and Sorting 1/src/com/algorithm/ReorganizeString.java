package com.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {

    // Hashmap +  PriorityQueue
    // Time Complexity O(nlogn)
    public String reorganizeString(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        // use StringBuilder to consumes less memory
        StringBuilder sb = new StringBuilder(s.length());

        for(Character ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // max Heap  self define PriorityQueue sorting order
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for(Map.Entry<Character, Integer> m : map.entrySet()){
            pq.add(m);
        }
        Map.Entry<Character, Integer> pre = null;

        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> cur = pq.poll();
            if(pre != null && pre.getValue() > 0){
                pq.offer(pre);
            }
            sb.append(cur.getKey());
            cur.setValue(cur.getValue() - 1);
            pre = cur;
        }

        return sb.length() == s.length() ? sb.toString() : "";
    }
}
