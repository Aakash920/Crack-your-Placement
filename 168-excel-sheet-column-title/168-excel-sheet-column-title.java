class Solution {
    public String convertToTitle(int col) {
        StringBuilder sb=new StringBuilder();
        while(col!=0){
            char val=(char) ((col-1)%26 +65);
            col=(col-1)/26;
            sb.append(val);
        }
        return sb.reverse().toString();
    }
}