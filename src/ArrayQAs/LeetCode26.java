package ArrayQAs;

public class LeetCode26 {
    /**
     * 26. 删除排序数组中的重复项
     * @param nums
     * @return
     */
    // 给定 nums = [0,1,1,1,1,2,2,3,3,4],
    //函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
    //你不需要考虑数组中超出新长度后面的元素。
    // 首先函数是以引用方式传递的，因此要对nums直接进行修改
    public int removeDuplicates(int[] nums) {
        int i = 0;  //慢指针
        int j = 1;  //快指针

        while (j < nums.length){
            if (nums[i] != nums[j]){
                nums[i + 1] = nums[j];
                i = j;
            }
            j++;
        }
        return i + 1;
        }
}

