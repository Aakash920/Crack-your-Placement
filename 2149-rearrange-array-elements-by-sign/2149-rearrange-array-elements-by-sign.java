class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos=new int[nums.length/2];
        int[] neg=new int[nums.length/2];
        int j=0, k=0, i=0;
        while(i<nums.length){
            if(nums[i]>=0){
                pos[j]=nums[i];
                j++;
            }else{
                neg[k]=nums[i];
                k++;
            }
            i++;
        }
        int[] ans=new int[nums.length];
        int p=1,q=1,r=0;
        ans[0]=pos[0];
        boolean f=false;
        while(p<nums.length){
            if(f==false){
                ans[p]=neg[r];
                r++;
                p++;
                f=true;
            }else{
                ans[p]=pos[q];
                q++;
                p++;
                f=false;
            }
        }
        return ans;
    }
}