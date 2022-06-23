class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1) return nums[0];
        int max=Integer.MIN_VALUE;
        int pro=1;
        for(int i=0 ; i<nums.length ; i++){
            pro*=nums[i];
            max=Math.max(max,pro);
            if(pro==0){
                pro=1;
            }
        }
        int maxBack=Integer.MIN_VALUE;
        pro=1;
        for(int i=nums.length-1 ; i>=0 ; i--){
            pro*=nums[i];
            max=Math.max(max,pro);
            if(pro==0){
                pro=1;
            }
        }
        return Math.max(max,maxBack);
    }
}