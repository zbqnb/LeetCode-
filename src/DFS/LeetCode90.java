package DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode90 {

        public List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(nums); //排序
            getAns(nums, 0, new ArrayList<>(), ans);
            return ans;
        }

        private void getAns(int[] nums, int start, ArrayList<Integer> temp, List<List<Integer>> ans) {
            ans.add(new ArrayList<>(temp));
            for (int i = start; i < nums.length; i++) {
                //和上个数字相等就跳过
                // [[], [1], [1, 2], [1, 2, 5], [1, 5], [2], [2, 5], [5]]
                if (i > start && nums[i] == nums[i - 1]) {
                    continue;
                }
                // [[], [1], [1, 2], [1, 2, 2], [1, 2, 2, 5], [1, 2, 5], [1, 5], [2], [2, 2], [2, 2, 5], [2, 5], [5]]
//                if (i > start && nums[i] == nums[i - 1]) {
//                    continue;
//                }
                temp.add(nums[i]);
                getAns(nums, i + 1, temp, ans);
                temp.remove(temp.size() - 1);
            }
        }
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        LeetCode90 solution = new LeetCode90();
        List<List<Integer>> lists = solution.subsetsWithDup(nums);
        System.out.println(lists);
    }
}
