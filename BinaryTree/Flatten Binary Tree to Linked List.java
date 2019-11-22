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
    public void flatten(TreeNode root) {
        
        if(root == null) return;
        if(root.left == null && root.right == null) return;        
        if(root.left!=null)
        {
            flatten(root.left);            
            TreeNode tempRight = root.right;
            root.right = root.left;
            root.left = null;
            while(root.right!=null)
                root = root.right;            
            root.right = tempRight;            
        }        
        flatten(root.right);
        
    }
}
