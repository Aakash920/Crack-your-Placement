class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long ans=0;
        long[] arr=new long[n];
        for(int[] road:roads){
            arr[road[0]]++;
            arr[road[1]]++;
        }
        
        Arrays.sort(arr);
        long cost=1;
        for(int i=0 ; i<arr.length ; i++){
            ans+=arr[i]*cost++;
        }
        return ans;
    }
}