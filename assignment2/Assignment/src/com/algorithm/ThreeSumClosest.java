package com.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int margin = Integer.MAX_VALUE;

        int res = nums[0] + nums[1] + nums[nums.length - 1];

        //if(res == target) return res;

        for(int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length -1;


            while(j < k) {

                int sum = nums[i] + nums[j] + nums[k];
                //if(sum == target) return sum;

                if(Math.abs(target - sum) < margin) {
                    margin = Math.abs(target - sum);
                    res = sum;
                }

                if (sum < target) {
                    j++;
                }
                else if (sum > target) {
                    k--;
                }
                else {
                    return res;
                }

            }

        }

        return res;
    }



}
