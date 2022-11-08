class Solution {
    public int lengthOfLongestSubstring(String s) {
        String ans="";
        int maxLength=-1;
        if(s.isEmpty()) return 0;
        else if(s.length()==1) return 1;
        
        for(char c:s.toCharArray()){
            String curr=String.valueOf(c);
            if(ans.contains(curr)){
                ans=ans.substring(ans.indexOf(curr)+1);
            }
            ans+=String.valueOf(c);
            maxLength=Math.max(maxLength,ans.length());
        }
        return maxLength;
    }
}