class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> list=new ArrayList<>();
        int n=arr.length;
        while(n>0){
            int idx=find(arr,n);
            if(idx!=n-1){
                flip(arr,idx+1);
                flip(arr,n);
                list.add(idx+1);
                list.add(n);
            }
            n--;
        }
        return list;
    }
    private int find(int[] arr, int n){
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
    private void flip(int[] arr,int k){
        for(int i=0 ; i<k/2 ; i++){
            int temp=arr[i];
            arr[i]=arr[k-i-1];
            arr[k-i-1]=temp;
        }
    }
}