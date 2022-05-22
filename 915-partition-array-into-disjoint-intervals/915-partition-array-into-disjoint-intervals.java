class Solution {
    public int partitionDisjoint(int[] arr) {
        int n=arr.length;
        int[] rightmin=new int[n+1];
        rightmin[n]=Integer.MAX_VALUE;
        for(int i=n-1 ; i>=0 ; i--){
            rightmin[i]=Math.min(rightmin[i+1],arr[i]);
        }
        int ans=0;
        int leftmax=Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            leftmax=Math.max(leftmax,arr[i]);
            if(leftmax<=rightmin[i+1]){
                ans=i;
                break;
            }
        }
        return ans+1;
    }
}