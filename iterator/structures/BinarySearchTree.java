package iterpattern.structures;

import iterpattern.Iterable;
import iterpattern.Iterator;

public class BinarySearchTree implements Iterable {
    private final TreeNode root;

    public BinarySearchTree(TreeNode root) {
        this.root = root;
    }

    public void insert(TreeNode node) {
        TreeNode current = root, parent = null;
        while (current != null) {
            if (node.getData() > current.getData()) {
                parent = current;
                current = current.getRight();
            } else {
                parent = current;
                current = current.getLeft();
            }
        }
        if (node.getData() > parent.getData())
            parent.setRight(node);
        else
            parent.setLeft(node);
    }


    @Override
    public Iterator getIterator() {
        return new BSTIterator(this.root);
    }
}
