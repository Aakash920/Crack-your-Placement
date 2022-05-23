class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long lo=-10000000000l;
        long hi=10000000000l;
        long ans=0;
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
            if(count(nums1,nums2,mid)>=k){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
    private long count(int[] arr1, int[] arr2, long dot_pro){
        long ans=0;
        for(int e1:arr1){
            int count=0;
            if(e1>=0){
                int lo=0;
                int hi=arr2.length-1;
                while(lo<=hi){
                    int mid=(lo+hi)/2;
                    if((long) e1*arr2[mid]<=dot_pro){
                        count=mid+1;
                        lo=mid+1;
                    }else{
                        hi=mid-1;
                    }
                }
                ans+=count;
                
            }else{
                int lo=0;
                int hi=arr2.length-1;
                while(lo<=hi){
                    int mid=(lo+hi)/2;
                    if((long) e1*arr2[mid]<=dot_pro){
                        count=arr2.length-mid;
                        hi=mid-1;
                    }else{
                        lo=mid+1;
                    }
                }
                ans+=count;
        }
        }
        return ans;
    }
}