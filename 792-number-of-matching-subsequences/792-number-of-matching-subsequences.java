class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count=0;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0 ; i<words.length ; i++){
            String ch=words[i];
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<String,Integer> e:map.entrySet()){
            String word=e.getKey();
            if(check(word,s)){
                count+=e.getValue();
            }
        }
        return count;
    }
    private boolean check(String word, String s){
        int i=0,j=0;
        while(i<word.length() && j<s.length()){
            if(word.charAt(i)==s.charAt(j)){
                i++;
            }
            j++;
        }
        if(i==word.length()) return true;
        return false;
    }
        
}