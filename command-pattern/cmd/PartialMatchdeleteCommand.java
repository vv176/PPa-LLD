package command.cmd;


import command.rcv.PartialMatchDeleter;
import command.rcv.TagInserter;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class PartialMatchdeleteCommand implements Command{

    private final Pattern regex;
    private final PartialMatchDeleter partialMatchDeleter;

    public PartialMatchdeleteCommand(Pattern regex,
                                     PartialMatchDeleter partialMatchDeleter) {
        this.regex = regex;
        this.partialMatchDeleter = partialMatchDeleter;
    }

    @Override
    public void execute() {
        this.partialMatchDeleter.delete(this.regex);
    }

    @Override
    public void undo() {

    }

}
