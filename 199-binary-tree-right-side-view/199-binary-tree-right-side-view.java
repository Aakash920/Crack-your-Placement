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
    public List<Integer> rightSideView(TreeNode root) {
//         if(root==null){
//             List<Integer> list=new ArrayList<>();
//             return list;
//         }
//         List<Integer> list=new ArrayList<>();
//         LinkedList<TreeNode> q=new LinkedList<>();
//         q.addLast(root);
//         while(!q.isEmpty()){
//             int len=q.size();
//             TreeNode remove=null;
//             for(int i=0 ; i<len ; i++){
//                 remove=q.removeFirst();
                
//                 if(remove.left!=null)
//                     q.addLast(remove.left);
//                 if(remove.right!=null)
//                     q.addLast(remove.right);
//             }
//             list.add(remove.val);
//         }
//         return list;
        
        
        List<Integer> ans=new ArrayList<>();
        rightView(root, ans, 0);
        return ans;
    }
    public void rightView(TreeNode node, List<Integer> list, int level){
        if(node==null) return;
        if(level==list.size()){
            list.add(node.val);
        }
        rightView(node.right,list,level+1);
        rightView(node.left,list,level+1);
    }
}