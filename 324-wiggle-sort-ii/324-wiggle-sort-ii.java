class Solution {
    public void wiggleSort(int[] arr) {
        Arrays.sort(arr);
        int[] ans=new int[arr.length];
        int i=1, j=arr.length-1;
        while(i<arr.length){
            ans[i]=arr[j];
            i+=2;
            j--;
        }
        i=0;
        while(i<arr.length){
            ans[i]=arr[j];
            i+=2;
            j--;
        }
        for(int k=0 ; k<ans.length ; k++){
            arr[k]=ans[k];
        }
    }
}