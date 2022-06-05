class Solution {
    public String shortestPalindrome(String s) {
        //String s+s'
        String sdash=s+"#"+ new StringBuilder(s).reverse().toString();
        int lps=LPS(sdash);
        String ans= new StringBuilder(s.substring(lps)).reverse().toString()+s;
        return ans;
    }
    private int LPS(String s){
        int[] lps=new int[s.length()];
        int i=1;
        int len=0;
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len>0){
                    len=lps[len-1];
                }else{
                    i++;
                }
            }
        }
        return lps[lps.length-1];
    }
}