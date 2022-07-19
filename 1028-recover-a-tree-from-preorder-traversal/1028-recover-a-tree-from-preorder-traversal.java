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
    public TreeNode recoverFromPreorder(String str) {
        return sol(str.toCharArray(),0);
    }
    int i=0, dashes=0;
    public TreeNode sol(char[] arr, int level){
        int num=0;
        while(i!=arr.length && arr[i]!='-'){
            num=num*10+Character.getNumericValue(arr[i++]);
        }
            TreeNode nn=new TreeNode(num);
            if(i==arr.length){
                return nn;
            }
            dashes=0;
            while(arr[i]=='-'){
                dashes++;
                i++;
            }
            if(dashes>level){
                nn.left=sol(arr,level+1);
                if(i!=arr.length && dashes>level){
                    nn.right=sol(arr,level+1);
            }
            }
        return nn;
    }
}