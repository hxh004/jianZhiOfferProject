package jianZhiOffer;

public class Solution_27 {
    public TreeNode mirrorTree(TreeNode root){
        if (root == null)  return null;
        TreeNode tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);
        return root;
    }
}
