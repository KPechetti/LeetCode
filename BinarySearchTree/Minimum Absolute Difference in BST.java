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
    int min = Integer.MAX_VALUE, prev = -1;
    public int getMinimumDifference(TreeNode root) {
        
        if(root == null)  return 0;
        
        getMinimumDifference(root.left);
        
        if(prev == -1) 
        {
            prev = root.val;
        }
        else
        {
            if(min > Math.abs(prev - root.val))
                min = Math.abs(prev - root.val);
            prev = root.val;
        }
        
        getMinimumDifference(root.right);
        
        return min;
    }
}
