class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0 ; i<t.length() ; i++){
            char cc=t.charAt(i);
            map.put(cc,map.getOrDefault(cc,0)+1);
        }
        for(int i=0 ; i<s.length() ; i++){
            char cc=s.charAt(i);
            if(map.containsKey(cc)){
                map.put(cc,map.get(cc)-1);
                if(map.get(cc)==0) map.remove(cc);
            }else{
                return false;
            }
        }
        return true;
    }
}