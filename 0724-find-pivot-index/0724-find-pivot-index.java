class Solution {
    public int pivotIndex(int[] nums) {
        int[] arr1=new int[nums.length];
        // arr1[0]=nums[0];
        int sum1=0;
        for(int i=0 ; i<nums.length ; i++){
            arr1[i]=sum1+nums[i];
            sum1=arr1[i];
        }
        int sum2=0;
        int[] arr2=new int[nums.length];
        for(int i=nums.length-1 ; i>=0 ; i--){
            arr2[i]=sum2+nums[i];
            sum2=arr2[i];
        }
        for(int i=0 ; i<nums.length ; i++){
            if(arr1[i]==arr2[i]) return i;
        }
        return -1;
    }
}