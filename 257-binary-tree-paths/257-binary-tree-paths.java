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
    public List<String> binaryTreePaths(TreeNode node) {
        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        path(node,list,sb);
        return list;
    }
    private void path(TreeNode node, List<String> list, StringBuilder sb){
        int len=sb.length();
        if(len==0){
            sb.append(node.val);
        }else{
            sb.append("->"+node.val);
        }
        if(node.left==null && node.right==null){
            list.add(sb.toString());
        }
        if(node.left!=null){
            path(node.left,list,sb);
        }
        if(node.right!=null){
            path(node.right,list,sb);
        }
        sb.setLength(len);
    }
}