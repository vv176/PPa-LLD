package command.cmd;

import command.rcv.PerfectMatchDeleter;
import command.rcv.TagInserter;

import java.util.ArrayList;
import java.util.List;

public class PerfectMatchDeleteCommand implements Command{

    private final String name;
    private final PerfectMatchDeleter perfectMatchDeleter;
    private final TagInserter tagInserter;
    private final List<String> deletedTags;

    public PerfectMatchDeleteCommand(String name,
                                     PerfectMatchDeleter perfectMatchDeleter,
                                     TagInserter tagInserter) {
        this.name = name;
        this.perfectMatchDeleter = perfectMatchDeleter;
        this.tagInserter = tagInserter;
        this.deletedTags = new ArrayList<>();
    }

    // receiver
    @Override
    public void execute() {
        this.deletedTags.addAll(this.perfectMatchDeleter.delete(this.name));
    }

    @Override
    public void undo() {
        for (String tag : deletedTags) {
            tagInserter.insert(tag);
        }
        this.deletedTags.clear();
    }

}
