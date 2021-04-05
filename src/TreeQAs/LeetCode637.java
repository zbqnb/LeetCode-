package TreeQAs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode637 {
    //二叉树的层平局值
    public List<Double> averageOfLevels(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> res = new ArrayList<>();
        queue.add(root);
        while (queue.size() > 0) {
            double sum = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                sum += queue.poll().val;
            }
            sum = sum/size;
            res.add(sum);
            queue.add(root.left);
            queue.add(root.right);
        }
        return res;
    }

}
