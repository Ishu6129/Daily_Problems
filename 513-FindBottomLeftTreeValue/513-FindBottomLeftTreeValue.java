// Last updated: 09/08/2025, 23:43:10
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
    int max=0;
    int[] elem={0};
    public int findBottomLeftValue(TreeNode root) {
        leftelem(root,1);
        return elem[0];
    }
    public void leftelem(TreeNode root,int cl){
        if(root==null){
            return;
        }
        if(max<cl){
            elem[0]=root.val;
            max=cl;
        }
        leftelem(root.left,cl+1);
        leftelem(root.right,cl+1);
    }
}