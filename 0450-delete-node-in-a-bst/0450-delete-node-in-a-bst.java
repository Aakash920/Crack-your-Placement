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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        //searching that Node
        if(root.val>key){
            root.left=deleteNode(root.left,key);
        }else if(root.val<key){ // searching that Node
            root.right=deleteNode(root.right,key);
        }else{
            //deletion
            //leaf Node
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case 3
            TreeNode is=inOrderSuccesssor(root.right);
            root.val=is.val;
            root.right=deleteNode(root.right,is.val);
        }
        return root;
    }
    public TreeNode inOrderSuccesssor(TreeNode node){
        while(node.left!=null){
            node=node.left;
        }
        return node;
    }
}