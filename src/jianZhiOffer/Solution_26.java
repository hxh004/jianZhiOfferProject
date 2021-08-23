package jianZhiOffer;

public class Solution_26 {
      //判断B是否为A的子结构
      Boolean isSubStructure(TreeNode A,TreeNode B){
            return (A!=null&&B!=null)&&(recur(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B));
      }
      //判断B是否为A的同根结构
      Boolean recur(TreeNode A,TreeNode B){
          if (B==null) return true;
          if (A==null || A.val!=B.val) return false;
          return recur(A.left,B.left) && recur(A.right,B.left);
      }
}


