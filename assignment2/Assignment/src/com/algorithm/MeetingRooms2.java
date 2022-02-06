package com.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeetingRooms2 {
    public int minMeetingRooms (int[][] intervals) {

        List<int[]> list = new ArrayList<>();
        for(int[] interval : intervals) {
            list.add(new int[]{interval[0], 1});
            list.add(new int[]{interval[1], -1});
        }
        Collections.sort(list, (a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        int res = 0;
        int amount = 0;
        for(int[] arr: list) {
            amount = amount + arr[1];
            res = Math.max(amount, res);
        }
        return res;
    }
}
