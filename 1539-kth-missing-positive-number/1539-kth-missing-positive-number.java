class Solution {
    public int findKthPositive(int[] arr, int k) {
        // HashSet<Integer> set=new HashSet<>();
        // for(int x:arr){
        //     set.add(x);
        // }
        // int ans=0;
        // for(int i=1 ; i<10000 ; i++){
        //     if(!set.contains(i)){
        //         k--;
        //         if(k==0) ans=i;
        //     }
        // }
        // return ans;
        
        //binary search
        int lo=0, hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]-mid-1<k){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return lo+k;
    }
}