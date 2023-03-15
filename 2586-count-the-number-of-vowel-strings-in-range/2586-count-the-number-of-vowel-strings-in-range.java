class Solution {
    public int vowelStrings(String[] arr, int left, int right) {
        int count=0;
        for(int i=left ; i<=right ; i++){
            if((arr[i].charAt(0)=='a'
              || arr[i].charAt(0)=='e'
              || arr[i].charAt(0)=='i'
              || arr[i].charAt(0)=='o'
              || arr[i].charAt(0)=='u')
              &&
              (arr[i].charAt(arr[i].length()-1)=='a'
                || arr[i].charAt(arr[i].length()-1)=='e'
                || arr[i].charAt(arr[i].length()-1)=='i'
                || arr[i].charAt(arr[i].length()-1)=='o'
                || arr[i].charAt(arr[i].length()-1)=='u')){
                    count++;
                }
        }
        return count;
    }
}