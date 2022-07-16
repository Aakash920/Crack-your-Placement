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
        //Solved from Level Order Traversal
        List<List<Integer>> ans=new ArrayList<>();
        
        if(root==null) return ans;
        LinkedList<TreeNode> q=new LinkedList<>();
        q.addLast(root);
        while(!q.isEmpty()){
            ans.add(0,new ArrayList<>());
            int len=q.size();
            for(int i=0 ; i<len ; i++){
                TreeNode node=q.removeFirst();
                ans.get(0).add(node.val);
                // if(node!=null){
                //     list.add(node.val);
                // }
                if(node.left!=null)
                    q.addLast(node.left);
                
                if(node.right!=null)
                    q.addLast(node.right);
            }
            // if(list.size()>0){
            //     ans.add(list);
            // }
            
        }
        // Collections.reverse(ans);
        return ans;
        
        
        // Solved From height concept
        // int n=height(root);
        // List<List<Integer>> ans=new ArrayList<>();
        // inorder(ans,root,n);
        // return ans;
    }
    
    // public void inorder(List<List<Integer>> list,TreeNode node, int n){
    //     if(node==null) return;
    //     inorder(list,node.left,n-1);
    //     List<Integer> ans=new ArrayList<>();
    //     ans.add(n-1,node.val);
    //     list.add(ans);
    //     inorder(list,node.right,n-1);
    // }
    // public int height(TreeNode node){
    //     if(node==null) return 0;
    //     return Math.max(height(node.left),height(node.right))+1;
    // }
}