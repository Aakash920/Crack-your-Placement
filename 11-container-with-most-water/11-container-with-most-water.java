class Solution {
    public int maxArea(int[] arr) {
        int maxArea=0;
        int i=0, j=arr.length-1;
        while(i<j){
            int area=0;
            if(arr[i]<arr[j]){
                area=arr[i]*(j-i);
                if(area>maxArea){
                    maxArea=area;
                }else{
                    i++;
                }
            }else{
                area=arr[j]*(j-i);
                if(area>maxArea){
                    maxArea=area;
                }else{
                    j--;
                }
            }
        }
        return maxArea;
    }
}