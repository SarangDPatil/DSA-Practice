class TreeNode {

    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Preorder {
    static void preorder(TreeNode root) {
    if(root == null)
        return;

    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
}

    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        preorder(root);
    }
}