class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Time complexity:-O(nlog(n))
//         int[] merged=new int[m+n];
//         int i=0, j=0,k=0;
        
//         while(i<m && j<n){
//             if(nums1[i]<=nums2[j]){
//                 merged[k++]=nums1[i++];
//             }else{
//                 merged[k++]=nums2[j++];
//             }
//         }
//         while(i<m){
//             merged[k++]=nums1[i++];
//         }
//         while(j<n){
//             merged[k++]=nums2[j++];
//         }
//         for(int l=0 ; l<merged.length ; l++){
//             nums1[l]=merged[l];
//         }
        
        int i=m-1, j=n-1, k=m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }else{
                nums1[k--]=nums2[j--];
            }
        }
    }
}