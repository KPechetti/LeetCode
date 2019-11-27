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
    public boolean isBalanced(TreeNode root) {        
        if(root == null) return true;        
        if(!isBalanced(root.left)) return false;
        int left = height(root.left);         
        int right = height(root.right);
        if(!isBalanced(root.right)) return false;
        return Math.abs(left-right) <= 1;        
    }
    
    
    public int height(TreeNode root)
    {
        if(root == null) return 0;
        
        int left  = height(root.left);
        int right  = height(root.right);
        
        return Math.max(left, right)+1;
        
    }
}
