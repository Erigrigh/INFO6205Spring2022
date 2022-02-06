package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        List<int[]> res = new ArrayList<>();
        int n1 = firstList.length;
        int n2 = secondList.length;

        if (n1 ==0 || n2 == 0) {
            return res.toArray(new int[res.size()][]);
        }

        int i = 0;
        int j = 0;
        while (i < n1 && j < n2)
        {
            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);

            if (start <= end)
            {
                res.add(new int[]{start, end});
            }

            if(firstList[i][1] < secondList[j][1]) {
                ++i;
            }
            else{
                ++j;
            }
        }

        return res.toArray(new int[res.size()][]);


    }
}
