class Solution {
    public int largestAltitude(int[] arr) {
        int max=Integer.MIN_VALUE;
        int pointer=0;
        for(int i=0 ; i<arr.length  ; i++){
            max=Math.max(max,pointer+=arr[i]);
        }
        if(max<0) return 0;
        return max;
    }
}