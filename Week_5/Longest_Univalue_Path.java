public class Longest_Univalue_Path {
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

    public int longestUnivaluePath(TreeNode root) {
        if (root == null)
            return 0;
        else if (root.left == null && root.right == null)
            return 0;
        else {
            int[] leftSolution = m_longestUnivaluePath(root.left, root.val, 0);
            int[] rightSolution = m_longestUnivaluePath(root.right, root.val, 0);
            if (leftSolution != null && rightSolution != null) {
                if (leftSolution[0] == rightSolution[0]) {
                    return leftSolution[1] + rightSolution[1];
                } else {
                    if (leftSolution[1] > rightSolution[1]) {
                        return leftSolution[1];
                    } else {
                        return rightSolution[1];

                    }
                }
            } else if (leftSolution == null) {
                return rightSolution[1];

            } else {
                return leftSolution[1];

            }
        }
    }

    public int[] m_longestUnivaluePath(TreeNode node, int previousID, int maxPathSoFar) {
        if (node == null)
            return null;

        int[] idAndValue = new int[2];// {id, value}
        if (node.left == null && node.right == null && node.val == previousID) {
            idAndValue[0] = previousID;
            idAndValue[1] = maxPathSoFar + 1;
            return idAndValue;
        } else if (node.left == null && node.right == null) {
            idAndValue[0] = node.val;
            idAndValue[1] = 1;
            return idAndValue;
        } else {
            int[] leftSolution = m_longestUnivaluePath(node.left, node.val, 0);
            int[] rightSolution = m_longestUnivaluePath(node.right, node.val, 0);
            if (leftSolution != null && rightSolution != null) {
                if (leftSolution[0] == rightSolution[0]) {
                    idAndValue[0] = leftSolution[0];
                    idAndValue[1] = leftSolution[1] + rightSolution[1];
                } else {
                    if (leftSolution[1] > rightSolution[1]) {
                        idAndValue[0] = leftSolution[0];
                        idAndValue[1] = leftSolution[1];
                    } else {
                        idAndValue[0] = rightSolution[0];
                        idAndValue[1] = rightSolution[1];

                    }
                }
                return idAndValue;
            } else if (leftSolution == null) {
                idAndValue[0] = rightSolution[0];
                idAndValue[1] = rightSolution[1];
                return idAndValue;

            } else {
                idAndValue[0] = leftSolution[0];
                idAndValue[1] = leftSolution[1];
                return idAndValue;
            }
        }

    }
}