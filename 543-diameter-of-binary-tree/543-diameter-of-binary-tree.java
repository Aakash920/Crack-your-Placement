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
    public class DiaPair{
        int ht=-1;
        int dia=0;
    }
    public int diameterOfBinaryTree(TreeNode node) {
       DiaPair mp=diameter(node);
       return mp.dia;
    }
    public DiaPair diameter(TreeNode node){
         if(node==null){
            DiaPair bp=new DiaPair();
            bp.ht=-1;
            bp.dia=0;
            return bp;
        }
        DiaPair ls=diameter(node.left);
        DiaPair rs=diameter(node.right);
        
        DiaPair mp=new DiaPair();
        mp.ht=Math.max(ls.ht,rs.ht)+1;
        mp.dia=Math.max(ls.ht+rs.ht+2,Math.max(ls.dia,rs.dia));
        return mp;
    }
}