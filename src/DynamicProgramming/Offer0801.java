package DynamicProgramming;

public class Offer0801 {
    //三步问题和跳台阶是一样的
    public int waysToStep(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        dp[4] = dp[1] + dp[3];
        // n = n-3 n-2 n-1 这三种方法跳上来的
        return 1;
}

}
