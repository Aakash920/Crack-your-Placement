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
    public TreeNode balanceBST(TreeNode root) {
        if(root==null) return null;
        
        ArrayList<Integer> list=new ArrayList<>();
        
        inorder(root,list);
        
        return balanced(list, 0, list.size()-1);
    }
    private void inorder(TreeNode node, ArrayList<Integer> list){
        if(node == null){
            return;
        }
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
        
    }
    private TreeNode balanced(ArrayList<Integer> list, int start, int end){
        if(start>end){
            return null;
        }
        int mid=start+(end-start)/2;
        TreeNode node=new TreeNode(list.get(mid));
        node.left=balanced(list,start,mid-1);
        node.right=balanced(list,mid+1,end);
        return node;
    }
}