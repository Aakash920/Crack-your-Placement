class Solution {
    public String removeOuterParentheses(String s) {
        int op=0;
        int k=0;
        String ans="";
        for(int i=0 ; i<s.length() ; i++){
            char ch=s.charAt(i);
            if(ch=='(') op++;
            else op--;
            if(op==0){
                ans+=check(s.substring(k,i+1));
                k=i+1;
            }
        }
        return ans;
    }
    public String check(String s){
        return s.substring(1,s.length()-1);
    }
}