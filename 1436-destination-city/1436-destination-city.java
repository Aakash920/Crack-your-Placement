class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> set=new HashSet<>();
        for(List<String> path:paths){
            set.add(path.get(0));
        }
        String ans="";
        for(List<String> path:paths){
            if(!set.contains(path.get(1))){
                ans+=path.get(1);
            }
        }
        return ans;
    }
}