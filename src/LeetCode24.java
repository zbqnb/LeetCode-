public class LeetCode24 {
    //

    /**
     * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     *
     */
    public int removeDuplicates(int[] nums) {
        //没过的原因是要对输入的数组去掉重复项！
        //[0,0,1,1,1,2,2,3,3,4]
        // i j
        //   i j
        //     i

        // [1,1,2]
        //  i j
        //    i j
        int length = 1;
        int i = 0;
        int j = 1;
        while (i < nums.length) {
            if (nums[i] == nums[j]) {
                j = j + 1;
            } else {
                length++;
                j = i + 1;
            }
            i++;
        }
        return length;
    }
    public int removeDuplicates2(int[] nums) {
        //[0,0,1,1,1,2,2,3,3,4]
        if (nums == null || nums.length ==0) {
            return 0;
        }
        int l = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[l++] = nums[i+1];
            }
        }
        return l + 1;
        /*
            if(nums == null || nums.length ==0) return 0;
        int y = 1;
        for(int i=0; i< nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                nums[y++] = nums[i+1];
            }
        }
        return y;
    }
         */
    }


    //
    public static void main(String[] args) {
        LeetCode24 test = new LeetCode24();
        int[] array = {1,1,2};
        System.out.println( test.removeDuplicates2(array));
    }
}
