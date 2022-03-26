package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question4 {
    public int[][] mergeIntervals(int[][] intervals){

        //List<int[]> res = new ArrayList<>();

        int[][] res = new int[intervals.length][2];

        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? a[1] - b[1]: a[0] - b[0]);

        int index = -1;

        for(int i = 0; i < intervals.length; i++ ){

            if(index == -1 || res[index][1] < intervals[i][0]){
                res[++index] = intervals[i];
            }
            else{
                res[index][1] = Math.max(res[index][1], intervals[i][1]);
            }

        }

        return Arrays.copyOf(res, index +1);
    }
}
