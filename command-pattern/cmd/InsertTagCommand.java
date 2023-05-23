package command.cmd;

import command.rcv.PerfectMatchDeleter;
import command.rcv.TagInserter;

public class InsertTagCommand implements  Command{

    private final String name;
    private final TagInserter tagInserter;
    private final PerfectMatchDeleter perfectMatchDeleter;

    public InsertTagCommand(String name, TagInserter tagInserter,
                            PerfectMatchDeleter perfectMatchDeleter) {
        this.name = name;
        this.tagInserter = tagInserter;
        this.perfectMatchDeleter = perfectMatchDeleter;
    }

    @Override
    public void execute() {
        this.tagInserter.insert(this.name);
    }

    @Override
    public void undo() {
        this.perfectMatchDeleter.delete(name);
    }

}
