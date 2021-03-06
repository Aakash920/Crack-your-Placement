class Solution {
    public void setZeroes(int[][] matrix) {
        int col0=1, rows=matrix.length, cols=matrix[0].length;
        for(int row=0 ; row<rows ; row++){
            if(matrix[row][0]==0) col0=0;
            for(int col=1 ; col<cols ; col++){
                if(matrix[row][col]==0){
                    matrix[row][0]=0;
                    matrix[0][col]=0;
                }
            }
        }
        for(int row=rows-1 ; row>=0 ; row--){
            for(int col=cols-1 ; col>=1 ; col--){
                if(matrix[row][0]==0 || matrix[0][col]==0){
                    matrix[row][col]=0;
                }
            }
            if(col0==0){
                matrix[row][0]=0;
            }
        }
    }
}

// for(int i=0 ; i<rows ; i++){
//             if(matrix[i][0]==0) col0=0;
//             for(int j=1 ; j<col ; j++){
//                 if(matrix[i][j]==0){
//                     matrix[i][0]=0;
//                     matrix[0][j]=0;
//                 }
//             }
//         }
//         for(int i=rows-1 ; i>=0 ; i--){
//             for(int j=col-1 ; j>=1 ; j--){
//                 if(matrix[i][0]==0 || matrix[0][j]==0){
//                     matrix[i][j]=0;
//                 }
//             }
//                 if(col0==0){
//                 matrix[i][0]=0;
//             }
            
//         }