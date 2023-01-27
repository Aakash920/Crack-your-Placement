class Solution {
    public boolean squareIsWhite(String s) {
        char al=s.charAt(0);
        int n=s.charAt(1);
        if((int) al % 2!=0 && n%2!=0){
            return false;
        }else if((int) al % 2!=0 && n%2==0){
            return true;
        }else if((int) al % 2==0 && n%2!=0){
            return true;
        }else{
            return false;
        }
    }
}