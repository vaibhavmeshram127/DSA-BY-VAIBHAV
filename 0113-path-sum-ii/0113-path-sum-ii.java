/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> soln=new ArrayList<>();
        helper(root,targetSum,ans,soln);
        return ans;

        
    }
    public void helper(TreeNode root,int targetSum,List<List<Integer>> ans,List<Integer> soln)
{
    if(root==null){
        return;
    }
    soln.add(root.val);
    if(root.left==null && root.right==null && targetSum-root.val==0){
        ans.add(new ArrayList<>(soln));
       
        
    }
    
   
    helper(root.left,targetSum-root.val,ans,soln);
    

    helper(root.right,targetSum-root.val,ans,soln);
    soln.remove(soln.size()-1);
    return;
    
    

}

}