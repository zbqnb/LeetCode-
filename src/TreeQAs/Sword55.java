package TreeQAs;

public class Sword55 {
    public int maxDepth(TreeNode root) {
    // 二叉树的深度
    // 二叉树的深度等于左右子树最大深度加1
        int res  = Dfs(root);
        return res;
    }
    private int Dfs(TreeNode root){
     if (root == null) {
         return 0;
     }

     int left = Dfs(root.left);
     int right = Dfs(root.right);
     return Math.max(left+ 1,right+1);
    }

}
