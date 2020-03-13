import java.util.LinkedList;

public class Leaf_Similar_Trees {
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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        LinkedList<Integer> leafsRoot1 = new LinkedList<Integer>();
        LinkedList<Integer> leafsRoot2 = new LinkedList<Integer>();
        leafsOfBranch(root1, leafsRoot1);
        leafsOfBranch(root2, leafsRoot2);
        if (leafsRoot1.size() != leafsRoot2.size())
            return false;
        else {
            for (int i = 0; i < leafsRoot1.size(); i++) {
                if (leafsRoot1.get(i) != leafsRoot2.get(i))
                    return false;
            }
        }
        return true;
    }

    public void leafsOfBranch(TreeNode node, LinkedList<Integer> leafs) {
        if (node == null)
            return;
        if (node.left == null && node.right == null) {
            leafs.add(node.val);
        } else {
            if (node.left != null) {
                leafsOfBranch(node.left, leafs);
            }
            if (node.right != null) {
                leafsOfBranch(node.right, leafs);
            }
        }
    }
}