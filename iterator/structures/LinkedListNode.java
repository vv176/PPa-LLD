package iterpattern.structures;

public class LinkedListNode {
    private final Integer val;
    private LinkedListNode next;

    public LinkedListNode(Integer val, LinkedListNode next) {
        this.val = val;
        this.next = next;
    }

    public Integer getVal() {
        return val;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}
