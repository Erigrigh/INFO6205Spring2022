package com.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrays {

    // Hashmap
    // Time Complexity O(n)

    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        // record the elements in the nums1
        for(int i : nums1) {
            if(!map.containsKey(i)) map.put(i, 1);
            else map.put(i, map.get(i) + 1);
        }

        // record the overlapped elements of nums1 and nums2
        for(int j : nums2) {
            if(map.containsKey(j)) {
                map.put(j, map.get(j) - 1);
                if(map.get(j) == 0) map.remove(j);
                list.add(j);
            }
        }

        // the return type is int[]
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }

}
