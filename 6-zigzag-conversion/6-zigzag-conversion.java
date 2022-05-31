class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] sb=new StringBuilder[numRows];
        char[] arr=s.toCharArray();
        // create 3 array in StringBuilder like:-
        //"[]
        // []
        // []"
        for(int i=0 ; i<numRows ; i++){
            sb[i]=new StringBuilder();
        }
        int i=0;
        while(i<arr.length){
            //go downward
            for(int j=0 ; j<numRows && i<arr.length ; j++){
                sb[j].append(arr[i]);
                i++;
            }
            //move upward
            for(int j=numRows-2 ; j>0 && i<arr.length ; j--){
                sb[j].append(arr[i]);
                i++;
            }
        }
        StringBuilder ans=sb[0];
        for(int k=1 ; k<numRows ; k++){
            ans.append(sb[k]);
        }
        return ans.toString();
    }
}