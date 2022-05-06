package com.algorithm;

public class NumberofIslands {

    public int numIslands(char[][] grid) {

        int res = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    res++;
                }
            }
        }
        //System.out.println(res);
        return res;
    }

    public void dfs(char[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length){
            return;
        }

        if(grid[i][j] != '1'){
            return;
        }

        grid[i][j] = '2';

        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);

    }
}
