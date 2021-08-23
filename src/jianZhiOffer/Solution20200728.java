package jianZhiOffer;

public class Solution20200728 {
    public static int FindGreatestSumOfSubArray(int[] array) {
        //从第一个元素开始，计算他后面到最后一个元素的和
        int max = array[0];
        //定义一个最大值，初始将第一个元素赋值给他，并且将计算出来的每个和都与其比较，并将其中较大的值放大那个存储元素中
        for (int i = 0;i < array.length-1 ;i++){
            int sum = array[i]; //定义一个数字用来存储和
            max = getMax(max,sum);
            for (int j = i+1;j<array.length;j++){
                sum+=array[j];
                max = getMax(max,sum);
            }
        }
        return max;
    }
    public static int getMax(int x,int y){
        if (x>=y){
            return x;
        }else {
            return y;
        }
    }
    public static void main(String[] args){
        int[] array = new int[]{2,8,1,5,9};
        int result = FindGreatestSumOfSubArray(array);
        System.out.println(result);
    }

}
