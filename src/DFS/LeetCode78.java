package DFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LeetCode78 {
    //子集

    public List<List<Integer>> subsets(int[] nums) {

        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>(); //用来表示栈的概念
        if (len == 0) {
            return res;
        }
        for (int i = 0; i < len + 1; i++) {
            Dfs(i,0,stack,nums,res);
        }
        return res;
    }

    private void Dfs(int depth,int start,Stack<Integer> path,int[] nums, List<List<Integer>> res) {

        if (path.size() == depth) {
           res.add(new ArrayList<>(path));
           return;
        }
        for (int i = start; i < nums.length; i++) {
                path.add(nums[i]);
                Dfs(depth ,i + 1,path,nums,res);
//                Dfs(depth ,start + 1,path,nums,res);
                path.pop();
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        LeetCode78 solution = new LeetCode78();
        List<List<Integer>> lists = solution.subsets(nums);
        System.out.println(lists);
    }
}
