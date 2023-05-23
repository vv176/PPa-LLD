package command.rcv;

import command.data.IStore;
import command.data.Store;

import java.util.ArrayList;
import java.util.List;

public class PerfectMatchDeleter {

    private final IStore iStore;

    public PerfectMatchDeleter(IStore iStore) {
        this.iStore = iStore;
    }

    public List<String> delete(String name) {
        if (name == null || name.length()  == 0)
            throw new IllegalArgumentException();
        List<String> tags = new ArrayList<>();
        iStore.getTags().forEach(tag -> tags.add(tag));
        List<String> deletedStrings = new ArrayList<>();
        for (String tag : tags) {
            if (name.equals(tag)) {
                iStore.delete(tag);
                deletedStrings.add(tag);
            }
        }
        return deletedStrings;
    }

}
