package iterpattern.structures;

public class TreeNode {
    private final Integer data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(Integer data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Integer getData() {
        return data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
