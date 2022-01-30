package com.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PancakeSorting {

    // Find the maximum value each time, do two flips
    // Time Complexity O(n^2)
    public List<Integer> pancakeSort(int[] arr) {

        int size = arr.length;
        List<Integer> res = new ArrayList<>();

        if (size <= 1) {
            return Collections.emptyList();
        }

        for (int i = size; i >= 1; i--) {
            int pos = findMaxPosition(i, arr);
            if (pos == i) {
                continue;
            }
            res.add(pos);
            reverse(arr, pos);
            res.add(i);
            reverse(arr, i);
        }
        return res;
    }

    private void reverse(int[] a, int num) {
        int i = 0, j = num - 1;
        int temp;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    private int findMaxPosition(int max, int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            if (a[i] == max) {
                return i + 1;
            }
        }
        return -1;
    }

}
