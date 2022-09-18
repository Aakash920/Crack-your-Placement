class Solution {
    public boolean rotateString(String s, String goal) {
       // if(s.length()!=goal.length()) return false;
       //  if(s.equals(goal)==true) return true;
       //  int k=0;
       //  for(int i=1 ; i<goal.length() ; i++){
       //      if(s.contains(goal.substring(0,i))==false){
       //          k=i-1;
       //          break;
       //      }
       //  }
       //  String sub=goal.substring(k,goal.length());
       //  if(s.substring(0,sub.length()).equals(sub)) return true;
       //  return false;
        return s.length()==goal.length() && (s+s).contains(goal);
    }
}