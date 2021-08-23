package jianZhiOffer;

import java.util.Stack;

public class Solution20200801 {
    public static int InversePairs(int [] array) {
        if (array.length<=1)
            return -1;
        int count = 0   ;
        for (int j = 1; j<array.length; j++){
            for(int i = 0;i<j;i++){
                if (array[i]>array[j]){
                    count++;
                }
            }
        }
        return count%1000000007;
    }

    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,5,6,7,0};
        int result = InversePairs(array);
        System.out.println(result);
    }
}
