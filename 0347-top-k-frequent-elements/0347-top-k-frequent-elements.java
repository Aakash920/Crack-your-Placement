class Solution {
    public int[] topKFrequent(int[] nums, int k) {
//         int[] nums=new int[k];
//         HashMap<Integer,Integer> map=new HashMap<>();
            
//         for(int ar:arr) map.put(ar,map.getOrDefault(ar,0)+1);
        
//         PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(
//                                                     (a,b) -> a.getValue()-b.getValue()
//         );
        
//         for(Map.Entry<Integer,Integer> e:map.entrySet()){
//             pq.add(e);
//             if(pq.size()>k) pq.poll();
//         }
//         int i=k;
//         if(!pq.isEmpty()){
//             nums[--i]=pq.poll().getKey();
//         }
//         return nums;
        
        int[] arr = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) ->
            a.getValue() - b.getValue()
        );
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            pq.add(it);
            if (pq.size() > k) pq.poll();
        }
        int i = k;
        while (!pq.isEmpty()) {
            arr[--i] = pq.poll().getKey();
        }
        return arr;
    }
}