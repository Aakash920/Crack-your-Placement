class Solution {
    public void sortColors(int[] nums) {
        //by Dutch National Flag Algorithm
        int i=0, mid=0, j=nums.length-1;
        while(mid<=j){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[i];
                nums[i]=temp;
                mid++;
                i++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp=nums[mid];
                nums[mid]=nums[j];
                nums[j]=temp;
                j--;
            }
        }
    }
}


