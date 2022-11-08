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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root=new ListNode();
        ListNode dummy=root;
        ListNode node;
        int c=0;
        while(l1!=null || l2!=null){
            int sum=0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next; 
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=c;
            
            int ld=sum%10;
            c=sum/10;
            node=new ListNode(ld);
            root.next=node;
            root=root.next;
            root.next=null;
        }
        if(c!=0){
            node=new ListNode(c);
            root.next=node;
            root=root.next;
        }
        return dummy.next;
    }
}