/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {     
    public ListNode swapPairs(ListNode head) {        
        if(head == null || head.next == null) return head;     
        ListNode temp = head.next.next;
        head.next.next  = head; 
        ListNode res = head.next;
        head.next = swapPairs(temp);        
        return res;
    }
}
