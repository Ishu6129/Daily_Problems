// Last updated: 17/02/2026, 23:32:09
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public void inorder(TreeNode node, List<Integer> arr) {
18        if (node == null) return;
19        inorder(node.left, arr);
20        arr.add(node.val);
21        inorder(node.right, arr);
22    }
23    public TreeNode build(List<Integer> arr, int l, int r) {
24        if (l > r) return null;
25        int mid = (l + r) / 2;
26        TreeNode node = new TreeNode(arr.get(mid));
27        node.left  = build(arr, l, mid - 1);
28        node.right = build(arr, mid + 1, r);
29        return node;
30    }
31    public TreeNode balanceBST(TreeNode root) {
32        List<Integer> arr = new ArrayList<>();
33        inorder(root, arr);
34        return build(arr, 0, arr.size() - 1);
35    }
36}