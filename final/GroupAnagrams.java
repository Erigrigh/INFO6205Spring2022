package com.algorithm;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map =  new HashMap<>();

        if(strs.length == 0) return res;

        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        //System.out.println(new ArrayList<>(map.values()));
        return new ArrayList<>(map.values());
    }

}

