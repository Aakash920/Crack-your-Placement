class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)->b.length()-a.length());
        for(char x:s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(Character i:map.keySet()){
            StringBuilder sb=new StringBuilder();
            int len=map.get(i);
            for(int j=0 ; j<len ; j++){
                sb.append(i+"");
            }
            pq.add(sb.toString());
        }
        StringBuilder ans=new StringBuilder();
        while(!pq.isEmpty()){
            ans.append(pq.remove());
        }
        return ans.toString();
    }
}