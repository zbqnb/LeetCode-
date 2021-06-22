package TreeQAs;

public class LeetCode105 {

    private TreeNode buildTreehelper(int[] preorder, int[] inorder) {

        TreeNode root = new TreeNode();
        root.val = preorder[0];

        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == root.val) {
              int leftIndex = i;
              break;
            }
        }
//        root.left = buildTreehelper();
//        root.right = buildTree();
        return null;
    }
}
