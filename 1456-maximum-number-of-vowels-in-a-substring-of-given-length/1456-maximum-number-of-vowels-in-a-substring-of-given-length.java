class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int sum=0;
        for(int i=0 ; i<k ; i++){
            if(isVowel(s.charAt(i))){
                sum++;
                max=Math.max(max,sum);
            }
        }
        for(int i=k ; i<s.length() ; i++){
            if(isVowel(s.charAt(i-k))) sum--;
            if(isVowel(s.charAt(i))) sum++;
            max=Math.max(max,sum);
        }
        return max;
    }
    public boolean isVowel(char c){
        if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
}