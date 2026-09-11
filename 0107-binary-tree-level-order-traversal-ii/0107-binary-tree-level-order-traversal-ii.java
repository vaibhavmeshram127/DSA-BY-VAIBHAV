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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return ans;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> soln=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode current=queue.poll();
                soln.add(current.val);
                if(current.left!=null){
                    queue.offer(current.left);

                }
                if(current.right!=null){
                    queue.offer(current.right);
                }


            }
            ans.add(0,soln);
        }
        return ans;
    }
}