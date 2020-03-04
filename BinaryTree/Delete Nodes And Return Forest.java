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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> remaining = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        for(int i: to_delete)
        {
            set.add(i);
        }
        
        removeNodes(root, remaining, set);
        
        if(!set.contains(root.val)) remaining.add(root);
        
        return remaining;
    }
    
    public TreeNode removeNodes(TreeNode root, List<TreeNode> remaining, Set<Integer> set)
    {
        if(root == null) return null;
        
        root.left = removeNodes(root.left, remaining, set);
        root.right = removeNodes(root.right, remaining, set);
        
        if(set.contains(root.val))
        {
            if(root.left != null) remaining.add(root.left);
            if(root.right != null) remaining.add(root.right);            
            return null;
        }
        
        return root;
    }
}
