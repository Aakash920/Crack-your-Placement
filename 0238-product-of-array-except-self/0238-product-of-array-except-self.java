class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        // O(n^2)
//         int j=0, k=0;
        
//         while(k<nums.length){
//             int pro=1;
//             int i=0;
//             while(i<nums.length){
//                 if(j==i) i++;
//                 else{
//                     pro*=nums[i];
//                     i++;
//                 }
//             }
//             k++;
//             ans[j++]=pro;
            
//         }
//             return ans;
        
        ans[0]=1;
        for(int i=1 ; i<nums.length ; i++){
            ans[i]=nums[i-1]*ans[i-1];
        }
        int right=1;
        for(int i=nums.length-1 ; i>=0 ; i--){
            ans[i]=right*ans[i];
            right*=nums[i];
        }
        return ans;
    }
}