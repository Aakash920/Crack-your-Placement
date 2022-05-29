class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int c=0;
        int al=a.length();
        int bl=b.length();
        int i=0;
        while(i<al || i<bl || c!=0){
            int x=0;
            if(i<al && a.charAt(al-i-1)=='1'){
                x=1;
            }
            int y=0;
            if(i<bl && b.charAt(bl-i-1)=='1'){
                y=1;
            }
            sb.append((x+y+c)%2);
            c=(x+y+c)/2;
            i++;
        }
        return sb.reverse().toString();
    }
}