class Solution {
    public String removeStars(String s) {
        StringBuilder sb=new StringBuilder(s);
        if(sb.charAt(0)=='*') sb.deleteCharAt(0);
        int i=1;
        while(i<sb.length()){
            if(sb.charAt(i)=='*'){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i-1);
                i-=2;
            }
            i++;
        }
        return sb.toString();
        
    }
}