class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        HashSet<Integer> set2=new HashSet<>();
        List<Integer> l1=new ArrayList<>();
        for(int i:nums2) set2.add(i);
        for(int i=0 ; i<nums1.length ; i++){
            if(!set2.contains(nums1[i])){
                l1.add(nums1[i]);
                set2.add(nums1[i]);
            }
        }
        ans.add(l1);
        
        HashSet<Integer> set1=new HashSet<>();
        List<Integer> l2=new ArrayList<>();
        for(int i:nums1) set1.add(i);
        for(int i=0 ; i<nums2.length ; i++){
            if(!set1.contains(nums2[i])){
                l2.add(nums2[i]);
                set1.add(nums2[i]);
            }
        }
        ans.add(l2);
        return ans;
    }
}