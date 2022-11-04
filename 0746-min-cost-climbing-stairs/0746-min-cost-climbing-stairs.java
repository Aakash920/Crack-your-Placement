class Solution {
    int cost=0;
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n+1];
        return Math.min(f(cost,n-1,dp),f(cost,n-2,dp));
    }
    public int f(int[] arr, int n, int[] dp){
        if(n==0) return arr[0];
        if(n==1) return arr[1];
        
        if(dp[n]!=0) return dp[n];
        return dp[n]=Math.min(f(arr,n-1,dp),f(arr,n-2,dp)) + arr[n];
    }
}