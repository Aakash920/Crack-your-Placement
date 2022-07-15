class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxCount=0;
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[i].length ; j++){
                maxCount=Math.max(maxCount,dfs(grid,i,j));
            }
        }
            return maxCount;
    }
        public int dfs(int[][] grid, int i, int j){
            if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0){
                return 0;
            }
            // after visit makes it zero so, taht we can't count it again
            grid[i][j]=0;
            
            return 1+dfs(grid,i-1,j)+dfs(grid,i+1,j)+dfs(grid,i,j-1)+dfs(grid,i,j+1);
        
    }
}