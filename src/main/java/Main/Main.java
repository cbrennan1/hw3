// Colin Brennan CS 445 HW3
// In the simplest implementation of a TableLamp the Button will have a Lightbulb.
// Write a Main class that creates a Button and then commands it to switch on and off.

package main.java.Main;

import main.java.lightbulb.*;
import main.java.buttons.*;

public class Main {

	public static void main(String[] args) {
        LightbulbInterface lightBulb = new Lightbulb();
        SwitchInterface button = new PushdownButton();
        TableLamp tableLamp = new TableLamp(button, lightBulb);

        System.out.println("Pushdown Button Implementation%n");
        tableLamp.turnOn();
        tableLamp.turnOff();
        System.out.println("%nButton Implementation%n");
        SwitchInterface button2 = new Button();
        TableLamp tableLamp2 = new TableLamp(button2, lightBulb);

        tableLamp2.turnOn();
        tableLamp2.turnOff();
    }

}
