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
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        // first odd nodes
        ListNode slow=head;
        ListNode first=new ListNode(slow.val);
        slow=slow.next;
        ListNode node=first;
        first.next=null;
        int i=2;
        while(slow!=null){
            if(i%2!=0){
                ListNode nn=new ListNode();
                nn.val=slow.val;
                first.next=nn;
                nn.next=null;
                first=first.next;
            }
            slow=slow.next;
            i++;
        }
        //even nodes
        if(head.next!=null){
        ListNode fast=head.next;
        ListNode sec=new ListNode(fast.val);
        fast=fast.next;
        ListNode node1=sec;
        sec.next=null;
        int j=3;
        while(fast!=null){
            if(j%2==0){
                ListNode nn=new ListNode();
                nn.val=fast.val;
                sec.next=nn;
                nn.next=null;
                sec=sec.next;
            }
            fast=fast.next;
            j++;
        }
        first.next=node1;
        }
        return node;
    }
}