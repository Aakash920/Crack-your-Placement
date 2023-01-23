class Solution {
    public String[] sortPeople(String[] arr, int[] ht) {
        String[] ans=new String[arr.length];
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0 ; i<arr.length ; i++){
            map.put(ht[i],arr[i]);
        }
        Arrays.sort(ht);
        int j=0;
        for(int i=ht.length-1 ; i>=0 ; i--){
            ans[j]=map.get(ht[i]);
            j++;
        }
        return ans;
    }
}