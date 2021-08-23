package jianZhiOffer;

public class Solution_10_1 {
    public static void main(String[] args) {
        //System.out.println(fib(10));
        System.out.println(numWays(2));
    }
     static int fib(int n) {
        int result;
        if(n==1|n==2) result = 1;
        else {result = fib(n-1) + fib(n-2);}
        return result;
    }
    public static int numWays(int n) {
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[n]=dp[n-1]+dp[n-2];

        }
        return dp[n];
    }
}
