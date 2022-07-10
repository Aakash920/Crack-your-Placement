class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        while(n>0){
            if(n==1) return true;
            else{
                if(n%3==0){
                    n/=3;
                }else{
                    break;
                }
            }
        }
        return false;
    }
}