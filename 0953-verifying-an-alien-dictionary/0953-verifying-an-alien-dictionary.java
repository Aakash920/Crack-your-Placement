class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] arr=new int[26];
        for(int i=0 ; i<order.length() ; i++){
            arr[order.charAt(i)-'a']=i;
        }
        for(int i=1 ; i<words.length ; i++){
            String s1=words[i-1];
            String s2=words[i];
            int n=Math.min(s1.length(),s2.length());
            boolean f=false;
            for(int j=0 ; j<n ; j++){
                if(arr[s1.charAt(j)-'a']<arr[s2.charAt(j)-'a']){
                    f=true;
                    break;
                }else if(arr[s1.charAt(j)-'a']>arr[s2.charAt(j)-'a']){
                    return false;
                }
            }
            if(!f && s1.length()>s2.length()) return false;
        }
        return true;
    }
}