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
    int min=Integer.MAX_VALUE;
    int previous=-1;
    public int getMinimumDifference(TreeNode node) {
        if(node==null) return 0;
        getMinimumDifference(node.left);
        if(previous!=-1) {
            min=Math.min(min,node.val-previous);
        }
        previous=node.val;
        getMinimumDifference(node.right);
        return min;
    }
}