package DFS;

import java.util.*;

public class leetCode0804 {
    //幂集
    public List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new LinkedList<>();
        ArrayList<Integer> path = new ArrayList<>();

        if (len == 0) {
            return res;
        }
        Dfs(res,path,0,len,nums);
        return res;

    }
    private void Dfs(List<List<Integer>> res,ArrayList<Integer> path,int start,int len,int[] nums) {
        res.add(new ArrayList<>(path));

        for (int i = start; i < len - 1; i++) {
            path.add(nums[i]);
            Dfs(res,path,start + 1,len,nums);
            path.remove(path.size() - 1);
        }
    }

}
