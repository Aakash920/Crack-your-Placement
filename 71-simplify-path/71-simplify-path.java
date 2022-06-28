class Solution {
    public String simplifyPath(String str) {
        // By doubly ended queue
        // Deque<String> s=new LinkedList<>();
        // StringBuilder ans=new StringBuilder();
        // String[] p=str.split("/");
        // for(int i=0 ; i<p.length ; i++){
        //     //pop()
        //     if(!s.isEmpty() && p[i].equals("..")) s.poll();
        //     //push
        //     else if(!p[i].equals("") && !p[i].equals(".") && !p[i].equals("..")){
        //         s.push(p[i]);
        //     }
        // }
        // if(s.isEmpty()) return "/";
        // if(!s.isEmpty()){
        //     ans.append("/").append(s.pollLast());
        // }
        // return ans.toString();
        
        //by using Stack
        Stack<String> s=new Stack<>();
        StringBuilder sb=new StringBuilder();
        String[] sp=str.split("/");
        for(int i=0 ; i<sp.length ; i++){
            //pop()
            if(!s.isEmpty() && sp[i].equals("..")) s.pop();
            //push
            else if(!sp[i].equals("") && !sp[i].equals(".") && !sp[i].equals("..")) s.push(sp[i]);
        }
        if(s.isEmpty()) return "/";
        while(!s.isEmpty()){
            sb.insert(0,s.pop()).insert(0,"/");
        }
        return sb.toString();
    }
}