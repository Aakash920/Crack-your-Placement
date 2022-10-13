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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans;
        LinkedList<TreeNode> q=new LinkedList<>();
        q.addLast(root);
        while(!q.isEmpty()){
            int len=q.size();
            ans=new ArrayList<>();
            for(int i=0 ; i<len ; i++){
                TreeNode remove=q.removeFirst();
                if(remove != null){
                    ans.add(remove.val);
                
                    q.addLast(remove.left);
                    q.addLast(remove.right);
    
                }
            }
            if(ans.size() > 0) list.add(ans);
        }
        return list;
    }
}