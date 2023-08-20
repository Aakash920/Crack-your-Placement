class Solution {
    public int equalPairs(int[][] arr) {
        // int count=0;
        // int n=arr.length;
        // for(int i=0 ; i<arr.length ; i++){
        //     for(int j=0 ; j<arr.length ; j++){
        //         int k=0;
        //         for( ; k<arr.length ; k++){
        //             if(arr[i][k]!=arr[k][j]){
        //                 break;
        //             }
        //         }
        //         if(k==n){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        
        int count=0;
        HashMap<String,Integer> map=new HashMap<>();
        for(int[] grid:arr){
            String s=Arrays.toString(grid);
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(int i=0 ; i<arr.length ; i++){
            int[] col=new int[arr.length];
            for(int j=0 ; j<arr.length ; j++){
                col[j]=arr[j][i];
            }
            if(map.containsKey(Arrays.toString(col))){
                count+=map.get(Arrays.toString(col));
            }
        }
        return count;
    }
}