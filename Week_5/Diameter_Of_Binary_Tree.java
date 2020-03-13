public class Diameter_Of_Binary_Tree {
    public static void main(String[] args) {

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        return getLongestPath(root);
    }

    public int getLongestPath(TreeNode root) {
        if (root == null)
            return 0;
        int path = 0;
        if (root.left != null)
            path++;
        if (root.right != null)
            path++;
        return Math.max(getLongestPath(root.left) + getLongestPath(root.right), path);
    }

}