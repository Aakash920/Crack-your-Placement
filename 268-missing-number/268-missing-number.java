class Solution {
    public int missingNumber(int[] arr) {
        //O(nlog(n))
        // Arrays.sort(arr);
        // if(arr[0]!=0) return 0;
        // for(int i=1 ; i<arr.length ; i++){
        //     if(arr[i]-arr[i-1]>1){
        //         return arr[i-1]+1;
        //     }
        // }
        // return arr[arr.length-1]+1;
        int[] nums=new int[arr.length+1];
        for(int i=0 ; i<arr.length ; i++){
            int idx=arr[i];
            nums[idx]=1;
        }
        int ans=-1;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]!=1){
                ans=i;
                break;
            }
        }
        return ans;
    }
}