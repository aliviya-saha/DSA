/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null )
            return null;
        
        ListNode fast=head, slow=head,entry=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            //find the collision
            if(fast==slow){
                while(slow!=entry){
                    entry=entry.next;
                    slow=slow.next;
                }
                return entry;
            }
        }
       return null; 
    }
}