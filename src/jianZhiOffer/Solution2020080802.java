package jianZhiOffer;

public class Solution2020080802 {
    public static void main(String[] args) {
        int[] A = new int[]{1,2,3,4,5};
        int[] B = multiply(A);
        for (int i:B){
            System.out.println(i);
        }
    }
    public static int[] multiply(int[] A) {
        int[] B = new int[A.length];
        for(int i=0;i<B.length;i++){
            int result = 1;//用来存储结果
            for(int j=0;j<A.length;j++){
                if(i==j){
                    result = result*1;
                }else {
                    result = result*A[j];
                }

            }
            B[i] = result;
        }
        return B;
    }
}
