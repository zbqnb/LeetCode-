package TreeQAs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode102Test {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //用队列解决
        ArrayList<List<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode> que = new LinkedList<>();
        que.add(root);

        while (que.size() > 0) {
            int size = que.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = que.remove();
                temp.add(treeNode.val);
            }
            res.add(temp);
            if (root.left != null) {
                que.add(root.left);
            }

            if (root.right != null) {
                que.add(root.right);
            }
        }
        return res;
    }
}
