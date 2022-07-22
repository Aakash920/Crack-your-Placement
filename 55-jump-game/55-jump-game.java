class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        return canJump(nums,new boolean[n]);
    }
    private boolean canJump(int[] nums, boolean[] dp){
        int n=dp.length;
        dp[n-1]=true;
        
        for(int i=n-2 ; i>=0 ; i--){
            int steps=nums[i];
            for(int j=i+1 ; j<=steps+i ; j++){
                if(dp[j]==true){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[0];
    }
}