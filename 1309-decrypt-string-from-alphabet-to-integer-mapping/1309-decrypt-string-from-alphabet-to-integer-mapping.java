class Solution {
    public String freqAlphabets(String s) {
        char[] arr=new char[s.length()];
        StringBuilder sb=new StringBuilder();
        for(int i=0 ; i<arr.length ; i++){
            if(i+2<arr.length && s.charAt(i+2)=='#'){
                char ch=(char) (((s.charAt(i)-48)*10) + (s.charAt(i+1)-48+97-1));
                sb.append(ch);
                i+=2;
            }else{
                char ch=(char) (s.charAt(i)-48+97-1);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}