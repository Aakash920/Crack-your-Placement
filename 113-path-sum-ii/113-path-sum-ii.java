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
    List<List<Integer>> ans;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans=new ArrayList<>();
        int cs=0;
        
        pathSum(root, targetSum, cs, new ArrayList<>());
        return ans;
    }
    public void pathSum(TreeNode node, int sum, int cs, List<Integer> list){
        if(node==null) return ;
        
        cs+=node.val;
        list.add(node.val);
        
        if(node.left==null && node.right==null && cs==sum){
            ans.add(new ArrayList<>(list));
        }
        
        //recursive calls
        pathSum(node.left,sum,cs,list);
        pathSum(node.right,sum,cs,list);
        list.remove(list.size()-1);
    }
}