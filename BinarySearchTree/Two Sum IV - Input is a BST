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
    public boolean findTarget(TreeNode root, int k) {
        
        List<Integer> res = new ArrayList<>();        
        dfs(root, res);       
        
        int i =0 , j = res.size()-1;
        while(i<j)
        {
            int sum =res.get(i)+ res.get(j);
            if(sum == k)
                return true;
            else if(sum > k)
                j--;
            else
                i++;
        }
        return false;
    }
    
    public void dfs(TreeNode root, List<Integer> res)
    {
        if(root == null) return;
        
        dfs(root.left, res);
        res.add(root.val);
        dfs(root.right, res);
    }
}
