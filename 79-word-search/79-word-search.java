class Solution {
    boolean visited[][];
    public boolean exist(char[][] b, String word) {
//         int k=0;
//         char cc=word.charAt(0);
//         for(int i=0 ; i<b.length ; i++){
//             for(int j=0 ; j<b[0].length ; j++){
//                 if(k<word.length()){
//                     cc=word.charAt(k);
//                 }
                
//                 if(cc==b[i][j] && k<word.length()){
//                     k++;
//                 }else if(k==word.length()){
//                     return true;
//                 }
//                 else{
//                     if(i<b.length-1 && b[i+1][j]==cc){
//                         k++;
//                     }else if(j<b[0].length-1 && b[i][j+1]==cc){
//                         k++;
//                     }
//                 }
//             }
//         }
//         return false;
        visited=new boolean[b.length][b[0].length];
        for(int i=0 ; i<b.length ; i++){
            for(int j=0 ; j<b[0].length ; j++){
                if(b[i][j]==word.charAt(0) && search(i,j,0,word,b)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean search(int i, int j, int k, String word, char[][] b){
        if(k==word.length()) return true;
        
        if(i<0 || i==b.length || j<0 || j==b[0].length || word.charAt(k)!=b[i][j] || visited[i][j]){
            return false;
        }
        
        visited[i][j]=true;
        if(search(i+1,j,k+1,word,b)||
           search(i-1,j,k+1,word,b)||
           search(i,j+1,k+1,word,b)||
           search(i,j-1,k+1,word,b)){
            return true;
        }
        visited[i][j]=false;
            return false;
        
    }
}