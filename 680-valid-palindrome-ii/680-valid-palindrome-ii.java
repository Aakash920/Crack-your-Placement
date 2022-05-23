class Solution {
    public boolean validPalindrome(String s) {
        int lo=0,hi=s.length()-1;
        while(lo<hi){
            if(s.charAt(lo)==s.charAt(hi)){
                lo++;
                hi--;
            }else{
                return (isPalin(s,lo,hi-1) || isPalin(s,lo+1,hi));
            }
        }
        return true;
    }
    private boolean isPalin(String s, int lo, int hi){
        while(lo<hi){
            if(s.charAt(lo)==s.charAt(hi)){
                lo++;
                hi--;
            }else{
                return false;
            }
        }
        return true;
    }
}