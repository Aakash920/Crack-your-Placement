class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x%10==0 && x!=0)) return false;
        
        int res=0;
        while(x>res){
            int ld=x%10;
            res=(res*10)+ld;
            x/=10;
        }
        return (res==x) || (x==res/10);
    }
}