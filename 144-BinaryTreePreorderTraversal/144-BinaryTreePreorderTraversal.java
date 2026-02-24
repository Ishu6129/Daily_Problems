// Last updated: 24/02/2026, 11:55:35
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
class Solution {List<Integer> list= new ArrayList <>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root==null){
            return list;
            } 
               list.add(root.val);
                preorderTraversal( root.left); 
                 preorderTraversal( root.right); 
        return list;
    }
}