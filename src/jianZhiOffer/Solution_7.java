package jianZhiOffer;


import java.util.HashMap;

public class Solution_7 {
    //给出二叉树的前序、中序遍历序列，构造出这棵树【无重复元素】
    int[] preorder;
    HashMap<Integer,Integer> dic = new HashMap<>();
    TreeNode buildTree(int[] preorder,int[] inorder){
        this.preorder = preorder;
        for (int i = 0 ;i<inorder.length;i++){
            dic.put(inorder[i],i);
        }
        return recur(0,0,inorder.length-1);
    }

    TreeNode recur(int root,int left,int right){
        if(left>right) return null;
        TreeNode node = new TreeNode(preorder[root]);
        int i  = dic.get(preorder[root]);
        node.left = recur(root + 1,left,i-1);
        node.right = recur(root + i -left+1,i+1,right);
        return node;
    }
}
