class Solution {
    public int longestSubsequence(String s, int k) {
        int j=0;
        int stop=0;
        int sum=0;
        int count=0;
        for(int i=s.length()-1 ; i>=0 ; i--){
            if(s.charAt(i)=='0'){
                count++;
            }else if(stop==0 && j<31){
                sum+=Math.pow(2,j);
                if(sum>k){
                    stop=1;
                    sum-=Math.pow(2,j);
                }else{
                    count++;
                }
            }
            j++;    
        }
        return count;
    }
}