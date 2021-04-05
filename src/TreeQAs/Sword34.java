package TreeQAs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Sword34 {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
      Dfs(root,sum);
      return res;
    }

    private void Dfs(TreeNode root,int sum){
        if (root == null) {
            return;
        }
        //   3
        // 1   2
        //1 3
        path.add(root.val);
        sum-= root.val;
        if (sum == 0 && root.left == null && root.right == null) {
            res.add(new LinkedList<>(path));
        }
        Dfs(root.left,sum);
        Dfs(root.right,sum);
        path.removeLast(); //回溯到上一层，重新找新枝条，重新找其他的路径
    }

}
