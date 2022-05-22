class Solution {
    public int numIdenticalPairs(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count=0;
        for(int i=0 ; i<arr.length ; i++){
            int x=arr[i];
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(Integer key:map.keySet()){
            int val=map.get(key);
            count+=(int)(val*(val-1)/2);
        }
        return count;
    }
}