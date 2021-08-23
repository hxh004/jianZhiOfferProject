package test;

import java.util.Vector;

public class TestFBLQ {
   /* public static void main(String[] args) {
        System.out.println(fib(7));
    }
    static int fib(int N){
        if(N<1) return 0;
        //备忘录全初始化为0
        Vector<Integer> memo(N + 1,0) = new Vector<Integer>();
        //初始化最简情况
        return helper(memo,N);
    }

    static int helper(Vector<int> memo, int n){
        if (n==1 || n==2) return  1;
        if (memo[n]!=0) return  memo[n];
        memo[n] = helper(memo,n-1)+helper(memo,n-2);
        return  memo[n];
    }*/
}
