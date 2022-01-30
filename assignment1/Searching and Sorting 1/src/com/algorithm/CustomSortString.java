package com.algorithm;

public class CustomSortString {


    // Time Complexity O(n)
    public String customerSortString(String order, String s) {

        //int[] mapO = new int[26];
        int[] mapS = new int[26];
        // use StringBuilder to consumes less memory
        StringBuilder sb = new StringBuilder();

        // calculate the char in the String s
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mapS[ch - 'a'] = mapS[ch - 'a'] + 1;
        }

        // according to the order String, generate output String
        for(int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);
            while(mapS[ch - 'a'] > 0) {
                sb.append(ch);
                mapS[ch -'a'] -= 1;
            }
        }

        // add the part of String s but not in the order String
        for(int i = 0; i < mapS.length; i++) {
            while(mapS[i] > 0) {
                char c = (char)('a' + i);
                sb.append(c);
                mapS[i]--;
            }
        }

        return sb.toString();
    }
}
