package alekseytyan.command.garage;

import alekseytyan.command.light.Light;

public class Garage {

    private Light light;

    public Garage(Light light) {
        this.light = light;
    }

    public void up() {
        System.out.println("Garage door is open");
    }
    public void down() {
        System.out.println("Garage door is closed");
    }
    public void stop() {
        System.out.println("The opening is stopped");
    }
    public void lightOn() {
        light.on();
    }
    public void lightOff() {
        light.off();
    }
}
