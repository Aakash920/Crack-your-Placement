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
    public TreeNode buildTree(int[] pre, int[] in) {
        TreeNode root=construct(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    public TreeNode construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi){
        if(plo>phi || ilo>ihi){
            return null;
        }
        TreeNode nn=new TreeNode();
        nn.val=pre[plo];
        
        int si=-1;
        int nel=0;
        for(int i=ilo ; i<=ihi ; i++){
            if(pre[plo]==in[i]){
                si=i;
                break;
            }
            nel++;
        }
        //calls for left and right
        nn.left=construct(pre,plo+1,plo+nel,in,ilo,si-1);
        nn.right=construct(pre,plo+nel+1,phi,in,si+1,ihi);
        
        return nn;
    }
}