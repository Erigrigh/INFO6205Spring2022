package com.algorithm;

public class StringCompression {
    public String compressString(String str){

        String res = str;
        StringBuilder sb = new StringBuilder();

        if(str.length() <= 2) {
            //System.out.println(res);
            return res;
        }

        int count = 1;
        sb.append(str.charAt(0));

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i - 1) == str.charAt(i)){
                count++;
            }
            else{
                sb.append(count);
                sb.append(str.charAt(i));
                count = 1;
            }
        }
        sb.append(count);

        if(sb.length() < str.length()){
            res = sb.toString();
        }

        //System.out.println(res);
        return res;
    }
}
