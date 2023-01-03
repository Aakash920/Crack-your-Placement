class Solution {
    public int xorOperation(int n, int start) {
        int prev=start+(2*0);
        int ans=start;
        for(int i=1 ; i<n ; i++){
            int num=start+(2*i);
            ans=prev^num;
            prev=ans;
        }
        return ans;
    }
}