class Solution {
    public int strStr(String haystack, String needle) {
        
        return haystack.indexOf(needle);
        
        // if(needle.length()==0) return 0;
        // if(needle.length()>haystack.length()) return -1;
        //     char cc=needle.charAt(0);
        //     for(int i=0 ; i<haystack.length() ; i++){
        //     if(cc==haystack.charAt(i)){
        //         return i;
        //     }
        // }
        // return -1;
    }
}