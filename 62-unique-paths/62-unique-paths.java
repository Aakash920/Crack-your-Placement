class Solution {
    public int uniquePaths(int m, int n) {
        // int[][] dp=new int[m][n];
        // for(int i=0 ; i<m ; i++){
        //     for(int j=0 ; j<n ; j++){
        //         if(i==0 || j==0){
        //             dp[i][j]=1;
        //         }else{
        //             dp[i][j]=dp[i-1][j]+dp[i][j-1];
        //         }
        //     }
        // }
        // return dp[m-1][n-1];
        
        // long ans=1;
        // for(int i=m+n-2, j=1 ; i>=Math.max(m,n) ; i--, j++){
        //     ans=(ans*i)/j;
        // }
        // return (int) ans;
        
        //By memorization
        int[][] dp=new int[m+1][n+1];
        return countWays(m,n,dp);
        
    }
    public static int countWays(int m, int n, int[][] dp){
        if(m==1 || n==1) return 1;
        
        if(dp[m][n]!=0){
            return dp[m][n];
        }
        int rows=countWays(m-1,n,dp);
        int cols=countWays(m,n-1,dp);
        int fn=rows+cols;
        
        return dp[m][n]=fn;
    }
}