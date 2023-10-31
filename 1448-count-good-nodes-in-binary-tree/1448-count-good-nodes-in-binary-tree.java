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
    int count=0;
    public int goodNodes(TreeNode node) {
        if(node==null) return 0;
        fun(node,Integer.MIN_VALUE,Integer.MIN_VALUE);
        return count;
    }
    public void fun(TreeNode node, int last, int max){
        if(node==null) return;
        if(node.val>=last && node.val>=max){
            count++;
        }
        max=Math.max(max,node.val);
        fun(node.left,node.val,max);
        fun(node.right,node.val,max);
    }
}