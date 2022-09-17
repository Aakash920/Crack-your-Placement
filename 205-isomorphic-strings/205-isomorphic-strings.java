class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] a1=new int[100];
        int[] a2=new int[100];
        for(int i=0 ; i<s.length() ; i++){
            char sch=s.charAt(i);
            char tch=t.charAt(i);
            if(a1[sch-' ']!=0){
                if(a1[sch-' ']!=tch){
                    return false;
                }
            }else{
                a1[sch-' ']=tch;
            }
            if(a2[tch-' ']!=0){
                if(a2[tch-' ']!=sch){
                    return false;
                }
            }else{
                a2[tch-' ']=sch;
            }
        }
        return true;
    }
}