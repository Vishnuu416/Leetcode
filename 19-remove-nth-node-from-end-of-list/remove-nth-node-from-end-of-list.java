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
        ListNode temp = head;
        int count=1;
        while(temp.next!=null)
        {
            temp = temp.next;
            count++;
        }
        ListNode dummy = head;
        int track=1;
        if(n==count)
            return head.next;
        while(track<(count-n) )
        {
            dummy =dummy.next;
            track++;
        }
        dummy.next = dummy.next.next;
        return head;
        
    }
}