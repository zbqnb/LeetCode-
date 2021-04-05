package TreeQAs;

import ListQAs.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
public class VIP_LeetCode102 {
    //首先是用队列的方式实现
    //自己给自己先讲解一下实现过程
    //队列就代表着用bfs
    //循环使用队列，处理完当前队列之后，将下一层的子树压进去，这样能按顺序弹出来
    public List<List<Integer>> levelOrder(TreeNode root) {

        if(root==null) {
            return new ArrayList<List<Integer>>();
        }

        List <List<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() > 0) {
            List<Integer> tempList = new ArrayList<Integer>();
            int l = queue.size();
            for (int i = 0; i < l; i++) {
                TreeNode li = queue.remove();
                tempList.add(li.val);
                if (li.left != null) {
                    queue.add(li.left);
                }
                if (li.right != null) {
                    queue.add(li.right);
                }
            }
            res.add(tempList);

        }
     return res;
    }

    //递归实现
    //思路是什么呢？ 有个index证明当前的层数 -> 把对应的层数作为index加进去

    public List<List<Integer>> levelOrder2(TreeNode root) {
        if(root==null) {
            return new ArrayList<List<Integer>>();
        }
        //用来存放最终结果
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        bfs(1,res,root);
        return res;

    }
    void bfs (int level ,List<List<Integer>> resArray,TreeNode node ) {

        if (level > resArray.size()) {
           resArray.add(new ArrayList<>());
        }

        resArray.get(level - 1).add(node.val);
        if (node.left != null) {
            bfs(level + 1,resArray,node.left);
        }
        if (node.right != null) {
            bfs(level + 1,resArray,node.right);
        }

    }
}
