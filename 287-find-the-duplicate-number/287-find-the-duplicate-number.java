class Solution {
    public int findDuplicate(int[] nums) {
        // T-O(n),S-O(1);
    //     Arrays.sort(nums);
    //     int i=1;
    //     while(i<nums.length && nums[i]!=nums[i-1]){
    //         i++;
    //     }
    //     return nums[i];
        
//         Set<Integer> set = new HashSet<>();
//         int len = nums.length;
//         for (int i = 0; i < len; i++) {
//             if (!set.add(nums[i])) {
//                 return nums[i];
//             }
//         }

//         return len;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()>1){
                return e.getKey();
            }
        }
        return map.size();
    }
}