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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode first=head;
        ListNode prev=null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode sec=reverse(slow);
        
        merge(first,sec);
        
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
    public void merge(ListNode f, ListNode s){
        
        while(f!=null){
            ListNode fNext=f.next;
            ListNode sNext=s.next;

            f.next=s;
            if(fNext==null){
                break;
            }
            s.next=fNext;

            f=fNext;
            s=sNext;
        }
    }
}