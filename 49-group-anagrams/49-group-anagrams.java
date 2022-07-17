class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0 ; i<str.length ; i++){
            //convert string into char array for applying sorting
            String temp=str[i];
            char[] charArr=temp.toCharArray();
            Arrays.sort(charArr);
            //convert into sting after sorting
            String temp1=new String(charArr);
            
            if(map.containsKey(temp1)==false){
                List<String> list=new ArrayList<>();
                list.add(temp);
                map.put(temp1,list);
            }else{
                List<String> list=new ArrayList<>();
                list=map.get(temp1);
                list.add(temp);
                map.put(temp1,list);
            }
        }
        List<List<String>> ans= new ArrayList<>();
        for(String answ : map.keySet())
        {
            List<String> answer=map.get(answ);
            ans.add(answer);
        }
        return ans;
    }
}