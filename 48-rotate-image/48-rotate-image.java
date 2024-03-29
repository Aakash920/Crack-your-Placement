class Solution {
    public void rotate(int[][] arr) {
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i ; j<arr[0].length ; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //reverse
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length/2 ; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][arr[0].length-1-j];
                arr[i][arr[0].length-1-j]=temp;
            }
        }
    }
}