class Solution {
    public String reversePrefix(String s, char ch) {
        StringBuilder sb=new StringBuilder();
        int idx=-1;
        for(int i=0 ; i<s.length() ; i++){
            idx=i;
            sb.append(s.charAt(i));
            if(s.charAt(i)==ch){
                sb.reverse();
                break;
            }
        }
        for(int i=idx+1 ; i<s.length() ; i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}