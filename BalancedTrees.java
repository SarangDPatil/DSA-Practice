class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class BalancedTrees {

    static int height(Node root) {

        if (root == null)
            return 0;

        return 1 + Math.max(
                height(root.left),
                height(root.right)
        );
    }

    static boolean isBalanced(Node root) {

        if (root == null)
            return true;

        int leftHeight =
                height(root.left);

        int rightHeight =
                height(root.right);

        if (Math.abs(
                leftHeight - rightHeight
            ) > 1)
            return false;

        return isBalanced(root.left) &&
               isBalanced(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);

        System.out.println(
                isBalanced(root)
        );
    }
}