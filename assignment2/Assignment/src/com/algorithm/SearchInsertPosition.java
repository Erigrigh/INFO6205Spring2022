package com.algorithm;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {


        int size = nums.length;
        int left = 0;
        int right = size - 1;

        if (nums[right] < target) {
            return size;
        }


        while(left < right) {

            int mid = left + (right - left) / 2;

            if(target <= nums[mid]) {
                right = mid;
            }
            else {
                left = mid + 1;
            }

        }

        return left;

    }
}
