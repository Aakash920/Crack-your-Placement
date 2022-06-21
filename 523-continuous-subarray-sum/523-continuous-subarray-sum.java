class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // TLE cause T:-O(n^2);
        // for(int i=0; i<nums.length ; i++){
        //     int sum=nums[i];
        //     for(int j=i+1 ; j<nums.length ; j++){
        //         sum+=nums[j];
        //         if(sum%k == 0){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0 ; i<nums.length ; i++){
            sum+=nums[i];
            int rem=sum%k;
            if(map.containsKey(rem)){
                if(i-map.get(rem)>1){
                    return true;
                }
            }else{
                map.put(rem,i);
            }
        }
        return false;
    }
}