class Solution {
    public int[] sortArray(int[] arr) {
        mergeSort(arr,0,arr.length-1);
        return arr;
    }
    public void mergeSort(int[] arr, int lo, int hi){
        if(lo<hi){
            int mid=lo+(hi-lo)/2;
            mergeSort(arr,lo,mid);
            mergeSort(arr,mid+1,hi);
            merge(arr,lo,mid,hi);
        }
    }
    public void merge(int[] arr, int lo, int mid, int hi){
        int n1=mid-lo+1;
        int n2=hi-mid;
        
        int[] left=new int[n1];
        int[] right=new int[n2];
        
        for(int i=0 ; i<n1 ; i++){
            left[i]=arr[lo+i];
        }
        for(int i=0 ; i<n2 ; i++){
            right[i]=arr[mid+i+1];
        }
        int i=0,j=0,k=lo;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }
}