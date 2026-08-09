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
     private ListNode reverseLinkedList(ListNode head) 
    {
            ListNode prev = null;
            ListNode current = head;

            while (current != null) {
             ListNode next = current.next;
             current.next = prev;
             prev = current;
                current = next;
        }

        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
       
        ListNode newhead = reverseLinkedList(slow);
        ListNode first = head;
        ListNode second = newhead;
        while(second!=null)
        {
            if(first.val!=second.val)
            {
                return false;
            }
            first = first.next;
            second = second.next;

        }
        reverseLinkedList(newhead);
        return true;
    

       
        
    }
}