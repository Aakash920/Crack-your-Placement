class Solution {
    public double myPow(double x, int n) {
        long nn=n;
        double ans=1.0;
        if(nn<0) nn=-nn;
        while(nn>0){
            if(nn%2!=0){
                ans=ans*x;
                nn-=1;
            }else{
                x=x*x;
                nn=nn/2;
            }
            
        }
        
        if(n<0){
            ans=(double)(1.0)/ (double)(ans);
        }
        return ans;
    }
}