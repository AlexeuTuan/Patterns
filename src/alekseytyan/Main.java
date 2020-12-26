package alekseytyan;

import alekseytyan.command.RemoteControl;
import alekseytyan.command.light.Light;
import alekseytyan.command.light.LightOnCommand;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light();
    }
}