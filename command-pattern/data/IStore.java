package command.data;

import java.util.List;

public interface IStore {

    List<String> getTags();
    void delete(String tag);
    void insert(String tag);

}
