class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int minr=0, maxr=matrix.length-1;
        int minc=0, maxc=matrix[0].length-1;
        int count=0;
        int total=matrix.length*matrix[0].length;
        while(count<total){
            //first row
            for(int i=minc ; i<=maxc && count<total ; i++){
                ans.add(matrix[minr][i]);
                count++;
            }
            minr++;
            //last col
            for(int i=minr ; i<=maxr && count<total ; i++){
                ans.add(matrix[i][maxc]);
                count++;
            }
            maxc--;
            //bottom row in reverse order
            for(int i=maxc ; i>=minc && count<total ; i--){
                ans.add(matrix[maxr][i]);
                count++;
            }
            maxr--;
            //middle row
            for(int i=maxr ; i>=minr && count<total ; i--){
                ans.add(matrix[i][minc]);
                count++;
            }
                minc++;
        }
            return ans;
    }
}
// while(ctr < total)
//         {
//             for(int i=minc;i<=maxc && ctr<total;i++)
//             {
//                 res.add(matrix[minr][i]);
//                 ctr++;
//             }
//             minr++;
//             for(int i=minr;i<=maxr && ctr<total;i++)
//             {
//                 res.add(matrix[i][maxc]);
//                 ctr++;
//             }
//             maxc--;
//             for(int i=maxc;i>=minc && ctr<total;i--)
//             {
//                 res.add(matrix[maxr][i]);
//                 ctr++;
//             }
//             maxr--;
//             for(int i=maxr;i>=minr && ctr<total;i--)
//             {
//                 res.add(matrix[i][minc]);
//                 ctr++;
//             }
//             minc++;