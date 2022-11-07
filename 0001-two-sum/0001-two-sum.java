class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0 ; i<arr.length ; i++){
            if(map.containsKey(target-arr[i])){
                ans[0]=i;
                ans[1]=map.get(target-arr[i]);
                return ans;
            }
            map.put(arr[i],i);
        }
        return ans;
        
    }
}