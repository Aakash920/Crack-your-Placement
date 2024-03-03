/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode node=head;
        int max=0;
        int n=0;
        while(head!=null){
            head=head.next;
            n++;
        }
        int i=0;
        ListNode first=node;
        while(i<(n/2)){
            node=node.next;
            i++;
        }
        ListNode rev=reverse(node);
        while(rev!=null){
            max=Math.max(max,(first.val+rev.val));
            first=first.next;
            rev=rev.next;
        }
        return max;
    }
    public ListNode reverse(ListNode node){
        ListNode temp=null;
        while(node!=null){
            ListNode nxt=node.next;
            node.next=temp;
            temp=node;
            node=nxt;
        }
        return temp;
    }
}

