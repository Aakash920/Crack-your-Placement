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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        LinkedList<TreeNode> q=new LinkedList<>();
        q.addLast(root);
        q.addLast(null);
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int len=q.size();
            for(int i=0 ; i<len ; i++){
                TreeNode remove=q.removeFirst();
                    if(remove!=null){
                        max=Math.max(max,remove.val);
                    
                    if(remove.left!=null){
                        q.addLast(remove.left);
                    }
                    if(remove.right!=null){
                        q.addLast(remove.right);
                    } 
                }else{
                        list.add(max);
                        max=Integer.MIN_VALUE;
                        if(!q.isEmpty()){
                            q.add(null);
                        }
                    }
            }
            
        }
        return list;
    }
}