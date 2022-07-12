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
    class Pair{
        int dia=0;
        int ht=-1;
    }
    public int diameterOfBinaryTree(TreeNode node) {
        Pair mp=diameter(node);
        return mp.dia;
    }
    public Pair diameter(TreeNode node){
        if(node==null){
            Pair bp=new Pair();
            bp.dia=0;
            bp.ht=-1;
            return bp;
        }
        
        Pair ls=diameter(node.left);
        Pair rs=diameter(node.right);
        
        Pair mp=new Pair();
        mp.ht=Math.max(ls.ht,rs.ht)+1;
        mp.dia=Math.max(ls.ht+rs.ht+2,Math.max(ls.dia,rs.dia));
        return mp;
    }
}