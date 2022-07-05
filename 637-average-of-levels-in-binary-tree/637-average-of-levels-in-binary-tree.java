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
    public List<Double> averageOfLevels(TreeNode root) {
        if(root==null) {
            List<Double> list=new ArrayList<>();
            return list;
        }
        // List<Double> list=new ArrayList<>();
        return levelOrder(root);
        
    } 
   
    private List<Double> levelOrder(TreeNode node){
        List<Double> list=new ArrayList<>();
        LinkedList<TreeNode> q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            int len=q.size();
            double avg=0;
            for(int i=0 ; i<len ; i++){
                TreeNode remove=q.removeFirst();
                avg=avg+Double.valueOf(remove.val);
                
                if(remove.left!=null)
                q.addLast(remove.left);
            
                if(remove.right!=null)
                    q.addLast(remove.right);
                
            }
            list.add(avg/len);
            
        }
        return list;
    }
}