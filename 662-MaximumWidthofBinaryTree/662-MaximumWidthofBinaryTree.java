// Last updated: 14/08/2025, 11:09:04
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

// width=end_id-start_idx+1

class Solution {
    class Pair{
        TreeNode node;
        int idx;
        public Pair(TreeNode node,int idx){
            this.node=node;
            this.idx=idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        int width=0;
        if (root != null) {
            q.add(new Pair(root,0));
        }
        while (!q.isEmpty()) {
            Pair start=q.peek();
            int s=q.size();
            Pair end=null;
            for(int i=0;i<s;i++){
                end=q.poll();
                if(end.node.left!=null){
                    q.add(new Pair(end.node.left,2*end.idx+1));
                }
                if(end.node.right!=null){
                    q.add(new Pair(end.node.right,2*end.idx+2));
                }
            }
            width=Math.max(width,end.idx-start.idx+1);
        }
        return width;
    }
}