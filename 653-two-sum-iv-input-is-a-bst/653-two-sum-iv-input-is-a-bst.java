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
    public boolean findTarget(TreeNode node, int k) {
        if(node==null){
            return false;
        }
    
        return findTarget(node,node,k);
//         HashSet<Integer> set=new HashSet<>();
//         return targetSum(node, k, set);
        
//     }
//     public boolean targetSum(TreeNode node, int k, HashSet<Integer> set){
//         if(node==null) return false;
//         if(set.contains(k-node.val)){
//             return true;
//         }else{
//             set.add(node.val);
//         }
//         return targetSum(node.left,k,set) || targetSum(node.right,k,set);
    }
    public boolean findTarget(TreeNode root, TreeNode node, int k){
        if(node==null) return false;
        int remaining=k-node.val;
        if(node.val<remaining){
            if(find(root,remaining)==true){
                return true;
            }
        }
        return findTarget(root,node.left,k) || findTarget(root,node.right,k);
    }
    private boolean find(TreeNode node,int target){
        if(node==null) return false;
        
        if(node.val>target){
            return find(node.left,target);
        }else if(node.val<target){
            return find(node.right,target);
        }else{
            return true;
        }
    }
}