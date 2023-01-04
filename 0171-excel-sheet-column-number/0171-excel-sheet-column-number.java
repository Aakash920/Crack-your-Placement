class Solution {
    public int titleToNumber(String s) {
        int ans=0;
        int j=0;
        for(int i=s.length()-1 ; i>=0 ; i--){
            ans+=Math.pow(26,j)*(s.charAt(i)-'A'+1);
            j++;
        }
        return ans;
    }
}