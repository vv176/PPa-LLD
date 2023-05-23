package command.tag;

import command.cmd.Command;

import java.util.Stack;

public class TagManager {

    private final Stack<Command> oldCommands;

    public TagManager() {
        this.oldCommands = new Stack<>();
    }

    public void changeTags(Command command) {
        command.execute();
        this.oldCommands.push(command);
    }

    public void undo() {
        if (oldCommands.empty())
            throw new RuntimeException("No command to undo");
        Command command = oldCommands.peek();
        command.undo();
        oldCommands.pop();
    }

}
