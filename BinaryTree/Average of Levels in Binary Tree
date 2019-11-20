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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> avg = new ArrayList<>();
        if(root == null) return avg;
        Queue<TreeNode> q = new LinkedList<>();        
        q.add(root);
        
        while(!q.isEmpty())
        {
            int size = q.size();
            long sum = 0;
            for(int i = 0; i<size; i++)
            {
                TreeNode node = q.poll();                
                sum += node.val;                
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
            
            avg.add((double)sum/size);
        }
        
        return avg;
    }
}
