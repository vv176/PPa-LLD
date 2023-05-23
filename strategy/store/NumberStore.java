package basicnumstore.store;

import basicnumstore.inserter.Inserter;
import basicnumstore.searcher.Searcher;

import java.util.ArrayList;
import java.util.List;

public class NumberStore {

    private final List<Integer> nums;
    private final Inserter inserter;
    private final Searcher searcher;

    public NumberStore(Inserter inserter,
                       Searcher searcher) {
        this.inserter = inserter;
        this.searcher = searcher;
        nums = new ArrayList<>();
    }

     public void insert(Integer num) {
        this.inserter.insert(num, this.nums);
     }

     public Integer search(Integer key) {
        return this.searcher.search(key, this.nums);
     }
}
// probs : -
// 1. OCP
// 2. Big Class
// 3. Code is not readable
// Inserter, Searcher
