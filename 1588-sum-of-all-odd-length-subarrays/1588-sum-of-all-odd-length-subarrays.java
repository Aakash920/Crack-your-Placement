class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total=0;
        int count=0;
        for(int i=0 ; i<arr.length  ; i++){
            int sum=0;
            for(int j=i ; j<arr.length ; j++){
                sum+=arr[j];
                count++;
                if(count%2!=0) total+=sum;
            }
        }
        return total;
    }
}