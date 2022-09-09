class Solution {
    public void setZeroes(int[][] arr) {
        int col0=1;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i][0]==0) col0=0;
            for(int j=1 ; j<arr[0].length ; j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
        for(int i=arr.length-1 ; i>=0 ; i--){
            for(int j=arr[0].length-1 ; j>=1 ; j--){
                if(arr[i][0]==0 || arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
            if(col0==0){
            arr[i][0]=0;
        }
        }
    }
}