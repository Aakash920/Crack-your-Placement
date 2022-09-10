class Solution {
    public int searchInsert(int[] arr, int x) {
        int lo=0,hi=arr.length-1;
        while(lo<=hi){
        int mid=lo+(hi-lo)/2;
            if(arr[mid]<x){
                lo=mid+1;
            }else if(arr[mid]>x){
                hi=mid-1;
            }else{
                return mid;
            }
        }
        return lo;
    }
}