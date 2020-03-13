public class Find_Bottom_Left_Tree_Value {
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

    public int findBottomLeftValue(TreeNode root) {
        int[] currentLow = new int[2];
        currentLow[0] = 0;
        currentLow[1] = root.val;
        getLowestLeftValue(root, 0, currentLow, 1);
        return currentLow[1];
    }

    public void getLowestLeftValue(TreeNode node, int level, int[] currentLow, int leftOrRight) {
        if (node == null)
            return;
        getLowestLeftValue(node.left, level + 1, currentLow, 0);
        getLowestLeftValue(node.right, level + 1, currentLow, 1);
        if (node.left == null && node.right == null && leftOrRight == 0 && currentLow[0] < level) {
            currentLow[0] = level;
            currentLow[1] = node.val;
        }
    }

    // public int findBottomLeftValue(TreeNode root) {

    // }

    // public int[] gettingLowestLeftValue(TreeNode node, int depth) {
    // int[] idValue = new int[2]; // {depth, id}

    // if (node == null) {
    // idValue[0] = Integer.MIN_VALUE;
    // idValue[1] = Integer.MIN_VALUE;
    // return idValue;
    // }
    // TreeNode current = node;
    // int tempDepth = 0;
    // while (current != null) {
    // current = current.left;
    // tempDepth++;
    // }

    // }

}