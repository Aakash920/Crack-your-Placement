class Solution {
    public int distributeCandies(int[] arr) {
        Arrays.sort(arr);
        int count=1;
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]!=arr[i-1] && count<arr.length/2){
                count++;
            }
        }
        return count;
    }
}