class Solution {
    public String greatestLetter(String s) {
        // StringBuilder sb=new StringBuilder();
        // for(int i=0 ; i<s.length() ; i++){
        //     char ch=s.charAt(i);
        //     if(ch>='A' && ch<='Z'){
        //         sb.append(ch);
        //     }
        // }
        // StringBuilder ans=new StringBuilder();
        // for(int i=0 ; i<sb.length() ; i++){
        //     char upper=sb.charAt(i);
        //     char ch=Character.toLowerCase(sb.charAt(i));
        //     for(int j=0 ; j<s.length() ; j++){
        //         if(ch==s.charAt(j) && ans.isEmpty()){
        //             ans.append(upper);
        //         }else if(!ans.isEmpty() && ch==s.charAt(j) && ans.charAt(0)<Character.toUpperCase(ch)){
        //             ans.deleteCharAt(0);
        //             ans.append(upper);
        //         }
        //     }
        // }
        // return ans.toString();
        
        
        //Another better solution
        // int[] up = new int[26];
        // int[] low = new int[26];
        // String ans="";
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
        //         up[s.charAt(i)-'A']=1;
        //     }else{
        //         low[s.charAt(i)-'a']=1;
        //     }
        // }
        // for(int i=25;i>=0;i--){
        //     if(up[i]>0 && low[i]>0){
        //         ans += (char)(i+'A');
        //         break;
        //     }
        // }
        // return ans;
        
        //One more better solution
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray())
            set.add(ch);
        
        for(char ch = 'Z'; ch >= 'A'; ch--)
            if(set.contains(ch) && set.contains((char)('a'+(ch-'A'))))
               return ch+"";
        return "";
    }
}