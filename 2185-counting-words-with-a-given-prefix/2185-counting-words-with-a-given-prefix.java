class Solution {
    public int prefixCount(String[] arr, String pref){
        int count=0;
        for(String s:arr){
            if(s.indexOf(pref)==0) count++;
        }
        return count;
    }
}