package TreeQAs;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode513 {class Solution {


    public int findBottomLeftValue(TreeNode root) {

        if (root.left == null && root.right == null) {
            return root.val;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode temp = new TreeNode(-100);
        while (queue != null) {
             temp = queue.poll();

            assert temp != null;
            if (temp.right != null) {
                queue.offer(temp.right);
            }

            if (temp.left != null) {
                queue.offer(temp.left);
            }
        }
        return temp.val;
    }
}
}
