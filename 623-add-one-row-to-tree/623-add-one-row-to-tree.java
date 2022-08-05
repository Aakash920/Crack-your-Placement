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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode new_root=new TreeNode(val);
            new_root.left=root;
            return new_root;
        }
        addOne(root,val,depth,1);
        return root;
    }
    public void addOne(TreeNode root, int val, int depth, int cd){
        if(root==null) return;
        if(cd==depth-1){
            //storage Addresses
            TreeNode ls=root.left;
            TreeNode rs=root.right;
            
            TreeNode leftNode=new TreeNode(val);
            TreeNode rightNode=new TreeNode(val);
            
            root.left=leftNode;
            root.right=rightNode;
            
            leftNode.left=ls;
            rightNode.right=rs;
            return;
        }else{
            addOne(root.left,val,depth,cd+1);
            addOne(root.right,val,depth,cd+1);
        }
    }
}