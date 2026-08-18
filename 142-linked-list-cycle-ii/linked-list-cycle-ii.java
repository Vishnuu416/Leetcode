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
       
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast =head;
        if(head==null)
        {
                return null;
        }
        
        while(fast!=null && fast.next !=null )
        {
            slow=slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                ListNode tempo = head;
                while(tempo!=slow)
                {
                    tempo = tempo.next;
                    slow=slow.next;
                }
                return tempo;
            }
            
        }
        return null;
        
    }
}