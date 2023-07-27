class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        List<Boolean> list=new ArrayList<>();
        
        for(int i=0 ; i<candies.length ; i++){
            pq.add(candies[i]);
        }
        int max=pq.peek();
        for(int i=0 ; i<candies.length ; i++){
            if(candies[i]+extraCandies>=max) list.add(true);
            else list.add(false);
        }
        return list;
    }
}