class Solution {
    public int maxProfit(int[] arr) {
        int buy=arr[0];
        int maxProfit=0;
        for(int i=1 ; i<arr.length ; i++){
            if(buy>arr[i]){
                buy=arr[i];
            }else{
                int profit=arr[i]-buy;
                maxProfit=Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }
}