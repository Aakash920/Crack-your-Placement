class Solution {
    public boolean exist(char[][] b, String word) {
        for(int i=0 ; i<b.length ; i++){
            for(int j=0 ; j<b[i].length; j++){
                if(backtrack(i,j,0,word,b)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean backtrack(int i, int j, int k, String word, char[][] b){
        if(k==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=b.length || j>=b[i].length || b[i][j]=='*'){
            return false;
        }
        if(b[i][j]!=word.charAt(k)){
            return false;
        }
        b[i][j]='*';
        boolean ans=(backtrack(i,j+1,k+1,word,b) ||
                       backtrack(i+1,j,k+1,word,b) ||
                       backtrack(i-1,j,k+1,word,b) ||
                       backtrack(i,j-1,k+1,word,b));
            
        b[i][j]=word.charAt(k);
        
        return ans;
    }
}

//  if(start == word.length())  return true;
        
//         if(r < 0 || c < 0 || r >= board.length || c >= board[r].length || board[r][c] == '*')
//             return false;

//         if(board[r][c] != word.charAt(start))   return false;

//         // mark cell as visited
//         board[r][c] = '*';
        
//         boolean result = (check(r,c+1,board,word,start+1) ||
//                         check(r+1,c,board,word,start+1) ||
//                         check(r-1,c,board,word,start+1) ||
//                         check(r,c-1,board,word,start+1));
        
//         // unmark cell as not-visited
//         board[r][c] = word.charAt(start);
        
//         return result;