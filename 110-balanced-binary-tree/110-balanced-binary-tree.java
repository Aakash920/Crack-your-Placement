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
    public boolean isBalanced(TreeNode node) {
        return height(node)!=-1;
    }
    private int height(TreeNode node){
        if(node==null) return 0;
        
        int ls=height(node.left);
        int rs=height(node.right);
        
        if(ls==-1 || rs==-1) return -1;
        if(Math.abs(ls-rs)>1) return -1;
        
        return Math.max(ls,rs)+1;
    }
}