package com.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {

    // use Hashmap to count the number of Elements
    // Time Complexity is O(n)
    public List<Integer> majorityElement(int[] nums) {
        int size = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > size / 3) {
                res.add(entry.getKey());
            }
        }

        return res;
    }

}
