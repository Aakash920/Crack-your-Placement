class Solution {
    public String longestCommonPrefix(String[] arr) {
        String prefix=arr[0];
        for(int i=1 ; i<arr.length ; i++){
            while(arr[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.length()==0) return "";
            }
        }
        return prefix;
    }
}