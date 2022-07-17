class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0 ; i<t.length() ; i++){
            char cc=t.charAt(i);
            if(map.containsKey(cc)==false){
                return false;
            }else if(map.get(cc)==1){
                map.remove(cc);
            }else{
                map.put(cc,map.get(cc)-1);
            }
        }
        return true;
    }
}