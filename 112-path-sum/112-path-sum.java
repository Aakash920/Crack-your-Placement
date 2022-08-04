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
    int lsum=0;
    public boolean hasPathSum(TreeNode node, int target) {
        if(node==null) return false;
        return pathSum(node, target, 0);
    }
    public boolean pathSum(TreeNode node, int target, int sum){
        if(node==null) return false;
        sum+=node.val;
        if(node.left==null && node.right==null) {
            if(sum==target) return true;
        }
        return pathSum(node.left,target,sum) || pathSum(node.right,target, sum);
    }
}