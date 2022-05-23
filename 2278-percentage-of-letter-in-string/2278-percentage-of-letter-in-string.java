class Solution {
    public int percentageLetter(String s, char cc) {
        int count=0;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)==cc){
                count++;
            }
        }
        int divide=(count*100)/s.length();
        return divide;
    }
}