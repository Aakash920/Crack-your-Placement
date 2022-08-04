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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        
        if(root.val==p.val || root.val==q.val) return root;
        TreeNode ls=lowestCommonAncestor(root.left,p,q);
        TreeNode rs=lowestCommonAncestor(root.right,p,q);
        
        if(ls==null) return rs;
        else if(rs==null) return ls;
        return root;
    }
}