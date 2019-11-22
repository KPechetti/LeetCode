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
    public TreeNode sortedArrayToBST(int[] nums) {
     
        if(nums ==null || nums.length == 0) return null;
        return bst(0, nums.length-1, nums);
    }
    
    public TreeNode bst(int low, int high, int [] nums)
    {
        TreeNode root = null;
        if(low <= high) 
        {
            int mid = (low+high)/2;            
            root = new TreeNode(nums[mid]);            
            root.left = bst(low, mid-1, nums);
            root.right = bst(mid+1, high, nums);
        }
        
        return root;
    }
    
}
