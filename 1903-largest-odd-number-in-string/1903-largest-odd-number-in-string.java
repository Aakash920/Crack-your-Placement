class Solution {
    public String largestOddNumber(String num) {
        int n=num.charAt(num.length()-1)-'0';
        if(n%2!=0 && n>0) return num;
        
        for(int i=num.length()-1 ; i>=0 ; i--){
            int x=num.charAt(i)-'0';
            if(x%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}