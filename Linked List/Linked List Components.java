/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
        
        int count = 0;  boolean broken = true;
        Set<Integer> st = new HashSet<>();
        for(int n: G) st.add(n);
        
        while(head!=null)
        {
           if(broken && st.contains(head.val))
           {               
               count++;
               broken = false;
               
           }               
           else if(!st.contains(head.val))
            {
                broken = true;
            }
            else
            {
                broken = false;
            }       
            
            head = head.next;
        }
        
        return count;
        
    }
}
