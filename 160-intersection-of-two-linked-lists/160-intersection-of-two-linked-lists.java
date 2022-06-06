/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode nodeA, ListNode nodeB) {
        if(nodeA==null || nodeB==null) return null;
        ListNode a=nodeA;
        ListNode b=nodeB;
        while(a!=b){
            a=a==null ? nodeB:a.next;
            b=b==null ? nodeA:b.next;
        }
        return a;
    }
}