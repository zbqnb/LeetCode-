package ArrayQAs;

public class LeetCode458 {
    /**
     * 给定一个二进制数组， 计算其中最大连续 1 的个数。
     * 输入：[1,1,0,0,1,1,1]
     * 输出：3
     * 解释：开头的两位和最后的三位都是连续 1 ，所以最大连续 1 的个数是 3.
     */
    //简单的滑动窗口
        public int findMaxConsecutiveOnes(int[] nums) {
            int res = 0;
            int fast = 0;
            int slow = 0;
            int l = nums.length;
            while (fast < l) {
                if (nums[fast] == 1) {
                    fast++;
                } else {
                    res = Math.max(fast - slow,res);
                    slow = fast;
                }
            }
            res = Math.max(fast - slow,res);
            return res;
    }
}
