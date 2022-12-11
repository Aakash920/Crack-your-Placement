class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> set=new HashSet<>();
       return check(set,n);
    }
    private boolean check(HashSet<Integer> set, int n){
        if(n==1) return true;
        if(set.contains(n)) return false;
        
        set.add(n);
        n=update(n);
        return check(set,n);
    }
    private int update(int n){
        int updated=0;
        while(n>0){
            int digit=n%10;
            updated+=(digit*digit);
            n/=10;
        }
        return updated;
    }
}