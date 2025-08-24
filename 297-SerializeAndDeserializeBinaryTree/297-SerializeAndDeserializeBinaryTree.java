// Last updated: 24/08/2025, 22:48:54
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder str=new StringBuilder();
        build(root,str);
        return str.toString();
    }
    public void build(TreeNode root,StringBuilder str){
        if(root==null){
            str.append("null,");
            return;
        }
        str.append(root.val+",");
        build(root.left,str);
        build(root.right,str);
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==null || data.isEmpty()){
            return null;
        }
        String[] str=data.split(",");
        return rebuild(str);

    }
    int idx=0;
     public TreeNode rebuild(String[] str){
        if(idx>=str.length){
            return null;
        }
        String s=str[idx++];
        if(s.equals("null")){
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(s));
        node.left=rebuild(str);
        node.right=rebuild(str);
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();       
// TreeNode ans = deser.deserialize(ser.serialize(root));