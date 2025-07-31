// Last updated: 31/07/2025, 19:34:21
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        rightside(root,1,l);
        return l;
    }
    int mxd=0;
    public void rightside(TreeNode root,int cl,List<Integer> l){
        if(root==null){
            return;
        }
        if(mxd<cl){
            l.add(root.val);
            mxd=cl;
        }
        rightside(root.right,cl+1,l);
        rightside(root.left,cl+1,l);
    }
}