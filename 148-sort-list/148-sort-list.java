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
        if(head==null) return null;
        if(head.next==null) return head;
        ArrayList<Integer> list=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(list);
        ListNode temp=head;
        ListNode first=new ListNode(list.get(0));
        ListNode ans=first;
        first.next=null;
        int i=1;
        while(i<list.size() && temp!=null){
            ListNode nn=new ListNode(list.get(i));
            first.next=nn;
            nn.next=null;
            first=first.next;
            i++;
        }
        return ans;
    }
}