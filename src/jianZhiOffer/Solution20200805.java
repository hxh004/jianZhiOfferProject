package jianZhiOffer;

import java.util.*;

public class Solution20200805 {
    public static void main(String[] args) {
        int[] array = new int[]{2,4,3,6,3,2,5,5};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        //MyFindNumsAppearOnce(array,num1,num2);
        //FindNumsAppearOnce(array,num1,num2);
        FindNumsAppearOnceNiuKe(array,num1,num2);
        System.out.println(num1[0]+","+num2[0]);
    }

    /*
    * 自己写的 性能最差的，最暴力的
    * */
    public static void MyFindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<array.length;i++){
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }else{
                map.replace(array[i],2);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (Integer getKey: map.keySet()){
            Integer value = map.get(getKey);
            if (value.equals(1)){
                list.add(getKey);
            }
        }
        num1[0] = list.get(0);
        num2[0] = list.get(1);
    }
    /*
    * 徐公码字解法
    * */

        public static void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
            if(array==null || array.length<2)
                return;
            int resultExclusiveOR=0;
            for(int i=0;i<array.length;i++)
                resultExclusiveOR^=array[i];

            int indexOf1=0;
            while(((resultExclusiveOR&1)==0) && (indexOf1<=4*8)){
                resultExclusiveOR=resultExclusiveOR>>1;  //只有n>>1不完整，要n=n>>1
                indexOf1++;
            }

            num1[0]=0;
            num2[0]=0;
            for(int i=0;i<array.length;i++){
                if(((array[i]>>indexOf1)&1)==1)
                    num1[0]^=array[i];
                else
                    num2[0]^=array[i];
            }
        }

        /*
        * 牛客上的解答
        * */
        public static void FindNumsAppearOnceNiuKe(int[] array, int num1[], int num2[]) {
            int xor1 = 0;
            for(int i=0; i < array.length; i++)
                xor1 = xor1^array[i];
            //在xor1中找到第一个不同的位对数据进行分类，分类为两个队列对数据进行异或求和找到我们想要的结果
            int index = 1;
            while((index & xor1)==0)  //hxh:这里其实是二进制的计算，按位与，当某一位数是1时，说明那一位是那个两个数字不同的，那么就求出第一个为1(即第一个不同的位数)，
                index = index <<1;//因为可能有多个位为1所以需要求一下位置
            int result1 = 0;
            int result2 = 0;
            for(int i=0; i < array.length; i++){  //这里根据那一位是否是1区分成两组，然后每一组各自异或，就能每组求出一个结果；
                if((index & array[i]) == 0)
                    result1 = result1^array[i];
                else
                    result2 = result2^array[i];
            }
            num1[0] = result1;
            num2[0] = result2;
        }

}
