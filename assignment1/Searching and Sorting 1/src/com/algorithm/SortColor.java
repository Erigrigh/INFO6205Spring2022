package com.algorithm;

public class SortColor {

    // since 1 <= n <= 300 and nums[i] is either 0, 1, or 2.
    // counting sort could be used to solve this question

    // two pointer
    // Time Complexity is O(n)
    public void sortColors (int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        for(int i = 0; i <= end; i++ ) {

            if(nums[i] == 0) {
                swap(nums, start, i);
                start++;
            }
            // i need to keep unchanged to recheck the num[i]
            else if(nums[i] == 2) {
                swap(nums, end, i);
                end--;
                i--;
            }
        }
    }

    public void swap (int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }


}
