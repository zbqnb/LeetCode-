package DynamicProgramming;

import javax.sound.sampled.AudioFormat;
import java.util.ArrayList;
import java.util.List;

public class LeetCode198 {
    public int rob(int[] nums) {
    //
        //子问题是什么
        /*
         让你求 n 个房屋的
         子问题是 k个房屋
         k 个房屋是 k - 1     k - 2 + k
         f(k)

         */
        int len = nums.length;
        int[]dp = new int[len];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= len; i++) {
            dp[i] = Math.max(dp[i - 1],dp[i - 2] + nums[i - 1]);
        }
        String sb = "123";
        return dp[len];
    }
}
