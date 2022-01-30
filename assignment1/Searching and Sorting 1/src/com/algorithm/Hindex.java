package com.algorithm;

public class Hindex {


    // since 1 <= n <= 5000  counting sort could be used to solve this question
    // and the time complexity of counting sort is O(n)

    // However, it also could be solved by using binary search

    // the total Time Complexity is O(nlogn)

    // O(logn)
    public int hIndex(int[] citations) {
        int size = citations.length;
        int left = 0;
        int right = size;

        //binary search the size of citations
        while(left <= right){
            int mid = left + (right - left)/2;

            if(check(citations, mid)){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return right;
    }

    // O(n)
    public boolean check(int[] citations, int mid) {
        int count=0;
        // iterate the citations
        for (int c : citations) {
            // paper that meets the requirement
            if(c >= mid){
                count++;
            }
        }
        // if meets the definition of h-index
        return count >= mid;
    }

}
