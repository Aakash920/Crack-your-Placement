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
    public TreeNode bstFromPreorder(int[] pre) {
        TreeNode root=null;
        for(int i=0 ; i<pre.length ; i++){
            root=construct(root,pre[i]);
        }
        return root;
    }
    public TreeNode construct(TreeNode node, int data){
        if(node==null){
            node=new TreeNode(data);
            return node;
        }
        if(data<node.val){
            node.left=construct(node.left,data);
        }else{
            node.right=construct(node.right,data);
        }
        return node;
    }
}