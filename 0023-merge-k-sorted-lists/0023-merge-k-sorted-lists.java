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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;
        return mergeSort(lists,0,lists.length-1);
    }
    public ListNode mergeSort(ListNode[] list, int lo, int hi){
        if(lo==hi) return list[lo];
        int mid=lo+(hi-lo)/2;
        ListNode left=mergeSort(list,lo,mid);
        ListNode right=mergeSort(list,mid+1,hi);
        
        return merge(left,right);
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(l1!=null || l2!=null){
            if(l1==null){
                temp.next=l2;
                l2=l2.next;
            }else if(l2==null){
                temp.next=l1;
                l1=l1.next;
            }else if(l1.val<=l2.val){
                temp.next=l1;
                l1=l1.next;
            }else if(l1.val>l2.val){
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        return dummy.next;
    }
}