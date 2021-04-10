public class LeetCode81 {
    //数组被截断再拼接的2分搜索
    public boolean search(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return false;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;

            if (nums[mid] == target) {
                return true;
            }
            if (nums[left] == nums[mid]) {
                left++;
                continue;
            }
            //前半部分有序
            if (nums[mid] > nums[left]) {
                if (target < nums[mid] && target>=nums[left]){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid]  && target <= nums[right]){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
                //如果 {1,1,1,1,1，0，1,1,1}
            // [2,5,6,0,0,1,2]
            // left == mid
            // left < mid
        }
        return false;
    }
}
