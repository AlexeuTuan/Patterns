package alekseytyan.command.garage;

import alekseytyan.command.Command;

public class GarageDoorOpenCommand implements Command {

    private Garage garage;

    public GarageDoorOpenCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.up();
    }

    @Override
    public void undo() {

    }
}
