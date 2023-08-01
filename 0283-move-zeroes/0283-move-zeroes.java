class Solution {
    public void moveZeroes(int[] arr) {
        //dutch national flag
        // if(arr.length==1) return;
        int i=0,j=0;
        
        while(i<arr.length && j<arr.length){
            if(arr[i]==0){
                i++;
            }else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
                i++;
            }
        }
    }
}