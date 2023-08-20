class Solution {
    public String removeStars(String s) {
        // StringBuilder sb=new StringBuilder(s);
        // if(sb.charAt(0)=='*') sb.deleteCharAt(0);
        // int i=1;
        // while(i<sb.length()){
        //     if(sb.charAt(i)=='*'){
        //         sb.deleteCharAt(i);
        //         sb.deleteCharAt(i-1);
        //         i-=2;
        //     }
        //     i++;
        // }
        // return sb.toString();
        
        StringBuilder sb=new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='*'){
                sb.deleteCharAt(sb.length()-1);
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}