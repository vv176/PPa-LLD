package iterpattern.structures;


import iterpattern.Iterator;

import java.util.Stack;

public class BSTIterator implements Iterator {

    private final TreeNode root;
    private final Stack<TreeNode> nodes;

    public BSTIterator(TreeNode root) {
        this.root = root;
        this.nodes = new Stack<>();
        init();
    }

    @Override
    public boolean hasNext() {
        return !(nodes.empty());
    }

    @Override
    public int next() {
        TreeNode node = nodes.peek();
        nodes.pop();
        TreeNode curr = node.getRight();
        while (curr != null) {
            nodes.push(curr);
            curr = curr.getLeft();
        }
        return node.getData();
    }

    private void init() {
        TreeNode curr = root;
        while (curr != null) {
            nodes.push(curr);
            curr = curr.getLeft();
        }
    }
}
