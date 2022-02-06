package com.algorithm;

public class SingleElementinaSortedArray {
    public int singleNonDuplicate(int[] nums) {

        int size = nums.length;
        int left = 0;
        int right = size - 1;

        if ( left == right) return nums[0];

        if (nums[right] != nums[right - 1]) {
            return nums[right];
        }

        while(left < right) {

            //if ( left == right) return nums[left];

            int mid = left + (right - left) / 2;

            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    left = mid + 2;
                }
                else if (nums[mid] == nums[mid - 1]) {
                    right = mid - 2;
                }
                else{
                    return nums[mid];
                }
            }
            else if (mid % 2 == 1){
                if (nums[mid] == nums[mid + 1]) {
                    right = mid - 1;
                }
                else if (nums[mid] == nums[mid - 1]) {
                    left = mid + 1;
                }
                else{
                    return nums[mid];
                }

            }


        }

        int res = nums[left];
        return res;





    }
}
