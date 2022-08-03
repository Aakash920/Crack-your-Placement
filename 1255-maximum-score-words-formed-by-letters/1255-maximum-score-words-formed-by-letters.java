class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int idx=0;
        int[]freq = new int[26];
        for(int i = 0; i<letters.length; i++){
            freq[letters[i]-'a']++;
        }
        return solution(words,freq,score,idx);
    }
    public int solution(String[] words, int[] letters, int[] score, int idx){
        if(idx==words.length) return 0;
        //if not included that word
        int wNotIncluded=0+solution(words,letters,score,idx+1);
        
        //if included
        int sword=0;
        String word=words[idx];
        boolean f=true; //if yes call can be made
        for(int i=0 ; i<word.length() ; i++){
            char cc=word.charAt(i);
            
            // check
            if(letters[cc-'a']==0){
                f=false;
            }
            //decrease its frequency
            letters[cc-'a']--;
            
            sword+=score[cc-'a'];
        }
        int syes=0;
        if(f){
            syes=sword+solution(words,letters,score,idx+1);
        }
        //backtrack
        for(int i=0 ; i<word.length() ; i++){
            char cc=word.charAt(i);
            letters[cc-'a']++;
        }
        return Math.max(wNotIncluded,syes);
    }
}