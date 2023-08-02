class Solution {
    public int maxOperations(int[] arr, int k) {
        Arrays.sort(arr);
        int i=0, j=arr.length-1;
        int count=0;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==k){
                count++;
                i++;
                j--;
            } 
            else if(sum<k) i++;
            else j--;
        }
        return count;
    }
}