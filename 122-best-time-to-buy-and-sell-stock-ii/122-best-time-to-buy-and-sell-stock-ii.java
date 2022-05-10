class Solution {
    public int maxProfit(int[] arr) {
        int profit=0;
        for(int i=1 ; i<arr.length ; i++){
            int diff=arr[i]-arr[i-1];
            if(diff > 0){
                profit+=diff;
            }
        }
        return profit;
    }
}