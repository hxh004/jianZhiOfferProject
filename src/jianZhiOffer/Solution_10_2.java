package jianZhiOffer;

public class Solution_10_2 {
    public static void main(String[] args) {
        System.out.println(numWays(100));
    }
    public static int numWays(int n) {
        if(n==0 |n==1) return 1;
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
            dp[i]=dp[i]%1000000007;
        }
        return dp[n];
    }
}
