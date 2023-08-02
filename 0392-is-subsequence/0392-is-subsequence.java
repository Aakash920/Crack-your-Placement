class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        if(s.length()==0) return true;
        if(t.length()==0) return false;
        while(j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                j++;
                i++;
            }else{
                j++;
            }
            if(i==s.length() && j<t.length()) return true;
            if(i==s.length()-1 && j==t.length()-1 && s.charAt(i)==t.charAt(j)) return true; 
        }
        return false;
    }
}