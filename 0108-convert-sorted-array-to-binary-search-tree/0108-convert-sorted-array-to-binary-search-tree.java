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
    public TreeNode sortedArrayToBST(int[] arr) {
        TreeNode root=tobst(arr,0,arr.length-1);
        return root;
    }
    TreeNode tobst(int[] arr, int lo, int hi){
        if(lo>hi) return null;
        int mid=(lo+hi)/2;
        
        TreeNode node=new TreeNode(arr[mid]);
        node.left=tobst(arr,lo,mid-1);
        node.right=tobst(arr,mid+1,hi);
        return node;
    }
}