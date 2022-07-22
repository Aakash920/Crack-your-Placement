class Solution {
    public boolean canJump(int[] nums) {
        return countPaths(nums);
    }
    private boolean countPaths(int[] nums){
        boolean[] dp=new boolean[nums.length];
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