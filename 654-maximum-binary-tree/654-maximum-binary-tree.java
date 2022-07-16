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
    
    public TreeNode constructMaximumBinaryTree(int[] arr) {
         
        return construct(arr,0,arr.length-1);
    }
    public TreeNode construct(int[] arr, int plo, int phi){
        if(plo>phi) return null;
        int i=findMax(arr,plo,phi);   
        
        TreeNode nn=new TreeNode(arr[i]);
        nn.left=construct(arr,plo,i-1);
        nn.right=construct(arr,i+1,phi);
        return nn;
    }
    public int findMax(int[] arr,int plo, int phi){
        int maximum=Integer.MIN_VALUE;
        int maxi=-1;
        for(int i=plo ; i<=phi ; i++){
            if(arr[i]>maximum){
                maximum=arr[i];
                maxi=i;
            }
        }
        return maxi;
    }
}