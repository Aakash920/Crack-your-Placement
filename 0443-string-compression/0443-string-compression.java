class Solution {
    public int compress(char[] arr) {
        int idx=0;
        int j=0;
        
        while(idx<arr.length){
            char cc=arr[idx];
            int count=0;
            while(idx<arr.length && cc==arr[idx]){
                idx++;
                count++;
            }
            //put character
            arr[j++]=cc;
            
            if(count!=1){
                for(char c:Integer.toString(count).toCharArray()){
                    arr[j++]=c;
                }
            }
        }
        return j;
    }
}