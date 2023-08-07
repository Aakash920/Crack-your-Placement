class Solution {
    public int longestSubarray(int[] arr) {
        int i=0, j=0, k=1;
        while(i<arr.length){
            if(arr[i]==0) k--;
            if(k<0){
                if(arr[j]==0){
                    k++;
                }
                j++;
            }
            i++;
        }
        return i-j-1;
    }
}