// Colin Brennan CS445 HW3
package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.buttons.Button;

public class Button_Testing {
    // String fixtures
    private final static String Switch_on_string_expected_output;
    private final static String Switch_off_string_expected_output;

    static {
    	Switch_on_string_expected_output = "Button switched to ON";
    	Switch_off_string_expected_output = "Button switched to OFF";
    }

    @Test // On
    void buttonSwitchOnOutputMatchesExpectedOutput() {
        Button button = new Button();
        assertEquals(Switch_on_string_expected_output, button.getSwitchOnString());
    }

    @Test // Off
    void buttonSwitchOffOutputMatchesExpectedOutput() {
        Button button = new Button();
        assertEquals(Switch_off_string_expected_output, button.getSwitchOffString());
    }


}