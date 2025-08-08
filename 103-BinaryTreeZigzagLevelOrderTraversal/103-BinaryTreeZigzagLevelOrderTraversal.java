// Last updated: 08/08/2025, 23:12:54
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        boolean order=false;
        if (root != null) {
            q.add(root);
        }
        
        while (!q.isEmpty()) {
            int lsize = q.size();
            List<Integer> arr = new ArrayList<>();
            
            int count = 0;
            while (count < lsize) {
                TreeNode n = q.poll();
                arr.add(n.val);

                if (n.left != null) {
                    q.add(n.left);
                }
                if (n.right != null) {
                    q.add(n.right);
                }
                count++;
            }
            if (order) {
            Collections.reverse(arr);
            }
            ll.add(arr);
            order=!order;
        }
        
        return ll;
    }
}