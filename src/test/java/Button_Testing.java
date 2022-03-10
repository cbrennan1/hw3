// Colin Brennan CS445 HW3
package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.buttons.Button;

public class Button_Testing {
    // String fixtures
    private final static String Switch_on_string_expected_output;
    private final static String Switch_off_string_expected_output;
    private final static String Switch_on_expected_output;
    private final static String Switch_off_expected_output;

    static {
    	Switch_on_string_expected_output = "Button switched to ON";
    	Switch_off_string_expected_output = "Button switched to OFF"; 
    	Switch_on_expected_output = "Button switched to ON";
    	Switch_off_expected_output = "Button switched to OFF";}

    @Test // On
    void buttonSwitchOnStringOutputMatchesExpectedOutput() {
        Button button = new Button();
        assertEquals(Switch_on_string_expected_output, button.getSwitchOnString()); }
    
    @Test
    public void testCollectionAdd() {
        Button button2 = new ArrayList();
        assertEquals(0, button2.size());
        Button.add("itemA");
        assertEquals(1, Button.size());
        Button.add("itemB");
        assertEquals(2, Button.size());
    }
    
    @Test // Off
    void buttonSwitchOffOutputMatchesExpectedOutput() {
        Button button = new Button();
        assertEquals(Switch_off_string_expected_output, button.getSwitchOffString()); }

}