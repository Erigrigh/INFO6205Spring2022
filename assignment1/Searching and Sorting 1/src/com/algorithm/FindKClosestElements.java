package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {
    // two pointer  sliding window
    // Time Complexity O(n)
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int size = arr.length;
        List<Integer> res = new ArrayList<>();

        int start = 0;
        int end = size - 1;

        int len = size - k;
        while (len > 0){
            if (x - arr[start] <= arr[end] - x){
                end--;
            }
            else if (x - arr[start] > arr[end] - x) {
                start++;
            }
            len--;
        }

        for (int i = start; i <= end; i++) {
            res.add(arr[i]);
        }

        return res;
    }
}
