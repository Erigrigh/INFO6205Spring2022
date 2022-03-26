package com.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question1 {

    public List<String> missingNumber(int[] nums, int lower, int upper){



        int size = upper - lower + 1;

        List<String> res = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        Set<Integer> set = new HashSet<>();

        if(lower == upper) return res;

        for(int i = lower; i <= upper; i++ ){
            //list.add(i);
            set.add(i);
        }

        for(int j : nums){
            if(list.contains(j)){
                list.remove(j);
            }

            if(set.contains(j)){
                set.remove(j);
            }
        }

        for(int in : set){
            list.add(in);
        }


        int[] arr =  new int[list.size()];
        for( int m = 0; m < list.size(); m ++){
            arr[m] = list.get(m);
            //System.out.println(arr[m]);
        }



        String str = "";

        for(int k = 0; k < list.size(); k++ ){

            if( k > 1  && list.get(k - 1)  == list.get(k) && (list.get(k) + 1 != list.get(k + 1))){
                str = str + "->" + list.get(k) + ",";
                continue;
            }

            if( k + 1 >= list.size()) break;

            if(k + 1 < list.size() && list.get(k) + 1 != list.get(k + 1)){

                str = str + list.get(k) + ",";

                str = str + list.get(k + 1) + "->";

            }


        }

        str  = str + list.get(list.size() - 1);

          String[] s = str.split(",");

        for(String s1 : s) {
            res.add(s1);
            System.out.println(s1);
        }

        return res;
    }
}
