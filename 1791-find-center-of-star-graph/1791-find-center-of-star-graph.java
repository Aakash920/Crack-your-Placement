class Solution {
    public int findCenter(int[][] edges) {
        int noOfNodes=edges.length+1;
        int[] arr=new int[noOfNodes+1];
        for(int[] edge:edges){
            arr[edge[0]]++;
            arr[edge[1]]++;
        }
        int ans=-1;
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]==edges.length){
                ans=i;
            }
        }
        return ans;
    }
}