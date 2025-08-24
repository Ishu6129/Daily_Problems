// Last updated: 24/08/2025, 22:49:24
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
    List<List<Integer>> ll=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        printRootToLeaf(root,targetSum,0,new ArrayList<Integer>());
        return ll;
    }
    public void printRootToLeaf(TreeNode root,int targetSum,int sum,List<Integer> arr){
        if(root==null) return;
        sum+=root.val;
		arr.add(root.val);
        if(root.left==null && root.right==null) {
			if(sum==targetSum){
				ll.add(new ArrayList<>(arr));
			}
		}
        printRootToLeaf(root.left,targetSum,sum,arr);
        printRootToLeaf(root.right,targetSum,sum,arr);
        arr.remove(arr.size() - 1);
    }
}