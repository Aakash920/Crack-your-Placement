class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0 ; i<capacity.length ; i++){
            list.add(capacity[i]-rocks[i]);
        }
        Collections.sort(list);
        int sum=0;
        for(int x:list){
            sum+=x;
            if(sum>additionalRocks) break;
            count++;
        }
        return count;
    }
}