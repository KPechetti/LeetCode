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
    int min = Integer.MAX_VALUE, prev = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        
        if(root == null) return 0;
        
        minDiffInBST(root.left);
        
        if(prev == Integer.MAX_VALUE) prev = root.val;
        else 
        {
            if(min > Math.abs(prev - root.val)) 
                min = Math.abs(prev-root.val);
            prev= root.val;
        }
        minDiffInBST(root.right);
        
        return min;       
        
    }
}
