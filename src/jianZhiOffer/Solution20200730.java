package jianZhiOffer;

import java.util.*;

public class Solution20200730 {
    public static String PrintMinNumber(int[] numbers) {
        if (numbers.length==0)
            return null;
        ArrayList<String> list = new ArrayList<>();
        //将数组中的数组添加进list中
        for (int num:numbers){
            list.add(String.valueOf(num));
        }
        //并且调用Collection的sort方法，对list进行排序，并且定义排序规则
        Collections.sort(list,new Comparator<String>(){
            @Override
            public int compare(String s1,String s2){
                String a=s1+s2;
                String b=s2+s1;
                return a.compareTo(b);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String str:list){
            sb.append(str);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        int[] array = new int[]{1,45,87,23,44,65};
        String result = PrintMinNumber(array);
        System.out.println(result);
    }
}
