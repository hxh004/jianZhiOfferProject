package jianZhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_32_1 {
    public int[] levelOrder(TreeNode root){
        //1.判空
        if (root == null) return  new int[0];
        //2.初始化
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        queue.add(root);
        //3.循环
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            ans.add(node.val);
            if (node.left!=null)  queue.add(node.left);
            if (node.right!=null)  queue.add(node.right);
        }
        //4.循环放到数组里面去
        int[] res = new int[ans.size()];
        for (int i = 0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}
