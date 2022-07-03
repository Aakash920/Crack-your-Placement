class Solution {
    public int longestConsecutive(int[] arr) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int x:arr){
            map.put(x,true);
        }
        for(int x:arr){
            if(map.containsKey(x-1)){
                map.put(x,false);
            }
        }
        int ml=0;
        int msp=0;
        for(int x:arr){
            if(map.get(x)==true){
                int tl=1;
                int tsp=x;
                while(map.containsKey(tsp+tl)){
                    tl++;
                }
                if(tl>ml){
                    ml=tl;
                    msp=tsp;
                }
            }
        }
        return ml;
    }
}