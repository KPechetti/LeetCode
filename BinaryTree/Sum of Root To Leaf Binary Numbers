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
    public int sumRootToLeaf(TreeNode root) {
        int parent =0;
        return dfs(root, parent);
    }
    
    
    public int dfs(TreeNode root, int parent)
    {
        if(root == null) return 0;        
        parent = 2 * parent + root.val;        
        if(root.left == null && root.right == null) return parent;
        return dfs(root.left, parent) + dfs(root.right, parent);
        
    }
}
