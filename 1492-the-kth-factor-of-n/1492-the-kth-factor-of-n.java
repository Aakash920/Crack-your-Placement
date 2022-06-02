class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        int ans=-1;
        for(int i=1; i <=n ; i++){
            if(n%i==0){
                list.add(i);
                k--;
                if(k==0){
                    ans=i;
                    break;
                }
            }
        } 
        return ans;
    }
}