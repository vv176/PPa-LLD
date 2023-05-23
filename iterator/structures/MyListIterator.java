package iterpattern.structures;

import iterpattern.Iterator;

import java.util.List;

public class MyListIterator implements Iterator {
    private final List<Integer> internalList;
    private Integer current;
    private final Integer size;

    public MyListIterator(List<Integer> internalList) {
        this.internalList = internalList;
        this.current = 0;
        this.size = internalList.size();
    }

    @Override
    public boolean hasNext() {
        return current < size;
    }

    @Override
    public int next() {
        int x = internalList.get(current);
        current++;
        return x;
    }
}
