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
    public ListNode partition(ListNode head, int x) {
        ListNode l1=new ListNode();
        ListNode an=l1;
        ListNode l2=new ListNode();
        ListNode ll=l2;
        ListNode t=head;
        while(t!=null){
            if(t.val<x){
                l1.next=t;
                l1=l1.next;
                
            }else{
                l2.next=t;
                l2=l2.next;
            }
            t=t.next;
        }
        l2.next=null;
        l1.next=ll.next;
        return an.next;
    }
}