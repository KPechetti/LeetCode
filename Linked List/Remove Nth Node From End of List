/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    int count = 0; ListNode prev = null;
    public ListNode removeNthFromEnd(ListNode head, int n) {    
        if(head == null) return null;
        
        head.next = removeNthFromEnd(head.next, n);
        
        count++;
        if(count == n)
        {
            if(prev == null) return null;
            else return prev;
        }
        
        prev = head;
        
        return head;
        
    }
}
