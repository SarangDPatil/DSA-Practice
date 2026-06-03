class TreeNode {

    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Postorder {
    static void postorder(TreeNode root) {
    if(root == null)
        return;

    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + " ");
}

    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        postorder(root);
    }
}