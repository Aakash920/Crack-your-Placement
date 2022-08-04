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
    public List<Integer> preorderTraversal(TreeNode node) {
        List<Integer> list=new ArrayList<>();
        if(node==null) return list;
        Stack<TreeNode> s=new Stack<>();
        s.push(node);
        while(!s.isEmpty()){
            node=s.pop();
            list.add(node.val);
            
            if(node.right!=null){
                s.push(node.right);
            }
            if(node.left!=null){
                s.push(node.left);
            }
            
        }
        return list;
    }
}