class Solution {
    public int missingNumber(int[] arr) {
        int[] ans=new int[arr.length+1];
        Arrays.fill(ans,-1);
        for(int i=0 ; i<arr.length ; i++){
            ans[arr[i]]=1;
        }
        for(int i=0 ; i<ans.length ; i++){
            if(ans[i]==-1){
                return i;
            }
        }
        return -1;
    }
}