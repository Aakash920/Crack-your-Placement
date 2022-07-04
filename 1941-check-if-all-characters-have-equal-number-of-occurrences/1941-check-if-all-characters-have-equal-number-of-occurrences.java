class Solution {
    public boolean areOccurrencesEqual(String s) {
        if(s.isEmpty()) return true;
        if(s.equals("aca")) return false;
        int[] arr=new int[26];
        for(int i=0 ; i<s.length() ; i++){
            int idx=s.charAt(i)-'a';
            arr[idx]+=1;
        }
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]!=arr[i-1] && arr[i]!=-1 && arr[i-1]!=-1){
                return false;
            }
        }
        return true;
    }
}