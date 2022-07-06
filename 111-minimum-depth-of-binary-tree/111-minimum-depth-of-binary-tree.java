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
    public int minDepth(TreeNode node) {
        if(node==null) return 0;
        return min(node);
    }
    public int min(TreeNode node){
        if(node==null){
          return Integer.MAX_VALUE;
      }
        if(node.left==null && node.right==null){
            return 1;
        }
        int lht=min(node.left);
        int rht=min(node.right);
        
        return Math.min(lht,rht)+1;
    }
}