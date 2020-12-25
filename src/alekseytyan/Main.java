package alekseytyan;

import alekseytyan.command.*;

public class Main {
    public static void main(String[] args) {

        SimpleRemoteControl remote = new SimpleRemoteControl(); // Remote


        // Command 1
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setSlot1(lightOn);
        remote.buttonSlot1();

        // Command 2
        Garage garage = new Garage(light);
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garage);
        remote.setSlot2(garageDoorOpen);
        remote.buttonSlot2();
    }
}