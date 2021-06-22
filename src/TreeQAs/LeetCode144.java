package TreeQAs;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LeetCode144 {
    //二叉树的前序遍历迭代写法
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();

        if (root == null) {
            return res;
        }
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(root.val);
        while (stack.size() > 0) {
            res.add(stack.pop());
            if (root.left != null) {
                stack.push(root.left.val);
            }
            if (root.right != null) {
                stack.push(root.right.val);
            }
        }
        return res;
    }
}
