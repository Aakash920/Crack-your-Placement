class Solution {
    public String removeStars(String s) {
        StringBuffer sb=new StringBuffer(s);
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