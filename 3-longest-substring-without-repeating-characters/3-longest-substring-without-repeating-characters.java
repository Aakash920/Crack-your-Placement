class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashMap<Character,Integer> map=new HashMap<>();
        // int left=0, right=0;
        // int len=0;
        // while(right<s.length()){
        //     if(map.containsKey(s.charAt(right))){
        //         left=Math.max(map.get(s.charAt(right))+1,left);
        //     }
        //     map.put(s.charAt(right),right);
        //     len=Math.max(len,right-left+1);
        //     right++;
        // }
        // return len;
        
        //by HashSet
        Set<Character>set=new HashSet<>();
        int i=0,j=0;
        int ans=0;
        while(j<s.length()){
            char x=s.charAt(j);
            if(!set.contains(x)){
                set.add(x);
            }
            else{
                if(set.size()>ans)ans=set.size();
                while(s.charAt(i)!=x){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
            }
            j++;
        }
        if(set.size()>ans)return set.size();
        return ans;
    }
}