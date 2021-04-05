package TreeQAs;

public class LeetCode104 {
   //二叉树的最大深度
    // 错的 sum一点变化都没有
    int level = 0;
    public int maxDepth(TreeNode root) {

            int res = rur(root,1);
            return  res;
    }

    private int rur (TreeNode root, int sum)  {
        if (root == null) {
            return 0;
        }
        if (level > sum) sum = level;
        return Math.max(rur(root.left,sum + 1),rur(root.right,sum + 1));
    }


//    public int maxDepth2(TreeNode root) {
//
//        int res = rur(root);
//        return  res;
//    }
//
//    private int rur2 (TreeNode root)  {
//        if (root == null) {
//            return 0;
//        }
//        return Math.max(rur(root.left),rur(root.right)) + 1;
    }

