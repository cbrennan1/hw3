// Colin Brennan CS445 HW3
package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.java.buttons.*;
import main.java.lightbulb.*;
import main.java.Main.TableLamp;

public class TableLamp_Testing {
    // String fixtures
	// Button
    private final static String Table_lamp_on_with_button_and_lightbulb_expected_output;
    private final static String Table_lamp_off_with_button_and_lightbulb_expected_output;
    // Pushdown Button
    private final static String Table_lamp_on_with_pushdown_button_and_lightbulb_expected_output;
    private final static String Table_lamp_off_with_pushdown_button_and_lightbulb_expected_output;


    static {
    	// Button
    	Table_lamp_on_with_button_and_lightbulb_expected_output = "Button switched to ON\nLightbulb on";
    	Table_lamp_off_with_button_and_lightbulb_expected_output = "Button switched to OFF\nLightbulb off";
    	// Pushdown Button
    	Table_lamp_on_with_pushdown_button_and_lightbulb_expected_output = "PushDownButton pushed to ON\nLightbulb on";
    	Table_lamp_off_with_pushdown_button_and_lightbulb_expected_output = "PushDownButton pushed to OFF\nLightbulb off"; }

    @Test
    void tableLampWithButtonAndLightbulbOnOutputMatchesExpectedOutput() {
        SwitchInterface button = new Button();
        LightbulbInterface lightbulb = new Lightbulb();
        TableLamp tableLamp = new TableLamp(button, lightbulb);
        assertEquals(Table_lamp_on_with_button_and_lightbulb_expected_output, tableLamp.getTableLampOnString()); }

    @Test
    void tableLampWithButtonAndLightbulbOffOutputMatchesExpectedOutput() {
    	SwitchInterface button = new Button();
    	LightbulbInterface lightbulb = new Lightbulb();
        TableLamp tableLamp = new TableLamp(button, lightbulb);
        assertEquals(Table_lamp_off_with_button_and_lightbulb_expected_output, tableLamp.getTableLampOffString()); }

    @Test
    void tableLampWithPushDownButtonAndLightbulbOnOutputMatchesExpectedOutput() {
    	SwitchInterface button = new PushdownButton();
    	LightbulbInterface lightbulb = new Lightbulb();
        TableLamp tableLamp = new TableLamp(button, lightbulb);
        assertEquals(Table_lamp_on_with_pushdown_button_and_lightbulb_expected_output, tableLamp.getTableLampOnString()); }

    @Test
    void tableLampWithPushDownButtonAndLightbulbOffOutputMatchesExpectedOutput() {
    	SwitchInterface button = new PushdownButton();
    	LightbulbInterface lightbulb = new Lightbulb();
        TableLamp tableLamp = new TableLamp(button, lightbulb);
        assertEquals(Table_lamp_off_with_pushdown_button_and_lightbulb_expected_output, tableLamp.getTableLampOffString()); }
}