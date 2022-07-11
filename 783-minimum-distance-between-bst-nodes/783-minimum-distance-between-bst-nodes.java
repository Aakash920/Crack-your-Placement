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
    int check=-1;
    public int minDiffInBST(TreeNode node) {
        if(node==null) return 0;
        minDiffInBST(node.left);
        if(check!=-1){
            min=Math.min(min,node.val-check);
        }
        check=node.val;
        minDiffInBST(node.right);
        return min;
    }
}