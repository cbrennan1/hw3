// Colin Brennan
package main.java.buttons;

public class Button implements SwitchInterface {
    private final static String switchOnString = "Button switched to ON";
    private final static String switchOffString = "Button switched to OFF";

    @Override
    public void switchOn() {
        System.out.println(switchOnString);
    }

    @Override
    public void switchOff() {
        System.out.println(switchOffString);
    }

    @Override
    public String getSwitchOnString() {
        return switchOnString;
    }

    @Override
    public String getSwitchOffString() {
        return switchOffString;
    }
}