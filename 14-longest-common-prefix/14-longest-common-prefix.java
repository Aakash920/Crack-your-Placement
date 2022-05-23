class Solution {
    public String longestCommonPrefix(String[] arr) {
        if(arr.length==0) return "";
        String prefix=arr[0];
        
        for(int i=1 ; i<arr.length ; i++)
            //get an index of prefix -> indexOf
            //flow.indexOf(flower) means jo flow or flower equal nii h
            while(arr[i].indexOf(prefix) != 0){
                //removing last letter of prefix
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        return prefix;
    }
}