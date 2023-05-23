package basicnumstore.searcher;

import java.util.List;

public class BinarySearcher implements Searcher{
    @Override
    public Integer search(Integer key, List<Integer> nums) {
        System.out.println("inside BinarySearcher");
        int l = 0, h = nums.size()-1;
        while (l <= h) {
            int m = (l+h)/2;
            if (nums.get(m) == key)
                return m;
            else if (nums.get(m) < key)
                l = m+1;
            else
                h = m-1;
        }
        return -1;
    }
}
