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
class Solution{
    public int sumRootToLeaf(TreeNode node) {
        return sum(node,0);
    }
    private int sum(TreeNode node, int sum){
        if(node==null) return 0;
        sum=(sum<<1)+node.val;
        if(node.left==null && node.right==null){
            return sum;
        }
        return sum(node.left,sum)+sum(node.right,sum);
    }
}