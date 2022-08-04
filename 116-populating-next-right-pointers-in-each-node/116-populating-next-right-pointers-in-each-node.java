/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return null;
        LinkedList<Node> q=new LinkedList<>();
        q.addLast(root);
        q.addLast(null);
        while(!q.isEmpty()){
            Node remove=q.removeFirst();
            if(remove!=null){
                if(remove.left!=null){
                    q.addLast(remove.left);
                }
                if(remove.right!=null){
                    q.addLast(remove.right);
                }
                remove.next=q.peek();
            }else{
                if(!q.isEmpty()){
                    q.addLast(null);
                }
            }
        }
        return root;
    }
}