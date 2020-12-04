import javax.swing.tree.TreeNode;

public class LeetCode108 {
    //将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
    //
    //本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
    // 主要是可以直接将这个升序数组看为一个二叉树中序遍历的结果，才能直接写
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    /**
    一定要构建一个内部类，要不然就没有root.left的方法了
     */
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x)
        { val = x; } };

        public TreeNode sortedArrayToBST(int[] nums) {
            return helper(nums,0,nums.length-1);
    }
    // [1,2,3,4,5,6,7]

    public TreeNode helper (int[] nums, int left ,int right) {
            int mid = (left + right)/2;

            if (left > right) {
                return null;
            }
            TreeNode root = new TreeNode(nums[mid]);
            //这里出了bug，是为什么呢
            root.left = helper(nums,0,mid-1);
            root.right = helper(nums,mid+1,nums.length -1);
            /*
            bug出现在上面的地方，错误的把边界很简单的认为是0和right了
            其实分治法每次都是left和right是更新的
            root.left = helper(nums,left,mid-1);
            root.right = helper(nums,mid+1,right);
             */

            return root;
    }
}
