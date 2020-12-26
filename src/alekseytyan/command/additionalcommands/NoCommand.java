package alekseytyan.command.additionalcommands;

import alekseytyan.command.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No action assigned");
    }

    @Override
    public void undo() {
        System.out.println("Nothing to cancel");
    }
}
