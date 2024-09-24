class Solution {
    int mod=(int)1e9+7;
    public int countGoodNumbers(long n) {
        long ans=1;
        if(n%2==0){
            long five=n/2;
            long four=n/2;
            ans= (pow(5,five)%mod*pow(4,four)%mod);
        }else{
            long five=Math.abs(n/2)+1;
            long four=n-five;
            ans= (pow(5,five)%mod*pow(4,four)%mod);
        }
        return (int) ans%1000000007;
    }
    public long pow(long a,long b){
        if(b==0){
            return 1;
        }
        long temp=pow(a,b/2);
        if(b%2==0){
            return (temp*temp)%mod;
        }
        else{
            return (a *temp*temp)%mod;
        }
    }
}