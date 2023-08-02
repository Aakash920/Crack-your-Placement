class Solution {
    public int maxArea(int[] arr) {
        int max=Integer.MIN_VALUE;
        int i=0,j=arr.length-1;
        
        while(i<j){
            if(arr[i]<=arr[j]){
                max=Math.max(max,(j-i)*arr[i]);
                i++;
            }else{
                max=Math.max(max,(j-i)*arr[j]);
                j--;
            }
        }
        return max;
    }
}