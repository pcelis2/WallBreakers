import java.util.LinkedList;

public class Sum_Of_Left_Leaves {
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

    public int sumOfLeftLeaves(TreeNode root) {
        LinkedList<Integer> leftNodes = new LinkedList<Integer>();
        getSumOfLeftSide(root, leftNodes);
        int sum = 0;
        for (Integer value : leftNodes)
            sum += value;
        return sum;

    }

    public int getSumOfLeftSide(TreeNode node, LinkedList<Integer> leftNodes) {
        if (node == null)
            return 0;
        else if (node.left == null && node.right == null) {
            return node.val;
        } else {
            leftNodes.add(getSumOfLeftSide(node.left, leftNodes));
            getSumOfLeftSide(node.right, leftNodes);
            return 0;
        }

    }
}