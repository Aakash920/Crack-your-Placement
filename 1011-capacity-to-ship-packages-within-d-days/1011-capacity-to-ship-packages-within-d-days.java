class Solution {
    public int shipWithinDays(int[] wt, int days) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int x:wt){
            sum+=x;
            max=Math.max(max,x);
        }
        int lo=max;
        int hi=sum;
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isPossible(wt,mid,days)==true){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] arr ,int mid, int m){
        int sum=0;
        int st=1;
        for(int i=0 ; i<arr.length ; i++){
            sum+=arr[i];
            if(sum>mid){
                st++;
                sum=arr[i];
            }
        }
        return st<=m;
    }
}