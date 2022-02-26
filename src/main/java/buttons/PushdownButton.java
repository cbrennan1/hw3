// Colin Brennan CS445 HW3
package main.java.buttons;

public class PushdownButton implements SwitchInterface {
	//Replace the Button with a PushdownButton, one that switches between on and off every time it's pushed. 
    private final static String switchOnStr = "PushDownButton pushed to ON";
    private final static String switchOffStr = "PushDownButton pushed to OFF";

    @Override
    public void switchOn() {
        System.out.println(switchOnStr);
    }

    @Override
    public void switchOff() {
        System.out.println(switchOffStr);
    }

    @Override
    public String getSwitchOnString() {
        return switchOnStr;
    }

    @Override
    public String getSwitchOffString() {
        return switchOffStr;
    }
}
