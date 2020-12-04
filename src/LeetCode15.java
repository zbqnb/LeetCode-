import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 

示例：

给定数组 nums = [-1, 0, 1, 2, -1, -4]，

满足要求的三元组集合为：
[
  [-1, 0, 1],
  [-1, -1, 2]
]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/3sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode15 {
    //首先的思路是把两个数字的和取出来和第三个相加,看完题解之后才知道这样时间复杂度就会变成
    // N3，空间复杂度也会变成o（N）；
    //因此选择二分法？双指针，双指针的前提是什么呢？排序！


        public List<List<Integer>> threeSum(int[] nums) {

            List<List<Integer>> lists = new ArrayList<>();
            Arrays.sort(nums);



            for (int i = 0; i < nums.length; i++) {

                if(nums[i] > 0) return lists;//这里是数组已经排序完了，假如再排序的话
                //第一位已经大于0的话之后的数字不可能有相加为0的情况，因此直接返回，顺便解决了范例
                //{0,0,0,0}

                if(i > 0 && nums[i] == nums[i-1]) continue;
                //这里是处理重复的数字

                int L = i + 1;
                int R = nums.length - 1 ;

                while (L < R){
                  if(nums[L] + nums[R] + nums[i] == 0){
                      ArrayList<Integer> ans = new ArrayList<>();
                      ans.add(nums[L]);
                      ans.add(nums[R]);
                      ans.add(nums[i]);
                      lists.add(ans);
                      while(L < R && nums[L+1] == nums[L]) ++L;
                      while (L < R && nums[R-1] == nums[R]) --R;
                      ++L;
                      --R;

                  } else if (nums[L] + nums[R] + nums[i] < 0){
                      L++;
                  } else {
                      R--;
                  }
                }
            }
            return lists;
            }
        }


