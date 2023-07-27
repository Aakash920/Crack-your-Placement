class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int lo=0, hi=arr.length-1;
        
        while(lo<=hi){
            if(isVowel(arr[lo]) && isVowel(arr[hi])){
                char temp=arr[lo];
                arr[lo]=arr[hi];
                arr[hi]=temp;
                lo++;
                hi--;
                
            }else if(isVowel(arr[lo]) && !isVowel(arr[hi])) hi--;
            else if(!isVowel(arr[lo]) && isVowel(arr[hi])) lo++;
            else{
                lo++;
                hi--;
            }
        }
        
        StringBuilder sb=new StringBuilder();
        for(char c:arr) sb.append(c);
        return sb.toString();
        
    }
    public boolean isVowel(char c){
        if((c=='a' || c=='e' || c=='i' || c=='o' || c=='u') 
            || (c=='A' || c=='E' || c=='I' || c=='O' || c=='U')){
            return true;
        }
        return false;
    }
}