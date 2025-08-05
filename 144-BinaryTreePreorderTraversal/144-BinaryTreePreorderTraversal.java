// Last updated: 06/08/2025, 01:42:19
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
    public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> ll=new ArrayList<>();
        traverse(root,ll);
        return ll;

    }

    public void traverse(TreeNode nn,List<Integer> ll){
        
        if(nn==null) return;

        ll.add(nn.val);
        traverse(nn.left,ll);
        traverse(nn.right,ll);

    }
}