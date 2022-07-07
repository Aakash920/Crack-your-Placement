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
    public boolean isCousins(TreeNode node, int x, int y) {
       LinkedList<TreeNode> q=new LinkedList<>();
        q.addLast(node);
        while(!q.isEmpty()){
            int len=q.size();
            boolean xexist=false;
            boolean yexist=false;
            for(int i=0 ; i<len ; i++){
                TreeNode remove=q.removeFirst();
                if(remove.val==x) xexist=true;
                if(remove.val==y) yexist=true;
                if(remove.left!=null && remove.right!=null){
                    if(remove.left.val==x && remove.right.val==y){
                        return false;
                    }
                    if(remove.left.val==y && remove.right.val==x){
                        return false;
                    }
                }
                
                if(remove.left!=null)
                    q.addLast(remove.left);
                
                if(remove.right!=null){
                    q.addLast(remove.right);
                }
            }
            if(xexist && yexist) return true;
        }
        return false;
    }
}