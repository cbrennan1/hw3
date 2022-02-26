// Colin Brennan
package main.java.buttons;

public class Button implements SwitchInterface {
	
	// When switched on the Button will print "Button switched to ON" to stdout. 
	// When switched off the button will print "Button switched to OFF" to stdout.
    private final static String switchOnString = "Button switched to ON";
    private final static String switchOffString = "Button switched to OFF";

    // The Button knows how to respond to switchOn() and switchOff()
    @Override
    public void switchOn() {
        System.out.println(switchOnString); }
    @Override
    public void switchOff() {
        System.out.println(switchOffString); }
    
    //  Get SwitchOn/SwitchOff String
    @Override
    public String getSwitchOnString() {
        return switchOnString; }
    @Override
    public String getSwitchOffString() {
        return switchOffString; }
}