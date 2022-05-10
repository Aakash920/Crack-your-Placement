class Solution {
    public int[] twoSum(int[] arr, int k) {
        int[] ans=new int[2];
        int sum=0;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                sum=arr[i]+arr[j];
                if(sum == k){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
}