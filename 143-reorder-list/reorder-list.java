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
    ListNode reverse(ListNode head)
    {
        
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null)
        {
        ListNode next = curr.next;
        curr.next = prev;
        prev=curr;
        curr = next;
        
        }
        return prev;


    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prevslow=null;
        if(head==null||head.next ==null)
        {
            return;
        }
        while(fast!=null  && fast.next!=null)
        {
            
            slow = slow.next;
            fast = fast.next.next;


        }

        
        ListNode secondstart= slow.next;
        slow.next=null;
        
        
        ListNode first = head;
        ListNode second = reverse(secondstart);

        while(first!=null&&second!=null)
        {
            ListNode temp1=null;
             ListNode temp2=null ;
        
            temp1 = first.next;
            temp2= second.next;
           
            first.next = second;
            second.next = temp1;
            first= temp1;
            second = temp2;


        }
        
        

        
        
    }
}