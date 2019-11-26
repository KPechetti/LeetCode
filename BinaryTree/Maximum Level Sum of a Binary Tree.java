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
    public int maxLevelSum(TreeNode root) {
        if(root == null) return 0;
        int level = 0, max = Integer.MIN_VALUE, levelCount = 0;        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty())
        {
            levelCount++;
            int size = q.size();
            int sum = 0;
            for(int i=0; i<size; i++)
            {
                TreeNode n = q.poll();                
                sum += n.val;
                if(n.left!=null)q.add(n.left);
                if(n.right!=null)q.add(n.right);
            }
            
            if(sum > max)
            {
                max = sum;
                level = levelCount;
            }
            
        }
        
        return level;
    }
}
