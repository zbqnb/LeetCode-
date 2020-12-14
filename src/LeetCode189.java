public class LeetCode189 {
    public void rotate(int[] nums, int k) {
        //方法1拆分数组
        //
        for (int i = 0; i < k; i++) {
            for (int j = 1; j < nums.length - 1; j++) {
                nums[j] = nums[j - 1];
                nums[0] = nums[nums.length - 1];
            }
        }

    }
}
