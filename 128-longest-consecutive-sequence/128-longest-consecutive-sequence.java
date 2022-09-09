class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0) return 0;
        Arrays.sort(arr);
        int count=0 ;
        int mcount=0;
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]-arr[i-1]>1){
                count=0;
            }else if(arr[i]-arr[i-1]==1){
                count++;
            }
            mcount=Math.max(mcount,count);
        }
        
        return mcount+1;
    }
}