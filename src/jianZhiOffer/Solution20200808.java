package jianZhiOffer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution20200808 {
    public static void main(String[] args) {
        int[] numbers = new int[]{2,4,2,1,4};
        int[] duplication = new int[1];
        //boolean result = duplicate(numbers,5,duplication);
        boolean result2 = duplicate(numbers,5,duplication);
        System.out.println(result2+","+duplication[0]);
    }
    public static boolean duplicate(int numbers[], int length, int[] duplication) {
        //先最简单的暴力法，将所有数字都放到map中，如果不包含，就放进去，如果包含，就返回
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < length ; i++){
            if(!map.containsKey(numbers[i])){
                map.put(numbers[i],1);
            }else{
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
    //法二
    //对数组进行排序，然后判断
    public static boolean duplicateTwo(int numbers[], int length, int[] duplication){
        if (numbers==null||length<=0){
            return false;
        }
        Arrays.sort(numbers);
        for (int i = 0; i<length;i++){
            if (numbers[i]==numbers[i+1]){
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
}
