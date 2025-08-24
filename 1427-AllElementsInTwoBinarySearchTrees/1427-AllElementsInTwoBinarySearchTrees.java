// Last updated: 24/08/2025, 22:48:00
class Solution {
    List<Integer> list = new ArrayList<>();
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        inorder(root1);
        inorder(root2);
        Collections.sort(list);
        return list;
    }
    
    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}
