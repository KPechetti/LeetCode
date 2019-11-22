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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        
        Stack<List<Integer>> st = new Stack<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        
        q.add(root);
        
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> ls = new ArrayList<>();
            
            while(size>0)
            {
                TreeNode node = q.poll();
                ls.add(node.val);
                
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
                size--;
                
            }
            
            st.push(ls);
            
        }
        
        while(!st.isEmpty())
            res.add(st.pop());
        
        
        return res;
    }
}
