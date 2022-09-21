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
    public ListNode sortList(ListNode head) {
        // if(head==null) return null;
        // if(head.next==null) return head;
        // ArrayList<Integer> list=new ArrayList<>();
        // ListNode curr=head;
        // while(curr!=null){
        //     list.add(curr.val);
        //     curr=curr.next;
        // }
        // Collections.sort(list);
        // ListNode temp=head;
        // ListNode first=new ListNode(list.get(0));
        // ListNode ans=first;
        // first.next=null;
        // int i=1;
        // while(i<list.size() && temp!=null){
        //     ListNode nn=new ListNode(list.get(i));
        //     first.next=nn;
        //     nn.next=null;
        //     first=first.next;
        //     i++;
        // }
        // return ans;
        
        //merge sort
        if(head==null || head.next==null) return head;

        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        return merge(l1,l2);
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp.next=l1;
                l1=l1.next;
                temp=temp.next;
            }else{
                temp.next=l2;
                l2=l2.next;
                temp=temp.next;
            }
        }
        if(l1!=null){
            temp.next=l1;
            l1=l1.next;
        }
        if(l2!=null){
            temp.next=l2;
            l2=l2.next;
        }
        return dummy.next;
    
    }
}