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
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<postorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
        
        
    }
    public TreeNode helper(int[] inorder,int inFi,int inLi,int[] postorder,int pFi,int pLi,HashMap<Integer,Integer> map){
        if(inFi>inLi || pFi>pLi){
            return null;
        }
        TreeNode root=new TreeNode(postorder[pLi]);
        int index=map.get(postorder[pLi]);
        int left=index-inFi;

        root.left=helper(inorder,inFi,index-1,postorder,pFi,pFi+left-1,map);
        root.right=helper(inorder,index+1,inLi,postorder,pFi+left,pLi-1,map);
        return root;
    

    }
}