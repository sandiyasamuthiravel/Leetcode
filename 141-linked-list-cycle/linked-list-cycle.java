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
    public boolean hasCycle(ListNode head) {
        ListNode low=head;
        ListNode high=head;
        while(high!=null&&high.next!=null)
        {
            low=low.next;
            high=high.next.next;
            if(high==low)
            {
                return true;
            }
        }
        return false; 
    }
}