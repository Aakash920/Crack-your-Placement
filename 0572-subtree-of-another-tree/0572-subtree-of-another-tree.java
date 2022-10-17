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
    public boolean isSubtree(TreeNode t1, TreeNode t2) {
        if(t2==null) return true;
        if(t1==null) return false;
        
        if(t1.val==t2.val){
            if(isSame(t1,t2)){
                return true;
            }
        }
        return isSubtree(t1.left,t2) || isSubtree(t1.right,t2);
    }
    private boolean isSame(TreeNode t1, TreeNode t2){
        if(t1==null && t2==null){
            return true;
        }
        if(t1==null || t2==null) return false;
        
        if(t1.val==t2.val){
            return isSame(t1.left,t2.left) && isSame(t1.right,t2.right);
        }
        return false;
    }
}