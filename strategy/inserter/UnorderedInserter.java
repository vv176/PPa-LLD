package basicnumstore.inserter;

import java.util.List;

public class UnorderedInserter implements Inserter{
    @Override
    public void insert(Integer num, List<Integer> nums) {
        System.out.println("inside UnOrderedInserter");
        nums.add(num);
    }
}
