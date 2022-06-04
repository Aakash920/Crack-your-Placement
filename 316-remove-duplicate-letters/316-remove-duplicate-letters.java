class Solution {
    public String removeDuplicateLetters(String str) {
        Stack<Character> st=new Stack<>();
        int[] freq=new int[26];
        boolean[] exist=new boolean[26];
        for(int i=0 ; i<str.length() ; i++){
            char ch=str.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0 ; i<str.length() ; i++){
            char ch=str.charAt(i);
            freq[ch-'a']--;
            if(exist[ch-'a']) continue;
            while(st.size()>0 && st.peek()>ch && freq[st.peek()-'a']>0){
                char rem=st.pop();
                exist[rem-'a']=false;
            }
            st.push(ch);
            exist[ch-'a']=true;
        }
        char[] ans=new char[st.size()];
        for(int i=ans.length-1; i >=0 ; i--){
            ans[i]=st.pop();
        }
        return new String(ans);
    }
}