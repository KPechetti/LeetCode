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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ls = new ArrayList<>();
        inorder(root,ls,k);
        return ls.get(k-1);
    }
    
    public void inorder(TreeNode root, List<Integer> ls, int k)
    {
        if(root == null || ls.size() > k)
            return;
        
        inorder(root.left, ls,k);
        ls.add(root.val);
        inorder(root.right, ls,k);        
    }
}
