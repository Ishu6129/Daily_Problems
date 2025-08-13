// Last updated: 13/08/2025, 11:29:15
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

 // 1 camera setup
 // -1 camera ki need h
 // 0 camera ki need nahi h
class Solution {
    private int count=0;
    public int minCameraCover(TreeNode root) {
        int c=camera(root);
        if(c==-1) count++;
        return count;
    }
    public int camera(TreeNode root){
        if(root==null) return 0;
        int left=camera(root.left);
        int right=camera(root.right);
        if(left==-1 ||right==-1) {
            count++;
            return 1;// cmaera ki setup kerna h
        }
        else if(left==1||right==1) return 0;  // camera kisi ek ke paas ya  ek covered h
        return -1; // camera ki need h
    }
}