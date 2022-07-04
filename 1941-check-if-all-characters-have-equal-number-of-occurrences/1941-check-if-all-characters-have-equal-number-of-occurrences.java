class Solution {
    public boolean areOccurrencesEqual(String s) {
//         if(s.isEmpty()) return true;
        
//         int[] arr=new int[26];
//         ArrayList<Integer> list=new ArrayList<>();
//         Arrays.fill(arr,-1);
//         for(int i=0 ; i<s.length() ; i++){
//             int idx=s.charAt(i)-'a';
//             arr[idx]+=1;
//         }
//         for(int i=0 ; i<arr.length ; i++){
//             if(arr[i]!=-1){
//                 list.add(arr[i]);
//             }
//         }
        
//         for(int i=1 ; i<list.size(); i++){
//             if(list.get(i)!=list.get(i-1)){
//                 return false;
//             }
//         }
//         return true;
        
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int first=map.get(s.charAt(0));
        // for(Map.Entry<Character,Integer> e:map.entrySet()){
        //     if(e.getValue()!=first){
        //         return false;
        //     }
        // }
        for(int i=1; i<s.length() ; i++){
            if(map.get(s.charAt(i))!=first){
                return false;
            }
        }
        return true;
    }
}