/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {    
    
    ListNode dummy = null, even = null;
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null) return head;
        if(dummy == null) 
        {
            dummy = head.next;
            even = dummy;
        }
        else
        {
            dummy.next = head.next;     
            dummy = dummy.next;            
        }
        
        head.next = (head.next !=null && head.next.next != null) ? oddEvenList(head.next.next) : even;
        
        return head;
    }
}
