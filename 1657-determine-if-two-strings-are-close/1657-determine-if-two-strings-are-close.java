class Solution {
    public boolean closeStrings(String s1, String s2) {
//         if(s1.length()!=s2.length()) return false;
//         LinkedHashMap<Character,Integer> m1=new LinkedHashMap<>();
//         for(int i=0 ; i<s1.length() ; i++){
//             char c=s1.charAt(i);
//             m1.put(c,m1.getOrDefault(c,0)+1);
//         }
//         LinkedHashMap<Character,Integer> m2=new LinkedHashMap<>();
//         for(int i=0 ; i<s2.length() ; i++){
//             char c=s2.charAt(i);
//             m2.put(c,m2.getOrDefault(c,0)+1);
//         }
//         HashSet<Integer> set1=new HashSet<>();
//         HashSet<Character> set2=new HashSet<>();
//         for(Map.Entry<Character,Integer> e:m1.entrySet()){
//             set1.add(e.getValue());
//             set2.add(e.getKey());
//         }
//         for(Map.Entry<Character,Integer> e:m2.entrySet()){
//             if(set2.contains(e.getKey())){
//                 if(!set1.contains(e.getValue())) return false;
//                 else set1.remove(e.getValue());
//             }else{
//                 return false;
//             }
            
//         }
//         return true;
        
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        
        for(int i=0 ; i<s1.length() ; i++){
            arr1[s1.charAt(i)-'a']++;
        }
        
        for(int i=0 ; i<s2.length() ; i++){
            arr2[s2.charAt(i)-'a']++;
        }
        
        
        for(int i=0 ; i<26 ; i++){
            if((arr1[i]==0 && arr2[i]!=0) || (arr1[i]!=0 && arr2[i]==0)){
                return false;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1,arr2);
         
    }
}