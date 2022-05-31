class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        if(arr[0]!=0) return 0;
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]-arr[i-1]>1){
                return arr[i-1]+1;
            }
        }
        return arr[arr.length-1]+1;
    }
}