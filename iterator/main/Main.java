package iterpattern.main;

import iterpattern.Iterable;
import iterpattern.Iterator;
import iterpattern.structures.*;

import java.io.DataInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(
                new TreeNode(10, null, null));
        bst.insert(new TreeNode(5,null,null));
        bst.insert(new TreeNode(25,null,null));
        bst.insert(new TreeNode(1,null,null));
        bst.insert(new TreeNode(7,null,null));
        display(bst);
        LinkedList ll = new LinkedList(new LinkedListNode(0,null));
        ll.insert(new LinkedListNode(10,null));
        ll.insert(new LinkedListNode(15,null));
        ll.insert(new LinkedListNode(150,null));
        display(ll);
    }
    private static void display(Iterable iterable) {
        Iterator iterator = iterable.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }

}
