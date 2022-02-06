package com.algorithm;

public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {

        int size = nums.length;
        int left = 0;
        int right = size -1;

        if ( left == right) return nums[0];

        if (nums[left] < nums[right]) {
            return nums[0];
        }

        int target = nums[0];

        while(left < right) {

            int mid = left + (right - left) / 2 + 1;
            if (nums[mid] < target) {
                right = mid -1;

            }
            else {
                left = mid;

            }
        }

        return nums[left + 1];





    }
}
