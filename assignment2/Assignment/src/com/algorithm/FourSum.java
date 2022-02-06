package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
            if( i != 0 && nums[i] == nums[i-1]) continue;

            for(int j = i + 1; j <nums.length; j++) {

                if(j != i + 1 && nums[j] == nums[j - 1]) continue;

                int start = j + 1;
                int end = nums.length -1;

                while( start < end) {


                    int sum = nums[i] + nums[j] + nums[start] + nums[end];

                    if(sum < target) {
                        start++;
                    }
                    else if (sum > target) {
                        end--;
                    }
                    else{

                        res.add(List.of(nums[i], nums[j], nums[start], nums[end]));
                        start++;
                        end--;
                    }

                    while ( start != j + 1 && start < end && nums[start] == nums[start - 1]) start++;
                    while ( start < end && end != nums.length -1 && nums[end] == nums[end + 1]) end--;

                }
            }
        }

        return res;
    }
}
