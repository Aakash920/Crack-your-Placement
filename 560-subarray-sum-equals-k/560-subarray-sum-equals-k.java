class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int i:arr){
            sum+=i;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
                map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}