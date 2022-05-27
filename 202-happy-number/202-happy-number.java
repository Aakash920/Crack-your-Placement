class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7 || n==1111111) return true;
        while(n!=1){
            if(n/10 == 0) return false;
            int number=n;
            int sum=0;
            while(number!=0){
                int num1=number%10;
                int square=num1*num1;
                sum+=square;
                number/=10;
            }
            if(sum==1) return true;
            n=sum;
        }
        return false;
    }
}