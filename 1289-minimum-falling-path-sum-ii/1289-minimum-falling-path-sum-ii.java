// O(n^3) by Recursion
// class Solution {
//     public int minFallingPathSum(int[][] grid) {
//         int n=grid.length, m=grid[0].length;
//         int min=Integer.MAX_VALUE;
        
//         for(int i=0 ; i<m ; i++){
//             int[][] dp=new int[n][m];
//             for(int[] row:dp) Arrays.fill(row,-1);
//             min=Math.min(min,helper(0,i,grid,dp));
            
//         }
//         return min;
//     }
//     public int helper(int r, int c, int[][] grid, int[][] dp){
//         int n=grid.length;
//         int m=grid[0].length;
        
//         if(r<0 || r>=n || c<0 || c>=m){
//             return Integer.MAX_VALUE;
//         }
//         //Final ans @ last position in Grid
//         if(r==n-1) return grid[r][c];
        
//         //Calculated before
//         if(dp[r][c]!=-1) return dp[r][c];
        
//         int sum=grid[r][c];
//         int min=Integer.MAX_VALUE;
        
//         for(int j=0 ; j<m ; j++){
//             if(c!=j){
//                 int temp=helper(r+1,j,grid,dp);
//                 min=Math.min(min,temp);
//             }
//         }
//         sum+=min;
        
//         //Memorize
//         dp[r][c]=sum;
        
//         return dp[r][c];
//     }
// }
class Solution {
    public int minFallingPathSum(int[][] grid) {
        // Tabulation Method
        int n=grid.length;
        int m=grid[0].length;
        
        int[][] dp=new int[n][m];
        
        //Initialise our dp array
        for(int i=0 ; i<m ; i++){
            dp[0][i]=grid[0][i];
        }
        
        for(int i=1 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                dp[i][j]=grid[i][j];
                
                //Finding previous min
                int prev_min=Integer.MAX_VALUE;
                for(int k=0 ; k<m ; k++){
                    if(k!=j){
                        prev_min=Math.min(prev_min,dp[i-1][k]);
                    }
                }
                dp[i][j]+=prev_min;
            }
        }
        
        //Traverse last row for finding final ans
        int min=Integer.MAX_VALUE;
        for(int j=0 ; j<m ; j++){
            min=Math.min(min,dp[n-1][j]);
        }
        
        return min;
        
    }
}