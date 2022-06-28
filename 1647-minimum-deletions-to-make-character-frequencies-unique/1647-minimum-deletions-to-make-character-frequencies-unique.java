class Solution {
    public int minDeletions(String s) {
        int[] arr=new int[26];
        for(int i=0 ; i<s.length() ; i++){
            arr[s.charAt(i)-'a']+=1;
        }
        int ans=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0 ; i<26 ; i++){
            if(arr[i]!=0)
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }else{
                while(list.contains(arr[i]) && arr[i]>0){
                    arr[i]--;
                    ans++;
                }
                list.add(arr[i]);
            }
        }
        return ans;
    }
}