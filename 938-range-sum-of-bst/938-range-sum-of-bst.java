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
    int sum=0;
    public int rangeSumBST(TreeNode root, int lo, int hi) {
        if(root==null) return 0;
        if(lo<=root.val && hi>=root.val){
            sum+=root.val;
        }
        if(lo<root.val){
            rangeSumBST(root.left,lo,hi);
        }
        if(hi>root.val){
            rangeSumBST(root.right,lo,hi);
        }
        return sum;
    }
}