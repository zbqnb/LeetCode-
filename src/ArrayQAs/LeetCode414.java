package ArrayQAs;
//第三大的数
/**
 * 输入：[3, 2, 1]
 * 输出：1

 * 输入：[1, 2]
 * 输出：2

 * 输入：[2, 2, 3, 1]
 * 输出：1

 */
public class LeetCode414 {
    public int thirdMax(int[] nums) {
        //hashmap <nums , 次数 >
        //不需要次数，只需要简单的O1过一次数组
       // [1st,2rd,3st]
        // [1st,i,2rd]
        int[] res = new int[3];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > res[2]){
                res[2] = nums[i];
                if (nums[i] > res[1]){
                    res[2] = nums[1];
                    res[1] = nums[i];
                    if (nums[i] > res[0]){
                        res[1] = res[0];
                        res[0] = nums[i];
                    }
                }
            }
        }
        return res[2];
    }
}
