package DynamicProgramming;

public class LeetCodeSwordOffer42 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int dp[] = new int[nums.length + 1];
        // base case
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
           if (dp[i - 1] > 0) {
               dp[i] = dp[i - 1] + nums[i];
           } else {
               dp[i] = nums[i];
           }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }
}
