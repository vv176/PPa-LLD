package basicnumstore.inserter;

import java.util.Collections;
import java.util.List;

public class OrderedInserter implements Inserter{
    @Override
    public void insert(Integer num, List<Integer> nums) {
        System.out.println("inside OrderedInserter");
        nums.add(num);
        int k = nums.size()-1;
        while (k > 0 && nums.get(k) < nums.get(k-1)) {
            Collections.swap(nums, k-1, k);
            k--;
        }
    }
}
