package DFS;

import java.lang.reflect.Array;

public class LeetCode60 {
    //排列组合
    //首先dfs -> 全走一遍
    // dfs的时间复杂度是多少呢 // O(2n)?
    // 那么 n = 3那不就是截一个数组么？
    // k在返回第k个
    //
    private int n;
    private int k;
    int[] factorial = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

    public String getPermutation(int n, int k) {
     // dfs
        this.n = n;
        this.k = k;
        String res = "";
        StringBuffer path = new StringBuffer();
        boolean [] used = new boolean[n];
        Dfs(0,used,path);
        res = path.toString();
        return res;
    }
     //进到1那边，就看当前层的k值，就以当前层数开头的下面还有多少个路径
    private void Dfs(int index,boolean[] used,StringBuffer path) {
        // j是层数也就数组长度
        // n - j
        // 剪枝是在进入这个节点或者分支时候实现的
        //
        int cout = factorial[(n - index -1)];
        if (index == n) {
            return;
        }

        for (int i = 0; i < n; i++) {
            if (used[i]) {
                continue;
            }
            if (k - cout > 0) {
            k -= cout;
            continue;
            }
            path.append(i);
            Dfs(index + 1,used,path);
        }

    }
}
