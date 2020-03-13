import java.util.*;

public class N_Ary_Tree_Postorder_Traversal {
    public static void main(String[] args) {

    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public List<Integer> postorder(Node root) {
        List<Integer> mySolution = new LinkedList<Integer>();
        helperFunction(root, mySolution);
        return mySolution;

    }

    public void helperFunction(Node nd, List<Integer> solution) {
        if (nd == null)
            return;
        for (Node child : nd.children)
            helperFunction(child, solution);
        solution.add(nd.val);
    }
}