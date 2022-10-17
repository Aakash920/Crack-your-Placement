class Solution {
    public int numTrees(int n) {
        //Remember formula: f(n)=f(i-1)*f(n-i);
        return topDown(n,new int[n+1]);
    }
    public int topDown(int n, int[] dp){
        if(n<=1) return 1;
        int ans=0;
        if(dp[n]!=0){
            return dp[n];
        }
        for(int i=1 ; i<=n ; i++){
            ans+=topDown(i-1,dp)*topDown(n-i,dp);
        }
        return dp[n]=ans;
    }
}