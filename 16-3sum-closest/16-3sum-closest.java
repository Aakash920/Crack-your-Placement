class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0 ; i<nums.length ; i++){
            int lo=i+1;
            int hi=nums.length-1;
            while(lo<hi){
                if(nums[i]+nums[lo]+nums[hi]==target) return target;
                else if(Math.abs(nums[i]+nums[lo]+nums[hi]-target)<diff){
                    diff=Math.abs(nums[i]+nums[lo]+nums[hi]-target);
                    ans=nums[i]+nums[lo]+nums[hi];
                }
                if(nums[i]+nums[lo]+nums[hi]>target) hi--;
                else lo++;
            }
        }
        
        return ans;
    }
}