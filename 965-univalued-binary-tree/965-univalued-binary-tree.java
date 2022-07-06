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
    public boolean isUnivalTree(TreeNode node) {
        if(node==null) return true;
        return isUnivalTree(node,node.val);
        
    }
    public boolean isUnivalTree(TreeNode node, int data){
        if(node==null) return true;
        if(data!=node.val) return false;
        
        return isUnivalTree(node.left,data) && isUnivalTree(node.right,data);
    }
}