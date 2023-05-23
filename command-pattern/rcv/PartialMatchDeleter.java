package command.rcv;

import command.data.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class PartialMatchDeleter {

    public List<String> delete(Pattern pattern) {
        List<String> tags = new ArrayList<>();
        Store.getTags().forEach(tag ->tags.add(tag));
        List<String> deletedStrings = new ArrayList<>();
        for(String tag : tags) {
            if (pattern.matcher(tag).matches()) {
                Store.delete(tag);
                deletedStrings.add(tag);
            }
        }
        return deletedStrings;
    }

}
