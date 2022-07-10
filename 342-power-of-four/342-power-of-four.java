class Solution {
    public boolean isPowerOfFour(int n) {
        for(int i=0 ; i<n ; i++){
            long power=(long)Math.pow(4,i);
            if(power==n){
                return true;
            }else if(power>n){
                break;
            }
        }
        return false;
    }
}