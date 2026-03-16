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
    public boolean isPalindrome(ListNode head) {
          if(head==null||head.next==null)
        {
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        } 
         ListNode first=head;
          ListNode second=reverse(slow.next);
        while(second!=null)
        {
            if(first.val!=second.val)
            { 
                //  reverse(second);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        // reverse(second);
        return true;
    }
    public  ListNode reverse (ListNode node)
    {    
        if(node==null||node.next==null)
        {
            return node;
        }
        ListNode temp=node;
         ListNode dummy=null;
          while(temp!=null)
          {
           ListNode next=temp.next;
            temp.next=dummy;
            dummy=temp;
            temp=next;
          }
          return dummy;
    }
}