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
    public int findBottomLeftValue(TreeNode root) {
        int value = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);        
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i =0; i<size; i++)
            {                
                TreeNode node = q.poll();
                if(i ==0) value = node.val;                
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }            
        }
        
        return value;
}
    
}
