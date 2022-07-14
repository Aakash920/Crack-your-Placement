/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
        if(node==null || node==p || node==q) return node;
        
        TreeNode ls=lowestCommonAncestor(node.left,p,q);
        TreeNode rs=lowestCommonAncestor(node.right,p,q);
        if(ls==null){
            return rs;
        }else if(rs==null){
            return ls;
        }else{
            return node;
        }
    }
}