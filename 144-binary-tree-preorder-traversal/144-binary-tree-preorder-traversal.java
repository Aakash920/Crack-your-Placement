/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class Pair{
        TreeNode node;
        boolean sd;
        boolean ld;
        boolean rd;
    }
    public List<Integer> preorderTraversal(TreeNode node) {
        List<Integer> list=new ArrayList<>();
        Stack<Pair> s=new Stack<>();
        Pair sp=new Pair();
        sp.node=node;
        s.push(sp);
        while(!s.isEmpty()){
            Pair nn=s.peek();
            if(nn.node==null){
                s.pop();
                continue;
            }
            if(nn.sd==false && nn.node!=null){
                list.add(nn.node.val);
                nn.sd=true;
            }else if(nn.ld==false){
                Pair np=new Pair();
                np.node=nn.node.left;
                s.push(np);
                nn.ld=true;
            }else if(nn.rd==false){
                Pair np=new Pair();
                np.node=nn.node.right;
                s.push(np);
                nn.rd=true;
            }else{
                s.pop();
            }
        }
        return list;
    }
}