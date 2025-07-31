// Last updated: 31/07/2025, 19:34:23
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
    
    class diapair{
        int dt=0;
        int ht=-1;
    }

    public diapair diameter(TreeNode root){
        if(root==null){
            return new diapair();
        }
        diapair ldp=diameter(root.left);
        diapair rdp=diameter(root.right);
        int sd=ldp.ht+rdp.ht+2;
        diapair sdp=new diapair();
        sdp.dt=Math.max(sd,Math.max(rdp.dt,ldp.dt));
        sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
        return sdp;

    } 
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dt;
    }
}