class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        int open=n;
        int close=n;
        String op="";
        solution(open,close,op,list);
        return list;
    }
    public void solution(int open, int close, String op, List<String> list){
        if(open==0 && close==0){
            list.add(op);
            return;
        }
        if(open!=0){
            solution(open-1,close,op+"(",list);
        }
        if(close>open){
            solution(open,close-1,op+")",list);
        }
    }
}