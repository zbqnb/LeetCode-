public class LeetCode704 {
    //二分查找
    public int search(int[] nums, int target) {

        int len = nums.length;
        int mid = len / 2;

        while (true) {
            if (nums[mid] > target) {
                mid += mid/2;
            }
            if (nums[mid] < target) {
                mid -= mid/2;
            }
            if (nums[mid] == target) {
                return mid;
            }
            return -1;
        }
    }
}
