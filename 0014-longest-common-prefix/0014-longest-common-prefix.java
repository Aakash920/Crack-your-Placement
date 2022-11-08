class Solution {
    public String longestCommonPrefix(String[] arr) {
        String pre=arr[0];
        for(int i=1 ; i<arr.length ; i++){
            while(arr[i].indexOf(pre)!=0){
                pre=pre.substring(0,pre.length()-1);
            }
            if(pre.length()==0) return "";
        }
        return pre;
    }
}