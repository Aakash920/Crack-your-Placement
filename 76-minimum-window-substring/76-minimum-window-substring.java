class Solution {
    public String minWindow(String s, String t) {
        String ans="";
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0 ; i<t.length() ; i++){
            char cc=t.charAt(i);
            map2.put(cc,map2.getOrDefault(cc,0)+1);
        }
        int i=-1;
        int j=-1;
        int mct=0;
        int dct=t.length();
        HashMap<Character,Integer> map1=new HashMap<>();
        //acquire
        while(true){
            boolean f1=false;
            boolean f2=false;
            while(i<s.length()-1 && mct<dct){
                i++;
                char cc=s.charAt(i);
                map1.put(cc,map1.getOrDefault(cc,0)+1);
                if(map1.getOrDefault(cc,0)<=map2.getOrDefault(cc,0)){
                    mct++;
                }
                f1=true;
            }
            //collect answers and release
            while(j<i && mct==dct){
                String pans=s.substring(j+1,i+1);
                if(ans.length()==0 || pans.length()<ans.length()){
                    ans=pans;
                }
                j++;
                char cc=s.charAt(j);
                if(map1.get(cc)==1){
                    map1.remove(cc);
                }else{
                    map1.put(cc,map1.get(cc)-1);
                }
                if(map1.getOrDefault(cc,0)<map2.getOrDefault(cc,0)){
                    mct--;
                }
                f2=true;
            }
            if(f1==false && f2==false){
                break;
            }
        }
        return ans;
    }
}