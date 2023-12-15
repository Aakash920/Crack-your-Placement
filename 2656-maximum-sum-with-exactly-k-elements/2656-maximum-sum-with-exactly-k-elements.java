class Solution {
    public int maximizeSum(int[] nums, int k) {
        // O(nlog(n))
        // Arrays.sort(nums);
        // int sum=0;
        // while(k>0){
        //     sum+=nums[nums.length-1];
        //     nums[nums.length-1]+=1;
        //     k--;
        // }
        // return sum;
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int sum=0;
        for(int i:nums) pq.add(i);
        while(k>0){
            sum+=pq.peek();
            pq.add(pq.peek()+1);
            k--;
        }
        return sum;
    }
}