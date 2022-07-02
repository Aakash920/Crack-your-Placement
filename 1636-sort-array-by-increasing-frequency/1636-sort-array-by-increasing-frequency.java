class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b) ->{
            return (map.get(a)==map.get(b)) ? (b-a) : map.get(a)-map.get(b);
        });
        int[] res=new int[nums.length];
        int i=0;
        for(int j=0 ; j<list.size() ; j++){
            for(int k = 0; k < map.get(list.get(j)); k++){
            res[i] = list.get(j);
            i++;
        }
    }
        return res;
}
}