package command.data;

import java.util.List;

public class IStoreImpl implements IStore{
    @Override
    public List<String> getTags() {
        return Store.getTags();
    }

    @Override
    public void delete(String tag) {
        Store.delete(tag);
    }

    @Override
    public void insert(String tag) {
        Store.insert(tag);
    }
}
