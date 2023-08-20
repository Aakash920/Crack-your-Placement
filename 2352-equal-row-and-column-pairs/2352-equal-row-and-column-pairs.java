class Solution {
    public int equalPairs(int[][] arr) {
        int count=0;
        int n=arr.length;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr.length ; j++){
                int k=0;
                for( ; k<arr.length ; k++){
                    if(arr[i][k]!=arr[k][j]){
                        break;
                    }
                }
                if(k==n){
                    count++;
                }
            }
        }
        return count;
    }
}