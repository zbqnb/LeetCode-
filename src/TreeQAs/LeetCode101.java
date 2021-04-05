package TreeQAs;

public class LeetCode101 {
    // 判断一个二叉树是否是镜像对称

        public boolean isSymmetric(TreeNode root) {

        return bfs(root.left,root.right);
        }

        private boolean bfs(TreeNode leftRoot , TreeNode rightRoot) {
         //三个条件是什么
            if (leftRoot.left == null || leftRoot == null) {
                return true;
            }

            if(leftRoot.left != rightRoot.right || leftRoot.right != rightRoot.left) {
                return false;
            }

            return bfs(leftRoot.left,rightRoot.right);

        }




}
