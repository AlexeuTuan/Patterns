package alekseytyan.command;

public class SimpleRemoteControl {

    Command slot;
    Command slot2;

    public SimpleRemoteControl() {

    }

    public void setSlot1(Command command) {
        slot = command;
    }

    public void setSlot2(Command command) {
        slot2 = command;
    }



    public void buttonSlot1() {
        slot.execute();
    }

    public void buttonSlot2() {
        slot2.execute();
    }
}