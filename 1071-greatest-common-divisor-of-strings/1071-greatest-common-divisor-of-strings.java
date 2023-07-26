class Solution {
    public String gcdOfStrings(String s1, String s2) {
        int a=s1.length();
        int b=s2.length();
        String ans1=s1+s2;
        String ans2=s2+s1;
        if(!ans1.equals(ans2)) return "";
        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0 ; i<a ; i++){
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }
}