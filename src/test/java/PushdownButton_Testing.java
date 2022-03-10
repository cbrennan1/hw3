// Colin Brennan CS445 HW3
package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.buttons.PushdownButton;

public class PushdownButton_Testing {
    // String fixtures
    private final static String Switch_on_string_expected_output;
    private final static String Switch_off_string_expected_output;

    static {
    	Switch_on_string_expected_output = "PushDownButton pushed to ON";
    	Switch_off_string_expected_output = "PushDownButton pushed to OFF"; }

    @Test // On
    void PushdownButtonSwitchOnOutputMatchesExpectedOutput() {
    	PushdownButton button = new PushdownButton();
        assertEquals(Switch_on_string_expected_output, button.getSwitchOnString()); }

    @Test // Off
    void PushdownButtonSwitchOffOutputMatchesExpectedOutput() {
        PushdownButton button = new PushdownButton();
        assertEquals(Switch_off_string_expected_output, button.getSwitchOffString()); }

}