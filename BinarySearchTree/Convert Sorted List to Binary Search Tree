/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> ls = new ArrayList<>();
        if(head == null) return null;
        while(head!=null)
        {
            ls.add(head.val);
            head = head.next;
        }        
        return bst(0, ls.size()-1, ls);
    }
    
    public TreeNode bst(int low, int high, List<Integer> ls)
    {
        TreeNode root = null;
        if(low <= high)
        {
            int mid = (low+high)/2;
            root = new TreeNode(ls.get(mid));
            root.left = bst(low, mid-1, ls);
            root.right = bst(mid+1, high, ls);
        }
        return root;
    }
    
}
