class Solution {
    public int[] minOperations(String s) {
        int[] ans=new int[s.length()];
        // int cur=0;
        int sum=0;
        for(int cur=0 ; cur<s.length() ; cur++){
            for(int i=0 ; i<s.length() ; i++){
                if(s.charAt(i)=='1'){
                    sum+=Math.abs(i-cur);
                }
            }
            ans[cur]=sum;
            sum=0;
        } 
        return ans;
    }
}