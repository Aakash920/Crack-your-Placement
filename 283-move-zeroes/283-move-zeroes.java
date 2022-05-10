class Solution {
    public void moveZeroes(int[] arr) {
        int res=0, i=0;
        while(i<arr.length){
            if(arr[i]==0){
                i++;
            }else{
                int temp=arr[i];
                arr[i]=arr[res];
                arr[res]=temp;
                res++;
                i++;
            }
        }
    }
}