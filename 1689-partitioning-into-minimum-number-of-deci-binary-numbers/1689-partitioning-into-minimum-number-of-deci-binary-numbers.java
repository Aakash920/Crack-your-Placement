class Solution {
    public int minPartitions(String s) {
        int[] arr=new int[s.length()];
        for(int i=0 ; i<arr.length ; i++){
            char ch=s.charAt(i);
            arr[i]=Integer.parseInt(String.valueOf(ch));
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}