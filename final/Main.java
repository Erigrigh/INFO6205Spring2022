package com.algorithm;

public class Main {

    public static void main(String[] args) {
	// write your code here


        StringCompression stringCompression = new StringCompression();
        stringCompression.compressString("aabcccccaaa");
        stringCompression.compressString("ab");




        NumberofIslands numberofIslands = new NumberofIslands();
        char[][] grid = new char[4][5];
        //grid = [['1','1','1','1','0'], ['1','1','0','1','0'], ["1","1","0","0","0"], ["0","0","0","0","0"]];
        grid[0][0]= '1';
        grid[0][1]= '1';
        grid[0][2]= '1';
        grid[0][3]= '1';
        grid[0][4]= '0';

        grid[1][0]= '1';
        grid[1][1]= '1';
        grid[1][2]= '0';
        grid[1][3]= '1';
        grid[1][4]= '0';

        grid[2][0]= '1';
        grid[2][1]= '1';
        grid[2][2]= '0';
        grid[2][3]= '0';
        grid[2][4]= '0';

        grid[3][0]= '0';
        grid[3][1]= '0';
        grid[3][2]= '0';
        grid[3][3]= '0';
        grid[3][4]= '0';

        char[][] grid2 = new char[4][5];

        grid2[0][0]= '1';
        grid2[0][1]= '1';
        grid2[0][2]= '0';
        grid2[0][3]= '0';
        grid2[0][4]= '0';

        grid2[1][0]= '1';
        grid2[1][1]= '1';
        grid2[1][2]= '0';
        grid2[1][3]= '0';
        grid2[1][4]= '0';

        grid2[2][0]= '0';
        grid2[2][1]= '0';
        grid2[2][2]= '1';
        grid2[2][3]= '0';
        grid2[2][4]= '0';

        grid2[3][0]= '0';
        grid2[3][1]= '0';
        grid2[3][2]= '0';
        grid2[3][3]= '1';
        grid2[3][4]= '1';

        numberofIslands.numIslands(grid);
        numberofIslands.numIslands(grid2);


        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        String[] strs2 = {""};
        String[] strs3 = {"a"};

        GroupAnagrams groupAnagrams = new GroupAnagrams();
        groupAnagrams.groupAnagrams(strs1);
        groupAnagrams.groupAnagrams(strs2);
        groupAnagrams.groupAnagrams(strs3);
    }
}
