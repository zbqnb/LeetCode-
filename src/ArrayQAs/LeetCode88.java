package ArrayQAs;

public class LeetCode88 {

  // 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3

    // 输入：nums1 = [1,2,3,0,0,6], m = 3, nums2 = [2,2,6], n = 3
  // 输出：[1,2,2,3,5,6]
  public void Merge(int[] nums1, int m, int[] nums2, int n) {

      int i = m; // num1的可操作地方
      int j = n;// 控制
      int p = nums1.length - 1;// nums1的结尾


      while (j> 0){
          if (nums1[i--] <= nums2[j]) {
              nums1[p] = nums2[j];
              j--;
          }
          nums1[i] = nums1[p];
          j--;
      }
}

}
