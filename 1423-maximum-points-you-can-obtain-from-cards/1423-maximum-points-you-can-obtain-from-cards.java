class Solution {
    public int maxScore(int[] arr, int k) {
        //by sliding window 
        int leftSum=0;
        int rightSum=0;
        for(int i=0 ; i<k ; i++){
            leftSum+=arr[i];
        }
        int max=leftSum;
        for(int j=0 ; j<k ; j++){
            leftSum=leftSum-arr[k-1-j];
            rightSum=rightSum+arr[arr.length-1-j];
            max=Math.max(max,leftSum+rightSum);
        }
        return max;  
    }
}