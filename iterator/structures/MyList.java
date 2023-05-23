package iterpattern.structures;

import iterpattern.Iterable;
import iterpattern.Iterator;

import java.util.ArrayList;
import java.util.List;

public class MyList implements Iterable {
    private final List<Integer> internalList;

    public MyList() {
        this.internalList = new ArrayList<>();
    }

    public void insert(Integer x) {
        this.internalList.add(x);
    }

    @Override
    public Iterator getIterator() {
        return new MyListIterator(this.internalList);
    }
}
