package TreeQAs;

public class LeetCode783 {
    //因为是二叉搜索树对吧
    /*所以宗旭遍历结果是[]
     *
     */
    public int minDiffInBST(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 0;
        }
        // cur
        int cur = Math.min(root.val - root.left.val,root.right.val - root.val);
        int nextLevel = Math.min(minDiffInBST(root.left),minDiffInBST(root.right));
        int res = Math.min(cur,nextLevel);
        return res;
    }

}
