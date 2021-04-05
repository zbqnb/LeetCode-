package DFS;

import java.nio.file.Path;
import java.security.PrivateKey;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LeetCode77 {
    //给定两个整数n和k，返回组合
    //阶层 4 * 3  / 2 * 1 = 6
    //
    int n = 0;
    int k = 0;
    List<List<Integer>> res = new ArrayList<>();
    boolean[] used = new boolean[n];

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.res = res;
        this.used = used;
        int depth = k;
        Deque<Integer> path = new ArrayDeque<>(depth);
//        Dfs(0,);
        return res;
    }
    //剪枝
    //可以选的
    //当前的搜索起点
    //
    private void Dfs(int depth, Deque<Integer> path) {
        if (depth == k) {
            res.add(new ArrayList<>(path));
        }
        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                path.add(i);
                used[i] = true;
                Dfs(depth+1,path);
                used[i] = false;
                path.removeLast();
            }
        }
    }


}
