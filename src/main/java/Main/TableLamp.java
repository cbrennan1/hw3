// Colin Brennan CS 445 HW3
package main.java.Main;

import main.java.buttons.SwitchInterface;
import main.java.lightbulb.LightbulbInterface;

public class TableLamp {
	
	//Button and Lightbulb
    private SwitchInterface button;
    private LightbulbInterface lightbulb;

    public TableLamp(SwitchInterface button, LightbulbInterface lightbulb) {
        this.button = button;
        this.lightbulb = lightbulb;
    }

    // Turn Table Lamp On/Off
    public void turnOn() {
    	button.switchOn();
        lightbulb.on(); }
    
    public void turnOff() {
    	button.switchOff();
        lightbulb.off(); }

    // Get On/Off String for Table Lamp
    public String getTableLampOnString() {
        String output = "";
        output += button.getSwitchOnString();
        output += "\n";
        output += lightbulb.getOnString();
        return output; }

    public String getTableLampOffString() {
        String output = "";
        output += button.getSwitchOffString();
        output += "\n";
        output += lightbulb.getOffString();
        return output; }
}