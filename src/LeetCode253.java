/*
输入: [3,4,5,1,2]
输出: 1
示例 2:

输入: [4,5,6,7,0,1,2]
输出: 0


 */



public class LeetCode253 {
    public int findMin(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]) {
                return nums[i];
            }
        }
        return nums[0];
    }//这是暴力解法，题目要求用二分法查找，但是测试用时0ms，内存消耗大目前不知道什么意思


    public int findMin2(int[] nums) {//二分法，时间是多少？N（logN）
        int left = 0;
        int right = nums.length;

        while (left < right){

            int middle = (right + left)/2;

            if (nums[middle] < nums[right]){
                // middle可能是最小值
                right = middle;
            } else {
                // middle肯定不是最小值
                left = middle + 1 ;
            }
        }
    return nums[left];
    }
}





