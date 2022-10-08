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
        // Set<Character>set=new HashSet<>();
        // int i=0,j=0;
        // int ans=0;
        // while(j<s.length()){
        //     char x=s.charAt(j);
        //     if(!set.contains(x)){
        //         set.add(x);
        //     }
        //     else{
        //         if(set.size()>ans)ans=set.size();
        //         while(s.charAt(i)!=x){
        //             set.remove(s.charAt(i));
        //             i++;
        //         }
        //         i++;
        //     }
        //     j++;
        // }
        // if(set.size()>ans)return set.size();
        // return ans;
        
        
//         HashMap<Character, Integer> map=new HashMap<>();
//         int i=-1, j=-1;
//         int ans=0;
//         while(true){
//             boolean f1=false;
//             boolean f2=false;
//             //aquire
//             while(i<s.length()-1){
//                 f1=true;
//                 i++;
//                 char ch=s.charAt(i);
//                 map.put(ch,map.getOrDefault(ch,0)+1);
                
//                 if(map.get(ch)==2){
//                     break;
//                 }else{
//                     int len=i-j;
//                     ans=Math.max(ans,len);
//                 }
//             }
//             //release
//             while(j<i){
//                 f2=true;
//                 j++;
//                 char ch=s.charAt(j);
//                 map.put(ch,map.get(ch)-1);
//                 if(map.get(ch)==1){
//                     break;
//                 } 
//             }
//             if(f1==false || f2==false) break;
//         }
//         return ans;
        
    
        int[] fre=new int[256];
        int l=0, r=0;
        int ans=0;
        while(r<s.length()){
            fre[s.charAt(r)]++;
            
            while(fre[s.charAt(r)]>1){
                fre[s.charAt(l)]--;
                l++;
            }
            ans=Math.max(r-l+1,ans);
            r++;
        }
        return ans;
    }
}