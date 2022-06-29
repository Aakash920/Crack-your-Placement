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
        LinkedList<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        
        queue.addLast(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            List<Integer> ans=new ArrayList<>();
            for(int i=0 ; i<len ; i++){
                TreeNode remove=queue.removeFirst();
                if(remove != null){
                    ans.add(remove.val);
                    
                    //call childs
                    queue.addLast(remove.left);
                    queue.addLast(remove.right);
                }
            }
            if(ans.size() > 0) list.add(ans);
        }
        return list;
    }
}