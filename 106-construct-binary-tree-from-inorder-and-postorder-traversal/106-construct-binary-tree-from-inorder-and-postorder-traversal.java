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
    public TreeNode buildTree(int[] in, int[] post) {
        if(in==null || post==null || in.length!=post.length) return null;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0 ; i<in.length ; i++){
            map.put(in[i],i);
        }
        return construct(in,0,in.length-1,post,0,post.length-1,map);
    }
    public TreeNode construct(int[] in,int ilo,int ihi,int[] post, int plo, int phi,HashMap<Integer,Integer> map){
        if(plo>phi || ilo>ihi) return null;
        TreeNode nn=new TreeNode(post[phi]);
        int rootNode=map.get(post[phi]);
        int leftSide=rootNode-ilo;
        
        nn.left=construct(in, ilo,rootNode-1,post,plo,plo+leftSide-1,map);
        nn.right=construct(in,rootNode+1,ihi,post,plo+leftSide,phi-1,map);
        return nn;
    }
}