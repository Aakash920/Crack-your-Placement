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
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode node) {
        boolean flag=false;
        List<List<Integer>> ans=new ArrayList<>();
        if(node==null) return ans;
        LinkedList<TreeNode> q=new LinkedList<>();
        q.addLast(node);
        while(!q.isEmpty()){
            int len=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0 ; i<len ; i++){
                TreeNode remove=q.removeFirst();
                if(remove!=null)
                list.add(remove.val);
                
                if(remove.left!=null)
                    q.addLast(remove.left);
                if(remove.right!=null)
                    q.addLast(remove.right);
            }
            if(flag==false){
                ans.add(list);
                flag=true;
            }else{
                Collections.reverse(list);
                ans.add(list);
                flag=false;
            }
            
        }
        return ans;
    }
}