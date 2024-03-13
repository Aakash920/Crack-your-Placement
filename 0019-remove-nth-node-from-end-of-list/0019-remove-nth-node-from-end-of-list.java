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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node=head;
        int count=0;
        while(node!=null) {
            node=node.next;
            count++;
        }
        
        if(count==1 && n==1){
            ListNode ans=null;
            return ans;
        }
        
        int idx=count-n-1; //5-2-1=2
        if(idx<0){
            head=head.next;
            return head;
        }
        
        ListNode first=head;
        int i=0;
        while(first!=null){
            if(idx==i){
                if(first.next.next!=null){
                    first.next=first.next.next;
                    return head;
                }else{
                    first.next=null;
                    return head;
                }
            }else{
                first=first.next;
                i++;
            }
        }
        return head;
    }
}