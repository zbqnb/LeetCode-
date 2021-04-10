public class LeetCode88 {
    //合并两个有序数组
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p = m - n; // 指向数组1最后一个不是0的位置的
        int cur = m;
        int q = n; // 指向数组2的最后
        // [1,2,3,0,0,0]
        // temp = 2
        // [1,2,2,0,0,0]
        // temp = 3

        while (q > 0) {
            if (nums1[p] > nums2[q]) {
                nums1[cur] = nums1[p];
                cur--;
                p--;
            } else {
                nums1[cur] = nums2[q];
                q--;
                cur--;
            }
        }
    }


}
