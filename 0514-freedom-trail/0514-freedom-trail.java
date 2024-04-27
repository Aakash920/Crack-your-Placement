class Solution {
    int[][] dp=new int[101][101];
    public int findRotateSteps(String ring, String key) {
        
        for(int[] row:dp) Arrays.fill(row,-1);
        return helper(0,0,ring,key);
        
    }
    public int helper(int ringIdx, int keyIdx, String ring, String key){
        //base case
        if (keyIdx == key.length()) {
            return 0;
        }
        
        //Use
        if(dp[ringIdx][keyIdx]!=-1){
            return dp[ringIdx][keyIdx];
        }
        
        int min=Integer.MAX_VALUE;
        for(int i=0 ; i<ring.length() ; i++){
            if(ring.charAt(i)==key.charAt(keyIdx)){
                int totalSteps=count(ringIdx,i,ring.length())+1+ helper(i,keyIdx+1,ring,key);
                min=Math.min(min,totalSteps);
            }
        }
        
        //Memorise
        dp[ringIdx][keyIdx]=min;
        
        return min;
    }
    public int count(int ringIdx, int i, int totalLen){
        int clockwise=Math.abs(ringIdx-i);
        int anticlock=totalLen-clockwise;
        return Math.min(clockwise,anticlock);
    }
}