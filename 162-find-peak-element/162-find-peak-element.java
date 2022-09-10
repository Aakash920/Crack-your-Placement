class Solution {
    public int findPeakElement(int[] arr) {
       int peak=arr[0];
       int peaki=0;
       for(int i=1 ; i<arr.length ; i++){
           if(arr[i]>peak) {
               peak=arr[i];
               peaki=i;
           }
       }
       return peaki;
    }
}