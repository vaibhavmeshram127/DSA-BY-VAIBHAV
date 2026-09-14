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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return true;
        }
        queue.offer(root);
        boolean isNull=false;
        while(!queue.isEmpty()){
            TreeNode current=queue.poll();
            if(current==null){
                isNull=true;
            }else{
                if(isNull){
                    return false;
                }else{
                    queue.offer(current.left);
                    queue.offer(current.right);
                }
            }
        }
        return true;
        

        
    }
}