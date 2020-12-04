import java.util.Arrays;

/*
示例：

输入：nums = [-1,2,1,-4], target = 1
输出：2
解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。

双指针问题
 */
public class LeetCode16 {
    //双指针问题首先是什么！排序！
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

    int sum = 0;

        for (int i = 0; i < nums.length; i++) {

        int L = i + 1;
        int R = nums.length - 1;
        sum = nums[i] + nums[i] + nums[i];

        if(i > 0 && nums[i] == nums[i-1]) continue;

        while(L < R){
            if (sum < target){
                L++;
            } else if (sum == target){
                return sum;
            } else {
                R--;
            }
        }

    }
     return sum;
}
}
