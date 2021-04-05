package DFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;


public class LeetCode46 {

    public List<List<Integer>> permute(int[] nums) {
        //全排序
        //回溯是在递归前后做同样的事
        //比如 Dfs（a）

        int length = nums.length;
        int level = 0; //当前所处的层数 比如【1，2】就是第二层

        List<List<Integer>> res = new ArrayList<>();
        boolean[] usedTable = new boolean[length];
        List<Integer> path = new ArrayList<>();
        bfs(res,0,path,usedTable,length,nums);
        return res;
    }

    private void bfs( List<List<Integer>> res,int level,List<Integer> path,boolean[] usedTable,int length,int[] nums) {
        if (level == length) {
            res.add(new ArrayList<>(path));
            return ;
        }
        //这里大问题，错将
        for (int i = 0; i < length; i++) {
            if (!usedTable[i]) {
                path.add(nums[i]);
                usedTable[i] = true;
                bfs(res,level + 1,path,usedTable,length,nums);
                usedTable[i] = false;
                path.remove(path.size() - 1);
            }
            // 问题在这里，错将递归和回溯放在if条件外面，导致很多的for循环都调用了一次回溯，而不是在条件下的回溯
        }
    }
    //
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        LeetCode46 solution = new LeetCode46();
        List<List<Integer>> lists = solution.permute(nums);
        System.out.println(lists);
    }
}
