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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        
        if(root==null) return ans;
        LinkedList<TreeNode> q=new LinkedList<>();
        q.addLast(root);
        while(!q.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int len=q.size();
            for(int i=0 ; i<len ; i++){
                TreeNode node=q.removeFirst();
                if(node!=null){
                    list.add(node.val);
                }
                if(node.left!=null)
                    q.addLast(node.left);
                
                if(node.right!=null)
                    q.addLast(node.right);
            }
            if(list.size()>0){
                ans.add(list);
            }
            
        }
        Collections.reverse(ans);
        return ans;
    }
}