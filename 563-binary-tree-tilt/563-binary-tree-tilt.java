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
    int tilt=0;
    public int findTilt(TreeNode node) {
        tilt(node);
        return tilt;
    }
    public int tilt(TreeNode node){
      if(node==null) return 0;
      
      int ls=tilt(node.left);
      int rs=tilt(node.right);
      
      int ltilt=Math.abs(ls-rs);
      tilt+=ltilt;
      int ts=ls+rs+node.val;
      return ts;
    }
}