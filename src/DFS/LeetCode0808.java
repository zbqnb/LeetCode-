package DFS;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0808 {
    //返回所有字符串的排列组合
    public String[] permutation(String S) {
     //[ ]
        int length = S.length();
        int depth = 0;
        boolean[] visited = new boolean[length];
        List<String> res = new ArrayList<>();
        StringBuffer bf = new StringBuffer();
        Dfs(length,0,S,res,bf,visited);
        return  res.toArray(new String[0]);

    }
    private void Dfs(int length,int depth,String s,List<String> res,StringBuffer bf, boolean[] visited) {
        if (depth == length){
            res.add(bf.toString());
            return;
        }

        for (int i = 0; i < length; i++) {
            if (visited[i]){
                char temp = s.charAt(i);
                bf.append(temp);
                visited[i] = true;
                Dfs(length,depth+1,s,res,bf,visited);
                bf.deleteCharAt(length - 1);
                visited[i] = false;
            }
        }
    }
}
