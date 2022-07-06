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
    public int minDepth(TreeNode node) {
        if(node==null) return 0;
        LinkedList<TreeNode> q=new LinkedList<>();
        q.addLast(node);
        int min=1;
        while(!q.isEmpty()){
            int len=q.size();
            for(int i=0 ; i<len ; i++){
                TreeNode remove=q.removeFirst();
                if(remove.left==null && remove.right==null){
                    return min;
                }
                
                if(remove.left!=null)
                    q.addLast(remove.left);
                
                if(remove.right!=null)
                    q.addLast(remove.right);
            }
            min++;
        }
        return min;
    }
//     public int min(TreeNode node){
//         if(node==null){
//           return Integer.MAX_VALUE;
//       }
//         if(node.left==null && node.right==null){
//             return 1;
//         }
//         int lht=min(node.left);
//         int rht=min(node.right);
        
//         return Math.min(lht,rht)+1;
//     }
}