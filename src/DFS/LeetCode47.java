package DFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LeetCode47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        //返回一个
        //剪枝
    List<List<Integer>> res = new ArrayList<>();
    int len = nums.length;
    Deque<Integer> path = new ArrayDeque<>(len);
    int depth = 0;
    boolean [] used = new boolean[len];
    Dfs(len,0,nums,res,path,used);
    return res;
    }
    private void Dfs(int length,int depth,int[] nums,List<List<Integer>> res, Deque<Integer> path,boolean[]used) {
        if (depth == length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < length; i++) {
            if (used[i]) {
                continue;
            }

            // 剪枝条件：i > 0 是为了保证 nums[i - 1] 有意义
            // 写 !used[i - 1] 是因为 nums[i - 1] 在深度优先遍历的过程中刚刚被撤销选择
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                Dfs(length,depth+1,nums,res,path,used);
                used[i] = false;
                path.removeLast();
            }
        }
    }

}
