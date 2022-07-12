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
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        pathSum(root);
        return max;
        
    }
    public int pathSum(TreeNode root){
        if(root==null) return 0;
        int ls=pathSum(root.left);
        int rs=pathSum(root.right);
        
        ls=Math.max(ls,0);
        rs=Math.max(rs,0);
        
        max=Math.max(max,ls+rs+root.val);
        return Math.max(ls,rs)+root.val;
    }
}